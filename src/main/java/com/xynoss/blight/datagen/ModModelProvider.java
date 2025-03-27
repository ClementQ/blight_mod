package com.xynoss.blight.datagen;

import com.xynoss.blight.block.ModBlocks;
import com.xynoss.blight.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLIGHT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_BLIGHT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BLIGHT_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLIGHT_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BURNING_STONE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGIC_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PINK_GARNET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_PINK_GARNET_BLOCK);



    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_BLIGHT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLIGHT_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BURNING_STONE_ASHES, Models.GENERATED);

        itemModelGenerator.register(ModItems.CHISEL_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.CAULIFLOWER, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PINK_GARNET, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_GARNET, Models.GENERATED);
    }
}
