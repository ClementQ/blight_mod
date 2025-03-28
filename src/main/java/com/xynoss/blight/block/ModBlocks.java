package com.xynoss.blight.block;

import com.xynoss.blight.Blight;
import com.xynoss.blight.block.custom.BurningStone;
import com.xynoss.blight.block.custom.MagicBlock;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;


public class ModBlocks {

//Tuto blocks/ores
    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block", new Block(AbstractBlock.Settings.create()
        .strength(4f)
        .requiresTool()
        .sounds(BlockSoundGroup.AMETHYST_BLOCK)
        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"pink_garnet_block")))
    ));
    public static final Block RAW_PINK_GARNET_BLOCK = registerBlock("raw_pink_garnet_block", new Block(AbstractBlock.Settings.create()
        .strength(3f)
        .requiresTool()
        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"raw_pink_garnet_block")))
    ));
    public static final Block MAGIC_BLOCK = registerBlock("magic_block", new MagicBlock(AbstractBlock.Settings.create()
        .strength(1f)
        .requiresTool()
        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"magic_block")))
    ));

    public static final Block PINK_GARNET_STAIRS = registerBlock("pink_garnet_stairs", new StairsBlock(ModBlocks.PINK_GARNET_BLOCK.getDefaultState(),
            AbstractBlock.Settings.create().strength(2f).requiresTool()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"pink_garnet_stairs")))
    ));
    public static final Block PINK_GARNET_SLAB = registerBlock("pink_garnet_slab", new SlabBlock(
                AbstractBlock.Settings.create().strength(2f).requiresTool()
                .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"pink_garnet_slab")))
    ));

    public static final Block PINK_GARNET_BUTTON = registerBlock("pink_garnet_button", new ButtonBlock(BlockSetType.IRON, 2,
                AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()
                .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"pink_garnet_button")))
    ));
    public static final Block PINK_GARNET_PRESSURE_PLATE = registerBlock("pink_garnet_pressure_plate", new PressurePlateBlock(BlockSetType.IRON,
                AbstractBlock.Settings.create().strength(2f).requiresTool()
                .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"pink_garnet_pressure_plate")))
    ));

    public static final Block PINK_GARNET_FENCE = registerBlock("pink_garnet_fence", new FenceBlock(
                AbstractBlock.Settings.create().strength(2f).requiresTool()
                .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"pink_garnet_fence")))
    ));
    public static final Block PINK_GARNET_FENCE_GATE = registerBlock("pink_garnet_fence_gate", new FenceGateBlock(WoodType.ACACIA,
                AbstractBlock.Settings.create().strength(2f).requiresTool()
                        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"pink_garnet_fence_gate")))
    ));
    public static final Block PINK_GARNET_WALL = registerBlock("pink_garnet_wall", new WallBlock(
                AbstractBlock.Settings.create().strength(2f).requiresTool()
                        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"pink_garnet_wall")))
    ));

    public static final Block PINK_GARNET_DOOR = registerBlock("pink_garnet_door", new DoorBlock(BlockSetType.IRON,
                AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()
                        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"pink_garnet_door")))
    ));
    public static final Block PINK_GARNET_TRAPDOOR = registerBlock("pink_garnet_trapdoor", new TrapdoorBlock(BlockSetType.IRON,
                AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()
                        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"pink_garnet_trapdoor")))
    ));




//Blight Blocks
    public static final Block BLIGHT_BLOCK = registerBlock("blight_block", new Block(AbstractBlock.Settings.create()
        .strength(4f)
        .requiresTool()
        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"blight_block")))
    ));
    public static final Block RAW_BLIGHT_BLOCK = registerBlock("raw_blight_block", new Block(AbstractBlock.Settings.create()
        .strength(3f)
        .requiresTool()
        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"raw_blight_block")))
    ));

//Blight Ores
    public static final Block BLIGHT_ORE = registerBlock("blight_ore",new ExperienceDroppingBlock(
        UniformIntProvider.create(2, 5),
        AbstractBlock.Settings.create()
        .strength(3f)
        .requiresTool()
        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"blight_ore")))
    ));
    public static final Block DEEPSLATE_BLIGHT_ORE = registerBlock("deepslate_blight_ore",new ExperienceDroppingBlock(
        UniformIntProvider.create(3, 6),
        AbstractBlock.Settings.create().
        strength(4f)
        .requiresTool()
        .sounds(BlockSoundGroup.DEEPSLATE)
        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"deepslate_blight_ore")))
    ));
    public static final Block BURNING_STONE = registerBlock("burning_stone", new BurningStone(AbstractBlock.Settings.create()
            .strength(3f)
            .requiresTool()
            .luminance(state -> 5)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"burning_stone")))
    ));



//Function
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID, name)), block);
    }

    private static void registerBlockItem(String name, Block block) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID, name));
        BlockItem item = new BlockItem(block, new Item.Settings().registryKey(key));
        Registry.register(Registries.ITEM, key, item);

    }

    public static void registerModBlocks(){
        Blight.LOGGER.info("Registering Mod Blocks for" + Blight.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.PINK_GARNET_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
        });

    }
}
