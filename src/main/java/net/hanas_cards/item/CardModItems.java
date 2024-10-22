package net.hanas_cards.item;

import net.hanas_cards.HanasCardsMod;
import net.hanas_cards.item.Custom.CardItem;
import net.hanas_cards.item.Custom.FlyingPigCard;
import net.hanas_cards.item.Custom.TamedWolfCard;
import net.hanas_cards.util.CustomCardRarity;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.HashMap;
import java.util.Map;

import static net.hanas_cards.util.CustomCardRarity.*;

/*
todo
 small pack updates
 ----
 villager variants (village pack update)
 ----
 elder guardian, guardian, pufferfish, + new ocean mob variants (Sea pack update)
 ----
 panda + variants (Panda pack update)
 ----
 warden, silverfish, llamas, goats, wandering trader, trader llama (Mountain exploration pack update)
 ----
 breeze (Trial pack update)
 ----
 add slimed mob pack (slime cow, slime chicken, slime, ect.) (Slimed pack update)
 ----
 add golden mob pack (golden chicken, golden cow, golden frog, ect.) (Golden pack update)
 ----
 add minecraft earth all variants (muddy pig, ect.) (Minecraft earth pack update)
 ----
 dev cards
 block cards
 item cards
 mod integration???
*/


public class CardModItems {

    //public static final Item  = registerItem("",
    //        new CardItem(new Item.Settings(), "", "", "", Rarity.COMMON));

    private static final Map<String, Item> ITEMS = new HashMap<>();

    //public static final Item FLINT_SOURCE_CARD = registerItem("flint_source_card",
    //        new SourceCardItem(new Item.Settings(), SourceType.FLINT, 1, Rarity.COMMON));
    //public static final Item STONE_SOURCE_CARD = registerItem("stone_source_card",
    //        new SourceCardItem(new Item.Settings(), SourceType.STONE, 1, Rarity.COMMON));
    //public static final Item IRON_SOURCE_CARD = registerItem("iron_source_card",
    //        new SourceCardItem(new Item.Settings(), SourceType.IRON, 1, Rarity.COMMON));
    //public static final Item EMERALD_SOURCE_CARD = registerItem("emerald_source_card",
    //        new SourceCardItem(new Item.Settings(), SourceType.EMERALD, 1, Rarity.COMMON));
    //public static final Item NETHERRACK_SOURCE_CARD = registerItem("netherrack_source_card",
    //        new SourceCardItem(new Item.Settings(), SourceType.NETHERRACK, 1, Rarity.COMMON));
    //public static final Item ENDSTONE_SOURCE_CARD = registerItem("endstone_source_card",
    //        new SourceCardItem(new Item.Settings(), SourceType.ENDSTONE, 1, Rarity.COMMON));


    //Overworld
    //Passive
    // Allay
    public static final Item ALLAY_CARD = registerItem("allay_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Allay", "Default", Rarity.UNCOMMON));
    public static final Item BURNING_ALLAY_CARD = registerItem("burning_allay_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Allay", "Burning", Rarity.RARE));

    // Armadillo
    public static final Item ARMADILLO_CARD = registerItem("armadillo_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Armadillo", "Default", Rarity.COMMON));

    // Axolotl
    public static final Item LUCY_AXOLOTL_CARD = registerItem("lucy_axolotl_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Axolotl", "§dLucy", Rarity.COMMON));
    public static final Item WILD_AXOLOTL_CARD = registerItem("wild_axolotl_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Axolotl", "§4Wild", Rarity.COMMON));
    public static final Item GOLD_AXOLOTL_CARD = registerItem("gold_axolotl_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Axolotl", "§eGold", Rarity.COMMON));
    public static final Item CYAN_AXOLOTL_CARD = registerItem("cyan_axolotl_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Axolotl", "§3Cyan", Rarity.COMMON));
    public static final Item BLUE_AXOLOTL_CARD = registerItem("blue_axolotl_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Axolotl", "§9Blue", Rarity.UNCOMMON));
    public static final Item GREEN_AXOLOTL_CARD = registerItem("green_axolotl_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Axolotl", "§2Green", Rarity.UNCOMMON));
    public static final Item MELONOID_AXOLOTL_CARD = registerItem("melonoid_axolotl_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Axolotl", "Melonoid", Rarity.RARE));
    public static final Item BLACK_AND_RED_AXOLOTL_CARD = registerItem("black_and_red_axolotl_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Axolotl", "§8Black §7And §cRed", Rarity.RARE));

    public static final Item SCREAMING_LUCY_AXOLOTL_CARD = registerItem("screaming_lucy_axolotl_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Axolotl", "Screaming §dLucy", Rarity.EPIC));
    public static final Item CACTUS_AXOLOTL_CARD = registerItem("cactus_axolotl_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Axolotl", "§2Cactus", Rarity.COMMON));
    public static final Item TWO_TAILED_GLOWING_AXOLOTL_CARD = registerItem("two_tailed_glowing_axolotl_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Axolotl", "Glowing (Two Tailed)", Rarity.RARE));
    public static final Item ULTRA_VIOLET_AXOLOTL_CARD = registerItem("ultra_violet_axolotl_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Axolotl", "Ultra Violet", Rarity.EPIC));

    public static final Item SKELETON_AXOLOTL_CARD = registerItem("skeleton_axolotl_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Axolotl", "Skeleton", Rarity.UNCOMMON));
    public static final Item PUMPKIN_AXOLOTL_CARD = registerItem("pumpkin_axolotl_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Axolotl", "Pumpkin", Rarity.UNCOMMON));

    // Bat
    public static final Item BAT_CARD = registerItem("bat_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Bat", "§4Default", Rarity.COMMON));

    // Bee
    public static final Item ANGRY_BEE_CARD = registerItem("angry_bee_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Angry Bee", "§4Angry", Rarity.COMMON));
    public static final Item BEE_CARD = registerItem("bee_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Bee", "Default", Rarity.COMMON));
    public static final Item ANGRY_POLLINATED_BEE_CARD = registerItem("angry_pollinated_bee_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Angry Bee", "§4Angry Pollinated", Rarity.UNCOMMON));
    public static final Item POLLINATED_BEE_CARD = registerItem("pollinated_bee_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Bee", "Pollinated", Rarity.UNCOMMON));
    public static final Item GENTLE_BEE_CARD = registerItem("gentle_bee_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Bee", "Gentle", Rarity.EPIC));

    public static final Item WALDO_BEE_CARD = registerItem("waldo_bee_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Bee", "Waldo", Rarity.COMMON));

    // Camel
    public static final Item CAMEL_CARD = registerItem("camel_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Camel", "Default", Rarity.COMMON));

    public static final Item PIRATE_CAMEL_CARD = registerItem("pirate_camel_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Camel", "Pirate", Rarity.COMMON));

    // Dolphin
    public static final Item DOLPHIN_CARD = registerItem("dolphin_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Dolphin", "Default", Rarity.COMMON));

    // Fox
    public static final Item FOX_CARD = registerItem("fox_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Fox", "Default", Rarity.COMMON));
    public static final Item SNOW_FOX_CARD = registerItem("snow_fox_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Fox", "§bSnowy", Rarity.COMMON));

    // Frog
    public static final Item TEMPERATE_FROG_CARD = registerItem("temperate_frog_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Frog", "Temperate", Rarity.COMMON));
    public static final Item WARM_FROG_CARD = registerItem("warm_frog_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Frog", "Warm", Rarity.COMMON));
    public static final Item COLD_FROG_CARD = registerItem("cold_frog_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Frog", "Cold", Rarity.UNCOMMON));
    public static final Item TADPOLE_CARD = registerItem("tadpole_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Frog", "Tadpole", Rarity.COMMON));

    public static final Item CLOWN_TEMPERATE_FROG_CARD = registerItem("clown_temperate_frog_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Frog", "Clown Temperate", Rarity.COMMON));
    public static final Item CLOWN_WARM_FROG_CARD = registerItem("clown_warm_frog_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Frog", "Clown Warm", Rarity.COMMON));
    public static final Item CLOWN_COLD_FROG_CARD = registerItem("clown_cold_frog_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Frog", "Clown Cold", Rarity.UNCOMMON));

    // Firefly
    public static final Item FIREFLY_CARD = registerItem("firefly_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Passive", "Firefly", Rarity.UNCOMMON));

    // Parrot
    public static final Item RED_PARROT_CARD = registerItem("red_parrot_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Parrot", "Red", Rarity.UNCOMMON));
    public static final Item BLUE_PARROT_CARD = registerItem("blue_parrot_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Parrot", "Blue", Rarity.UNCOMMON));
    public static final Item GREEN_PARROT_CARD = registerItem("green_parrot_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Parrot", "Green", Rarity.UNCOMMON));
    public static final Item CYAN_PARROT_CARD = registerItem("cyan_parrot_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Parrot", "Cyan", Rarity.UNCOMMON));
    public static final Item GRAY_PARROT_CARD = registerItem("gray_parrot_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Parrot", "Gray", Rarity.UNCOMMON));

    public static final Item COWBOY_RED_PARROT_CARD = registerItem("cowboy_red_parrot_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Parrot", "Cowboy Red", Rarity.UNCOMMON));

    // Squid
    public static final Item SQUID_CARD = registerItem("squid_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Squid", "Default", Rarity.COMMON));
    public static final Item GLOW_SQUID_CARD = registerItem("glow_squid_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Squid", "§3Glow", Rarity.COMMON));

    // Sniffer
    public static final Item SNIFFER_CARD = registerItem("sniffer_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Sniffer", "Default", Rarity.RARE));

    //Farm Animals
    //Chicken
    public static final Item CHICKEN_CARD = registerItem("chicken_card",
             new CardItem(new Item.Settings(), "§2Overworld", "Chicken", "Default", Rarity.COMMON));
    public static final Item DIAMOND_CHICKEN_CARD = registerItem("diamond_chicken_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Chicken", "§3Diamond", Rarity.EPIC));

    public static final Item PEARLARIUM_CHICKEN_CARD = registerItem("pearlarium_chicken_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Chicken", "Pearlarium", Rarity.EPIC));
    public static final Item PETRAMIUNIUM_CHICKEN_CARD = registerItem("petramiunium_chicken_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Chicken", "Petramiunium", Rarity.EPIC));
    public static final Item IRON_CHICKEN_CARD = registerItem("iron_chicken_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Chicken", "§fIron", Rarity.UNCOMMON));
    public static final Item COPPER_CHICKEN_CARD = registerItem("copper_chicken_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Chicken", "Copper", Rarity.UNCOMMON));

    public static final Item LAPIS_CHICKEN_CARD = registerItem("lapis_chicken_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Chicken", "Lapis", Rarity.RARE));
    public static final Item QUARTZ_CHICKEN_CARD = registerItem("quartz_chicken_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Chicken", "Quartz", Rarity.RARE));

    // COW
    public static final Item COW_CARD = registerItem("cow_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cow", "Default", Rarity.COMMON));
    public static final Item RED_MOOSHROOM_CARD = registerItem("red_mooshroom_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cow", "§cRed Mooshroom", Rarity.UNCOMMON));
    public static final Item BROWN_MOOSHROOM_CARD = registerItem("brown_mooshroom_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cow", "§4Brown Mooshroom", Rarity.UNCOMMON));
    public static final Item MOOBLOOM_CARD = registerItem("moobloom_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cow", "§eMoobloom", Rarity.RARE));
    public static final Item WOOLY_COW_CARD = registerItem("wooly_cow_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cow", "§4Wooly", Rarity.RARE));

    public static final Item PEARLARIUM_COW_CARD = registerItem("pearlarium_cow_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cow", "Pearlarium", Rarity.EPIC));
    public static final Item PETRAMIUNIUM_COW_CARD = registerItem("petramiunium_cow_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cow", "Petramiunium", Rarity.EPIC));
    public static final Item IRON_COW_CARD = registerItem("iron_cow_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cow", "§fIron", Rarity.UNCOMMON));
    public static final Item COPPER_COW_CARD = registerItem("copper_cow_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cow", "Copper", Rarity.UNCOMMON));

    public static final Item LAPIS_COW_CARD = registerItem("lapis_cow_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cow", "Lapis", Rarity.RARE));
    public static final Item QUARTZ_COW_CARD = registerItem("quartz_cow_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cow", "Quartz", Rarity.RARE));

    // Donkey
    public static final Item DONKEY_CARD = registerItem("donkey_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Donkey", "Default", Rarity.COMMON));
    public static final Item SADDLED_DONKEY_CARD = registerItem("saddled_donkey_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Donkey", "Saddled", Rarity.COMMON));

    // Horse
    public static final Item HORSE_CARD = registerItem("horse_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Horse", "Default", Rarity.COMMON));
    public static final Item ARMORED_HORSE_CARD = registerItem("armored_horse_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Horse", "Armored", Rarity.COMMON));
    public static final Item SKELETON_HORSE_CARD = registerItem("skeleton_horse_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Horse", "Skeleton", Rarity.RARE));
    public static final Item ZOMBIE_HORSE_CARD = registerItem("zombie_horse_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Horse", "Zombie", Rarity.RARE));

    // Mule
    public static final Item MULE_CARD = registerItem("mule_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Hybrid", "Default", Rarity.COMMON));

    // Rabbit
    public static final Item RABBIT_CARD = registerItem("rabbit_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Rabbit", "§4Default", Rarity.COMMON));
    public static final Item ALBINO_RABBIT_CARD = registerItem("albino_rabbit_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Rabbit", "§fAlbino", Rarity.COMMON));
    public static final Item BLACK_AND_WHITE_RABBIT_CARD = registerItem("black_and_white_rabbit_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Rabbit", "§8Black §7And §fWhite", Rarity.COMMON));
    public static final Item BLACK_RABBIT_CARD = registerItem("black_rabbit_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Rabbit", "§8Black", Rarity.COMMON));
    public static final Item GOLD_RABBIT_CARD = registerItem("gold_rabbit_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Rabbit", "§6Gold", Rarity.COMMON));
    public static final Item KILLER_RABBIT_CARD = registerItem("killer_rabbit_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Rabbit", "§4Killer", Rarity.UNCOMMON));
    public static final Item SALT_AND_PEPPER_RABBIT_CARD = registerItem("salt_and_pepper_rabbit_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Rabbit", "§fSalt §7And §8Pepper", Rarity.COMMON));
    public static final Item JUMBO_RABBIT_CARD = registerItem("jumbo_rabbit_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Rabbit", "§4Jumbo", Rarity.RARE));

    public static final Item COPYWRITTEN_BLACK_RABBIT_CARD = registerItem("copywritten_black_rabbit_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Rabbit", "Copywritten §8Black", Rarity.UNCOMMON));

    public static final Item PEARLARIUM_RABBIT_CARD = registerItem("pearlarium_rabbit_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Rabbit", "Pearlarium", Rarity.EPIC));
    public static final Item PETRAMIUNIUM_RABBIT_CARD = registerItem("petramiunium_rabbit_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Rabbit", "Petramiunium", Rarity.EPIC));
    public static final Item IRON_RABBIT_CARD = registerItem("iron_rabbit_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Rabbit", "§fIron", Rarity.UNCOMMON));
    public static final Item COPPER_RABBIT_CARD = registerItem("copper_rabbit_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Rabbit", "Copper", Rarity.UNCOMMON));

    public static final Item LAPIS_RABBIT_CARD = registerItem("lapis_rabbit_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Rabbit", "Lapis", Rarity.RARE));
    public static final Item QUARTZ_RABBIT_CARD = registerItem("quartz_rabbit_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Rabbit", "Quartz", Rarity.RARE));
    public static final Item DIAMOND_RABBIT_CARD = registerItem("diamond_rabbit_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Rabbit", "§3Diamond", Rarity.EPIC));

    // Sheep
    public static final String[] sheep_colors = {
            "Red", "Orange", "Yellow", "Lime", "Green", "Cyan",
            "Light Blue", "Blue", "Purple", "Magenta", "Pink", "Gray", "Light Gray", "Black", "Brown", "White"
    };

    public static void registerSheepCards() {
        for (String color : sheep_colors) {
            String cardName = color.toLowerCase().replace(" ", "_") + "_sheep_card";
            String variant = "§" + getSheepColorCode(color) + color + " Sheep";

            Item sheepCard = new CardItem(new Item.Settings(), "§2Overworld", "Sheep", variant, Rarity.COMMON);
            //System.out.println("Successfully registered sheep card: " + cardName);

            registerItem(cardName, sheepCard);
            ITEMS.put(cardName, sheepCard);
        }
        System.out.println("Successfully registered Sheep Cards");
    }

    // Sheep Color Codes
    public static String getSheepColorCode(String color) {
        return switch (color) {
            case "Red" -> "c";
            case "Orange" -> "6";
            case "Yellow" -> "e";
            case "Lime" -> "a";
            case "Green" -> "2";
            case "Cyan" -> "3";
            case "Light Blue" -> "b";
            case "Blue" -> "9";
            case "Purple" -> "5";
            case "Magenta" -> "d";
            case "Pink" -> "d";
            case "Gray" -> "8";
            case "Light Gray" -> "7";
            case "Black" -> "8";
            case "Brown" -> "4";
            case "White" -> "f";
            default -> "f";
        };
    }

    public static final Item PEARLARIUM_SHEEP_CARD = registerItem("pearlarium_sheep_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Sheep", "Pearlarium", Rarity.EPIC));
    public static final Item PETRAMIUNIUM_SHEEP_CARD = registerItem("petramiunium_sheep_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Sheep", "Petramiunium", Rarity.EPIC));
    public static final Item IRON_SHEEP_CARD = registerItem("iron_sheep_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Sheep", "§fIron", Rarity.UNCOMMON));
    public static final Item COPPER_SHEEP_CARD = registerItem("copper_sheep_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Sheep", "Copper", Rarity.UNCOMMON));

    public static final Item LAPIS_SHEEP_CARD = registerItem("lapis_sheep_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Sheep", "Lapis", Rarity.RARE));
    public static final Item QUARTZ_SHEEP_CARD = registerItem("quartz_sheep_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Sheep", "Quartz", Rarity.RARE));

    public static final Item RAINBOW_SHEEP_CARD = registerItem("rainbow_sheep_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Sheep", "§cR§6A§eI§aN§2B§bO§3W", MYTHIC));

    // Pig
    public static final Item PIG_CARD = registerItem("pig_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Pig", "Default", Rarity.COMMON));

    public static final Item FLYING_PIG_CARD = registerItem("flying_pig_card",
            new FlyingPigCard(new Item.Settings().fireproof(), "§2Overworld", "Pig", "Flying", CustomCardRarity.LEGENDARY)
                    );

    public static final Item PEARLARIUM_PIG_CARD = registerItem("pearlarium_pig_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Pig", "Pearlarium", Rarity.EPIC));
    public static final Item PETRAMIUNIUM_PIG_CARD = registerItem("petramiunium_pig_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Pig", "Petramiunium", Rarity.EPIC));
    public static final Item IRON_PIG_CARD = registerItem("iron_pig_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Pig", "§fIron", Rarity.UNCOMMON));
    public static final Item COPPER_PIG_CARD = registerItem("copper_pig_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Pig", "Copper", Rarity.UNCOMMON));

    public static final Item LAPIS_PIG_CARD = registerItem("lapis_pig_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Pig", "Lapis", Rarity.RARE));
    public static final Item QUARTZ_PIG_CARD = registerItem("quartz_pig_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Pig", "Quartz", Rarity.RARE));

    // Villager
    public static final String[] villager_card_professions = {
            "Unemployed", "Farmer", "Fisherman", "Shepherd", "Fletcher",
            "Librarian", "Cleric", "Armorer", "Toolsmith", "Weaponsmith", "Butcher", "Cartographer", "Nitwit"
    };
    //todo all the biome variants in a later release
    public static final String[] villager_card_biomes = {
            "Plains"//, "Desert", "Savanna", "Taiga", "Swamp", "Jungle", "Snowy"
    };

    public static void registerVillagerCards() {
        for (String biome : villager_card_biomes) {
            for (String profession : villager_card_professions) {
                String cardName = biome.toLowerCase().replace(" ", "_") + "_"
                        + profession.toLowerCase().replace(" ", "_")
                        + "_villager_card";

                String variant = (biome + " " + profession);

                Item villagerCard = new CardItem(new Item.Settings(), "§2Overworld", "Villager", variant, Rarity.COMMON);
                //System.out.println("Successfully registered villager card: " + cardName);

                registerItem(cardName, villagerCard);
                ITEMS.put(cardName, villagerCard);
            }
        }
        System.out.println("Successfully registered Villager Cards");
    }

    public static final Item SCREAM_PLAINS_UNEMPLOYED_VILLAGER_CARD = registerItem("scream_plains_unemployed_villager_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Villager", "Default", Rarity.COMMON));

    // Golem
    public static final Item IRON_GOLEM_CARD = registerItem("iron_golem_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Golem", "Default", Rarity.COMMON));
    public static final Item GOLDEN_GOLEM_CARD = registerItem("golden_golem_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Golem", "Default", Rarity.RARE));
    public static final Item SNOW_GOLEM_CARD = registerItem("snow_golem_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Golem", "Default", Rarity.COMMON));
    public static final Item SHEARED_SNOW_GOLEM_CARD = registerItem("sheared_snow_golem_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Golem", "Sheared", Rarity.COMMON));

    // Turtle
    public static final Item TURTLE_CARD = registerItem("turtle_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Turtle", "Default", Rarity.COMMON));

    // Pet
    // Ocelot & Cat
    public static final Item OCELOT_CARD = registerItem("ocelot_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cat", "Default", Rarity.RARE));
    public static final Item BLACK_CAT_CARD = registerItem("black_cat_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cat", "§8Black", Rarity.RARE));
    public static final Item BRITISH_SHORTHAIR_CAT_CARD = registerItem("british_shorthair_cat_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cat", "§7British", Rarity.UNCOMMON));
    public static final Item CALICO_CAT_CARD = registerItem("calico_cat_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cat", "§8Cal§6ico", Rarity.UNCOMMON));
    public static final Item JELLY_CAT_CARD = registerItem("jelly_cat_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cat", "§fJelly", Rarity.UNCOMMON));
    public static final Item PERSIAN_CAT_CARD = registerItem("persian_cat_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cat", "§ePersian", Rarity.UNCOMMON));
    public static final Item RAGDOLL_CAT_CARD = registerItem("ragdoll_cat_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cat", "§fRagdoll", Rarity.UNCOMMON));
    public static final Item RED_CAT_CARD = registerItem("red_cat_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cat", "§cRed", Rarity.UNCOMMON));
    public static final Item SIAMESE_CAT_CARD = registerItem("siamese_cat_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cat", "§7Siamese", Rarity.UNCOMMON));
    public static final Item TABBY_CAT_CARD = registerItem("tabby_cat_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cat", "§6Tabby", Rarity.UNCOMMON));
    public static final Item TUXEDO_CAT_CARD = registerItem("tuxedo_cat_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cat", "§8Tuxedo", Rarity.UNCOMMON));
    public static final Item WHITE_CAT_CARD = registerItem("white_cat_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Cat", "§fWhite", Rarity.UNCOMMON));

    // Wolf & Dog
    // Normal Variants
    public static final Item WOLF_ASHEN_CARD = registerItem("wolf_ashen_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§7Wolf (Ashen)", Rarity.COMMON));
    public static final Item WOLF_BLACK_CARD = registerItem("wolf_black_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§8Wolf (Black)", Rarity.COMMON));
    public static final Item WOLF_CHESTNUT_CARD = registerItem("wolf_chestnut_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§cWolf (Chestnut)", Rarity.COMMON));
    public static final Item WOLF_PALE_CARD = registerItem("wolf_pale_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§fWolf (Pale)", Rarity.COMMON));
    public static final Item WOLF_RUSTY_CARD = registerItem("wolf_rusty_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§6Wolf (Rusty)", Rarity.COMMON));
    public static final Item WOLF_SNOWY_CARD = registerItem("wolf_snowy_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§fWolf (Snowy)", Rarity.COMMON));
    public static final Item WOLF_SPOTTED_CARD = registerItem("wolf_spotted_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§dWolf (Spotted)", Rarity.COMMON));
    public static final Item WOLF_STRIPED_CARD = registerItem("wolf_striped_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§8Wolf (Striped)", Rarity.COMMON));
    public static final Item WOLF_WOODS_CARD = registerItem("wolf_woods_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§2Wolf (Woods)", Rarity.COMMON));

    // Angry Variants
    public static final Item WOLF_ASHEN_ANGRY_CARD = registerItem("wolf_ashen_angry_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§4Angry Wolf (Ashen)", Rarity.UNCOMMON));
    public static final Item WOLF_BLACK_ANGRY_CARD = registerItem("wolf_black_angry_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§4Angry Wolf (Black)", Rarity.UNCOMMON));
    public static final Item WOLF_CHESTNUT_ANGRY_CARD = registerItem("wolf_chestnut_angry_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§4Angry Wolf (Chestnut)", Rarity.UNCOMMON));
    public static final Item WOLF_PALE_ANGRY_CARD = registerItem("wolf_pale_angry_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§4Angry Wolf (Pale)", Rarity.UNCOMMON));
    public static final Item WOLF_RUSTY_ANGRY_CARD = registerItem("wolf_rusty_angry_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§4Angry Wolf (Rusty)", Rarity.UNCOMMON));
    public static final Item WOLF_SNOWY_ANGRY_CARD = registerItem("wolf_snowy_angry_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§4Angry Wolf (Snowy)", Rarity.UNCOMMON));
    public static final Item WOLF_SPOTTED_ANGRY_CARD = registerItem("wolf_spotted_angry_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§4Angry Wolf (Spotted)", Rarity.UNCOMMON));
    public static final Item WOLF_STRIPED_ANGRY_CARD = registerItem("wolf_striped_angry_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§4Angry Wolf (Striped)", Rarity.UNCOMMON));
    public static final Item WOLF_WOODS_ANGRY_CARD = registerItem("wolf_woods_angry_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§4Angry Wolf (Woods)", Rarity.UNCOMMON));

    // Armored Variants
    public static final Item WOLF_ASHEN_ARMOR_CARD = registerItem("wolf_ashen_armor_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§7Armored Wolf (Ashen)", Rarity.RARE));
    public static final Item WOLF_BLACK_ARMOR_CARD = registerItem("wolf_black_armor_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§8Armored Wolf (Black)", Rarity.RARE));
    public static final Item WOLF_CHESTNUT_ARMOR_CARD = registerItem("wolf_chestnut_armor_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§cArmored Wolf (Chestnut)", Rarity.RARE));
    public static final Item WOLF_PALE_ARMOR_CARD = registerItem("wolf_pale_armor_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§fArmored Wolf (Pale)", Rarity.RARE));
    public static final Item WOLF_RUSTY_ARMOR_CARD = registerItem("wolf_rusty_armor_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§6Armored Wolf (Rusty)", Rarity.RARE));
    public static final Item WOLF_SNOWY_ARMOR_CARD = registerItem("wolf_snowy_armor_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§fArmored Wolf (Snowy)", Rarity.RARE));
    public static final Item WOLF_SPOTTED_ARMOR_CARD = registerItem("wolf_spotted_armor_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§dArmored Wolf (Spotted)", Rarity.RARE));
    public static final Item WOLF_STRIPED_ARMOR_CARD = registerItem("wolf_striped_armor_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§8Armored Wolf (Striped)", Rarity.RARE));
    public static final Item WOLF_WOODS_ARMOR_CARD = registerItem("wolf_woods_armor_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Wolf", "§2Armored Wolf (Woods)", Rarity.RARE));

    //public static final Item TAMED_WOLF_ASHEN_CARD = registerItem("tamed_wolf_ashen_card",
    //        new TamedWolfCard(
    //        new Item.Settings(),
    //        "Overworld", "Wolf", "Tamed", Rarity.EPIC, "ashen", "Red",
    //        Identifier.ofVanilla("wolf_ashen_card"),
    //        Identifier.ofVanilla("hanas_cards.collars/collar_red")))
    //;

    public static final String[] wolf_breed = {
            "Ashen", "Black", "Chestnut", "Pale", "Rusty", "Snowy", "Spotted", "Striped", "Woods"
    };

    public static final String[] collar_colors = {
            "Red", "Orange", "Yellow", "Lime", "Green", "Cyan",
            "Light Blue", "Blue", "Purple", "Magenta", "Pink", "Gray", "Light Gray", "Black", "Brown", "White"
    };

    public static void registerTamedWolfCards() {
        for (String wolfBreed : wolf_breed) {
            {
                for (String color : collar_colors) {
                    String cardName = "tamed_" + wolfBreed.toLowerCase().replace(" ","_") + "_wolf_" +
                        color.toLowerCase().replace(" ", "_") + "_card";
                    String collar_color = getWolfCollarColor(color);
                    String variant = "Tamed with §" + getWolfCollarColor(color) + color + " Collar";
                    String collar_path = "hanas_cards.collars/collar_" + color.toLowerCase().replace(" ", "_");

                    Item tamedWolfCard = new TamedWolfCard(
                            new Item.Settings(),
                            "§2Overworld", "Wolf", variant, Rarity.COMMON, wolfBreed.toLowerCase().replace(" ","_"), collar_color,
                            Identifier.ofVanilla("hanas_cards.item/wolf_" + wolfBreed.toLowerCase().replace(" ","_") + "_card"),
                            Identifier.ofVanilla(collar_path)
                    );
                    //System.out.println("Successfully registered Tamed Wolf " + wolfBreed + " card: " + cardName);

                    registerItem(cardName, tamedWolfCard);
                    ITEMS.put(cardName, tamedWolfCard);
                }
            }
        }
        System.out.println("Successfully registered Tamed Wolf Cards");
    }

    public static String getWolfCollarColor(String color) {
        return switch (color) {
            case "Red" -> "c";         //0
            case "Orange" -> "6";      //1
            case "Yellow" -> "e";      //2
            case "Lime" -> "a";        //3
            case "Green" -> "2";       //4
            case "Cyan" -> "3";        //5
            case "Light Blue" -> "b";  //6
            case "Blue" -> "9";        //7
            case "Purple" -> "5";      //8
            case "Magenta" -> "d";     //9
            case "Pink" -> "d";        //10
            case "Gray" -> "8";        //11
            case "Light Gray" -> "7";  //12
            case "Black" -> "8";       //13
            case "Brown" -> "4";       //14
            case "White" -> "f";       //15
            default -> "f";
        };
    }

    //Hostile
    //Phantom
    public static final Item PHANTOM_CARD = registerItem("phantom_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Undead Mob", "Phantom", Rarity.COMMON));

    //Spider
    public static final Item CAVE_SPIDER_CARD = registerItem("cave_spider_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Spider", "§8Cave", Rarity.COMMON));
    public static final Item SPIDER_CARD = registerItem("spider_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Spider", "Defualt", Rarity.COMMON));
    public static final Item INVISIBLE_SPIDER_CARD = registerItem("invisible_spider_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Spider", "§9Invisible", Rarity.UNCOMMON));

    //Creaking
    public static final Item CREAKING_CARD = registerItem("creaking_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Creaking", "Default", Rarity.RARE));
    public static final Item SLEEPING_CREAKING_CARD = registerItem("sleeping_creaking_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Creeper", "Sleeping", Rarity.RARE));
    //Creeper
    public static final Item CREEPER_CARD = registerItem("creeper_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Creeper", "Default", Rarity.UNCOMMON));
    public static final Item CHARGED_CREEPER_CARD = registerItem("charged_creeper_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Creeper", "§6Charged", Rarity.UNCOMMON));

    //Zombie
    public static final Item ZOMBIE_CARD = registerItem("zombie_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Zombie", "Default", Rarity.COMMON));
    public static final Item HUSK_CARD = registerItem("husk_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Zombie", "Husk", Rarity.UNCOMMON));
    public static final Item DROWNED_CARD = registerItem("drowned_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Zombie", "Drowned", Rarity.UNCOMMON));

    public static final Item HALLOWEEN_ZOMBIE_CARD = registerItem("halloween_zombie_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Zombie", "Halloween", Rarity.COMMON));
    public static final Item CYBER_ZOMBIE_CARD = registerItem("cyber_zombie_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Zombie", "§3CYBER", Rarity.RARE));

    //Pillager
    public static final Item EVOKER_CARD = registerItem("evoker_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Pillager", "Evoker", Rarity.COMMON));
    public static final Item PILLAGER_CARD = registerItem("pillager_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Pillager", "Default", Rarity.COMMON));
    public static final Item RAVAGER_CARD = registerItem("ravager_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Pillager", "Ravager", Rarity.COMMON));
    public static final Item VEX_CARD = registerItem("vex_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Pillager", "Vex", Rarity.COMMON));
    public static final Item VINDICATOR_CARD = registerItem("vindicator_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Pillager", "Vindicator", Rarity.COMMON));
    public static final Item WITCH_CARD = registerItem("witch_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Pillager", "Witch", Rarity.COMMON));
    public static final Item ILLUSIONER_CARD = registerItem("illusioner_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Pillager", "Illusioner", Rarity.UNCOMMON));
    public static final Item ICEOLOGER_CARD = registerItem("iceologer_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Pillager", "Iceologer", Rarity.RARE));

    //Skeleton
    public static final Item SKELETON_CARD = registerItem("skeleton_card",
            new CardItem(new Item.Settings(), "§2Overworld §cNether", "Skeleton", "Default", Rarity.COMMON));
    public static final Item BOGGED_CARD = registerItem("bogged_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Skeleton", "Bogged", Rarity.UNCOMMON));
    public static final Item STRAY_CARD = registerItem("stray_card",
            new CardItem(new Item.Settings(), "§2Overworld", "Skeleton", "§3Stray", Rarity.UNCOMMON));
    //Nether
    //Passive
    public static final Item STRIDER_CARD = registerItem("strider_card",
            new CardItem(new Item.Settings(), "§cNether", "Passive", "Default", Rarity.UNCOMMON));

    //Hostile
    public static final Item WITHER_SKELETON_CARD = registerItem("wither_skeleton_card",
            new CardItem(new Item.Settings(), "§cNether", "Skeleton", "Wither", Rarity.UNCOMMON));
    public static final Item WITHER_CARD = registerItem("wither_card",
            new CardItem(new Item.Settings(), "§cNether", "Undead Mob", "Default", Rarity.EPIC));
    public static final Item INVULNERABLE_WITHER_CARD = registerItem("invulnerable_wither_card",
            new CardItem(new Item.Settings(), "§cNether", "Undead Mob", "Invulnerable", Rarity.EPIC));

    public static final Item GHAST_CARD = registerItem("ghast_card",
            new CardItem(new Item.Settings(), "§cNether", "Ghast", "Default", Rarity.COMMON));

    //Blaze
    public static final Item BLAZE_CARD = registerItem("blaze_card",
            new CardItem(new Item.Settings(), "§cNether", "Blaze", "Default", Rarity.COMMON));
    public static final Item WILDFIRE_CARD = registerItem("wildfire_card",
            new CardItem(new Item.Settings(), "§cNether", "Blaze", "Wildfire", Rarity.RARE));

    //Magma Cube
    public static final Item MAGMA_CUBE_CARD = registerItem("magma_cube_card",
            new CardItem(new Item.Settings(), "§cNether", "Magma Cube", "Default", Rarity.UNCOMMON));

    //Piglin
    public static final Item PIGLIN_SWORD_CARD = registerItem("piglin_sword_card",
            new CardItem(new Item.Settings(), "§cNether", "Piglin", "§ePiglin (Sword)", Rarity.UNCOMMON));
    public static final Item PIGLIN_CROSSBOW_CARD = registerItem("piglin_crossbow_card",
            new CardItem(new Item.Settings(), "§cNether", "Piglin", "§aPiglin (Crossbow)", Rarity.UNCOMMON));
    public static final Item PIGLIN_BRUTE_CARD = registerItem("piglin_brute_card",
            new CardItem(new Item.Settings(), "§cNether", "Piglin Brute", "§4Piglin Brute", Rarity.RARE));
    public static final Item ZOMBIFIED_PIGLIN_CARD = registerItem("zombified_piglin_card",
            new CardItem(new Item.Settings(), "§cNether", "Zombified Piglin", "§2Zombified", Rarity.COMMON));

    //Hoglin
    public static final Item HOGLIN_CARD = registerItem("hoglin_card",
            new CardItem(new Item.Settings(), "§cNether", "Hoglin", "§eHoglin", Rarity.COMMON));
    public static final Item ZOMBIFIED_HOGLIN_CARD = registerItem("zombified_hoglin_card",
            new CardItem(new Item.Settings(), "§cNether", "Hoglin", "§2Zoglin", Rarity.RARE));

    //End
    //Ender Dragon
    public static final Item ENDER_DRAGON_CARD = registerItem("ender_dragon_card",
            new CardItem(new Item.Settings(), "§5End", "Dragon", "Default", Rarity.COMMON));
    public static final Item GLITCHED_ENDER_DRAGON_CARD = registerItem("glitched_ender_dragon_card",
            new CardItem(new Item.Settings(), "§5End", "Dragon", "Glitched", CustomCardRarity.GLITCHED));
    //Enderman
    public static final Item ENDERMAN_CARD = registerItem("enderman_card",
            new CardItem(new Item.Settings(), "§2Overworld §cNether §5End", "Enderman", "Default", Rarity.COMMON));
    //Endermite
    public static final Item ENDERMITE_CARD = registerItem("endermite_card",
            new CardItem(new Item.Settings(), "§5End", "Endermite", "Default", Rarity.COMMON));
    //Shulker
    public static final String[] shulker_colors = {
            "Red", "Orange", "Yellow", "Lime", "Green", "Cyan",
            "Light Blue", "Blue", "Purple", "Magenta", "Pink", "Gray", "Light Gray", "Black", "Brown", "White"
    };

    public static void registerShulkerCards() {
        for (String color : shulker_colors) {
            String cardName = color.toLowerCase().replace(" ", "_") + "_shulker_card";
            String variant = "§" + getShulkerColorCode(color) + color + " Shulker";

            Item shulkerCard = new CardItem(new Item.Settings(), "§5End", "Shulker", variant, Rarity.COMMON);

            //System.out.println("Successfully registered shulker card: " + cardName);

            registerItem(cardName, shulkerCard);
            ITEMS.put(cardName, shulkerCard);
        }
        System.out.println("Successfully registered Shulker Cards");
    }

    //Shulker Color Codes
    private static String getShulkerColorCode(String color) {
        return switch (color) {
            case "Red" -> "c";
            case "Orange" -> "6";
            case "Yellow" -> "e";
            case "Lime" -> "a";
            case "Green" -> "2";
            case "Cyan" -> "3";
            case "Light Blue" -> "b";
            case "Blue" -> "9";
            case "Purple" -> "5";
            case "Magenta" -> "d";
            case "Pink" -> "d";
            case "Gray" -> "8";
            case "Light Gray" -> "7";
            case "Black" -> "8";
            case "Brown" -> "4";
            case "White" -> "f";
            default -> "f";
        };
    }

    public static final Item SHULKER_CARD = registerItem("shulker_card",
            new CardItem(new Item.Settings(), "§5End", "Shulker", "Default", Rarity.COMMON));

    public static final Item INVALID_CARD = registerItem("invalid_card",
            new CardItem(new Item.Settings(), "§kEnd", "§kInvalid", "§kNull", CustomCardRarity.GLITCHED));

    public static Item get(String name) {
        return ITEMS.get(name);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(HanasCardsMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        HanasCardsMod.LOGGER.info("Registering Mod Items for " + HanasCardsMod.MOD_ID);
    }
}