package net.mcreator.mariomod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.mariomod.init.MarioModModBlocks;

public class FireFlowerBlockAdditionalGenerationConditionProcedure {
	public static String execute(LevelAccessor world, double x, double z) {
		double count = 0;
		count = 128;
		while (count > 1) {
			if ((world.getBlockState(new BlockPos((int) x, (int) count, (int) z))).getBlock() == Blocks.CRIMSON_NYLIUM) {
				world.setBlock(new BlockPos((int) x, (int) count, (int) z), MarioModModBlocks.FIRE_FLOWER_BLOCK.defaultBlockState(), 3);
			} else {
				count = count - 1;
			}
		}
		return "y level" + count;
	}
}
