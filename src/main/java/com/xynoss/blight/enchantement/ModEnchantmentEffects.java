package com.xynoss.blight.enchantement;

import com.mojang.serialization.MapCodec;
import com.xynoss.blight.Blight;
import com.xynoss.blight.enchantement.custom.LightningStrikerEnchantmentEffect;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantmentEffects {

    public static final MapCodec<? extends EnchantmentEntityEffect> LIGHTNIG_STRIKER = registerEntityEffect("lightning_striker", LightningStrikerEnchantmentEffect.CODEC);


    private static MapCodec<? extends EnchantmentEntityEffect> registerEntityEffect(String name, MapCodec<? extends EnchantmentEntityEffect> codec){
        return Registry.register(Registries.ENCHANTMENT_ENTITY_EFFECT_TYPE, Identifier.of(Blight.MOD_ID, name), codec);
    }

    public static void registerEnchantmentEffects () {
        Blight.LOGGER.info("Registering Mod Enchantment Effects for " + Blight.MOD_ID);
    }
}
