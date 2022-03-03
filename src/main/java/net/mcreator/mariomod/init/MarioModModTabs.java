
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mariomod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class MarioModModTabs {
	public static CreativeModeTab TAB_MARIO;

	public static void load() {
		TAB_MARIO = new CreativeModeTab("tabmario") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Items.CAKE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
