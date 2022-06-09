package net.mcreator.mariomod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.mariomod.init.MarioModModItems;
import net.mcreator.mariomod.MarioModMod;

import java.util.function.Supplier;
import java.util.Map;

public class ToadTradeOutputProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double itemCount = 0;
		MarioModMod.LOGGER.info(itemCount);
		itemCount = Math.round(new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(0) / 10);
		if (new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
					if (stack != null)
						return stack.getCount();
				}
				return 0;
			}
		}.getAmount(0) >= 10) {
			if (new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
							&& _current.get() instanceof Map _slots) {
						ItemStack stack = ((Slot) _slots.get(sltid)).getItem();
						if (stack != null)
							return stack.getCount();
					}
					return 0;
				}
			}.getAmount(0) % 10 == 0) {
				if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current
						&& _current.get() instanceof Map _slots) {
					ItemStack _setstack = new ItemStack(MarioModModItems.SUPER_MUSHROOM.get());
					_setstack.setCount((int) itemCount);
					((Slot) _slots.get(1)).set(_setstack);
					_player.containerMenu.broadcastChanges();
				}
			}
		}
	}
}
