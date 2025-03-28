package com.xynoss.blight.datagen;

import com.xynoss.blight.block.ModBlocks;
import com.xynoss.blight.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.loot.FabricBlockLootTableGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

//Loottable Tuto
        addDrop(ModBlocks.PINK_GARNET_BLOCK);
        addDrop(ModBlocks.RAW_PINK_GARNET_BLOCK);

        addDrop(ModBlocks.PINK_GARNET_STAIRS);
        addDrop(ModBlocks.PINK_GARNET_SLAB, slabDrops(ModBlocks.PINK_GARNET_SLAB));

        addDrop(ModBlocks.PINK_GARNET_BUTTON);
        addDrop(ModBlocks.PINK_GARNET_PRESSURE_PLATE);

        addDrop(ModBlocks.PINK_GARNET_FENCE);
        addDrop(ModBlocks.PINK_GARNET_FENCE_GATE);
        addDrop(ModBlocks.PINK_GARNET_WALL);

        addDrop(ModBlocks.PINK_GARNET_DOOR, doorDrops(ModBlocks.PINK_GARNET_DOOR));
        addDrop(ModBlocks.PINK_GARNET_TRAPDOOR);


//Loottable Blight
        addDrop(ModBlocks.BLIGHT_BLOCK);
        addDrop(ModBlocks.RAW_BLIGHT_BLOCK);
        addDrop(ModBlocks.BURNING_STONE);

        addDrop(ModBlocks.BLIGHT_ORE, multipleOreDrops(ModBlocks.BLIGHT_ORE, ModItems.RAW_BLIGHT, 1,3));
        addDrop(ModBlocks.DEEPSLATE_BLIGHT_ORE, multipleOreDrops(ModBlocks.DEEPSLATE_BLIGHT_ORE, ModItems.RAW_BLIGHT, 3,7));
        addDrop(ModBlocks.BURNING_STONE, multipleOreDrops(ModBlocks.DEEPSLATE_BLIGHT_ORE, ModItems.BURNING_STONE_ASHES, 3,7));
    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops)))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE))))));
    }
}
