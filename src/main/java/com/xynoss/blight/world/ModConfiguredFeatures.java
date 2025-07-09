package com.xynoss.blight.world;

import com.xynoss.blight.Blight;
import com.xynoss.blight.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.client.search.IdentifierSearcher;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> MYTHRION_ORE_KEY = registerKey("mythrion_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ELDRANITE_ORE_KEY = registerKey("eldranite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TRIONITE_ORE_KEY = registerKey("trionite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NYXIUM_ORE_KEY = registerKey("nyxium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BLIGHT_ORE_KEY = registerKey("blight_ore");




    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        RuleTest stoneReplacebles = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplacebles = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplacebles = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endReplacebles = new BlockMatchRuleTest(Blocks.END_STONE);

        //Mythrion ORES
        List<OreFeatureConfig.Target> overworldMythrionOres =
                List.of(
                        OreFeatureConfig.createTarget(deepslateReplacebles, ModBlocks.DEEPSLATE_MYTHRION_ORE.getDefaultState()));

        //Eldranite ORES
        List<OreFeatureConfig.Target> netherEldraniteOres =
                List.of(
                        OreFeatureConfig.createTarget(netherReplacebles, ModBlocks.NETHER_ELDRANITE_ORE.getDefaultState()));

        //Trionite ORES
        List<OreFeatureConfig.Target> netherTrioniteOres =
                List.of(
                        OreFeatureConfig.createTarget(netherReplacebles, ModBlocks.NETHER_TRIONITE_ORE.getDefaultState()));

        //Nyxium ORES
        List<OreFeatureConfig.Target> endNyxiumOres =
                List.of(
                        OreFeatureConfig.createTarget(endReplacebles, ModBlocks.NYXIUM_ORE.getDefaultState()));

        //Blight ORES
        List<OreFeatureConfig.Target> overworldBlightOres =
                List.of(
                        OreFeatureConfig.createTarget(stoneReplacebles, ModBlocks.BLIGHT_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacebles, ModBlocks.DEEPSLATE_BLIGHT_ORE.getDefaultState()));


        //Register ORES
        register(context, MYTHRION_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMythrionOres, 9));
        register(context, ELDRANITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherEldraniteOres, 9));
        register(context, TRIONITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherTrioniteOres, 9));
        register(context, NYXIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(endNyxiumOres, 5));
        register(context, BLIGHT_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldBlightOres, 12));

    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name){
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Blight.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key,
                                                                                   F feature,
                                                                                   FC configuration){
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
