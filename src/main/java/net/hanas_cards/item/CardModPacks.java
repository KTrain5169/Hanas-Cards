package net.hanas_cards.item;

import net.hanas_cards.HanasCardsMod;
import net.hanas_cards.item.Custom.CardPackItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CardModPacks {
    //private static final Map<String, Item> ITEMS = new HashMap<>();

    public static final Item RAINBOW_CARD_PACK = registerItem("rainbow_card_pack",
            new CardPackItem(new CardPackSettings(5,
                    Map.of(),
                    List.of(
                            TagKey.of((Registries.ITEM.getKey()), Identifier.of("hanas_cards", "common_cards")),
                            TagKey.of((Registries.ITEM.getKey()), Identifier.of("hanas_cards", "uncommon_cards")),
                            TagKey.of((Registries.ITEM.getKey()), Identifier.of("hanas_cards", "rare_cards")),
                            TagKey.of((Registries.ITEM.getKey()), Identifier.of("hanas_cards", "epic_cards")),
                            TagKey.of((Registries.ITEM.getKey()), Identifier.of("hanas_cards", "mythic_cards")),
                            TagKey.of((Registries.ITEM.getKey()), Identifier.of("hanas_cards", "legendary_cards"))
                    ))));
    public static final Item OVERWORLD_MOB_CARD_PACK = registerItem("overworld_mob_card_pack",
            new CardPackItem(new CardPackSettings(3,
                    Map.of(),
                    List.of(
                            TagKey.of((Registries.ITEM.getKey()), Identifier.of("hanas_cards", "overworld_mob_cards"))
                    ))));
    public static final Item NETHER_MOB_CARD_PACK = registerItem("nether_mob_card_pack",
            new CardPackItem(new CardPackSettings(3,
                    Map.of(),
                    List.of(
                            TagKey.of((Registries.ITEM.getKey()), Identifier.of("hanas_cards", "nether_mob_cards"))
                    ))));
    public static final Item END_MOB_CARD_PACK = registerItem("end_mob_card_pack",
            new CardPackItem(new CardPackSettings(3,
                    Map.of(),
                    List.of(
                            TagKey.of((Registries.ITEM.getKey()), Identifier.of("hanas_cards", "end_mob_cards"))
                    ))));
    public static final Item SERIES_ONE_CARD_PACK = registerItem("series_one_card_pack",
            new CardPackItem(new CardPackSettings(6,
                    Map.of(),
                    List.of(
                            TagKey.of(Registries.ITEM.getKey(), Identifier.of("hanas_cards", "series_one_cards"))
                    ))));
    public static final Item SERIES_TWO_CARD_PACK = registerItem("series_two_card_pack",
            new CardPackItem(new CardPackSettings(6,
                    Map.of(),
                    List.of(
                            TagKey.of(Registries.ITEM.getKey(), Identifier.of("hanas_cards", "series_two_cards"))
                    ))));

    public static final Item SERIES_ONE_EXPANSION_ONE_CARD_PACK = registerItem("series_one_expansion_one_card_pack",
            new CardPackItem(new CardPackSettings(4,
                    Map.of(),
                    List.of(
                            TagKey.of(Registries.ITEM.getKey(), Identifier.of("hanas_cards", "series_one_expansion_one_cards"))
                    ))));
    public static final Item SERIES_ONE_EXPANSION_TWO_CARD_PACK = registerItem("series_one_expansion_two_card_pack",
            new CardPackItem(new CardPackSettings(3,
                    Map.of(),
                    List.of(
                            TagKey.of(Registries.ITEM.getKey(), Identifier.of("hanas_cards", "series_one_expansion_two_cards"))
                    ))));


    //public static Item get(String name) {
    //    return ITEMS.get(name);
    //}

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(HanasCardsMod.MOD_ID, name), item);
    }

    public static void registerModPacks() {
        HanasCardsMod.LOGGER.info("Registering Mod Cards for " + HanasCardsMod.MOD_ID);
    }
}
