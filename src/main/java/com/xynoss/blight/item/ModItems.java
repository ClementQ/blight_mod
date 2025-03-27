package com.xynoss.blight.item;
import com.xynoss.blight.item.custom.ChiselItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import com.xynoss.blight.Blight;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"pink_garnet")))));
public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"raw_pink_garnet")))));

public static final Item BLIGHT_INGOT = registerItem("blight_ingot", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"blight_ingot")))));
public static final Item RAW_BLIGHT = registerItem("raw_blight", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"raw_blight")))));

public static final Item CHISEL_ITEM = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(32).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"chisel")))));

private static Item registerItem(String name, Item item) {
    return Registry.register(Registries.ITEM, Identifier.of(Blight.MOD_ID, name), item);
}

public static void registerModItems() {
    Blight.LOGGER.info("Registering Mod Items for " + Blight.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
            entries.add(RAW_PINK_GARNET);
        });
    }
}
