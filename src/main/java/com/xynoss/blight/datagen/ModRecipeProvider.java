package com.xynoss.blight.datagen;

import com.xynoss.blight.Blight;
import com.xynoss.blight.block.ModBlocks;
import com.xynoss.blight.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.data.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {
            @Override
            public void generate() {

                List<ItemConvertible> BLIGHT_SMELTABLES = List.of(ModItems.RAW_BLIGHT, ModBlocks.BLIGHT_ORE,
                        ModBlocks.DEEPSLATE_BLIGHT_ORE);

                offerSmelting(BLIGHT_SMELTABLES, RecipeCategory.MISC, ModItems.BLIGHT_INGOT, 0.25f, 200,"blight");
                offerBlasting(BLIGHT_SMELTABLES, RecipeCategory.MISC, ModItems.BLIGHT_INGOT, 0.25f, 100,"blight");

                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.BLIGHT_INGOT, RecipeCategory.DECORATIONS, ModBlocks.BLIGHT_BLOCK);
                offerReversibleCompactingRecipes(RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_PINK_GARNET, RecipeCategory.DECORATIONS, ModBlocks.PINK_GARNET_BLOCK);

                createShaped(RecipeCategory.TOOLS, ModItems.BLIGHT_SWORD)
                        .pattern("B")
                        .pattern("B")
                        .pattern("S")
                        .input('B',ModItems.BLIGHT_INGOT)
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModItems.BLIGHT_INGOT), conditionsFromItem(ModItems.BLIGHT_INGOT))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.BLIGHT_PICKAXE)
                        .pattern("BBB")
                        .pattern(" S ")
                        .pattern(" S ")
                        .input('B',ModItems.BLIGHT_INGOT)
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModItems.BLIGHT_INGOT), conditionsFromItem(ModItems.BLIGHT_INGOT))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);

                createShaped(RecipeCategory.TOOLS, ModItems.BLIGHT_SHOVEL)
                        .pattern("B")
                        .pattern("S")
                        .pattern("S")
                        .input('B',ModItems.BLIGHT_INGOT)
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModItems.BLIGHT_INGOT), conditionsFromItem(ModItems.BLIGHT_INGOT))
                        .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModItems.PINK_GARNET, 9)
                        .input(ModItems.CHISEL_ITEM)
                        .criterion(hasItem(ModItems.CHISEL_ITEM), conditionsFromItem(ModItems.CHISEL_ITEM))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModItems.PINK_GARNET, 32)
                        .input(ModBlocks.MAGIC_BLOCK)
                        .criterion(hasItem(ModBlocks.MAGIC_BLOCK), conditionsFromItem(ModBlocks.MAGIC_BLOCK))
                        .offerTo(exporter, "raw_pink_garnet_from_magic_block");
            }
        };
    }

    @Override
    public String getName() {
        return "";
    }
}
