package com.xynoss.blight.item.custom;

import com.google.common.collect.ImmutableMap;
import com.xynoss.blight.util.ModTags;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.world.World;

import java.util.List;
import java.util.Map;

public class ModArmorItem extends ArmorItem {

    public static final Map<TagKey<Item>, List<StatusEffectInstance>> MATERIAL_TO_EFFECT_MAP =
            new ImmutableMap.Builder<TagKey<Item>, List<StatusEffectInstance>>()
                    .put(ModTags.Items.BLIGHT_ARMOR,
                            List.of(new StatusEffectInstance(StatusEffects.SPEED, 20, 2, false, false),
                                    new StatusEffectInstance(StatusEffects.JUMP_BOOST, 20, 1, false, false)))
                    .build();
    public ModArmorItem(ArmorMaterial material, EquipmentType type, Settings settings) {
        super(material, type, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected){
        if (!world.isClient()){
            if (entity instanceof PlayerEntity player){
                if (hasFullSuitOfArmorOn(player)){
                    evaluateArmorEffects(player);
                }
            }
        }
    }


    private void evaluateArmorEffects(PlayerEntity player) {
        for (Map.Entry<TagKey<Item>, List<StatusEffectInstance>> entry : MATERIAL_TO_EFFECT_MAP.entrySet()) {
            TagKey<Item> armorTag = entry.getKey(); // On récupère le tag d'armure
            List<StatusEffectInstance> mapStatusEffects = entry.getValue(); // On récupère les effets associés

            if (hasCorrectArmorOn(armorTag, player)) {
                addStatusEffectForMaterial(player, armorTag, mapStatusEffects);
            }
        }
    }

    private void addStatusEffectForMaterial(PlayerEntity player, TagKey<Item> armorTag, List<StatusEffectInstance> mapStatusEffect) {
        boolean hasPlayerEffect = mapStatusEffect.stream().allMatch(statusEffectInstance -> player.hasStatusEffect(statusEffectInstance.getEffectType()));

        if(!hasPlayerEffect) {
            for (StatusEffectInstance instance : mapStatusEffect) {
                player.addStatusEffect(new StatusEffectInstance(instance.getEffectType(),
                        instance.getDuration(), instance.getAmplifier(), instance.isAmbient(), instance.shouldShowParticles()));
            }
        }
    }

    private boolean hasFullSuitOfArmorOn(PlayerEntity player) {
        ItemStack boots = player.getInventory().getArmorStack(0);
        ItemStack leggings = player.getInventory().getArmorStack(1);
        ItemStack breastplate = player.getInventory().getArmorStack(2);
        ItemStack helmet = player.getInventory().getArmorStack(3);

        return !helmet.isEmpty() && !breastplate.isEmpty()
                && !leggings.isEmpty() && !boots.isEmpty();
    }

    private boolean hasCorrectArmorOn(TagKey<Item> armorTag, PlayerEntity player) {
        for (ItemStack armorStack : player.getInventory().armor) {
            if (!(armorStack.getItem() instanceof ArmorItem armorItem)) {
                return false; // Si l'objet n'est pas une armure, on retourne false
            }
            if (!armorStack.isIn(armorTag)) {
                return false; // Si l'armure ne correspond pas au tag, on retourne false
            }
        }
        return true; // Si toutes les pièces d'armure correspondent, on retourne true
    }


}
