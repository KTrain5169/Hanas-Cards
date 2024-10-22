package net.hanas_cards.util;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.hanas_cards.config.ModConfigs;
import net.hanas_cards.item.CardModPacks;
import net.minecraft.entity.EntityType;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.KilledByPlayerLootCondition;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class LootTableModifier {
    public static final Logger LOGGER = LogManager.getLogger();

    public static void registerLootTableEvents() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {

            if (ModConfigs.enableOverworldDrops) {
                for (EntityType<?> entity : ModConfigs.overworldEntities) {
                    if (entity.getLootTableId().equals(key) && source.isBuiltin()) {
                        LootPool.Builder pool = LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(ItemEntry.builder(CardModPacks.OVERWORLD_MOB_CARD_PACK))
                                .conditionally(RandomChanceLootCondition.builder(ModConfigs.overworldDropChance))
                                .conditionally(KilledByPlayerLootCondition.builder());

                        tableBuilder.pool(pool);
                    }
                }
            }
            if (ModConfigs.enableNetherDrops) {
                for (EntityType<?> entity : ModConfigs.netherEntities) {
                    if (entity.getLootTableId().equals(key) && source.isBuiltin()) {
                        LootPool.Builder pool = LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(ItemEntry.builder(CardModPacks.NETHER_MOB_CARD_PACK))
                                .conditionally(RandomChanceLootCondition.builder(ModConfigs.netherDropChance))
                                .conditionally(KilledByPlayerLootCondition.builder());

                        tableBuilder.pool(pool);
                    }
                }
            }
            if (ModConfigs.enableEndDrops) {
                for (EntityType<?> entity : ModConfigs.endEntities) {
                    if (entity.getLootTableId().equals(key) && source.isBuiltin()) {
                        LootPool.Builder pool = LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(ItemEntry.builder(CardModPacks.END_MOB_CARD_PACK))
                                .conditionally(RandomChanceLootCondition.builder(ModConfigs.endDropChance))
                                .conditionally(KilledByPlayerLootCondition.builder());

                        tableBuilder.pool(pool);
                    }
                }
            }
            if (ModConfigs.enableSeriesDrops) {
                for (EntityType<?> entity : ModConfigs.allEntities) {
                    if (entity.getLootTableId().equals(key) && source.isBuiltin()) {
                        LootPool.Builder pool = LootPool.builder()
                                .rolls(ConstantLootNumberProvider.create(1.0F))
                                .with(ItemEntry.builder(CardModPacks.SERIES_ONE_CARD_PACK))
                                .with(ItemEntry.builder(CardModPacks.SERIES_ONE_EXPANSION_ONE_CARD_PACK))
                                .with(ItemEntry.builder(CardModPacks.SERIES_ONE_EXPANSION_TWO_CARD_PACK))
                                .conditionally(RandomChanceLootCondition.builder(ModConfigs.seriesDropChance))
                                .conditionally(KilledByPlayerLootCondition.builder());

                        tableBuilder.pool(pool);
                    }
                }
            }
        });
    }
}
