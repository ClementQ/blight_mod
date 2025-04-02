package com.xynoss.blight.item;
import com.xynoss.blight.item.custom.ChiselItem;
import com.xynoss.blight.item.custom.HammerItem;
import com.xynoss.blight.item.custom.ModArmorItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import com.xynoss.blight.Blight;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.item.equipment.trim.ArmorTrim;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModItems {

//Tuto Items
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"pink_garnet")))
    ));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"raw_pink_garnet")))
    ));
    public static final Item CHISEL_ITEM = registerItem("chisel", new ChiselItem(new Item.Settings()
            .maxDamage(32)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"chisel")))
    ));
    public static final Item CAULIFLOWER = registerItem("cauliflower", new Item(new Item.Settings()
            .food(ModFoodComponents.CAULIFLOWER)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"cauliflower")))
    ){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.blight.cauliflower.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });


//Blight Items
    public static final Item BLIGHT_INGOT = registerItem("blight_ingot", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"blight_ingot")))
    ));
    public static final Item RAW_BLIGHT = registerItem("raw_blight", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"raw_blight")))
    ));
    public static final Item BURNING_STONE_ASHES = registerItem("burning_stone_ashes", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"burning_stone_ashes")))
    ));
    public static final Item RAW_ELDRANITE = registerItem("raw_eldranite", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"raw_eldranite")))
    ));
    public static final Item ELDRANITE_INGOT = registerItem("eldranite_ingot", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"eldranite_ingot")))
    ));
    public static final Item RAW_MYTHRION = registerItem("raw_mythrion", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"raw_mythrion")))
    ));
    public static final Item MYTHRION_INGOT = registerItem("mythrion_ingot", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"mythrion_ingot")))
    ));

    //Tools
    public static final Item BLIGHT_SWORD = registerItem("blight_sword", new SwordItem(ModToolMaterials.BLIGHT, 3,-2.4f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"blight_sword")))
    ));
    public static final Item BLIGHT_PICKAXE = registerItem("blight_pickaxe", new PickaxeItem(ModToolMaterials.BLIGHT, 1,-2.8f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"blight_pickaxe")))
    ));
    public static final Item BLIGHT_SHOVEL = registerItem("blight_shovel", new ShovelItem(ModToolMaterials.BLIGHT, 1.5f,-3.0f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"blight_shovel")))
    ));
    public static final Item BLIGHT_AXE = registerItem("blight_axe", new AxeItem(ModToolMaterials.BLIGHT, 6,-3.2f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"blight_axe")))
    ));
    public static final Item BLIGHT_HOE = registerItem("blight_hoe", new SwordItem(ModToolMaterials.BLIGHT, 0,-3.0f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"blight_hoe")))
    ));
    public static final Item BLIGHT_HAMMER = registerItem("blight_hammer", new HammerItem(ModToolMaterials.BLIGHT, 7,-3.4f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"blight_hammer")))
    ));

    //ARMORS
    public static final Item BLIGHT_HELMET = registerItem("blight_helmet", new ModArmorItem(ModArmorMaterials.BLIGHT, EquipmentType.HELMET,new Item.Settings()
            .maxDamage(EquipmentType.HELMET.getMaxDamage(37))
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"blight_helmet")))
    ));
    public static final Item BLIGHT_CHESTPLPATE = registerItem("blight_chestplate", new ModArmorItem(ModArmorMaterials.BLIGHT, EquipmentType.CHESTPLATE,new Item.Settings()
            .maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(37))
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"blight_chestplate")))
    ));
    public static final Item BLIGHT_LEGGINGS = registerItem("blight_leggings", new ModArmorItem(ModArmorMaterials.BLIGHT, EquipmentType.LEGGINGS,new Item.Settings()
            .maxDamage(EquipmentType.LEGGINGS.getMaxDamage(37))
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"blight_leggings")))
    ));
    public static final Item BLIGHT_BOOTS = registerItem("blight_boots", new ModArmorItem(ModArmorMaterials.BLIGHT, EquipmentType.BOOTS,new Item.Settings()
            .maxDamage(EquipmentType.BOOTS.getMaxDamage(37))
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"blight_boots")))
    ));






//Functions
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
