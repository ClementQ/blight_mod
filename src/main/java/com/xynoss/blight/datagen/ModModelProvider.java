package com.xynoss.blight.datagen;

import com.xynoss.blight.block.ModBlocks;
import com.xynoss.blight.block.custom.PinkGarnetLampBlock;
import com.xynoss.blight.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.*;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
//Tuto Models
        BlockStateModelGenerator.BlockTexturePool pinkGarnetPool= blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_GARNET_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAGIC_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_PINK_GARNET_BLOCK);

        pinkGarnetPool.stairs(ModBlocks.PINK_GARNET_STAIRS);
        pinkGarnetPool.slab(ModBlocks.PINK_GARNET_SLAB);

        pinkGarnetPool.button(ModBlocks.PINK_GARNET_BUTTON);
        pinkGarnetPool.pressurePlate(ModBlocks.PINK_GARNET_PRESSURE_PLATE);

        pinkGarnetPool.fence(ModBlocks.PINK_GARNET_FENCE);
        pinkGarnetPool.fenceGate(ModBlocks.PINK_GARNET_FENCE_GATE);
        pinkGarnetPool.wall(ModBlocks.PINK_GARNET_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.PINK_GARNET_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PINK_GARNET_TRAPDOOR);

        Identifier lampOffIdentifier = TexturedModel.CUBE_ALL.upload(ModBlocks.PINK_GARNET_LAMP, blockStateModelGenerator.modelCollector);
        Identifier lampOnIdentifier = blockStateModelGenerator.createSubModel(ModBlocks.PINK_GARNET_LAMP,"_on", Models.CUBE_ALL, TextureMap::all);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(ModBlocks.PINK_GARNET_LAMP)
                .coordinate(BlockStateModelGenerator.createBooleanModelMap(PinkGarnetLampBlock.CLICKED, lampOnIdentifier, lampOffIdentifier)));

//BLight Models
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLIGHT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_BLIGHT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BLIGHT_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLIGHT_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BURNING_STONE);





    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
//Blight Items
        itemModelGenerator.register(ModItems.RAW_BLIGHT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLIGHT_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BURNING_STONE_ASHES, Models.GENERATED);

        itemModelGenerator.register(ModItems.BLIGHT_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLIGHT_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLIGHT_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLIGHT_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLIGHT_HOE, Models.HANDHELD);

//Tuto Items
        itemModelGenerator.register(ModItems.CHISEL_ITEM, Models.GENERATED);
        itemModelGenerator.register(ModItems.CAULIFLOWER, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PINK_GARNET, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_GARNET, Models.GENERATED);
    }
}
