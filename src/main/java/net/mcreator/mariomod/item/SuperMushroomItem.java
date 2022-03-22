
package net.mcreator.mariomod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mariomod.procedures.SuperMushroomOnPlayerStoppedUsingProcedure;
import net.mcreator.mariomod.procedures.SuperMushroomItemIsDroppedByPlayerProcedure;
import net.mcreator.mariomod.procedures.SuperMushroomItemInInventoryTickProcedure;
import net.mcreator.mariomod.init.MarioModModTabs;

public class SuperMushroomItem extends Item {
	public SuperMushroomItem() {
		super(new Item.Properties().tab(MarioModModTabs.TAB_MARIO).stacksTo(1).rarity(Rarity.COMMON));
		setRegistryName("super_mushroom");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
		SuperMushroomOnPlayerStoppedUsingProcedure.execute(entity);
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		SuperMushroomItemInInventoryTickProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean onDroppedByPlayer(ItemStack itemstack, Player entity) {
		SuperMushroomItemIsDroppedByPlayerProcedure.execute(entity.level, entity);
		return true;
	}
}
