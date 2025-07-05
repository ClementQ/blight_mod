package com.xynoss.blight.item;

import com.xynoss.blight.Blight;
import com.xynoss.blight.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Blight.MOD_ID, "pink_garnet_items"),
            FabricItemGroup.builder().icon(() ->new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.blight.pink_garnet_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);
                        entries.add(ModItems.CHISEL_ITEM);
                        entries.add(ModItems.CAULIFLOWER);
                        entries.add(ModItems.CAULIFLOWER_SEEDS);
                        entries.add(ModItems.HONEY_BERRIES);
                    })
                    .build());

    public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Blight.MOD_ID, "pink_garnet_blocks"),
            FabricItemGroup.builder().icon(() ->new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
                    .displayName(Text.translatable("itemgroup.blight.pink_garnet_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.MAGIC_BLOCK);

                        entries.add(ModBlocks.PINK_GARNET_STAIRS);
                        entries.add(ModBlocks.PINK_GARNET_SLAB);

                        entries.add(ModBlocks.PINK_GARNET_BUTTON);
                        entries.add(ModBlocks.PINK_GARNET_PRESSURE_PLATE);

                        entries.add(ModBlocks.PINK_GARNET_FENCE);
                        entries.add(ModBlocks.PINK_GARNET_FENCE_GATE);
                        entries.add(ModBlocks.PINK_GARNET_WALL);

                        entries.add(ModBlocks.PINK_GARNET_DOOR);
                        entries.add(ModBlocks.PINK_GARNET_TRAPDOOR);

                        entries.add(ModBlocks.PINK_GARNET_LAMP);

                    })
                    .build());


//BLIGHT
    public static final ItemGroup BLIGHT_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Blight.MOD_ID, "blight_block"),
            FabricItemGroup.builder().icon(() ->new ItemStack(ModBlocks.BLIGHT_BLOCK))
                    .displayName(Text.translatable("itemgroup.blight.blight_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BLIGHT_BLOCK);
                        entries.add(ModBlocks.RAW_BLIGHT_BLOCK);
                        entries.add(ModBlocks.BLIGHT_ORE);
                        entries.add(ModBlocks.DEEPSLATE_BLIGHT_ORE);
                        entries.add(ModBlocks.BURNING_STONE);
                        entries.add(ModBlocks.ELDRANITE_ORE);
                        entries.add(ModBlocks.ELDRANITE_BLOCK);
                        entries.add(ModBlocks.RAW_ELDRANITE_BLOCK);
                        entries.add(ModBlocks.DEEPSLATE_MYTHRION_ORE);
                        entries.add(ModBlocks.MYTHRION_BLOCK);
                        entries.add(ModBlocks.RAW_MYTHRION_BLOCK);




                    })
                    .build());
    public static final ItemGroup BLIGHT_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Blight.MOD_ID, "blight_ingot"),
            FabricItemGroup.builder().icon(() ->new ItemStack(ModItems.BLIGHT_INGOT))
                    .displayName(Text.translatable("itemgroup.blight.blight_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BLIGHT_INGOT);
                        entries.add(ModItems.RAW_BLIGHT);
                        entries.add(ModItems.BURNING_STONE_ASHES);
                        entries.add(ModItems.RAW_ELDRANITE);
                        entries.add(ModItems.ELDRANITE_INGOT);
                        entries.add(ModItems.RAW_MYTHRION);
                        entries.add(ModItems.MYTHRION_INGOT);

                    })
                    .build());
    public static final ItemGroup BLIGHT_TOOLS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Blight.MOD_ID, "blight_pickaxe"),
            FabricItemGroup.builder().icon(() ->new ItemStack(ModItems.BLIGHT_PICKAXE))
                    .displayName(Text.translatable("itemgroup.blight.blight_tools"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BLIGHT_PICKAXE);
                        entries.add(ModItems.BLIGHT_SWORD);
                        entries.add(ModItems.BLIGHT_SHOVEL);
                        entries.add(ModItems.BLIGHT_AXE);
                        entries.add(ModItems.BLIGHT_HOE);
                        entries.add(ModItems.BLIGHT_HAMMER);
                        entries.add(ModItems.BLIGHT_BOW);

                        entries.add(ModItems.BLIGHT_HELMET);
                        entries.add(ModItems.BLIGHT_CHESTPLPATE);
                        entries.add(ModItems.BLIGHT_LEGGINGS);
                        entries.add(ModItems.BLIGHT_BOOTS);

                        entries.add(ModItems.MYTHRION_PICKAXE);
                        entries.add(ModItems.MYTHRION_SWORD);
                        entries.add(ModItems.MYTHRION_SHOVEL);
                        entries.add(ModItems.MYTHRION_AXE);
                        entries.add(ModItems.MYTHRION_HOE);
                        entries.add(ModItems.MYTHRION_HAMMER);

                    })
                    .build());


    public static void registerItemGroups(){

        Blight.LOGGER.info("Registering Item Groups for " + Blight.MOD_ID);
    }
}
