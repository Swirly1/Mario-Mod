package net.mcreator.mariomod.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.mariomod.init.MarioModModBlocks;

import java.util.Map;

public class IceFlowerBlockUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double count = 0;
		if ((world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == Blocks.GRASS_BLOCK
				|| (world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == Blocks.DIRT
				|| (world.getBlockState(new BlockPos(x, y - 2, z))).getBlock() == Blocks.STONE) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
			{
				BlockPos _bp = new BlockPos(x, y - 2, z);
				BlockState _bs = Blocks.SNOW_BLOCK.defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			{
				BlockPos _bp = new BlockPos(x, y - 3, z);
				BlockState _bs = Blocks.SNOW_BLOCK.defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
			world.setBlock(new BlockPos(x, y - 1, z), MarioModModBlocks.ICE_FLOWER_BLOCK.get().defaultBlockState(), 3);
		}
	}
}
