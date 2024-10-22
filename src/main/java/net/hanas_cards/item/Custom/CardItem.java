package net.hanas_cards.item.Custom;

import net.hanas_cards.component.CardComponent;
import net.hanas_cards.component.ModDataComponentTypes;
import net.hanas_cards.util.CustomCardRarity;
import net.hanas_cards.util.GradingSystem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.util.*;
import net.minecraft.world.World;

import java.util.List;
import java.util.Objects;

import static net.hanas_cards.util.TextUtils.*;

public class CardItem extends Item {

    private final String dimension;
    private final String cardType;
    private final String variant;
    private final Rarity rarity;
    private final CustomCardRarity customRarity;

    /**
     * Card Item Using Vanilla Rarity
     */
    public CardItem(Settings settings, String dimension, String card_type, String variant, Rarity rarity) {
        super(settings.rarity(rarity).maxCount(16));
        this.dimension = dimension;
        this.cardType = card_type;
        this.variant = variant;
        this.rarity = rarity;
        this.customRarity = null;
    }

    /**
     * Card Item Using Custom Rarity
     */
    public CardItem(Settings settings, String dimension, String card_type, String variant, CustomCardRarity customRarity) {
        super(settings.maxCount(16));
        this.dimension = dimension;
        this.cardType = card_type;
        this.variant = variant;
        this.rarity = null;
        this.customRarity = customRarity;
    }

    @Override
    public Text getName(ItemStack stack) {
        if (customRarity != null) {
            String colorCode = customRarity.getColorCode();
            MutableText cardName = Text.translatable("item.cardItem.hanas_cards.name");
            String cleanVariant = variant.replaceAll("§.", "");
            return Text.literal(colorCode + toTitleCase(cleanVariant) + " ")
                    .append(Text.literal(colorCode + toTitleCase(cardType) + " "))
                    .append(cardName.formatted(customRarity.getFormatting()))
                    .formatted(customRarity.getFormatting());
        }
        return super.getName(stack);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack originalStack = player.getStackInHand(hand);
        CardComponent component = originalStack.get(ModDataComponentTypes.CARD_COMPONENT);

        if (!world.isClient) {
            if (component == null) {
                if (originalStack.getCount() == 1) {
                    ItemStack gradedCard = getEmptiedStack(originalStack, player);
                    player.setStackInHand(hand, gradedCard);
                    player.sendMessage(Text.literal("Card graded!").formatted(Formatting.GREEN), true);
                    return TypedActionResult.success(gradedCard, world.isClient());
                } else {
                    ItemStack gradedCard = originalStack.split(1);
                    gradedCard.setCount(1);
                    gradedCard.set(ModDataComponentTypes.CARD_COMPONENT, createNewGrading());
                    ItemStack exchangedStack = ItemUsage.exchangeStack(originalStack, player, gradedCard);

                    if (originalStack.isEmpty()) {
                        player.setStackInHand(hand, ItemStack.EMPTY);
                    } else {
                        player.setStackInHand(hand, originalStack);
                    }

                    player.sendMessage(Text.literal("Card graded!").formatted(Formatting.GREEN), true);
                    return TypedActionResult.success(exchangedStack, world.isClient());
                }
            } else {
                player.sendMessage(Text.literal("This card is already graded!").formatted(Formatting.RED), true);
            }
        }

        return TypedActionResult.pass(originalStack);
    }

    public static ItemStack getEmptiedStack(ItemStack stack, PlayerEntity player) {
        ItemStack gradedCard = stack.split(1);
        gradedCard.setCount(1);
        gradedCard.set(ModDataComponentTypes.CARD_COMPONENT, createNewGrading());
        return gradedCard;
    }

    private static CardComponent createNewGrading() {
        float newGrading = GradingSystem.generateRandomGrade();
        return new CardComponent(newGrading, "Graded", List.of("tag"));
    }

    public Rarity getRarity() {
        return this.rarity; // This assumes you already have the Rarity field defined.
    }

    /**
     * Get the custom rarity of the card.
     *
     * @return the custom rarity, or null if not set.
     */

    public CustomCardRarity getCustomRarity() {
        return customRarity;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        tooltip.add(Text.literal(""));
        tooltip.add(Text.literal("---------------------"));

        String boldedDimension = dimension.replaceAll("(§.)", "$1§l");
        tooltip.add(Text.translatable("§fDimension: §7§l" + toTitleCase(boldedDimension)));

        tooltip.add(Text.literal("---------------------"));
        if (customRarity != null) {
            tooltip.add(Text.translatable("§lRarity: " + customRarity.getColorCode() + "§l" + toTitleCase(customRarity.getDisplayName())));
        } else if (rarity != null) {
            tooltip.add(Text.translatable("§fRarity: " + getRarityColor(rarity) + "§l" + toTitleCase(rarity.name())));
        }

        tooltip.add(Text.literal("---------------------"));
        tooltip.add(Text.translatable("§fType: §7§l" + toTitleCase(cardType)));
        tooltip.add(Text.literal("---------------------"));

        String boldedVariant = variant.replaceAll("(§.)", "$1§l");
        tooltip.add(Text.translatable("§fVariant: §7§l" + toTitleCase(boldedVariant)));
        tooltip.add(Text.literal("---------------------"));

        if (stack.get(ModDataComponentTypes.CARD_COMPONENT) != null) {
            CardComponent component = stack.get(ModDataComponentTypes.CARD_COMPONENT);
            tooltip.add(Text.literal("§fGrading: §7§l"));
            tooltip.add(Text.literal(String.valueOf(Objects.requireNonNull(component).getGrading()))
                    .formatted(Formatting.GRAY, Formatting.BOLD));
            tooltip.add(Text.literal("§fGrading Quality: §7§l"));
            tooltip.add(Text.literal(GradingSystem.getGradeDescription(component.getGrading()))
                    .formatted(Formatting.GRAY, Formatting.BOLD));
            tooltip.add(Text.literal("---------------------"));
        }

        super.appendTooltip(stack, context, tooltip, type);
    }


    private String getRarityColor(Rarity rarity) {
        return switch (rarity) {
            case COMMON -> "§f";
            case UNCOMMON -> "§e";
            case RARE -> "§9";
            case EPIC -> "§5";
            default -> "§f";
        };
    }
}
