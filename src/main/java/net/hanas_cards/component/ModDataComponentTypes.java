package net.hanas_cards.component;

import net.hanas_cards.HanasCardsMod;
import net.minecraft.component.ComponentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.function.UnaryOperator;

public class ModDataComponentTypes {
    public static final ComponentType<CardComponent> CARD_COMPONENT = register("card_component",
            builder -> builder.codec(CardComponent.CODEC));
    //public static final ComponentType<SourceCardComponent> SOURCE_CARD_COMPONENT = register("source_card_component",
    //        builder -> builder.codec(SourceCardComponent.CODEC));

    // Generalized register method
    private static <T> ComponentType<T> register(String name, UnaryOperator<ComponentType.Builder<T>> builderOperator) {
        return Registry.register(
                Registries.DATA_COMPONENT_TYPE,
                Identifier.of("hanas_cards", name), // Replace with your mod's ID
                builderOperator.apply(ComponentType.builder()).build()
        );
    }

    public static void registerDataComponentTypes() {
        HanasCardsMod.LOGGER.info("Registering Data Component Types for " + HanasCardsMod.MOD_ID);
    }
}
