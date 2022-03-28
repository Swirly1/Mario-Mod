package net.mcreator.mariomod.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

import net.mcreator.mariomod.network.MarioModModVariables;

public class TrippleJumpOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity.isOnGround() == true) {
			MarioModModVariables.MapVariables.get(world).jumpCount = MarioModModVariables.MapVariables.get(world).jumpCount + 1;
			MarioModModVariables.MapVariables.get(world).syncData(world);
		}
		if (MarioModModVariables.MapVariables.get(world).jumpCount % 3 == 0) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"effect give @p minecraft:jump_boost 1 3");
			}
			while (entity.isOnGround() == false) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null)
						_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
								"effect give @p minecraft:resistance 1 3");
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
						continue;
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 5);
			}
		}
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(new TextComponent(("" + MarioModModVariables.MapVariables.get(world).jumpCount)), (true));
	}
}
