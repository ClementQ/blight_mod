package com.xynoss.blight.block;

import com.xynoss.blight.Blight;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block",
            AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK));


    //private static Block registerBlock(String name, Block block){
    //    registerBlockItem(name, block);
    //    return Registry.register(Registries.BLOCK, Identifier.of(Blight.MOD_ID,name), block);
    //}
//
    //private static void registerBlockItem(String name, Block block){
    //    Registry.register(Registries.ITEM, Identifier.of(Blight.MOD_ID, name),
    //            new BlockItem(block, new Item.Settings()));
    //}

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

    public static void registerModBlock(){
        Blight.LOGGER.info("Registering Mod Bocks for " + Blight.MOD_ID );

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.PINK_GARNET_BLOCK);
        });
    }
}
