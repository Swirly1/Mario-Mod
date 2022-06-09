package net.mcreator.mariomod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.mariomod.entity.YoshiEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class YoshiJumpProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingUpdateEvent event) {
		execute(event, event.getEntityLiving());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof YoshiEntity) {
			if (entity.isOnGround()) {
				entity.getPersistentData().putBoolean("inair", (true));
			} else {
				entity.getPersistentData().putBoolean("inair", (false));
				entity.fallDistance = 0;
			}
		}
	}
}
