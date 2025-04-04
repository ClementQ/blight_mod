package com.xynoss.blight.trim;

import com.xynoss.blight.Blight;
import com.xynoss.blight.item.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.equipment.trim.ArmorTrimPattern;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;


public class ModTrimPatterns {

    public static final RegistryKey<ArmorTrimPattern> FARFARAWAY = RegistryKey.of(RegistryKeys.TRIM_PATTERN,
            Identifier.of(Blight.MOD_ID, "farfaraway"));

    public static void bootstrap(Registerable<ArmorTrimPattern> context) {
        register(context, ModItems.FARFARAWAY_SMITHING_TEMPLATE, FARFARAWAY);
    }

    private static void register(Registerable<ArmorTrimPattern> context, Item item, RegistryKey<ArmorTrimPattern> key){
        ArmorTrimPattern trimPattern = new ArmorTrimPattern(key.getValue(),Registries.ITEM.getEntry(item),
                Text.translatable(Util.createTranslationKey("trim_pattern", key.getValue())), false);

        context.register(key, trimPattern);
    }
}
