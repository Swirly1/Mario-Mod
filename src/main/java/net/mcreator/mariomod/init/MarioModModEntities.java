
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mariomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.mariomod.entity.YoshiEntity;
import net.mcreator.mariomod.entity.KoopaEntity;
import net.mcreator.mariomod.entity.IceFlowerEntity;
import net.mcreator.mariomod.entity.GoombaEntity;
import net.mcreator.mariomod.entity.FireFlowerEntity;
import net.mcreator.mariomod.entity.CaptainToadEntity;
import net.mcreator.mariomod.MarioModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MarioModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, MarioModMod.MODID);
	public static final RegistryObject<EntityType<FireFlowerEntity>> FIRE_FLOWER = register("projectile_fire_flower",
			EntityType.Builder.<FireFlowerEntity>of(FireFlowerEntity::new, MobCategory.MISC).setCustomClientFactory(FireFlowerEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<IceFlowerEntity>> ICE_FLOWER = register("projectile_ice_flower",
			EntityType.Builder.<IceFlowerEntity>of(IceFlowerEntity::new, MobCategory.MISC).setCustomClientFactory(IceFlowerEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GoombaEntity>> GOOMBA = register("goomba",
			EntityType.Builder.<GoombaEntity>of(GoombaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(GoombaEntity::new)

					.sized(0.6f, 0.6f));
	public static final RegistryObject<EntityType<KoopaEntity>> KOOPA = register("koopa",
			EntityType.Builder.<KoopaEntity>of(KoopaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(KoopaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CaptainToadEntity>> CAPTAIN_TOAD = register("captain_toad",
			EntityType.Builder.<CaptainToadEntity>of(CaptainToadEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CaptainToadEntity::new)

					.sized(0.6f, 1.7f));
	public static final RegistryObject<EntityType<YoshiEntity>> YOSHI = register("yoshi",
			EntityType.Builder.<YoshiEntity>of(YoshiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(YoshiEntity::new)

					.sized(0.9f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			GoombaEntity.init();
			KoopaEntity.init();
			CaptainToadEntity.init();
			YoshiEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(GOOMBA.get(), GoombaEntity.createAttributes().build());
		event.put(KOOPA.get(), KoopaEntity.createAttributes().build());
		event.put(CAPTAIN_TOAD.get(), CaptainToadEntity.createAttributes().build());
		event.put(YOSHI.get(), YoshiEntity.createAttributes().build());
	}
}
