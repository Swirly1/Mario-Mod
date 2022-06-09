package net.mcreator.mariomod.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.BlockPos;

import net.mcreator.mariomod.network.MarioModModVariables;
import net.mcreator.mariomod.init.MarioModModBlocks;

public class PipeConnectorToolRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (MarioModModVariables.MapVariables.get(world).pipeCount == 1) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == MarioModModBlocks.WARP_PIPE.get()) {
				{
					double _setval = x;
					entity.getCapability(MarioModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.pipeX = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = y;
					entity.getCapability(MarioModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.pipeY = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = z;
					entity.getCapability(MarioModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.pipeZ = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				MarioModModVariables.MapVariables.get(world).pipeCount = 2;
				MarioModModVariables.MapVariables.get(world).syncData(world);
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("Find another pipe to connect!"), (true));
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("This is not a pipe."), (true));
			}
		} else if (MarioModModVariables.MapVariables.get(world).pipeCount == 2) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == MarioModModBlocks.WARP_PIPE.get()) {
				if (MarioModModVariables.MapVariables.get(world).pipeCount == 2
						&& (entity.getCapability(MarioModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MarioModModVariables.PlayerVariables())).pipeX == x
						&& (entity.getCapability(MarioModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MarioModModVariables.PlayerVariables())).pipeY == y
						&& (entity.getCapability(MarioModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MarioModModVariables.PlayerVariables())).pipeZ == z) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("You can not connect the same pipe."), (true));
				} else if (MarioModModVariables.MapVariables.get(world).pipeCount == 2
						&& ((entity.getCapability(MarioModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new MarioModModVariables.PlayerVariables())).pipeX != x
								|| (entity.getCapability(MarioModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new MarioModModVariables.PlayerVariables())).pipeY != y
								|| (entity.getCapability(MarioModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new MarioModModVariables.PlayerVariables())).pipeZ != z)) {
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putString("LocationX",
									("" + (entity.getCapability(MarioModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MarioModModVariables.PlayerVariables())).pipeX));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putString("LocationY",
									("" + (entity.getCapability(MarioModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MarioModModVariables.PlayerVariables())).pipeY));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putString("LocationZ",
									("" + (entity.getCapability(MarioModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
											.orElse(new MarioModModVariables.PlayerVariables())).pipeZ));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(
								(entity.getCapability(MarioModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new MarioModModVariables.PlayerVariables())).pipeX,
								(entity.getCapability(MarioModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new MarioModModVariables.PlayerVariables())).pipeY,
								(entity.getCapability(MarioModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new MarioModModVariables.PlayerVariables())).pipeZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putString("LocationX", ("" + x));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(
								(entity.getCapability(MarioModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new MarioModModVariables.PlayerVariables())).pipeX,
								(entity.getCapability(MarioModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new MarioModModVariables.PlayerVariables())).pipeY,
								(entity.getCapability(MarioModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new MarioModModVariables.PlayerVariables())).pipeZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putString("LocationY", ("" + y));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(
								(entity.getCapability(MarioModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new MarioModModVariables.PlayerVariables())).pipeX,
								(entity.getCapability(MarioModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new MarioModModVariables.PlayerVariables())).pipeY,
								(entity.getCapability(MarioModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new MarioModModVariables.PlayerVariables())).pipeZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putString("LocationZ", ("" + z));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(x, y, z);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putBoolean("Connected", (true));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					if (!world.isClientSide()) {
						BlockPos _bp = new BlockPos(
								(entity.getCapability(MarioModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new MarioModModVariables.PlayerVariables())).pipeX,
								(entity.getCapability(MarioModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new MarioModModVariables.PlayerVariables())).pipeY,
								(entity.getCapability(MarioModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new MarioModModVariables.PlayerVariables())).pipeZ);
						BlockEntity _blockEntity = world.getBlockEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_blockEntity != null)
							_blockEntity.getTileData().putBoolean("Connected", (true));
						if (world instanceof Level _level)
							_level.sendBlockUpdated(_bp, _bs, _bs, 3);
					}
					MarioModModVariables.MapVariables.get(world).pipeCount = 1;
					MarioModModVariables.MapVariables.get(world).syncData(world);
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(new TextComponent("Pipes Connected!"), (true));
				}
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(new TextComponent("This is not a pipe."), (true));
			}
		}
	}
}
