
package net.mcreator.mariomod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.mariomod.procedures.SuperStarFoodEatenProcedure;
import net.mcreator.mariomod.init.MarioModModTabs;

public class SuperStarItem extends Item {
	public SuperStarItem() {
		super(new Item.Properties().tab(MarioModModTabs.TAB_MARIO).stacksTo(1).rarity(Rarity.COMMON)
				.food((new FoodProperties.Builder()).nutrition(0).saturationMod(0f).alwaysEat()

						.build()));
		setRegistryName("super_star");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 1;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		SuperStarFoodEatenProcedure.execute(entity);
		return retval;
	}
}
