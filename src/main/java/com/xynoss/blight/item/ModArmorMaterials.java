package com.xynoss.blight.item;

import com.xynoss.blight.Blight;
import com.xynoss.blight.util.ModTags;
import net.minecraft.item.equipment.*;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;

public class ModArmorMaterials implements ArmorMaterials {
    public static final ArmorMaterial BLIGHT = new ArmorMaterial(5, Util.make(new EnumMap<>(EquipmentType.class), map -> {
        map.put(EquipmentType.BOOTS, 2);
        map.put(EquipmentType.LEGGINGS, 4);
        map.put(EquipmentType.CHESTPLATE, 6);
        map.put(EquipmentType.HELMET, 2);
        map.put(EquipmentType.BODY, 4);
    }), 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0F, 3.0F, ModTags.Items.BLIGHT_REPAIR, RegistryKey.of(RegistryKey.ofRegistry(Identifier.ofVanilla("equipment_asset")), Identifier.of(Blight.MOD_ID, "blight")));
}
