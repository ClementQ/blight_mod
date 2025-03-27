package com.xynoss.blight.item;

import com.xynoss.blight.Blight;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;

public class ModFuelItems {
    public static void registerModFuelItem(){
        FuelRegistryEvents.BUILD.register(((builder, context) -> {
            builder.add(ModItems.BURNING_STONE_ASHES,2500);
        }));

    }
}
