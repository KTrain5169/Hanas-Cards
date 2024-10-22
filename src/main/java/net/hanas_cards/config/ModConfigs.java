package net.hanas_cards.config;


import com.mojang.datafixers.util.Pair;
import net.hanas_cards.HanasCardsMod;
import net.minecraft.entity.EntityType;

import java.util.ArrayList;
import java.util.List;

public class ModConfigs {
    public static SimpleConfig CONFIG;
    private static ModConfigProvider configs;

    public static float MinGrade;
    public static float MaxGrade;

    // Configurable drop chances for different dimensions.
    public static float overworldDropChance;
    public static float netherDropChance;
    public static float endDropChance;
    public static float seriesDropChance;

    // Flags to enable/disable specific drops.
    public static boolean enableOverworldDrops;
    public static boolean enableNetherDrops;
    public static boolean enableEndDrops;
    public static boolean enableSeriesDrops;

    // Configurable entity groups (modifiable via config).
    public static List<EntityType<?>> overworldEntities;
    public static List<EntityType<?>> netherEntities;
    public static List<EntityType<?>> endEntities;
    public static List<EntityType<?>> allEntities;

    //CardModDebug
    public static boolean enableDebug;

    public static void registerConfigs() {
        configs = new ModConfigProvider();
        createConfigs();

        CONFIG = SimpleConfig.of(HanasCardsMod.MOD_ID + "_config")
                .provider(configs)
                .request();

        assignConfigs();
        printConfigStatus();
    }

    private static void createConfigs() {
        configs.addKeyValuePair(
                new Pair<>("Grading.minGrade", 1.0f),
                "Minimum grade value for the grading system [1.0-5.0]"
        );
        configs.addKeyValuePair(
                new Pair<>("Grading.maxGrade", 5.0f),
                "Maximum grade value for the grading system [1.0-5.0]"
        );

        // Drop chance configuration
        configs.addKeyValuePair(
                new Pair<>("DropChance.overworld", 0.025f), "Overworld drop chance, Default[0.025F]");
        configs.addKeyValuePair(
                new Pair<>("DropChance.nether", 0.025f), "Nether drop chance, Default[0.025F]");
        configs.addKeyValuePair(
                new Pair<>("DropChance.end", 0.025f), "End drop chance, Default[0.025F]");
        configs.addKeyValuePair(
                new Pair<>("DropChance.series", 0.075f), "Series drop chance, Default[0.075F]");

        // Enable/Disable drops for each dimension
        configs.addKeyValuePair(
                new Pair<>("Enable.overworldDrops", true), "Enable Overworld Pack drops");
        configs.addKeyValuePair(
                new Pair<>("Enable.netherDrops", true), "Enable Nether Pack drops");
        configs.addKeyValuePair(
                new Pair<>("Enable.endDrops", true), "Enable End Pack drops");
        configs.addKeyValuePair(
                new Pair<>("Enable.seriesDrops", true), "Enable Series Pack drops");

        // Mod/Debug
        configs.addKeyValuePair(
                new Pair<>("Enable.enableDebug", false), "Enable debug");

        // Entity lists for each dimension
        configs.addKeyValuePair(
                new Pair<>("Entities.overworld", List.of("minecraft:cow", "minecraft:sheep")),
                "List of entities for overworld pack drops (use entity IDs)"
        );
        configs.addKeyValuePair(
                new Pair<>("Entities.nether", List.of("minecraft:blaze", "minecraft:ghast")),
                "List of entities for nether pack drops (use entity IDs)"
        );
        configs.addKeyValuePair(
                new Pair<>("Entities.end", List.of("minecraft:enderman", "minecraft:shulker")),
                "List of entities for end pack drops (use entity IDs)"
        );
    }

    private static void assignConfigs() {
        // Assigning grading values
        MinGrade = (float) CONFIG.getOrDefault("Grading.minGrade", 1.0f);
        MaxGrade = (float) CONFIG.getOrDefault("Grading.maxGrade", 5.0f);

        // Assigning drop chances
        overworldDropChance = (float) CONFIG.getOrDefault("DropChance.overworld", 0.025F);
        netherDropChance = (float) CONFIG.getOrDefault("DropChance.nether", 0.025F);
        endDropChance = (float) CONFIG.getOrDefault("DropChance.end", 0.025F);
        seriesDropChance = (float) CONFIG.getOrDefault("DropChance.series", 0.075F);

        // Assigning drop toggles
        enableOverworldDrops = (boolean) CONFIG.getOrDefault("Enable.overworldDrops", true);
        enableNetherDrops = (boolean) CONFIG.getOrDefault("Enable.netherDrops", true);
        enableEndDrops = (boolean) CONFIG.getOrDefault("Enable.endDrops", true);
        enableSeriesDrops = (boolean) CONFIG.getOrDefault("Enable.seriesDrops", true);

        // Assigning debug mode
        enableDebug = (boolean) CONFIG.getOrDefault("Enable.enableDebug", false);

        // Assigning entities from config or using default values
        overworldEntities = getEntityList("Entities.overworld", defaultOverworldEntities());
        netherEntities = getEntityList("Entities.nether", defaultNetherEntities());
        endEntities = getEntityList("Entities.end", defaultEndEntities());

        // Handle global drops (all entities) based on the series drops flag
        if (!enableSeriesDrops) {
            allEntities = List.of();
        } else {
            allEntities = new ArrayList<>();
            allEntities.addAll(overworldEntities);
            allEntities.addAll(netherEntities);
            allEntities.addAll(endEntities);
        }
    }

    /**
     * Retrieves a list of entities from the config or returns the default list if not present.
     */
    private static List<EntityType<?>> getEntityList(String key, List<EntityType<?>> defaultEntities) {
        List<String> entityNames = getStringList(key);
        if (entityNames.isEmpty()) {
            return defaultEntities; // Use default if config doesn't have the list
        }

        List<EntityType<?>> entities = new ArrayList<>();
        for (String entityName : entityNames) {
            EntityType<?> entityType = EntityType.get(entityName).orElse(null); // Get entity type safely
            if (entityType != null) {
                entities.add(entityType);
            }
        }
        return entities.isEmpty() ? defaultEntities : entities;
    }

    /**
     * Retrieves a list of strings from the config or returns an empty list if not present.
     */
    private static List<String> getStringList(String key) {
        Object value = CONFIG.get(key);
        if (value instanceof List<?>) {
            List<String> result = new ArrayList<>();
            for (Object obj : (List<?>) value) {
                if (obj instanceof String) {
                    result.add((String) obj);
                }
            }
            return result;
        }
        return List.of(); // Return an empty list if the value is not a List
    }

    /**
     * Default list of overworld entities.
     */
    private static List<EntityType<?>> defaultOverworldEntities() {
        return List.of(
                EntityType.ALLAY,
                EntityType.ARMADILLO,
                EntityType.AXOLOTL,
                EntityType.BAT,
                EntityType.CAMEL,
                EntityType.CAT,
                EntityType.CHICKEN,
                EntityType.COD,
                EntityType.COW,
                EntityType.DONKEY,
                EntityType.FROG,
                EntityType.GLOW_SQUID,
                EntityType.HORSE,
                EntityType.MOOSHROOM,
                EntityType.MULE,
                EntityType.OCELOT,
                EntityType.PARROT,
                EntityType.PIG,
                EntityType.PUFFERFISH,
                EntityType.RABBIT,
                EntityType.SALMON,
                EntityType.SHEEP,
                EntityType.SKELETON_HORSE,
                EntityType.SNIFFER,
                EntityType.SNOW_GOLEM,
                EntityType.SQUID,
                EntityType.TADPOLE,
                EntityType.TROPICAL_FISH,
                EntityType.TURTLE,
                EntityType.VILLAGER,
                EntityType.WANDERING_TRADER,
                EntityType.ZOMBIE_HORSE,
                EntityType.BEE,
                EntityType.DOLPHIN,
                EntityType.DROWNED,
                EntityType.ENDERMAN,
                EntityType.FOX,
                EntityType.GOAT,
                EntityType.IRON_GOLEM,
                EntityType.LLAMA,
                EntityType.PANDA,
                EntityType.POLAR_BEAR,
                EntityType.TURTLE,
                EntityType.TRADER_LLAMA,
                EntityType.WOLF,
                EntityType.CAVE_SPIDER,
                EntityType.SPIDER,
                EntityType.BOGGED,
                EntityType.BREEZE,
                EntityType.CREEPER,
                EntityType.ELDER_GUARDIAN,
                EntityType.EVOKER,
                EntityType.GUARDIAN,
                EntityType.HUSK,
                EntityType.PHANTOM,
                EntityType.PILLAGER,
                EntityType.RAVAGER,
                EntityType.SILVERFISH,
                EntityType.SKELETON,
                EntityType.SLIME,
                EntityType.STRAY,
                EntityType.VEX,
                EntityType.VINDICATOR,
                EntityType.WARDEN,
                EntityType.WITCH,
                EntityType.ZOMBIE,
                EntityType.ZOMBIE_VILLAGER
        );
    }

    /**
     * Default list of nether entities.
     */
    private static List<EntityType<?>> defaultNetherEntities() {
        return List.of(
                EntityType.STRIDER,
                EntityType.ENDERMAN,
                EntityType.PIGLIN,
                EntityType.ZOMBIFIED_PIGLIN,
                EntityType.BLAZE,
                EntityType.GHAST,
                EntityType.HOGLIN,
                EntityType.MAGMA_CUBE,
                EntityType.PIGLIN_BRUTE,
                EntityType.SKELETON,
                EntityType.WITHER,
                EntityType.WITHER_SKELETON,
                EntityType.ZOGLIN
        );
    }

    /**
     * Default list of end entities.
     */
    private static List<EntityType<?>> defaultEndEntities() {
        return List.of(
                EntityType.ENDERMITE,
                EntityType.ENDERMAN,
                EntityType.ENDER_DRAGON,
                EntityType.SHULKER
        );
    }

    // Debugging
    public static void printConfigStatus() {
        System.out.println("All " + configs.getConfigsList().size() + " configs have been set properly");
    }

    /*
        allEntities  = List.of(
                EntityType.ALLAY,
                EntityType.ARMADILLO,
                EntityType.AXOLOTL,
                EntityType.BAT,
                EntityType.CAMEL,
                EntityType.CAT,
                EntityType.CHICKEN,
                EntityType.COD,
                EntityType.COW,
                EntityType.DONKEY,
                EntityType.FROG,
                EntityType.GLOW_SQUID,
                EntityType.HORSE,
                EntityType.MOOSHROOM,
                EntityType.MULE,
                EntityType.OCELOT,
                EntityType.PARROT,
                EntityType.PIG,
                EntityType.PUFFERFISH,
                EntityType.RABBIT,
                EntityType.SALMON,
                EntityType.SHEEP,
                EntityType.SKELETON_HORSE,
                EntityType.SNIFFER,
                EntityType.SNOW_GOLEM,
                EntityType.SQUID,
                EntityType.TADPOLE,
                EntityType.TROPICAL_FISH,
                EntityType.TURTLE,
                EntityType.VILLAGER,
                EntityType.WANDERING_TRADER,
                EntityType.ZOMBIE_HORSE,
                EntityType.BEE,
                EntityType.DOLPHIN,
                EntityType.DROWNED,
                EntityType.FOX,
                EntityType.GOAT,
                EntityType.IRON_GOLEM,
                EntityType.LLAMA,
                EntityType.PANDA,
                EntityType.POLAR_BEAR,
                EntityType.TURTLE,
                EntityType.TRADER_LLAMA,
                EntityType.WOLF,
                EntityType.CAVE_SPIDER,
                EntityType.SPIDER,
                EntityType.BOGGED,
                EntityType.BREEZE,
                EntityType.CREEPER,
                EntityType.ELDER_GUARDIAN,
                EntityType.EVOKER,
                EntityType.GUARDIAN,
                EntityType.HUSK,
                EntityType.PHANTOM,
                EntityType.PILLAGER,
                EntityType.RAVAGER,
                EntityType.SILVERFISH,
                EntityType.SKELETON,
                EntityType.SLIME,
                EntityType.STRAY,
                EntityType.VEX,
                EntityType.VINDICATOR,
                EntityType.WARDEN,
                EntityType.WITCH,
                EntityType.ZOMBIE,
                EntityType.ZOMBIE_VILLAGER,
                EntityType.STRIDER,
                EntityType.PIGLIN,
                EntityType.ZOMBIFIED_PIGLIN,
                EntityType.BLAZE,
                EntityType.GHAST,
                EntityType.HOGLIN,
                EntityType.MAGMA_CUBE,
                EntityType.PIGLIN_BRUTE,
                EntityType.SKELETON,
                EntityType.WITHER,
                EntityType.WITHER_SKELETON,
                EntityType.ZOGLIN,
                EntityType.ENDERMITE,
                EntityType.ENDERMAN,
                EntityType.ENDER_DRAGON,
                EntityType.SHULKER
        );
        */

}