package com.xynoss.blight.enchantement;

import com.xynoss.blight.Blight;
import com.xynoss.blight.enchantement.custom.LightningStrikerEnchantmentEffect;
import net.minecraft.component.EnchantmentEffectComponentTypes;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.effect.EnchantmentEffectTarget;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.EnchantmentTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

public class ModEnchantments {

    public static final RegistryKey<Enchantment> LIGHTNING_STRIKER = RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(Blight.MOD_ID, "lightning_striker"));

    public static void bootstrap(Registerable<Enchantment> registerable){
        var enchantment = registerable.getRegistryLookup(RegistryKeys.ENCHANTMENT);
        var items = registerable.getRegistryLookup(RegistryKeys.ITEM);

        register(registerable, LIGHTNING_STRIKER, Enchantment.builder(Enchantment.definition(
                items.getOrThrow(ItemTags.WEAPON_ENCHANTABLE),
                items.getOrThrow(ItemTags.SWORD_ENCHANTABLE),
                10,
                2,
                Enchantment.leveledCost(10,7),
                Enchantment.leveledCost(21, 7),
                2,
                AttributeModifierSlot.MAINHAND))
                .exclusiveSet(enchantment.getOrThrow(EnchantmentTags.DAMAGE_EXCLUSIVE_SET))
                .addEffect(EnchantmentEffectComponentTypes.POST_ATTACK,
                        EnchantmentEffectTarget.ATTACKER, EnchantmentEffectTarget.VICTIM,
                        new LightningStrikerEnchantmentEffect())
        );

    }

    private static void register(Registerable<Enchantment> registry, RegistryKey<Enchantment> key, Enchantment.Builder builder){
        registry.register(key, builder.build(key.getValue()));
    }
}
