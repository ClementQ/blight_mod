package com.xynoss.blight.component;

import com.mojang.serialization.Codec;
import com.xynoss.blight.Blight;
import net.minecraft.client.render.item.property.bool.BooleanProperty;
import net.minecraft.component.ComponentType;
import net.minecraft.component.type.DyedColorComponent;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

import java.awt.*;
import java.util.function.UnaryOperator;

public class ModDataComponentTypes {

    public static final ComponentType<BlockPos> COORDINATES = register("coordinates",builder -> builder.codec(BlockPos.CODEC));
    //public static BooleanProperty CHISEL_USED;
    public static final ComponentType<Boolean> CHISEL_USED = register("chisel_used", (builder) -> builder.codec(Codec.BOOL));



    private static <T>ComponentType<T> register(String name, UnaryOperator<ComponentType.Builder<T>> builderOperator)
    {
        return Registry.register(Registries.DATA_COMPONENT_TYPE, Identifier.of(Blight.MOD_ID,name),
                builderOperator.apply(ComponentType.builder()).build());
    }

    public static void registerDataComponentTypes(){
        Blight.LOGGER.info("Registering Data Component Types for "+ Blight.MOD_ID);
    }
}
