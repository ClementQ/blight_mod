package com.xynoss.blight.datagen;

import com.xynoss.blight.item.ModItems;
import com.xynoss.blight.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.PINK_GARNET)
                .add(ModItems.RAW_PINK_GARNET)
                .add(Items.COAL)
                .add(Items.STICK)
                .add(Items.APPLE);

        //TOOLS
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.BLIGHT_SWORD)
                .add(ModItems.MYTHRION_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.BLIGHT_PICKAXE)
                .add(ModItems.MYTHRION_PICKAXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.BLIGHT_SHOVEL)
                .add(ModItems.MYTHRION_SHOVEL);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.BLIGHT_AXE)
                .add(ModItems.MYTHRION_AXE);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.BLIGHT_HOE)
                .add(ModItems.MYTHRION_HOE);

        //BLIGHT TOOLS
        getOrCreateTagBuilder(ModTags.Items.BLIGHT_REPAIR)
                .add(ModItems.BLIGHT_INGOT);
        getOrCreateTagBuilder(ModTags.Items.BLIGHT_TOOLS)
                .add(ModItems.BLIGHT_PICKAXE)
                .add(ModItems.BLIGHT_SWORD)
                .add(ModItems.BLIGHT_SHOVEL)
                .add(ModItems.BLIGHT_AXE)
                .add(ModItems.BLIGHT_HOE)
                .add(ModItems.BLIGHT_HAMMER);

        //MYTHRION TOOLS
        getOrCreateTagBuilder(ModTags.Items.MYTHRION_REPAIR)
                .add(ModItems.MYTHRION_INGOT);
        getOrCreateTagBuilder(ModTags.Items.MYTHRION_TOOLS)
                .add(ModItems.MYTHRION_PICKAXE)
                .add(ModItems.MYTHRION_SWORD)
                .add(ModItems.MYTHRION_SHOVEL)
                .add(ModItems.MYTHRION_AXE)
                .add(ModItems.MYTHRION_HOE)
                .add(ModItems.MYTHRION_HAMMER);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.BLIGHT_HELMET)
                .add(ModItems.BLIGHT_CHESTPLPATE)
                .add(ModItems.BLIGHT_LEGGINGS)
                .add(ModItems.BLIGHT_BOOTS);

        getOrCreateTagBuilder(ModTags.Items.BLIGHT_ARMOR)
                .add(ModItems.BLIGHT_HELMET)
                .add(ModItems.BLIGHT_CHESTPLPATE)
                .add(ModItems.BLIGHT_LEGGINGS)
                .add(ModItems.BLIGHT_BOOTS);

        getOrCreateTagBuilder(ItemTags.WOOL_CARPETS)
                .add(ModItems.MUSIC_DISC_ARISE);


    }
}
