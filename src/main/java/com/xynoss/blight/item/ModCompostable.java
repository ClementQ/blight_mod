package com.xynoss.blight.item;

import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;

public class ModCompostable {
    //Add the possibility to compost vegetables
    public static void registerCompostable(){
        CompostingChanceRegistry.INSTANCE.add(ModItems.CAULIFLOWER, 0.5f);
        CompostingChanceRegistry.INSTANCE.add(ModItems.CAULIFLOWER_SEEDS, 0.25f);
        CompostingChanceRegistry.INSTANCE.add(ModItems.HONEY_BERRIES, 0.15f);

    }
}
