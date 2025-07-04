package com.xynoss.blight.potion;

import com.xynoss.blight.Blight;
import com.xynoss.blight.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;

public class ModPotions {

    public static final RegistryEntry<Potion> SLIMEY_POTION = registerPotion("slimey_potion",
            new Potion("slimey_potion", new StatusEffectInstance(ModEffects.SLIMEY, 1200, 0)));


    public static RegistryEntry<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(Blight.MOD_ID, name), potion);
    }


    public static void registerPotions() {
        Blight.LOGGER.info("Registering Mod Potions for " + Blight.MOD_ID);
    }
}
