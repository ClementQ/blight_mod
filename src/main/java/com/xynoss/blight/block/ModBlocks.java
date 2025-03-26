package com.xynoss.blight.block;

import com.xynoss.blight.Blight;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
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

    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block", AbstractBlock.Settings.create().
            strength(4f).
            requiresTool().
            sounds(BlockSoundGroup.AMETHYST_BLOCK)
    );

    public static final Block RAW_PINK_GARNET_BLOCK = registerBlock("raw_pink_garnet_block", AbstractBlock.Settings.create().
            strength(3f).
            requiresTool()
    );


//Blight ore
    public static final Block BLIGHT_BLOCK = registerBlock("blight_block", AbstractBlock.Settings.create().
            strength(4f).
            requiresTool()
    );
    public static final Block RAW_BLIGHT_BLOCK = registerBlock("raw_blight_block", AbstractBlock.Settings.create().
            strength(3f).
            requiresTool()
    );
    public static final Block BLIGHT_ORE = registerExperienceDroppingBlock("blight_ore",2,5,AbstractBlock.Settings.create().
            strength(3f).
            requiresTool()
    );
    public static final Block DEEPSLATE_BLIGHT_ORE = registerExperienceDroppingBlock("deepslate_blight_ore",2,5,AbstractBlock.Settings.create().
            strength(4f)
            .requiresTool()
            .sounds(BlockSoundGroup.DEEPSLATE)
    );



    private static Block registerExperienceDroppingBlock(String name, int minExp, int maxExp,AbstractBlock.Settings blockSettings) {
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID, name));
        Block block = new ExperienceDroppingBlock(UniformIntProvider.create(minExp,maxExp),blockSettings.registryKey(key));
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, key, block);
    }

    private static Block registerBlock(String name, AbstractBlock.Settings blockSettings) {
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID, name));
        Block block = new Block(blockSettings.registryKey(key));
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, key, block);
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
