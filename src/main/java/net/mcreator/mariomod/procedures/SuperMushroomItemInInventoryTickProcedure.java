package net.mcreator.mariomod.procedures;

import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.CapabilityItemHandler;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.core.Direction;

import net.mcreator.mariomod.init.MarioModModItems;

import java.util.concurrent.atomic.AtomicReference;

public class SuperMushroomItemInInventoryTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double health = 0;
		double diamonds = 0;
		double shrooms = 0;
		Direction playerDirection = Direction.NORTH;
		shrooms = 0;
		{
			AtomicReference<IItemHandler> _iitemhandlerref = new AtomicReference<>();
			entity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> _iitemhandlerref.set(capability));
			if (_iitemhandlerref.get() != null) {
				for (int _idx = 0; _idx < _iitemhandlerref.get().getSlots(); _idx++) {
					ItemStack itemstackiterator = _iitemhandlerref.get().getStackInSlot(_idx).copy();
					if (MarioModModItems.SUPER_MUSHROOM == itemstackiterator.getItem()) {
						shrooms = shrooms + (itemstackiterator).getCount();
					}
				}
			}
		}
		if (shrooms > 1) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(new TextComponent(("You can only have 1 super mushroom " + "in your inventory. ")), (true));
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(MarioModModItems.SUPER_MUSHROOM);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
			playerDirection = entity.getDirection();
			if ((entity.getDirection()) == Direction.NORTH) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, (z - 1), new ItemStack(MarioModModItems.SUPER_MUSHROOM));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if ((entity.getDirection()) == Direction.EAST) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + 1), y, z, new ItemStack(MarioModModItems.SUPER_MUSHROOM));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else if ((entity.getDirection()) == Direction.SOUTH) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, (z + 1), new ItemStack(MarioModModItems.SUPER_MUSHROOM));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			} else {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x - 1), y, z, new ItemStack(MarioModModItems.SUPER_MUSHROOM));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 20
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) == 40) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(MarioModModItems.SUPER_MUSHROOM);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
						_player.inventoryMenu.getCraftSlots());
			}
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"attribute @s minecraft:generic.max_health base set 20");
			}
		}
		if ((entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(MarioModModItems.SUPER_MUSHROOM)) : false)
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) == 20) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"attribute @s minecraft:generic.max_health base set 40");
			}
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(40);
		}
	}
}
