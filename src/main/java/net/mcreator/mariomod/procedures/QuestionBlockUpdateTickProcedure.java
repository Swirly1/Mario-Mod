package net.mcreator.mariomod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.mariomod.init.MarioModModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class QuestionBlockUpdateTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(new BlockPos(x, entity.getY() + 2, z))).getBlock() == MarioModModBlocks.QUESTION_BLOCK.get()) {
			if (entity.getDeltaMovement().y() >= 0.2) {
				world.setBlock(new BlockPos(x, entity.getY() + 2, z), Blocks.AIR.defaultBlockState(), 3);
				QuestionBlockBlockDestroyedByPlayerProcedure.execute(world, x, y, z);
			}
		}
	}
}
