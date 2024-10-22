package net.hanas_cards.util;

import net.hanas_cards.HanasCardsMod;
import net.hanas_cards.component.ModDataComponentTypes;
import net.hanas_cards.item.CardModItems;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.util.Identifier;

public class ModModelPredicates {
    public static void registerModelPredicates() {
        //ModelPredicateProviderRegistry.register(CardModItems.WOLF_ASHEN_CARD, Identifier.of(HanasCardsMod.MOD_ID, "tamed"),
        //        (stack, world, entity, seed) -> stack.get(ModDataComponentTypes.) != null ? 1f : 0F);
    }
}
