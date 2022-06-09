package net.mcreator.mariomod.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.mariomod.init.MarioModModItems;

import java.util.function.Supplier;
import java.util.Map;

public class ToadTradeThisGUIIsOpenedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			ItemStack _setstack = new ItemStack(MarioModModItems.SUPER_MUSHROOM.get());
			_setstack.setCount(1);
			((Slot) _slots.get(1)).set(_setstack);
			_player.containerMenu.broadcastChanges();
		}
	}
}
