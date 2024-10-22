package net.hanas_cards.item.Custom;

import net.hanas_cards.item.CardPackSettings;
import net.hanas_cards.util.CustomCardRarity;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.Rarity;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static net.hanas_cards.util.TextUtils.toTitleCase;

public class CardPackItem extends Item {

    private final CardPackSettings settings;

    public CardPackItem(CardPackSettings settings) {
        super(settings);
        this.settings = settings;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        if (world.isClient) {
            return TypedActionResult.success(player.getStackInHand(hand));
        }

        ItemStack stack = player.getStackInHand(hand);
        world.playSound(null, player.getX(), player.getY(), player.getZ(),
                SoundEvents.ENTITY_ITEM_PICKUP, SoundCategory.PLAYERS, 1.0F, 1.0F);
        player.sendMessage(Text.literal("You opened a card pack!").formatted(Formatting.BOLD), true);

        int numberOfCards = settings.getNumberOfCards();
        Map<TagKey<Item>, Integer> weightedTags = settings.getWeightedTags();
        List<TagKey<Item>> unweightedTags = settings.getUnweightedTags();

        List<ItemStack> possibleItems = new ArrayList<>(getCardsFromTags(unweightedTags));
        List<ItemStack> weightedItems = getWeightedCardsFromTags(weightedTags, world.getRandom());

        if (possibleItems.isEmpty() && weightedItems.isEmpty()) {
            player.sendMessage(Text.literal("No items found in tags!").formatted(Formatting.RED), true);
            return TypedActionResult.fail(stack);
        }

        List<String> rarityMessages = new ArrayList<>(); // Initialize rarityMessages outside the loop

        for (int i = 0; i < numberOfCards; i++) {
            ItemStack randomCard;

            // Try to get a random weighted card first, then a regular card if none available
            if (!weightedItems.isEmpty()) {
                randomCard = getRandomCard(weightedItems, world.getRandom());
            } else if (!possibleItems.isEmpty()) {
                randomCard = getRandomCard(possibleItems, world.getRandom());
            } else {
                break; // Exit if no items are available
            }

            // Only proceed if a valid card was received
            if (!randomCard.isEmpty()) {
                // Log rarity for debugging
                String rarityMessage;
                if (randomCard.getItem() instanceof CardItem cardItem) {
                    CustomCardRarity customRarity = cardItem.getCustomRarity();
                    if (customRarity != null) {
                        rarityMessage = customRarity.getColorCode() + customRarity.getDisplayName();
                    } else {
                        Rarity vanillaRarity = cardItem.getRarity(); // Get the vanilla rarity
                        rarityMessage = getRarityColor(vanillaRarity) + vanillaRarity.name(); // Use the method that takes Rarity
                    }
                    rarityMessages.add(rarityMessage); // Add to the list
                } else {
                    rarityMessage = getRarityFromItem(randomCard);
                    rarityMessages.add(rarityMessage); // Add to the list
                }

                // Add the card to the player's inventory
                if (!player.getInventory().insertStack(randomCard)) {
                    player.dropItem(randomCard, true);
                }
            } else {
                // Handle the case where a randomCard is empty and ensure the loop count continues
                i--; // Decrement i to retry getting a card
            }
        }

        // Send the collected rarity messages after all cards are processed
        if (!rarityMessages.isEmpty()) {
            String received = String.join(", ", rarityMessages); // Join messages with commas
            player.sendMessage(Text.literal("You received: " + received).formatted(Formatting.BOLD), false);
        }

        // Decrease the stack size unless the player is in creative mode
        if (!player.isCreative()) {
            stack.decrement(1);
        }

        return TypedActionResult.success(stack);
    }



    private String getRarityFromItem(ItemStack itemStack) {
        // Retrieve the rarity component from the item stack
        Rarity rarityComponent = itemStack.getComponents().getOrDefault(DataComponentTypes.RARITY, null);

        if (rarityComponent != null) {
            String rarity = rarityComponent.name(); // Use the name() method to get the rarity string
            System.out.println("Item rarity found: " + rarity); // Log the found rarity
            return rarity;
        } else {
            System.out.println("Item rarity not found."); // Log if rarity is not found
        }

        return null; // Return null if the rarity component is not present
    }

    private ItemStack getRandomCard(List<ItemStack> possibleItems, Random random) {
        return possibleItems.get(random.nextInt(possibleItems.size()));
    }

    private List<ItemStack> getCardsFromTags(List<TagKey<Item>> tags) {
        List<ItemStack> items = new ArrayList<>();

        for (TagKey<Item> tagKey : tags) {
            Registries.ITEM.getEntryList(tagKey).ifPresent(cardEntries ->
                    cardEntries.stream()
                        .map(entry -> new ItemStack(entry.value()))
                        .forEach(items::add));
        }

        return items;
    }

    private List<ItemStack> getWeightedCardsFromTags(Map<TagKey<Item>, Integer> weightedTags, Random random) {
        List<ItemStack> weightedItems = new ArrayList<>();

        for (Map.Entry<TagKey<Item>, Integer> entry : weightedTags.entrySet()) {
            TagKey<Item> tagKey = entry.getKey();
            int weight = entry.getValue();

            RegistryEntryList<Item> tagItems = Registries.ITEM.getEntryList(tagKey).orElse(null);
            if (tagItems == null) {
                continue;
            }

            for (RegistryEntry<Item> itemEntry : tagItems) {
                for (int i = 0; i < weight; i++) {
                    weightedItems.add(new ItemStack(itemEntry.value()));
                }
            }
        }

        return weightedItems;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        super.appendTooltip(stack, context, tooltip, type);
        int numberOfCards = settings.getNumberOfCards();

        List<TagKey<Item>> unweightedTags = settings.getUnweightedTags();
        for (TagKey<Item> tag : unweightedTags) {
            String tagPath = tag.id().getPath().replaceAll("_", " ");
            String formattedTagPath = toTitleCase(tagPath);
            String rarityColor = getRarityColorFromTag(tagPath);

            tooltip.add(Text.literal("§7Contains: ")
                    .append(Text.literal(rarityColor + formattedTagPath).formatted(Formatting.RESET)));
        }

        Map<TagKey<Item>, Integer> weightedTags = settings.getWeightedTags();
        for (Map.Entry<TagKey<Item>, Integer> entry : weightedTags.entrySet()) {
            TagKey<Item> tag = entry.getKey();
            String tagPath = tag.id().getPath().replaceAll("_", " ");
            String formattedTagPath = toTitleCase(tagPath);
            String rarityColor = getRarityColorFromTag(tagPath);

            int weight = entry.getValue();
            tooltip.add(Text.literal("§7Contains: ")
                    .append(Text.literal(rarityColor + formattedTagPath + " (Weight: " + weight + ")").formatted(Formatting.RESET)));
        }
        tooltip.add(Text.literal("§7Cards: ")
                .append(Text.literal(String.valueOf(numberOfCards)).formatted(Formatting.BOLD)));
    }

    public String getRarityColor(Rarity rarity) {
        return switch (rarity) {
            case COMMON -> "§f"; // White
            case UNCOMMON -> "§e"; // Yellow
            case RARE -> "§9"; // Blue
            case EPIC -> "§5"; // Purple
            default -> "§f"; // Default to white
        };
    }

    private String getRarityColorFromTag(String tagPath) {
        // Custom rarities
        for (CustomCardRarity rarity : CustomCardRarity.values()) {
            if (tagPath.toLowerCase().contains(rarity.getDisplayName().toLowerCase())) {
                return rarity.getColorCode();
            }
        }

        // Vanilla rarity colors
        if (tagPath.equalsIgnoreCase("common")) {
            return "§f";
        } else if (tagPath.toLowerCase().contains("uncommon")) {
            return "§e";
        } else if (tagPath.toLowerCase().contains("rare")) {
            return "§b";
        } else if (tagPath.toLowerCase().contains("epic")) {
            return "§d";
        }

        return "§7";
    }
}