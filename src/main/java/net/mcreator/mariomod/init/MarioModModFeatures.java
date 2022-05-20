
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mariomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Holder;

import net.mcreator.mariomod.world.features.plants.IceFlowerBlockFeature;
import net.mcreator.mariomod.world.features.plants.FireFlowerBlockFeature;
import net.mcreator.mariomod.world.features.Question1Feature;
import net.mcreator.mariomod.world.features.Brick2Question1Feature;
import net.mcreator.mariomod.MarioModMod;

import java.util.function.Supplier;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber
public class MarioModModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, MarioModMod.MODID);
	private static final List<FeatureRegistration> FEATURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<Feature<?>> FIRE_FLOWER_BLOCK = register("fire_flower_block", FireFlowerBlockFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, FireFlowerBlockFeature.GENERATE_BIOMES,
					FireFlowerBlockFeature::placedFeature));
	public static final RegistryObject<Feature<?>> ICE_FLOWER_BLOCK = register("ice_flower_block", IceFlowerBlockFeature::feature,
			new FeatureRegistration(GenerationStep.Decoration.VEGETAL_DECORATION, IceFlowerBlockFeature.GENERATE_BIOMES,
					IceFlowerBlockFeature::placedFeature));
	public static final RegistryObject<Feature<?>> BRICK_2_QUESTION_1 = register("brick_2_question_1", Brick2Question1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Brick2Question1Feature.GENERATE_BIOMES,
					Brick2Question1Feature::placedFeature));
	public static final RegistryObject<Feature<?>> QUESTION_1 = register("question_1", Question1Feature::feature,
			new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES, Question1Feature.GENERATE_BIOMES, Question1Feature::placedFeature));

	private static RegistryObject<Feature<?>> register(String registryname, Supplier<Feature<?>> feature, FeatureRegistration featureRegistration) {
		FEATURE_REGISTRATIONS.add(featureRegistration);
		return REGISTRY.register(registryname, feature);
	}

	@SubscribeEvent
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (FeatureRegistration registration : FEATURE_REGISTRATIONS) {
			if (registration.biomes() == null || registration.biomes().contains(event.getName()))
				event.getGeneration().getFeatures(registration.stage()).add(registration.placedFeature().get());
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			Supplier<Holder<PlacedFeature>> placedFeature) {
	}
}
