package net.hanas_cards.datagen;

import net.hanas_cards.config.ModConfigs;
import net.hanas_cards.item.CardModItems;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.hanas_cards.item.CardModPacks;
import net.minecraft.data.client.*;
import net.minecraft.item.Item;

import static net.hanas_cards.item.CardModItems.*;


public class ModModelProvider extends FabricModelProvider {
    //private BiConsumer<Identifier, Supplier<JsonElement>> modelCollector;

    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(CardModPacks.RAINBOW_CARD_PACK, Models.GENERATED);

        itemModelGenerator.register(CardModPacks.OVERWORLD_MOB_CARD_PACK, Models.GENERATED);
        itemModelGenerator.register(CardModPacks.NETHER_MOB_CARD_PACK, Models.GENERATED);
        itemModelGenerator.register(CardModPacks.END_MOB_CARD_PACK, Models.GENERATED);

        itemModelGenerator.register(CardModPacks.SERIES_ONE_CARD_PACK, Models.GENERATED);
        itemModelGenerator.register(CardModPacks.SERIES_TWO_CARD_PACK, Models.GENERATED);

        itemModelGenerator.register(CardModPacks.SERIES_ONE_EXPANSION_ONE_CARD_PACK, Models.GENERATED);
        itemModelGenerator.register(CardModPacks.SERIES_ONE_EXPANSION_TWO_CARD_PACK, Models.GENERATED);

        itemModelGenerator.register(CardModItems.ALLAY_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.BURNING_ALLAY_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.ARMADILLO_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.LUCY_AXOLOTL_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WILD_AXOLOTL_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.GOLD_AXOLOTL_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.CYAN_AXOLOTL_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.BLUE_AXOLOTL_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.GREEN_AXOLOTL_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.MELONOID_AXOLOTL_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.BLACK_AND_RED_AXOLOTL_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.SCREAMING_LUCY_AXOLOTL_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.CACTUS_AXOLOTL_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.TWO_TAILED_GLOWING_AXOLOTL_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.ULTRA_VIOLET_AXOLOTL_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.SKELETON_AXOLOTL_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.PUMPKIN_AXOLOTL_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.BAT_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.ANGRY_BEE_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.BEE_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.ANGRY_POLLINATED_BEE_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.POLLINATED_BEE_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.GENTLE_BEE_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WALDO_BEE_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.CAMEL_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.PIRATE_CAMEL_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.DOLPHIN_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.FOX_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.SNOW_FOX_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.TEMPERATE_FROG_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WARM_FROG_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.COLD_FROG_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.TADPOLE_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.CLOWN_TEMPERATE_FROG_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.CLOWN_WARM_FROG_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.CLOWN_COLD_FROG_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.FIREFLY_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.RED_PARROT_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.BLUE_PARROT_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.GREEN_PARROT_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.CYAN_PARROT_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.GRAY_PARROT_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.COWBOY_RED_PARROT_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.SQUID_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.GLOW_SQUID_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.SNIFFER_CARD, Models.GENERATED);

        // Rabbit
        itemModelGenerator.register(CardModItems.RABBIT_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.ALBINO_RABBIT_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.BLACK_AND_WHITE_RABBIT_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.BLACK_RABBIT_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.GOLD_RABBIT_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.KILLER_RABBIT_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.SALT_AND_PEPPER_RABBIT_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.JUMBO_RABBIT_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.COPYWRITTEN_BLACK_RABBIT_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.DIAMOND_RABBIT_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.PEARLARIUM_RABBIT_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.PETRAMIUNIUM_RABBIT_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.IRON_RABBIT_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.COPPER_RABBIT_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.LAPIS_RABBIT_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.QUARTZ_RABBIT_CARD, Models.GENERATED);

        // Chicken
        itemModelGenerator.register(CardModItems.CHICKEN_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.DIAMOND_CHICKEN_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.PEARLARIUM_CHICKEN_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.PETRAMIUNIUM_CHICKEN_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.IRON_CHICKEN_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.COPPER_CHICKEN_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.LAPIS_CHICKEN_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.QUARTZ_CHICKEN_CARD, Models.GENERATED);

        // Cow
        itemModelGenerator.register(CardModItems.COW_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.MOOBLOOM_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.RED_MOOSHROOM_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.BROWN_MOOSHROOM_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WOOLY_COW_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.PEARLARIUM_COW_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.PETRAMIUNIUM_COW_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.IRON_COW_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.COPPER_COW_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.LAPIS_COW_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.QUARTZ_COW_CARD, Models.GENERATED);

        // Donkey
        itemModelGenerator.register(CardModItems.DONKEY_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.SADDLED_DONKEY_CARD, Models.GENERATED);

        // Horse
        itemModelGenerator.register(CardModItems.HORSE_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.ARMORED_HORSE_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.SKELETON_HORSE_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.ZOMBIE_HORSE_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.MULE_CARD, Models.GENERATED);

        // Sheep
        for (String color : sheep_colors) {
            String cardName = color.toLowerCase().replace(" ", "_") + "_sheep_card";
            Item item = CardModItems.get(cardName);
            if (item != null) {
                itemModelGenerator.register(item, Models.GENERATED);
                if (ModConfigs.enableDebug) {
                    System.out.println("Successfully registered model for: " + cardName + " In ModelProvider");
                }
            } else if (ModConfigs.enableDebug) {
                System.err.println("Item not found for: " + cardName + " In ModelProvider");
            }
        }

        itemModelGenerator.register(CardModItems.PEARLARIUM_SHEEP_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.PETRAMIUNIUM_SHEEP_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.IRON_SHEEP_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.COPPER_SHEEP_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.LAPIS_SHEEP_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.QUARTZ_SHEEP_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.RAINBOW_SHEEP_CARD, Models.GENERATED);

        // Pig
        itemModelGenerator.register(CardModItems.PIG_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.FLYING_PIG_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.PEARLARIUM_PIG_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.PETRAMIUNIUM_PIG_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.IRON_PIG_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.COPPER_PIG_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.LAPIS_PIG_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.QUARTZ_PIG_CARD, Models.GENERATED);

        for (String biome : villager_card_biomes) {
            for (String profession : villager_card_professions) {
                String cardName = biome.trim().toLowerCase().replace(" ", "_") + "_"
                        + profession.trim().toLowerCase().replace(" ", "_") + "_villager_card";

                Item item = CardModItems.get(cardName);

                if (item != null) {
                    itemModelGenerator.register(item, Models.GENERATED);
                    if (ModConfigs.enableDebug) {
                        System.out.println("Successfully registered model for: " + cardName + " In ModelProvider");
                    };
                } else if (ModConfigs.enableDebug) {
                    System.err.println("Item not found for: " + cardName + " In ModelProvider");
                }
            }
        }

        itemModelGenerator.register(CardModItems.SCREAM_PLAINS_UNEMPLOYED_VILLAGER_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.IRON_GOLEM_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.GOLDEN_GOLEM_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.SNOW_GOLEM_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.SHEARED_SNOW_GOLEM_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.TURTLE_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.OCELOT_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.BLACK_CAT_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.BRITISH_SHORTHAIR_CAT_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.CALICO_CAT_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.JELLY_CAT_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.PERSIAN_CAT_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.RAGDOLL_CAT_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.RED_CAT_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.SIAMESE_CAT_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.TABBY_CAT_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.TUXEDO_CAT_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WHITE_CAT_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.WOLF_ASHEN_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WOLF_BLACK_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WOLF_CHESTNUT_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WOLF_PALE_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WOLF_RUSTY_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WOLF_SNOWY_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WOLF_SPOTTED_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WOLF_STRIPED_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WOLF_WOODS_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.WOLF_ASHEN_ANGRY_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WOLF_BLACK_ANGRY_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WOLF_CHESTNUT_ANGRY_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WOLF_PALE_ANGRY_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WOLF_RUSTY_ANGRY_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WOLF_SNOWY_ANGRY_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WOLF_SPOTTED_ANGRY_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WOLF_STRIPED_ANGRY_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WOLF_WOODS_ANGRY_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.WOLF_ASHEN_ARMOR_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WOLF_BLACK_ARMOR_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WOLF_CHESTNUT_ARMOR_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WOLF_PALE_ARMOR_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WOLF_RUSTY_ARMOR_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WOLF_SNOWY_ARMOR_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WOLF_SPOTTED_ARMOR_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WOLF_STRIPED_ARMOR_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WOLF_WOODS_ARMOR_CARD, Models.GENERATED);

        for (String wolfBreed: wolf_breed) {
            for (String color : collar_colors) {
                String cardName = "tamed_" + wolfBreed.toLowerCase().replace(" ","_") + "_wolf_" +
                        color.toLowerCase().replace(" ", "_") + "_card";
                Item item = CardModItems.get(cardName);
                if (item != null) {
                    itemModelGenerator.register(item, Models.GENERATED);
                    if (ModConfigs.enableDebug) {
                        System.out.println("Successfully registered model for: " + cardName + " In ModelProvider");
                    };
                } else if (ModConfigs.enableDebug) {
                    System.err.println("Item not found for: " + cardName + " In ModelProvider");
                }
            }
        }

        itemModelGenerator.register(CardModItems.PHANTOM_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.CAVE_SPIDER_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.SPIDER_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.INVISIBLE_SPIDER_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.CREAKING_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.SLEEPING_CREAKING_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.CREEPER_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.CHARGED_CREEPER_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.ZOMBIE_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.HUSK_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.DROWNED_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.HALLOWEEN_ZOMBIE_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.CYBER_ZOMBIE_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.EVOKER_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.PILLAGER_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.RAVAGER_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.VEX_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.VINDICATOR_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WITCH_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.ILLUSIONER_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.ICEOLOGER_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.SKELETON_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.BOGGED_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.STRAY_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.STRIDER_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.WITHER_SKELETON_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WITHER_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.INVULNERABLE_WITHER_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.GHAST_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.BLAZE_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.WILDFIRE_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.MAGMA_CUBE_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.PIGLIN_SWORD_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.PIGLIN_CROSSBOW_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.PIGLIN_BRUTE_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.ZOMBIFIED_PIGLIN_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.HOGLIN_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.ZOMBIFIED_HOGLIN_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.ENDER_DRAGON_CARD, Models.GENERATED);
        itemModelGenerator.register(CardModItems.GLITCHED_ENDER_DRAGON_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.ENDERMAN_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.ENDERMITE_CARD, Models.GENERATED);

        for (String color : shulker_colors) {
            String cardName = color.toLowerCase().replace(" ", "_") + "_shulker_card";
            Item item = CardModItems.get(cardName);
            if (item != null) {
                itemModelGenerator.register(item, Models.GENERATED);
                if (ModConfigs.enableDebug) {
                    System.out.println("Successfully registered model for: " + cardName + " In ModelProvider");
                };
            } else if (ModConfigs.enableDebug) {
                System.err.println("Item not found for: " + cardName + " In ModelProvider");
            }
        }

        itemModelGenerator.register(CardModItems.SHULKER_CARD, Models.GENERATED);

        itemModelGenerator.register(CardModItems.INVALID_CARD, Models.GENERATED);
    }
}