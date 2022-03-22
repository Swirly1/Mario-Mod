package net.mcreator.mariomod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.mariomod.init.MarioModModBlocks;

public class FireFlowerBlockUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double z) {
		double count = 0;
		count = 128;
		if ((world.getBlockState(new BlockPos((int) x, (int) count, (int) z))).getBlock() == MarioModModBlocks.FIRE_FLOWER_BLOCK) {
			while (count >= 32) {
				count = count - 1;
				if ((world.getBlockState(new BlockPos((int) x, (int) count, (int) z))).getBlock() == Blocks.CRIMSON_NYLIUM) {
					world.setBlock(new BlockPos((int) x, (int) (count + 1), (int) z), MarioModModBlocks.FIRE_FLOWER_BLOCK.defaultBlockState(), 3);
				}
			}
		}
	}
}
