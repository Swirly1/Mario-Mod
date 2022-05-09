package net.mcreator.mariomod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.mariomod.init.MarioModModBlocks;

public class FireFlowerBlockUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double z) {
		double count = 0;
		count = 128;
		if ((world.getBlockState(new BlockPos(x, count, z))).getBlock() == MarioModModBlocks.FIRE_FLOWER_BLOCK.get()) {
			while (count >= 32) {
				count = count - 1;
				if ((world.getBlockState(new BlockPos(x, count, z))).getBlock() == Blocks.CRIMSON_NYLIUM) {
					world.setBlock(new BlockPos(x, count + 1, z), MarioModModBlocks.FIRE_FLOWER_BLOCK.get().defaultBlockState(), 3);
				}
			}
		}
	}
}
