
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pichula.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import net.mcreator.pichula.world.features.ores.TroncodeJunglaFeature;
import net.mcreator.pichula.world.features.ores.HolajunglaFeature;
import net.mcreator.pichula.world.features.ores.EarthbeginFeature;
import net.mcreator.pichula.world.features.ores.AntimateriaFeature;
import net.mcreator.pichula.world.features.lakes.PetroleoFeature;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PichulaModFeatures {
	private static final Map<Feature<?>, FeatureRegistration> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(AntimateriaFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				AntimateriaFeature.GENERATE_BIOMES, AntimateriaFeature.CONFIGURED_FEATURE));
		REGISTRY.put(EarthbeginFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, EarthbeginFeature.GENERATE_BIOMES,
				EarthbeginFeature.CONFIGURED_FEATURE));
		REGISTRY.put(PetroleoFeature.FEATURE,
				new FeatureRegistration(GenerationStep.Decoration.LAKES, PetroleoFeature.GENERATE_BIOMES, PetroleoFeature.CONFIGURED_FEATURE));
		REGISTRY.put(TroncodeJunglaFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				TroncodeJunglaFeature.GENERATE_BIOMES, TroncodeJunglaFeature.CONFIGURED_FEATURE));
		REGISTRY.put(HolajunglaFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, HolajunglaFeature.GENERATE_BIOMES,
				HolajunglaFeature.CONFIGURED_FEATURE));
	}

	@SubscribeEvent
	public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {
		event.getRegistry().registerAll(REGISTRY.keySet().toArray(new Feature[0]));
		REGISTRY.forEach((feature, registration) -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, feature.getRegistryName(),
				registration.configuredFeature()));
	}

	@Mod.EventBusSubscriber
	private static class BiomeFeatureLoader {
		@SubscribeEvent
		public static void addFeatureToBiomes(BiomeLoadingEvent event) {
			for (FeatureRegistration registration : REGISTRY.values()) {
				if (registration.biomes() == null || registration.biomes().contains(event.getName())) {
					event.getGeneration().getFeatures(registration.stage()).add(() -> registration.configuredFeature());
				}
			}
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			ConfiguredFeature<?, ?> configuredFeature) {
	}
}
