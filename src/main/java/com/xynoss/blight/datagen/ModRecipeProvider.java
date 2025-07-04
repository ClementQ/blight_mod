package com.xynoss.blight.datagen;

import com.xynoss.blight.Blight;
import com.xynoss.blight.block.ModBlocks;
import com.xynoss.blight.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.data.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;

import javax.tools.Tool;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import static net.minecraft.command.argument.RegistryKeyArgumentType.registryKey;
import static net.minecraft.data.recipe.RecipeGenerator.hasItem;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {

            public enum ToolType {
                PICKAXE, AXE, SHOVEL, HOE, SWORD
            }

            @Override
            public void generate() {


                List<ItemConvertible> BLIGHT_SMELTABLES = List.of(ModItems.RAW_BLIGHT, ModBlocks.BLIGHT_ORE,
                        ModBlocks.DEEPSLATE_BLIGHT_ORE);

                offerSmelting(BLIGHT_SMELTABLES, RecipeCategory.MISC, ModItems.BLIGHT_INGOT, 0.25f, 200,"blight");
                offerBlasting(BLIGHT_SMELTABLES, RecipeCategory.MISC, ModItems.BLIGHT_INGOT, 0.25f, 100,"blight");

                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.BLIGHT_INGOT, RecipeCategory.DECORATIONS, ModBlocks.BLIGHT_BLOCK);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.ELDRANITE_INGOT, RecipeCategory.DECORATIONS, ModBlocks.ELDRANITE_BLOCK);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_ELDRANITE, RecipeCategory.DECORATIONS, ModBlocks.RAW_ELDRANITE_BLOCK);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_PINK_GARNET, RecipeCategory.DECORATIONS, ModBlocks.PINK_GARNET_BLOCK);

                //BLIGHT TOOLS
                createTool(ToolType.PICKAXE, ModItems.BLIGHT_PICKAXE, ModItems.BLIGHT_INGOT, "blight_pickaxe");
                createTool(ToolType.AXE, ModItems.BLIGHT_AXE, ModItems.BLIGHT_INGOT, "blight_axe");
                createTool(ToolType.SHOVEL, ModItems.BLIGHT_SHOVEL, ModItems.BLIGHT_INGOT, "blight_shovel");
                createTool(ToolType.HOE, ModItems.BLIGHT_HOE, ModItems.BLIGHT_INGOT, "blight_hoe");
                createTool(ToolType.SWORD, ModItems.BLIGHT_SWORD, ModItems.BLIGHT_INGOT, "blight_sword");

                //MYTHRION TOOLS
                createTool(ToolType.PICKAXE, ModItems.MYTHRION_PICKAXE, ModItems.MYTHRION_INGOT, "mythrion_pickaxe");
                createTool(ToolType.AXE, ModItems.MYTHRION_AXE, ModItems.MYTHRION_INGOT, "mythrion_axe");
                createTool(ToolType.SHOVEL, ModItems.MYTHRION_SHOVEL, ModItems.MYTHRION_INGOT, "mythrion_shovel");
                createTool(ToolType.HOE, ModItems.MYTHRION_HOE, ModItems.MYTHRION_INGOT, "mythrion_hoe");
                createTool(ToolType.SWORD, ModItems.MYTHRION_SWORD, ModItems.MYTHRION_INGOT, "mythrion_sword");

                createShapeless(RecipeCategory.MISC, ModItems.PINK_GARNET, 9)
                        .input(ModItems.CHISEL_ITEM)
                        .criterion(hasItem(ModItems.CHISEL_ITEM), conditionsFromItem(ModItems.CHISEL_ITEM))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModItems.PINK_GARNET, 32)
                        .input(ModBlocks.MAGIC_BLOCK)
                        .criterion(hasItem(ModBlocks.MAGIC_BLOCK), conditionsFromItem(ModBlocks.MAGIC_BLOCK))
                        .offerTo(exporter, "raw_pink_garnet_from_magic_block");

            }



            public void createTool(ToolType toolType, Item tool, Item item, String recipePath){
                if(toolType == ToolType.SWORD){
                    createShaped(RecipeCategory.TOOLS, tool).pattern("I").pattern("I").pattern("S").input('I',item).input('S', Items.STICK).criterion(hasItem(item), conditionsFromItem(item)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)).offerTo(exporter, recipePath);
                } else if (toolType == ToolType.PICKAXE) {
                    createShaped(RecipeCategory.TOOLS, tool).pattern("BBB").pattern(" S ").pattern(" S ").input('B',item).input('S', Items.STICK).criterion(hasItem(item), conditionsFromItem(item)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)).offerTo(exporter, recipePath);
                } else if (toolType == ToolType.SHOVEL) {
                    createShaped(RecipeCategory.TOOLS, tool).pattern("B").pattern("S").pattern("S").input('B',item).input('S', Items.STICK).criterion(hasItem(item), conditionsFromItem(item)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)).offerTo(exporter, recipePath);
                } else if (toolType == ToolType.AXE) {
                    createShaped(RecipeCategory.TOOLS, tool).pattern("BB").pattern("BS").pattern(" S").input('B',item).input('S', Items.STICK).criterion(hasItem(item), conditionsFromItem(item)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)).offerTo(exporter, recipePath);
                } else if (toolType == ToolType.HOE){
                    createShaped(RecipeCategory.TOOLS, tool).pattern("BB").pattern(" S").pattern(" S").input('B',item).input('S', Items.STICK).criterion(hasItem(item), conditionsFromItem(item)).criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK)).offerTo(exporter, recipePath);
                }
            }
        };
    }



    @Override
    public String getName() {
        return "";
    }
}
