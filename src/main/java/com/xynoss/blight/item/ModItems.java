package com.xynoss.blight.item;
import com.xynoss.blight.block.ModBlocks;
import com.xynoss.blight.item.custom.ChiselItem;
import com.xynoss.blight.item.custom.HammerItem;
import com.xynoss.blight.item.custom.ModArmorItem;
import com.xynoss.blight.sound.ModSounds;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import com.xynoss.blight.Blight;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
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
    public static final Item CAULIFLOWER_SEEDS = registerItem("cauliflower_seeds", new BlockItem(ModBlocks.CAULIFLOWER_CROP,
                    new Item.Settings()
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"cauliflower_seeds")))
            )
    );
    public static final Item HONEY_BERRIES = registerItem("honey_berries", new BlockItem(ModBlocks.HONEY_BERRY_BUSH,
            new Item.Settings()
                    .food(ModFoodComponents.HONEY_BERRY)
                    .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID, "honey_berries")))
    ));


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
    public static final Item RAW_MYTHRION = registerItem("raw_mythrion", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"raw_mythrion")))
    ));
    public static final Item MYTHRION_INGOT = registerItem("mythrion_ingot", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"mythrion_ingot")))
    ));
    public static final Item RAW_ELDRANITE = registerItem("raw_eldranite", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"raw_eldranite")))
    ));
    public static final Item ELDRANITE_INGOT = registerItem("eldranite_ingot", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"eldranite_ingot")))
    ));
    public static final Item RAW_TRIONITE = registerItem("raw_trionite", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"raw_trionite")))
    ));
    public static final Item TRIONITE_INGOT = registerItem("trionite_ingot", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"trionite_ingot")))
    ));
    public static final Item RAW_PYRALITE = registerItem("raw_pyralite", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"raw_pyralite")))
    ));
    public static final Item PYRALITE_INGOT = registerItem("pyralite_ingot", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"pyralite_ingot")))
    ));
    public static final Item RAW_VALTHERIUM = registerItem("raw_valtherium", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"raw_valtherium")))
    ));
    public static final Item VALTHERIUM_INGOT = registerItem("valtherium_ingot", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"valtherium_ingot")))
    ));
    public static final Item RAW_NYXIUM = registerItem("raw_nyxium", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"raw_nyxium")))
    ));
    public static final Item NYXIUM_INGOT = registerItem("nyxium_ingot", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"nyxium_ingot")))
    ));

    //MUSIC
    public static final Item MUSIC_DISC_ARISE = registerItem("music_disc_arise", new Item(new Item.Settings()
            .jukeboxPlayable(ModSounds.ARISE_KEY)
            .maxCount(1)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"music_disc_arise")))
    ));

    //Tools
    public static final Item BLIGHT_SWORD = registerItem("blight_sword", new SwordItem(ModToolMaterials.BLIGHT, 40,-2.4f, new Item.Settings()
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
    public static final Item BLIGHT_HOE = registerItem("blight_hoe", new HoeItem(ModToolMaterials.BLIGHT, 0,-3.0f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"blight_hoe")))
    ));
    public static final Item BLIGHT_HAMMER = registerItem("blight_hammer", new HammerItem(ModToolMaterials.BLIGHT, 7,-3.4f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"blight_hammer")))
    ));
    public static final Item BLIGHT_BOW = registerItem("blight_bow", new BowItem(new Item.Settings()
            .maxDamage(500)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"blight_bow")))
    ));

    public static final Item MYTHRION_SWORD = registerItem("mythrion_sword", new SwordItem(ModToolMaterials.MYTHRION, 10,-2.4f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"mythrion_sword")))
    ));
    public static final Item MYTHRION_PICKAXE = registerItem("mythrion_pickaxe", new PickaxeItem(ModToolMaterials.MYTHRION, 1,-2.8f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"mythrion_pickaxe")))
    ));
    public static final Item MYTHRION_SHOVEL = registerItem("mythrion_shovel", new ShovelItem(ModToolMaterials.BLIGHT, 1.5f,-3.0f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"mythrion_shovel")))
    ));
    public static final Item MYTHRION_AXE = registerItem("mythrion_axe", new AxeItem(ModToolMaterials.BLIGHT, 6,-3.2f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"mythrion_axe")))
    ));
    public static final Item MYTHRION_HOE = registerItem("mythrion_hoe", new HoeItem(ModToolMaterials.BLIGHT, 0,-3.0f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"mythrion_hoe")))
    ));
    public static final Item MYTHRION_HAMMER = registerItem("mythrion_hammer", new HammerItem(ModToolMaterials.BLIGHT, 7,-3.4f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"mythrion_hammer")))
    ));

    public static final Item ELDRANITE_SWORD = registerItem("eldranite_sword", new SwordItem(ModToolMaterials.ELDRANITE, 15,-2.4f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"eldranite_sword")))
    ));
    public static final Item ELDRANITE_PICKAXE = registerItem("eldranite_pickaxe", new PickaxeItem(ModToolMaterials.ELDRANITE, 1,-2.8f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"eldranite_pickaxe")))
    ));
    public static final Item ELDRANITE_SHOVEL = registerItem("eldranite_shovel", new ShovelItem(ModToolMaterials.ELDRANITE, 1.5f,-3.0f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"eldranite_shovel")))
    ));
    public static final Item ELDRANITE_AXE = registerItem("eldranite_axe", new AxeItem(ModToolMaterials.ELDRANITE, 6,-3.2f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"eldranite_axe")))
    ));
    public static final Item ELDRANITE_HOE = registerItem("eldranite_hoe", new HoeItem(ModToolMaterials.ELDRANITE, 0,-3.0f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"eldranite_hoe")))
    ));
    public static final Item ELDRANITE_HAMMER = registerItem("eldranite_hammer", new HammerItem(ModToolMaterials.ELDRANITE, 7,-3.4f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"eldranite_hammer")))
    ));

    public static final Item TRIONITE_SWORD = registerItem("trionite_sword", new SwordItem(ModToolMaterials.TRIONITE, 15,-2.4f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"trionite_sword")))
    ));
    public static final Item TRIONITE_PICKAXE = registerItem("trionite_pickaxe", new PickaxeItem(ModToolMaterials.TRIONITE, 1,-2.8f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"trionite_pickaxe")))
    ));
    public static final Item TRIONITE_SHOVEL = registerItem("trionite_shovel", new ShovelItem(ModToolMaterials.TRIONITE, 1.5f,-3.0f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"trionite_shovel")))
    ));
    public static final Item TRIONITE_AXE = registerItem("trionite_axe", new AxeItem(ModToolMaterials.TRIONITE, 6,-3.2f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"trionite_axe")))
    ));
    public static final Item TRIONITE_HOE = registerItem("trionite_hoe", new HoeItem(ModToolMaterials.TRIONITE, 0,-3.0f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"trionite_hoe")))
    ));
    public static final Item TRIONITE_HAMMER = registerItem("trionite_hammer", new HammerItem(ModToolMaterials.TRIONITE, 7,-3.4f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"trionite_hammer")))
    ));

    public static final Item PYRALITE_SWORD = registerItem("pyralite_sword", new SwordItem(ModToolMaterials.PYRALITE, 15,-2.4f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"pyralite_sword")))
    ));
    public static final Item PYRALITE_PICKAXE = registerItem("pyralite_pickaxe", new PickaxeItem(ModToolMaterials.PYRALITE, 1,-2.8f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"pyralite_pickaxe")))
    ));
    public static final Item PYRALITE_SHOVEL = registerItem("pyralite_shovel", new ShovelItem(ModToolMaterials.PYRALITE, 1.5f,-3.0f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"pyralite_shovel")))
    ));
    public static final Item PYRALITE_AXE = registerItem("pyralite_axe", new AxeItem(ModToolMaterials.PYRALITE, 6,-3.2f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"pyralite_axe")))
    ));
    public static final Item PYRALITE_HOE = registerItem("pyralite_hoe", new HoeItem(ModToolMaterials.PYRALITE, 0,-3.0f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"pyralite_hoe")))
    ));
    public static final Item PYRALITE_HAMMER = registerItem("pyralite_hammer", new HammerItem(ModToolMaterials.PYRALITE, 7,-3.4f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"pyralite_hammer")))
    ));

    public static final Item VALTHERIUM_SWORD = registerItem("valtherium_sword", new SwordItem(ModToolMaterials.VALTHERIUM, 15,-2.4f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"valtherium_sword")))
    ));
    public static final Item VALTHERIUM_PICKAXE = registerItem("valtherium_pickaxe", new PickaxeItem(ModToolMaterials.VALTHERIUM, 1,-2.8f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"valtherium_pickaxe")))
    ));
    public static final Item VALTHERIUM_SHOVEL = registerItem("valtherium_shovel", new ShovelItem(ModToolMaterials.VALTHERIUM, 1.5f,-3.0f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"valtherium_shovel")))
    ));
    public static final Item VALTHERIUM_AXE = registerItem("valtherium_axe", new AxeItem(ModToolMaterials.VALTHERIUM, 6,-3.2f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"valtherium_axe")))
    ));
    public static final Item VALTHERIUM_HOE = registerItem("valtherium_hoe", new HoeItem(ModToolMaterials.VALTHERIUM, 0,-3.0f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"valtherium_hoe")))
    ));
    public static final Item VALTHERIUM_HAMMER = registerItem("valtherium_hammer", new HammerItem(ModToolMaterials.VALTHERIUM, 7,-3.4f, new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"valtherium_hammer")))
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
    public static final Item BLIGHT_HORSE_ARMOR = registerItem("blight_horse_armor",
            new AnimalArmorItem(ModArmorMaterials.BLIGHT, AnimalArmorItem.Type.EQUESTRIAN, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, false,
                    new Item.Settings()
                            .maxCount(1)
                            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID,"blight_horse_armor")))
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
