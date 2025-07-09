package com.xynoss.blight.datagen;

import com.xynoss.blight.block.ModBlocks;
import com.xynoss.blight.block.custom.CauliflowerCropBlock;
import com.xynoss.blight.block.custom.HoneyBerryBushBlock;
import com.xynoss.blight.block.custom.PinkGarnetLampBlock;
import com.xynoss.blight.component.ModDataComponentTypes;
import com.xynoss.blight.item.ModItems;
import com.xynoss.blight.item.equipment.ModEquipmentAssetKeys;
import com.xynoss.blight.util.ModItemModelGenerator;
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

        blockStateModelGenerator.registerCrop(ModBlocks.CAULIFLOWER_CROP, CauliflowerCropBlock.AGE, 0,1,2,3,4,5,6);
        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.HONEY_BERRY_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED,
                HoneyBerryBushBlock.AGE, 0,1,2,3);

//BLight Models
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_BLIGHT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLIGHT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MYTHRION_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_MYTHRION_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ELDRANITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_ELDRANITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TRIONITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_TRIONITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NYXIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_NYXIUM_BLOCK);


        //ORES
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BURNING_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLIGHT_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_BLIGHT_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_MYTHRION_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_ELDRANITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_TRIONITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NYXIUM_ORE);






    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        ModItemModelGenerator custom = new ModItemModelGenerator(itemModelGenerator.output, itemModelGenerator.modelCollector);


//Blight Items
        //ORES
        itemModelGenerator.register(ModItems.RAW_BLIGHT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLIGHT_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BURNING_STONE_ASHES, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_MYTHRION, Models.GENERATED);
        itemModelGenerator.register(ModItems.MYTHRION_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_ELDRANITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ELDRANITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_TRIONITE, Models.GENERATED);
        itemModelGenerator.register(ModItems.TRIONITE_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.NYXIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_NYXIUM, Models.GENERATED);


        itemModelGenerator.register(ModItems.MUSIC_DISC_ARISE, Models.GENERATED);

        itemModelGenerator.register(ModItems.BLIGHT_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLIGHT_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLIGHT_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLIGHT_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLIGHT_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.BLIGHT_HAMMER, Models.HANDHELD);
        custom.ModRegisterBow(ModItems.BLIGHT_BOW);

        itemModelGenerator.register(ModItems.MYTHRION_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRION_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRION_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRION_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRION_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.MYTHRION_HAMMER, Models.HANDHELD);


        //ARMORS
        itemModelGenerator.registerArmor(ModItems.BLIGHT_HELMET, ModEquipmentAssetKeys.BLIGHT,"helmet", false);
        itemModelGenerator.registerArmor(ModItems.BLIGHT_CHESTPLPATE, ModEquipmentAssetKeys.BLIGHT,"chestplate", false);
        itemModelGenerator.registerArmor(ModItems.BLIGHT_LEGGINGS, ModEquipmentAssetKeys.BLIGHT,"leggings", false);
        itemModelGenerator.registerArmor(ModItems.BLIGHT_BOOTS, ModEquipmentAssetKeys.BLIGHT,"boots", false);
        itemModelGenerator.register(ModItems.BLIGHT_HORSE_ARMOR, Models.GENERATED);

//Tuto Items
        itemModelGenerator.output.accept(ModItems.CHISEL_ITEM,
                ItemModels.condition(ItemModels.hasComponentProperty(ModDataComponentTypes.CHISEL_USED),
                        ItemModels.basic(itemModelGenerator.registerSubModel(ModItems.CHISEL_ITEM, "_used", Models.GENERATED)),
                        ItemModels.basic(itemModelGenerator.upload(ModItems.CHISEL_ITEM, Models.GENERATED))
                )
        );


        itemModelGenerator.register(ModItems.CAULIFLOWER, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_PINK_GARNET, Models.GENERATED);
        itemModelGenerator.register(ModItems.PINK_GARNET, Models.GENERATED);
    }

//    public void customGenerateItemModels(ModItemModelGenerator modItemModelGenerator){
//        modItemModelGenerator.ModRegisterBow(ModItems.BLIGHT_BOW);
//    }


}
