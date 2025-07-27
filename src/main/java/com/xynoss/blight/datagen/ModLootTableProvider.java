package com.xynoss.blight.datagen;

import com.xynoss.blight.block.ModBlocks;
import com.xynoss.blight.block.custom.CauliflowerCropBlock;
import com.xynoss.blight.block.custom.HoneyBerryBushBlock;
import com.xynoss.blight.item.ModItems;
import com.xynoss.blight.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.*;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.predicate.NumberRange;
import net.minecraft.predicate.StatePredicate;
import net.minecraft.predicate.item.EnchantmentPredicate;
import net.minecraft.predicate.item.EnchantmentsPredicate;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.predicate.item.ItemSubPredicateTypes;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        RegistryWrapper.Impl<Enchantment> impl = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT);

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

        //crops
        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.CAULIFLOWER_CROP)
                .properties(StatePredicate.Builder.create().exactMatch(CauliflowerCropBlock.AGE, CauliflowerCropBlock.MAX_AGE));
        this.addDrop(ModBlocks.CAULIFLOWER_CROP, this.cropDrops(ModBlocks.CAULIFLOWER_CROP, ModItems.CAULIFLOWER, ModItems.CAULIFLOWER_SEEDS, builder2));

        //bush
        this.addDrop(ModBlocks.HONEY_BERRY_BUSH,
                block -> this.applyExplosionDecay(
                        block,LootTable.builder()
                                .pool(LootPool.builder()
                                                .conditionally(BlockStatePropertyLootCondition.builder(ModBlocks.HONEY_BERRY_BUSH).properties(StatePredicate.Builder.create().exactMatch(HoneyBerryBushBlock.AGE, 3)))
                                                .with(ItemEntry.builder(ModItems.HONEY_BERRIES))
                                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(2.0F, 3.0F)))
                                                .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE)))
                                )
                                .pool(LootPool.builder()
                                                .conditionally(BlockStatePropertyLootCondition.builder(ModBlocks.HONEY_BERRY_BUSH).properties(StatePredicate.Builder.create().exactMatch(HoneyBerryBushBlock.AGE, 2)))
                                                .with(ItemEntry.builder(ModItems.HONEY_BERRIES))
                                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 2.0F)))
                                                .apply(ApplyBonusLootFunction.uniformBonusCount(impl.getOrThrow(Enchantments.FORTUNE)))
                                )));


//Loottable Blight


//        addDrop(ModBlocks.BURNING_STONE, createRequiredToolMultipleDrops(ModBlocks.BURNING_STONE, ModItems.BURNING_STONE_ASHES, 1, 3, ModTags.Items.BLIGHT_TOOLS));

        addDrop(ModBlocks.BURNING_STONE, createRequiredToolMultipleDrops(ModBlocks.BURNING_STONE, ModItems.BURNING_STONE_ASHES, 1, 3, List.of(ModTags.Items.MYTHRION_TOOLS)));

        addDrop(ModBlocks.DEEPSLATE_MYTHRION_ORE,   multipleOreDrops(ModBlocks.DEEPSLATE_MYTHRION_ORE, ModItems.RAW_MYTHRION, 1,3));
        addDrop(ModBlocks.NETHER_ELDRANITE_ORE,     createRequiredToolMultipleDrops(ModBlocks.NETHER_ELDRANITE_ORE, ModItems.RAW_ELDRANITE, 1,  1, List.of(ModTags.Items.MYTHRION_TOOLS)));
        addDrop(ModBlocks.NETHER_TRIONITE_ORE,      createRequiredToolMultipleDrops(ModBlocks.NETHER_TRIONITE_ORE,  ModItems.RAW_TRIONITE,  1,  1, List.of(ModTags.Items.ELDRANITE_TOOLS)));
        addDrop(ModBlocks.NETHER_PYRALITE_ORE,      createRequiredToolMultipleDrops(ModBlocks.NETHER_PYRALITE_ORE,  ModItems.RAW_PYRALITE,  1,  1, List.of(ModTags.Items.TRIONITE_TOOLS)));
        addDrop(ModBlocks.VALTHERIUM_ORE,           createRequiredToolMultipleDrops(ModBlocks.VALTHERIUM_ORE,       ModItems.RAW_VALTHERIUM,1,  1, List.of(ModTags.Items.PYRALITE_TOOLS)));
        addDrop(ModBlocks.OBRYTHIUM_ORE,            createRequiredToolMultipleDrops(ModBlocks.OBRYTHIUM_ORE,        ModItems.RAW_OBRYTHIUM, 1,  1, List.of(ModTags.Items.VALTHERIUM_TOOLS)));
        addDrop(ModBlocks.NYXIUM_ORE,               createRequiredToolMultipleDrops(ModBlocks.NYXIUM_ORE,           ModItems.RAW_NYXIUM,    1,  1, List.of(ModTags.Items.OBRYTHIUM_TOOLS)));
        addDrop(ModBlocks.BLIGHT_ORE,               createRequiredToolMultipleDrops(ModBlocks.BLIGHT_ORE,           ModItems.RAW_BLIGHT,    1,  1, List.of(ModTags.Items.NYXIUM_TOOLS)));
        addDrop(ModBlocks.DEEPSLATE_BLIGHT_ORE,     createRequiredToolMultipleDrops(ModBlocks.BLIGHT_ORE,           ModItems.RAW_BLIGHT,    1,  1, List.of(ModTags.Items.NYXIUM_TOOLS)));


        addDrop(ModBlocks.MYTHRION_BLOCK);
        addDrop(ModBlocks.ELDRANITE_BLOCK);
        addDrop(ModBlocks.TRIONITE_BLOCK);
        addDrop(ModBlocks.NYXIUM_BLOCK);
        addDrop(ModBlocks.BLIGHT_BLOCK);


        addDrop(ModBlocks.RAW_MYTHRION_BLOCK);
        addDrop(ModBlocks.RAW_ELDRANITE_BLOCK);
        addDrop(ModBlocks.RAW_TRIONITE_BLOCK);
        addDrop(ModBlocks.RAW_MYTHRION_BLOCK);
        addDrop(ModBlocks.RAW_BLIGHT_BLOCK);


    }

    public LootTable.Builder createRequiredToolMultipleDrops(Block drop, Item item, float minDrops, float maxDrops, List<TagKey<Item>> requiredToolTags) {
        RegistryWrapper.Impl<Item> itemRegistry = this.registries.getOrThrow(RegistryKeys.ITEM);
        RegistryWrapper.Impl<Enchantment> impl = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT);

        LootTable.Builder lootTable = LootTable.builder();

        for (TagKey<Item> tag : requiredToolTags) {
            // Pool avec Silk Touch
            lootTable.pool(LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .with(ItemEntry.builder(drop))
                    .conditionally(MatchToolLootCondition.builder(
                            ItemPredicate.Builder.create().tag(itemRegistry, tag)))
                    .conditionally(MatchToolLootCondition.builder(
                            ItemPredicate.Builder.create().subPredicate(
                                    ItemSubPredicateTypes.ENCHANTMENTS,
                                    EnchantmentsPredicate.enchantments(List.of(
                                            new EnchantmentPredicate(impl.getOrThrow(Enchantments.SILK_TOUCH), NumberRange.IntRange.atLeast(1)))
                                    )
                            )
                    ))
            );

            // Pool sans Silk Touch
            lootTable.pool(LootPool.builder()
                    .rolls(ConstantLootNumberProvider.create(1))
                    .with(ItemEntry.builder(item)
                            .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops)))
                            .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))
                    )
                    .conditionally(MatchToolLootCondition.builder(
                            ItemPredicate.Builder.create().tag(itemRegistry, tag)))
                    .conditionally(InvertedLootCondition.builder(
                            MatchToolLootCondition.builder(
                                    ItemPredicate.Builder.create().subPredicate(
                                            ItemSubPredicateTypes.ENCHANTMENTS,
                                            EnchantmentsPredicate.enchantments(List.of(
                                                    new EnchantmentPredicate(impl.getOrThrow(Enchantments.SILK_TOUCH), NumberRange.IntRange.atLeast(1)))
                                            )
                                    )
                            )
                    ))
            );
        }

//        for (TagKey<Item> tag : requiredToolTags) {
//            LootTable.builder()
//                    // Pool pour Silk Touch - drop le bloc lui-même
//                    .pool(LootPool.builder()
//                                    .rolls(ConstantLootNumberProvider.create(1))
//                                    .with(ItemEntry.builder(drop))
//                                    .conditionally(MatchToolLootCondition.builder(
//                                            ItemPredicate.Builder.create().tag(itemRegistry, tag))
//                                    )
//                                    .conditionally(MatchToolLootCondition.builder(ItemPredicate.Builder.create()
//                                            .subPredicate(ItemSubPredicateTypes.ENCHANTMENTS, EnchantmentsPredicate.enchantments(
//                                                    List.of(new EnchantmentPredicate(impl.getOrThrow(Enchantments.SILK_TOUCH), NumberRange.IntRange.atLeast(1)))
//                                            ))
//                                    ))
//
//                            // Condition Silk Touch prédéfinie
//                    )
//        };
//                    // Pool pour les drops normaux (sans Silk Touch)
//                    LootTable.pool(LootPool.builder()
//                            .rolls(ConstantLootNumberProvider.create(1))
//                            .with(ItemEntry.builder(item)
//                                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops)))
//                                    .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))
//                            )
//                            .conditionally(MatchToolLootCondition.builder(
//                                    ItemPredicate.Builder.create().tag(itemRegistry, tag)
//                            ))
//                            .conditionally(InvertedLootCondition.builder(
//                                    MatchToolLootCondition.builder(
//                                            ItemPredicate.Builder.create()
//                                                    .subPredicate(ItemSubPredicateTypes.ENCHANTMENTS, EnchantmentsPredicate.enchantments(
//                                                            List.of(new EnchantmentPredicate(impl.getOrThrow(Enchantments.SILK_TOUCH), NumberRange.IntRange.atLeast(1)))
//                                                    )) // Condition Silk Touch inversée
//                                    )
//                            ))
//                    );


        return lootTable;
    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop,
                this.applyExplosionDecay(drop,
                        ((LeafEntry.Builder<?>)
                                ItemEntry.builder(item)
                                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops)))
                                        .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE))))));
    }
}
