package com.xynoss.blight.world;

import com.xynoss.blight.Blight;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.Collection;


public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> MYTHRION_ORE_PLACED_KEY = registerKey("mythrion_ore_placed");
    public static final RegistryKey<PlacedFeature> ELDRANITE_ORE_PLACED_KEY = registerKey("eldranite_ore_placed");
    public static final RegistryKey<PlacedFeature> TRIONITE_ORE_PLACED_KEY = registerKey("trionite_ore_placed");
    public static final RegistryKey<PlacedFeature> PYRALITE_ORE_PLACED_KEY = registerKey("pyralite_ore_placed");
    public static final RegistryKey<PlacedFeature> NYXIUM_ORE_PLACED_KEY = registerKey("nyxium_ore_placed");
    public static final RegistryKey<PlacedFeature> BLIGHT_ORE_PLACED_KEY = registerKey("bligh_ore_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);


        //Mythrion ORE
        register(context, MYTHRION_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MYTHRION_ORE_KEY),
                ModOrePlacement.modifiersWithCount(14,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80)))
        );

        //Eldranite ORE
        register(context, ELDRANITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ELDRANITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(14,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80)))
        );

        //Trionite ORE
        register(context, TRIONITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TRIONITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(14,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80)))
        );

        //Pyralite ORE
        register(context, PYRALITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PYRALITE_ORE_KEY),
                ModOrePlacement.modifiersWithCount(14,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80)))
        );

        //Nyxium ORE
        register(context, NYXIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.NYXIUM_ORE_KEY),
                ModOrePlacement.modifiersWithCount(14,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80)))
        );

        //Blight ORE
        register(context, BLIGHT_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BLIGHT_ORE_KEY),
                ModOrePlacement.modifiersWithCount(14,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80)))
                );
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(Blight.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 Collection<? extends PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, java.util.List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, java.util.List.of(modifiers));
    }
}
