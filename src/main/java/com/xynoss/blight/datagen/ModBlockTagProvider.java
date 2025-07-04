package com.xynoss.blight.datagen;

import com.xynoss.blight.block.ModBlocks;
import com.xynoss.blight.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

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
                .add(ModBlocks.ELDRANITE_ORE)
        ;


        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RAW_BLIGHT_BLOCK)
                .add(ModBlocks.BLIGHT_BLOCK)
                .add(ModBlocks.PINK_GARNET_BLOCK)
                .add(ModBlocks.RAW_PINK_GARNET_BLOCK)
        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.BLIGHT_ORE)
                .add(ModBlocks.DEEPSLATE_BLIGHT_ORE)
                .add(ModBlocks.ELDRANITE_ORE)
        ;

        getOrCreateTagBuilder(BlockTags.FENCES).add(ModBlocks.PINK_GARNET_FENCE);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.PINK_GARNET_FENCE_GATE);
        getOrCreateTagBuilder(BlockTags.WALLS).add(ModBlocks.PINK_GARNET_WALL);


        //NEEDS BLIGHT TOOLS
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_BLIGHT_TOOL)
//                .add(ModBlocks.BURNING_STONE)
                .add(ModBlocks.DEEPSLATE_MYTHRION_ORE)
        ;

        //NEEDS MYTHRION TOOLS
        getOrCreateTagBuilder(ModTags.Blocks.NEEDS_MYTHRION_TOOL)
                .add(ModBlocks.BURNING_STONE)
        ;


    }
}
