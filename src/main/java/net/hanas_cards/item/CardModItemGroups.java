package net.hanas_cards.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.hanas_cards.HanasCardsMod;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static net.hanas_cards.item.CardModItems.*;

public class CardModItemGroups {
    public static final ItemGroup HANAS_CARDS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(HanasCardsMod.MOD_ID, "cards"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cards"))
            .icon(() -> new ItemStack(LUCY_AXOLOTL_CARD)).entries((displayContext, entries) -> {
                        entries.add(CardModPacks.OVERWORLD_MOB_CARD_PACK);
                        entries.add(CardModPacks.NETHER_MOB_CARD_PACK);
                        entries.add(CardModPacks.END_MOB_CARD_PACK);

                        entries.add(CardModPacks.RAINBOW_CARD_PACK);

                        entries.add(CardModPacks.SERIES_ONE_CARD_PACK);
                        entries.add(CardModPacks.SERIES_ONE_EXPANSION_ONE_CARD_PACK);
                        entries.add(CardModPacks.SERIES_ONE_EXPANSION_TWO_CARD_PACK);

                        //entries.add(FLINT_SOURCE_CARD);
                        //entries.add(STONE_SOURCE_CARD);
                        //entries.add(IRON_SOURCE_CARD);
                        //entries.add(EMERALD_SOURCE_CARD);
                        //entries.add(NETHERRACK_SOURCE_CARD);
                        //entries.add(ENDSTONE_SOURCE_CARD);

                        entries.add(ALLAY_CARD);
                        entries.add(BURNING_ALLAY_CARD);

                        entries.add(ARMADILLO_CARD);

                        entries.add(LUCY_AXOLOTL_CARD);
                        entries.add(WILD_AXOLOTL_CARD);
                        entries.add(GOLD_AXOLOTL_CARD);
                        entries.add(CYAN_AXOLOTL_CARD);
                        entries.add(BLUE_AXOLOTL_CARD);
                        entries.add(GREEN_AXOLOTL_CARD);
                        entries.add(MELONOID_AXOLOTL_CARD);
                        entries.add(BLACK_AND_RED_AXOLOTL_CARD);

                        entries.add(SCREAMING_LUCY_AXOLOTL_CARD);
                        entries.add(CACTUS_AXOLOTL_CARD);
                        entries.add(TWO_TAILED_GLOWING_AXOLOTL_CARD);
                        entries.add(ULTRA_VIOLET_AXOLOTL_CARD);

                        entries.add(SKELETON_AXOLOTL_CARD);
                        entries.add(PUMPKIN_AXOLOTL_CARD);

                        entries.add(BAT_CARD);

                        entries.add(ANGRY_BEE_CARD);
                        entries.add(BEE_CARD);
                        entries.add(ANGRY_POLLINATED_BEE_CARD);
                        entries.add(POLLINATED_BEE_CARD);

                        entries.add(GENTLE_BEE_CARD);
                        entries.add(WALDO_BEE_CARD);

                        entries.add(CAMEL_CARD);
                        entries.add(PIRATE_CAMEL_CARD);

                        entries.add(DOLPHIN_CARD);

                        entries.add(FOX_CARD);
                        entries.add(SNOW_FOX_CARD);

                        entries.add(TEMPERATE_FROG_CARD);
                        entries.add(WARM_FROG_CARD);
                        entries.add(COLD_FROG_CARD);
                        entries.add(TADPOLE_CARD);

                        entries.add(CLOWN_TEMPERATE_FROG_CARD);
                        entries.add(CLOWN_WARM_FROG_CARD);
                        entries.add(CLOWN_COLD_FROG_CARD);

                        entries.add(FIREFLY_CARD);

                        entries.add(RED_PARROT_CARD);
                        entries.add(BLUE_PARROT_CARD);
                        entries.add(GREEN_PARROT_CARD);
                        entries.add(CYAN_PARROT_CARD);
                        entries.add(GRAY_PARROT_CARD);

                        entries.add(COWBOY_RED_PARROT_CARD);

                        entries.add(SQUID_CARD);
                        entries.add(GLOW_SQUID_CARD);

                        entries.add(SNIFFER_CARD);

                        // Rabbit
                        entries.add(RABBIT_CARD);
                        entries.add(ALBINO_RABBIT_CARD);
                        entries.add(BLACK_AND_WHITE_RABBIT_CARD);
                        entries.add(BLACK_RABBIT_CARD);
                        entries.add(GOLD_RABBIT_CARD);
                        entries.add(KILLER_RABBIT_CARD);
                        entries.add(SALT_AND_PEPPER_RABBIT_CARD);
                        entries.add(JUMBO_RABBIT_CARD);

                        entries.add(COPYWRITTEN_BLACK_RABBIT_CARD);

                        entries.add(DIAMOND_RABBIT_CARD);

                        entries.add(PEARLARIUM_RABBIT_CARD);
                        entries.add(PETRAMIUNIUM_RABBIT_CARD);
                        entries.add(IRON_RABBIT_CARD);
                        entries.add(COPPER_RABBIT_CARD);

                        entries.add(LAPIS_RABBIT_CARD);
                        entries.add(QUARTZ_RABBIT_CARD);

                        // Chicken
                        entries.add(CHICKEN_CARD);

                        entries.add(DIAMOND_CHICKEN_CARD);
                        entries.add(PEARLARIUM_CHICKEN_CARD);
                        entries.add(PETRAMIUNIUM_CHICKEN_CARD);
                        entries.add(IRON_CHICKEN_CARD);
                        entries.add(COPPER_CHICKEN_CARD);

                        entries.add(LAPIS_CHICKEN_CARD);
                        entries.add(QUARTZ_CHICKEN_CARD);

                        // Cow
                        entries.add(COW_CARD);
                        entries.add(MOOBLOOM_CARD);
                        entries.add(RED_MOOSHROOM_CARD);
                        entries.add(BROWN_MOOSHROOM_CARD);
                        entries.add(WOOLY_COW_CARD);

                        entries.add(PEARLARIUM_COW_CARD);
                        entries.add(PETRAMIUNIUM_COW_CARD);
                        entries.add(IRON_COW_CARD);
                        entries.add(COPPER_COW_CARD);

                        entries.add(LAPIS_COW_CARD);
                        entries.add(QUARTZ_COW_CARD);

                        // Donkey
                        entries.add(DONKEY_CARD);
                        entries.add(SADDLED_DONKEY_CARD);

                        // Horse
                        entries.add(HORSE_CARD);
                        entries.add(ARMORED_HORSE_CARD);
                        entries.add(SKELETON_HORSE_CARD);
                        entries.add(ZOMBIE_HORSE_CARD);

                        entries.add(MULE_CARD);

                        // Sheep
                        for (String color : sheep_colors) {
                            String cardName = color.toLowerCase().replace(" ", "_") + "_sheep_card";
                            Item item = CardModItems.get(cardName);
                            if (item != null) {
                                entries.add(item);
                            } else {
                                // Log error
                                System.err.println("Item not found for: " + cardName + " In CardModItemGroups");
                            }
                        }
                        entries.add(PEARLARIUM_SHEEP_CARD);
                        entries.add(PETRAMIUNIUM_SHEEP_CARD);
                        entries.add(IRON_SHEEP_CARD);
                        entries.add(COPPER_SHEEP_CARD);

                        entries.add(LAPIS_SHEEP_CARD);
                        entries.add(QUARTZ_SHEEP_CARD);

                        entries.add(RAINBOW_SHEEP_CARD);

                        // Pig
                        entries.add(PIG_CARD);
                        entries.add(FLYING_PIG_CARD);

                        entries.add(PEARLARIUM_PIG_CARD);
                        entries.add(PETRAMIUNIUM_PIG_CARD);
                        entries.add(IRON_PIG_CARD);
                        entries.add(COPPER_PIG_CARD);

                        entries.add(LAPIS_PIG_CARD);
                        entries.add(QUARTZ_PIG_CARD);

                        for (String biome : villager_card_biomes) {
                            for (String profession : villager_card_professions) {
                                String cardName = biome.trim().toLowerCase().replace(" ", "_") + "_"
                                        + profession.trim().toLowerCase().replace(" ", "_") + "_villager_card";

                                Item item = CardModItems.get(cardName);

                                if (item != null) {
                                    entries.add(item);
                                } else {
                                    // Log error
                                    System.err.println("Item not found for: " + cardName + " In CardModItemGroups");
                                }
                            }
                        }

                        entries.add(SCREAM_PLAINS_UNEMPLOYED_VILLAGER_CARD);

                        entries.add(IRON_GOLEM_CARD);
                        entries.add(GOLDEN_GOLEM_CARD);
                        entries.add(SNOW_GOLEM_CARD);
                        entries.add(SHEARED_SNOW_GOLEM_CARD);

                        entries.add(TURTLE_CARD);

                        entries.add(OCELOT_CARD);
                        entries.add(BLACK_CAT_CARD);
                        entries.add(BRITISH_SHORTHAIR_CAT_CARD);
                        entries.add(CALICO_CAT_CARD);
                        entries.add(JELLY_CAT_CARD);
                        entries.add(PERSIAN_CAT_CARD);
                        entries.add(RAGDOLL_CAT_CARD);
                        entries.add(RED_CAT_CARD);
                        entries.add(SIAMESE_CAT_CARD);
                        entries.add(TABBY_CAT_CARD);
                        entries.add(TUXEDO_CAT_CARD);
                        entries.add(WHITE_CAT_CARD);

                        entries.add(WOLF_ASHEN_CARD);
                        entries.add(WOLF_BLACK_CARD);
                        entries.add(WOLF_CHESTNUT_CARD);
                        entries.add(WOLF_PALE_CARD);
                        entries.add(WOLF_RUSTY_CARD);
                        entries.add(WOLF_SNOWY_CARD);
                        entries.add(WOLF_SPOTTED_CARD);
                        entries.add(WOLF_STRIPED_CARD);
                        entries.add(WOLF_WOODS_CARD);
                        entries.add(WOLF_ASHEN_ANGRY_CARD);
                        entries.add(WOLF_BLACK_ANGRY_CARD);
                        entries.add(WOLF_CHESTNUT_ANGRY_CARD);
                        entries.add(WOLF_PALE_ANGRY_CARD);
                        entries.add(WOLF_RUSTY_ANGRY_CARD);
                        entries.add(WOLF_SNOWY_ANGRY_CARD);
                        entries.add(WOLF_SPOTTED_ANGRY_CARD);
                        entries.add(WOLF_STRIPED_ANGRY_CARD);
                        entries.add(WOLF_WOODS_ANGRY_CARD);
                        entries.add(WOLF_ASHEN_ARMOR_CARD);
                        entries.add(WOLF_BLACK_ARMOR_CARD);
                        entries.add(WOLF_CHESTNUT_ARMOR_CARD);
                        entries.add(WOLF_PALE_ARMOR_CARD);
                        entries.add(WOLF_RUSTY_ARMOR_CARD);
                        entries.add(WOLF_SNOWY_ARMOR_CARD);
                        entries.add(WOLF_SPOTTED_ARMOR_CARD);
                        entries.add(WOLF_STRIPED_ARMOR_CARD);
                        entries.add(WOLF_WOODS_ARMOR_CARD);

                        for (String wolfBreed: wolf_breed) {
                            for (String color : collar_colors) {
                                String cardName = "tamed_" + wolfBreed.toLowerCase().replace(" ","_") + "_wolf_" +
                                        color.toLowerCase().replace(" ", "_") + "_card";
                                Item item = CardModItems.get(cardName);
                                if (item != null) {
                                    entries.add(item);
                                    System.out.println("Successfully added tamed " + wolfBreed + " wolf card: " + cardName + "To Item Group");
                                } else {
                                    // Error
                                    System.err.println("Item not found for: " + cardName + " In CardModItemGroups");
                                }
                            }
                        }

                        entries.add(PHANTOM_CARD);

                        entries.add(CAVE_SPIDER_CARD);
                        entries.add(SPIDER_CARD);
                        entries.add(INVISIBLE_SPIDER_CARD);

                        entries.add(CREAKING_CARD);
                        entries.add(SLEEPING_CREAKING_CARD);

                        entries.add(CREEPER_CARD);
                        entries.add(CHARGED_CREEPER_CARD);

                        entries.add(ZOMBIE_CARD);
                        entries.add(HUSK_CARD);
                        entries.add(DROWNED_CARD);

                        entries.add(HALLOWEEN_ZOMBIE_CARD);
                        entries.add(CYBER_ZOMBIE_CARD);

                        entries.add(EVOKER_CARD);
                        entries.add(PILLAGER_CARD);
                        entries.add(RAVAGER_CARD);
                        entries.add(VEX_CARD);
                        entries.add(VINDICATOR_CARD);
                        entries.add(WITCH_CARD);
                        entries.add(ILLUSIONER_CARD);
                        entries.add(ICEOLOGER_CARD);

                        entries.add(SKELETON_CARD);
                        entries.add(BOGGED_CARD);
                        entries.add(STRAY_CARD);

                        entries.add(STRIDER_CARD);

                        entries.add(WITHER_SKELETON_CARD);
                        entries.add(WITHER_CARD);
                        entries.add(INVULNERABLE_WITHER_CARD);

                        entries.add(GHAST_CARD);

                        entries.add(BLAZE_CARD);
                        entries.add(WILDFIRE_CARD);

                        entries.add(MAGMA_CUBE_CARD);

                        entries.add(PIGLIN_SWORD_CARD);
                        entries.add(PIGLIN_CROSSBOW_CARD);
                        entries.add(PIGLIN_BRUTE_CARD);
                        entries.add(ZOMBIFIED_PIGLIN_CARD);

                        entries.add(HOGLIN_CARD);
                        entries.add(ZOMBIFIED_HOGLIN_CARD);

                        entries.add(ENDER_DRAGON_CARD);
                        entries.add(GLITCHED_ENDER_DRAGON_CARD);

                        entries.add(ENDERMAN_CARD);

                        entries.add(ENDERMITE_CARD);

                        for (String color : shulker_colors) {
                            String cardName = color.toLowerCase().replace(" ", "_") + "_shulker_card";
                            Item item = CardModItems.get(cardName);
                            if (item != null) {
                                entries.add(item);
                            } else {
                                System.err.println("Item not found for: " + cardName + " In CardModItemGroups");
                            }
                        }

                        entries.add(SHULKER_CARD);

                        entries.add(INVALID_CARD);


                }).build());


    public static void registerCardModItemGroups() {
        HanasCardsMod.LOGGER.info("Registering Item Groups for " + HanasCardsMod.MOD_ID);
    }
}