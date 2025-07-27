package com.xynoss.blight.datagen;

import com.xynoss.blight.item.ModItems;
import com.xynoss.blight.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
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
                .add(ModItems.MYTHRION_SWORD)
                .add(ModItems.ELDRANITE_SWORD)
        ;
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.BLIGHT_PICKAXE)
                .add(ModItems.MYTHRION_PICKAXE)
                .add(ModItems.ELDRANITE_PICKAXE)
        ;
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.BLIGHT_SHOVEL)
                .add(ModItems.MYTHRION_SHOVEL)
                .add(ModItems.ELDRANITE_SHOVEL)
        ;
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.BLIGHT_AXE)
                .add(ModItems.MYTHRION_AXE)
                .add(ModItems.ELDRANITE_AXE)
        ;
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.BLIGHT_HOE)
                .add(ModItems.MYTHRION_HOE)
                .add(ModItems.ELDRANITE_HOE)
        ;

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
                .add(ModItems.MYTHRION_HAMMER)

                .add(ModItems.ELDRANITE_PICKAXE)
                .add(ModItems.ELDRANITE_SWORD)
                .add(ModItems.ELDRANITE_SHOVEL)
                .add(ModItems.ELDRANITE_AXE)
                .add(ModItems.ELDRANITE_HOE)
                .add(ModItems.ELDRANITE_HAMMER)

                .add(ModItems.TRIONITE_PICKAXE)
                .add(ModItems.TRIONITE_SWORD)
                .add(ModItems.TRIONITE_SHOVEL)
                .add(ModItems.TRIONITE_AXE)
                .add(ModItems.TRIONITE_HOE)
                .add(ModItems.TRIONITE_HAMMER)

                .add(ModItems.PYRALITE_PICKAXE)
                .add(ModItems.PYRALITE_SWORD)
                .add(ModItems.PYRALITE_SHOVEL)
                .add(ModItems.PYRALITE_AXE)
                .add(ModItems.PYRALITE_HOE)
                .add(ModItems.PYRALITE_HAMMER)

                .add(ModItems.VALTHERIUM_PICKAXE)
                .add(ModItems.VALTHERIUM_SWORD)
                .add(ModItems.VALTHERIUM_SHOVEL)
                .add(ModItems.VALTHERIUM_AXE)
                .add(ModItems.VALTHERIUM_HOE)
                .add(ModItems.VALTHERIUM_HAMMER)

                .add(ModItems.OBRYTHIUM_PICKAXE)
                .add(ModItems.OBRYTHIUM_SWORD)
                .add(ModItems.OBRYTHIUM_SHOVEL)
                .add(ModItems.OBRYTHIUM_AXE)
                .add(ModItems.OBRYTHIUM_HOE)
                .add(ModItems.OBRYTHIUM_HAMMER)

                .add(ModItems.NYXIUM_PICKAXE)
                .add(ModItems.NYXIUM_SWORD)
                .add(ModItems.NYXIUM_SHOVEL)
                .add(ModItems.NYXIUM_AXE)
                .add(ModItems.NYXIUM_HOE)
                .add(ModItems.NYXIUM_HAMMER);

        //ELDRANITE TOOLS
        getOrCreateTagBuilder(ModTags.Items.ELDRANITE_REPAIR)
                .add(ModItems.ELDRANITE_INGOT);
        getOrCreateTagBuilder(ModTags.Items.ELDRANITE_TOOLS)
                .add(ModItems.ELDRANITE_PICKAXE)
                .add(ModItems.ELDRANITE_SWORD)
                .add(ModItems.ELDRANITE_SHOVEL)
                .add(ModItems.ELDRANITE_AXE)
                .add(ModItems.ELDRANITE_HOE)
                .add(ModItems.ELDRANITE_HAMMER)

                .add(ModItems.TRIONITE_PICKAXE)
                .add(ModItems.TRIONITE_SWORD)
                .add(ModItems.TRIONITE_SHOVEL)
                .add(ModItems.TRIONITE_AXE)
                .add(ModItems.TRIONITE_HOE)
                .add(ModItems.TRIONITE_HAMMER)

                .add(ModItems.PYRALITE_PICKAXE)
                .add(ModItems.PYRALITE_SWORD)
                .add(ModItems.PYRALITE_SHOVEL)
                .add(ModItems.PYRALITE_AXE)
                .add(ModItems.PYRALITE_HOE)
                .add(ModItems.PYRALITE_HAMMER)

                .add(ModItems.VALTHERIUM_PICKAXE)
                .add(ModItems.VALTHERIUM_SWORD)
                .add(ModItems.VALTHERIUM_SHOVEL)
                .add(ModItems.VALTHERIUM_AXE)
                .add(ModItems.VALTHERIUM_HOE)
                .add(ModItems.VALTHERIUM_HAMMER)

                .add(ModItems.OBRYTHIUM_PICKAXE)
                .add(ModItems.OBRYTHIUM_SWORD)
                .add(ModItems.OBRYTHIUM_SHOVEL)
                .add(ModItems.OBRYTHIUM_AXE)
                .add(ModItems.OBRYTHIUM_HOE)
                .add(ModItems.OBRYTHIUM_HAMMER)

                .add(ModItems.NYXIUM_PICKAXE)
                .add(ModItems.NYXIUM_SWORD)
                .add(ModItems.NYXIUM_SHOVEL)
                .add(ModItems.NYXIUM_AXE)
                .add(ModItems.NYXIUM_HOE)
                .add(ModItems.NYXIUM_HAMMER);

        //TRIONITE TOOLS
        getOrCreateTagBuilder(ModTags.Items.TRIONITE_REPAIR)
                .add(ModItems.TRIONITE_INGOT);
        getOrCreateTagBuilder(ModTags.Items.TRIONITE_TOOLS)
                .add(ModItems.TRIONITE_PICKAXE)
                .add(ModItems.TRIONITE_SWORD)
                .add(ModItems.TRIONITE_SHOVEL)
                .add(ModItems.TRIONITE_AXE)
                .add(ModItems.TRIONITE_HOE)
                .add(ModItems.TRIONITE_HAMMER)

                .add(ModItems.PYRALITE_PICKAXE)
                .add(ModItems.PYRALITE_SWORD)
                .add(ModItems.PYRALITE_SHOVEL)
                .add(ModItems.PYRALITE_AXE)
                .add(ModItems.PYRALITE_HOE)
                .add(ModItems.PYRALITE_HAMMER)

                .add(ModItems.VALTHERIUM_PICKAXE)
                .add(ModItems.VALTHERIUM_SWORD)
                .add(ModItems.VALTHERIUM_SHOVEL)
                .add(ModItems.VALTHERIUM_AXE)
                .add(ModItems.VALTHERIUM_HOE)
                .add(ModItems.VALTHERIUM_HAMMER)

                .add(ModItems.OBRYTHIUM_PICKAXE)
                .add(ModItems.OBRYTHIUM_SWORD)
                .add(ModItems.OBRYTHIUM_SHOVEL)
                .add(ModItems.OBRYTHIUM_AXE)
                .add(ModItems.OBRYTHIUM_HOE)
                .add(ModItems.OBRYTHIUM_HAMMER)

                .add(ModItems.NYXIUM_PICKAXE)
                .add(ModItems.NYXIUM_SWORD)
                .add(ModItems.NYXIUM_SHOVEL)
                .add(ModItems.NYXIUM_AXE)
                .add(ModItems.NYXIUM_HOE)
                .add(ModItems.NYXIUM_HAMMER);

        //PYRALITE TOOLS
        getOrCreateTagBuilder(ModTags.Items.PYRALITE_REPAIR)
                .add(ModItems.PYRALITE_INGOT);
        getOrCreateTagBuilder(ModTags.Items.PYRALITE_TOOLS)
                .add(ModItems.PYRALITE_PICKAXE)
                .add(ModItems.PYRALITE_SWORD)
                .add(ModItems.PYRALITE_SHOVEL)
                .add(ModItems.PYRALITE_AXE)
                .add(ModItems.PYRALITE_HOE)
                .add(ModItems.PYRALITE_HAMMER)

                .add(ModItems.VALTHERIUM_PICKAXE)
                .add(ModItems.VALTHERIUM_SWORD)
                .add(ModItems.VALTHERIUM_SHOVEL)
                .add(ModItems.VALTHERIUM_AXE)
                .add(ModItems.VALTHERIUM_HOE)
                .add(ModItems.VALTHERIUM_HAMMER)

                .add(ModItems.OBRYTHIUM_PICKAXE)
                .add(ModItems.OBRYTHIUM_SWORD)
                .add(ModItems.OBRYTHIUM_SHOVEL)
                .add(ModItems.OBRYTHIUM_AXE)
                .add(ModItems.OBRYTHIUM_HOE)
                .add(ModItems.OBRYTHIUM_HAMMER)

                .add(ModItems.NYXIUM_PICKAXE)
                .add(ModItems.NYXIUM_SWORD)
                .add(ModItems.NYXIUM_SHOVEL)
                .add(ModItems.NYXIUM_AXE)
                .add(ModItems.NYXIUM_HOE)
                .add(ModItems.NYXIUM_HAMMER);

        //VALTHERIUM TOOLS
        getOrCreateTagBuilder(ModTags.Items.VALTHERIUM_REPAIR)
                .add(ModItems.VALTHERIUM_INGOT);
        getOrCreateTagBuilder(ModTags.Items.VALTHERIUM_TOOLS)
                .add(ModItems.VALTHERIUM_PICKAXE)
                .add(ModItems.VALTHERIUM_SWORD)
                .add(ModItems.VALTHERIUM_SHOVEL)
                .add(ModItems.VALTHERIUM_AXE)
                .add(ModItems.VALTHERIUM_HOE)
                .add(ModItems.VALTHERIUM_HAMMER)

                .add(ModItems.OBRYTHIUM_PICKAXE)
                .add(ModItems.OBRYTHIUM_SWORD)
                .add(ModItems.OBRYTHIUM_SHOVEL)
                .add(ModItems.OBRYTHIUM_AXE)
                .add(ModItems.OBRYTHIUM_HOE)
                .add(ModItems.OBRYTHIUM_HAMMER)

                .add(ModItems.NYXIUM_PICKAXE)
                .add(ModItems.NYXIUM_SWORD)
                .add(ModItems.NYXIUM_SHOVEL)
                .add(ModItems.NYXIUM_AXE)
                .add(ModItems.NYXIUM_HOE)
                .add(ModItems.NYXIUM_HAMMER);

        //OBRYTHIUM TOOLS
        getOrCreateTagBuilder(ModTags.Items.OBRYTHIUM_REPAIR)
                .add(ModItems.OBRYTHIUM_INGOT);
        getOrCreateTagBuilder(ModTags.Items.OBRYTHIUM_TOOLS)
                .add(ModItems.OBRYTHIUM_PICKAXE)
                .add(ModItems.OBRYTHIUM_SWORD)
                .add(ModItems.OBRYTHIUM_SHOVEL)
                .add(ModItems.OBRYTHIUM_AXE)
                .add(ModItems.OBRYTHIUM_HOE)
                .add(ModItems.OBRYTHIUM_HAMMER)

                .add(ModItems.NYXIUM_PICKAXE)
                .add(ModItems.NYXIUM_SWORD)
                .add(ModItems.NYXIUM_SHOVEL)
                .add(ModItems.NYXIUM_AXE)
                .add(ModItems.NYXIUM_HOE)
                .add(ModItems.NYXIUM_HAMMER);

        //NYXIUM TOOLS
        getOrCreateTagBuilder(ModTags.Items.NYXIUM_REPAIR)
                .add(ModItems.NYXIUM_INGOT);
        getOrCreateTagBuilder(ModTags.Items.NYXIUM_TOOLS)
                .add(ModItems.NYXIUM_PICKAXE)
                .add(ModItems.NYXIUM_SWORD)
                .add(ModItems.NYXIUM_SHOVEL)
                .add(ModItems.NYXIUM_AXE)
                .add(ModItems.NYXIUM_HOE)
                .add(ModItems.NYXIUM_HAMMER);



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
