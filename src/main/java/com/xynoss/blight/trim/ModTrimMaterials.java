package com.xynoss.blight.trim;

import com.xynoss.blight.Blight;
import com.xynoss.blight.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.equipment.trim.ArmorTrimMaterial;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class ModTrimMaterials {
    public static final RegistryKey<ArmorTrimMaterial> BLIGHT = RegistryKey.of(RegistryKeys.TRIM_MATERIAL,
            Identifier.of(Blight.MOD_ID, "blight"));

    public static void bootstrap(Registerable<ArmorTrimMaterial> registerable) {
        register(registerable, BLIGHT, Registries.ITEM.getEntry(ModItems.BLIGHT_INGOT),
                Style.EMPTY.withColor(TextColor.parse("#b03fe0").getOrThrow()), 0.8f);
    }

    private static void register(Registerable<ArmorTrimMaterial> registerable, RegistryKey<ArmorTrimMaterial> armorTrimKey,
                                 RegistryEntry<Item> item, Style style, float itemModelIndex){
        ArmorTrimMaterial trimMaterial = new ArmorTrimMaterial(armorTrimKey.getValue().getPath(), item, Map.of(),
                Text.translatable(Util.createTranslationKey("trim_material", armorTrimKey.getValue())).fillStyle(style));

        registerable.register(armorTrimKey, trimMaterial);
    }
}
