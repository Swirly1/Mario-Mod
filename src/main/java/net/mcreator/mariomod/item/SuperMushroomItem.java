
package net.mcreator.mariomod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

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
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		SuperMushroomItemInInventoryTickProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
	}
}
