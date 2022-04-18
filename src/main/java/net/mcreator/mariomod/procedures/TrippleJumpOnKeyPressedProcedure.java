package net.mcreator.mariomod.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.mariomod.network.MarioModModVariables;

public class TrippleJumpOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		boolean give = false;
		MarioModModVariables.MapVariables.get(world).giveDouble = true;
		MarioModModVariables.MapVariables.get(world).syncData(world);
		if (entity.isOnGround() == true) {
			MarioModModVariables.MapVariables.get(world).jumpCount = MarioModModVariables.MapVariables.get(world).jumpCount + 1;
			MarioModModVariables.MapVariables.get(world).syncData(world);
		}
		if (entity.isOnGround() == true) {
			if (MarioModModVariables.MapVariables.get(world).jumpCount % 3 == 0) {
				MarioModModVariables.MapVariables.get(world).startY = entity.getY();
				MarioModModVariables.MapVariables.get(world).syncData(world);
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
								"effect give @p minecraft:jump_boost 1 2");
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
								"effect give @p minecraft:slow_falling 2 1");
				}
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private LevelAccessor world;

					public void start(LevelAccessor world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						if (entity.isOnGround() == false) {
							if (entity.isOnGround() == true) {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null)
										_ent.getServer().getCommands().performCommand(
												_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
												"effect clear @p minecraft:jump_boost");
								}
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null)
										_ent.getServer().getCommands().performCommand(
												_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
												"effect clear @p minecraft:slow_falling");
								}
							} else {
								TrippleJumpOnKeyPressedProcedure.execute(world, x, y, z, entity);
							}
						} else {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null)
									_ent.getServer().getCommands().performCommand(
											_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
											"effect clear @p minecraft:jump_boost");
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null)
									_ent.getServer().getCommands().performCommand(
											_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
											"effect clear @p minecraft:slow_falling");
							}
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 5);
			}
		}
	}
}
