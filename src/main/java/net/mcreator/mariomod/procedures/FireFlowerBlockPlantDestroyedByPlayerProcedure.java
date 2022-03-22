package net.mcreator.mariomod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class FireFlowerBlockPlantDestroyedByPlayerProcedure {
	public static void execute(LevelAccessor world, double x, double z) {
		world.setBlock(new BlockPos((int) x, (int) 128, (int) z), Blocks.AIR.defaultBlockState(), 3);
	}
}
