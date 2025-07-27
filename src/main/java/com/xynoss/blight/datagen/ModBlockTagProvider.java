package com.xynoss.blight.datagen;

import com.jcraft.jorbis.Block;
import com.xynoss.blight.block.ModBlocks;
import com.xynoss.blight.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.BLIGHT_BLOCK)
                .add(ModBlocks.BLIGHT_ORE)
                .add(ModBlocks.DEEPSLATE_BLIGHT_ORE)
                .add(ModBlocks.BURNING_STONE)
                .add(ModBlocks.PINK_GARNET_BLOCK)
                .add(ModBlocks.RAW_PINK_GARNET_BLOCK)
                .add(ModBlocks.MAGIC_BLOCK)
                .add(ModBlocks.DEEPSLATE_MYTHRION_ORE)
                .add(ModBlocks.NETHER_ELDRANITE_ORE)
                .add(ModBlocks.ELDRANITE_BLOCK)
                .add(ModBlocks.RAW_ELDRANITE_BLOCK)
                .add(ModBlocks.NETHER_TRIONITE_ORE)
                .add(ModBlocks.TRIONITE_BLOCK)
                .add(ModBlocks.RAW_TRIONITE_BLOCK)
                .add(ModBlocks.NETHER_PYRALITE_ORE)
                .add(ModBlocks.PYRALITE_BLOCK)
                .add(ModBlocks.RAW_PYRALITE_BLOCK)
                .add(ModBlocks.VALTHERIUM_ORE)
                .add(ModBlocks.VALTHERIUM_BLOCK)
                .add(ModBlocks.RAW_VALTHERIUM_BLOCK)
                .add(ModBlocks.OBRYTHIUM_ORE)
                .add(ModBlocks.OBRYTHIUM_BLOCK)
                .add(ModBlocks.RAW_OBRYTHIUM_BLOCK)
                .add(ModBlocks.NYXIUM_ORE)
                .add(ModBlocks.NYXIUM_BLOCK)
                .add(ModBlocks.RAW_NYXIUM_BLOCK)
        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
        ;
        
        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RAW_BLIGHT_BLOCK)
                .add(ModBlocks.BLIGHT_BLOCK)
                .add(ModBlocks.PINK_GARNET_BLOCK)
                .add(ModBlocks.RAW_PINK_GARNET_BLOCK)
        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.DEEPSLATE_MYTHRION_ORE)
        ;

        getOrCreateTagBuilder(BlockTags.FENCES).add(ModBlocks.PINK_GARNET_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.PINK_GARNET_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.PINK_GARNET_WALL);


        //NEEDS MYTHRION TOOLS
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_MYTHRION_TOOL)
                .addTag(BlockTags.NEEDS_DIAMOND_TOOL)
                .addTag(BlockTags.NEEDS_IRON_TOOL)
                .addTag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.BURNING_STONE)
                .add(ModBlocks.NETHER_ELDRANITE_ORE)
        ;

        //NEEDS ELDRANITE TOOLS
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_ELDRANITE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_MYTHRION_TOOL)
                .add(ModBlocks.NETHER_ELDRANITE_ORE)
                .add(ModBlocks.NETHER_TRIONITE_ORE)
        ;

        //NEEDS TRIONITE TOOLS
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_TRIONITE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_ELDRANITE_TOOL)
                .add(ModBlocks.NETHER_PYRALITE_ORE)

        ;

        //NEEDS PYRALITE TOOLS
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_PYRALITE_TOOL)
                .addTag(ModTags.Blocks.NEEDS_TRIONITE_TOOL)
                .add(ModBlocks.VALTHERIUM_ORE)
        ;

        //NEEDS VALTHERIUM TOOLS
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_VALTHERIUM_TOOL)
                .addTag(ModTags.Blocks.NEEDS_PYRALITE_TOOL)
                .add(ModBlocks.OBRYTHIUM_ORE)
        ;

        //NEEDS NYXIUM TOOLS
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_NYXIUM_TOOL)
                .addTag(ModTags.Blocks.NEEDS_VALTHERIUM_TOOL)
                .add(ModBlocks.NYXIUM_ORE)
                .add(ModBlocks.BLIGHT_ORE)
        ;

        //NEEDS BLIGHT TOOLS
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_BLIGHT_TOOL)
                .addTag(ModTags.Blocks.NEEDS_NYXIUM_TOOL)
        ;


    }
}
