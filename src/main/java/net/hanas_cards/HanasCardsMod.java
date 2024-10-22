package net.hanas_cards;

import net.fabricmc.api.ModInitializer;
import net.hanas_cards.component.ModDataComponentTypes;
import net.hanas_cards.config.ModConfigs;
import net.hanas_cards.item.CardModItems;
import net.hanas_cards.item.CardModItemGroups;
import net.hanas_cards.item.CardModPacks;
import net.hanas_cards.util.LootTableModifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HanasCardsMod implements ModInitializer {
    public static final String MOD_ID = "hanas_cards";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Hanas Cards Mod...");

        // Register and load the configs
        ModConfigs.registerConfigs();

        // Reload the config
        if (ModConfigs.CONFIG.reload()) {
            LOGGER.info("Configuration reloaded successfully.");
        } else {
            LOGGER.error("Failed to reload configuration on startup.");
        }

        CardModItemGroups.registerCardModItemGroups();

        CardModItems.registerModItems();
        CardModPacks.registerModPacks();
        CardModItems.registerSheepCards();
        CardModItems.registerVillagerCards();
        CardModItems.registerTamedWolfCards();
        CardModItems.registerShulkerCards();

        LootTableModifier.registerLootTableEvents();
        ModDataComponentTypes.registerDataComponentTypes();
    }
}
