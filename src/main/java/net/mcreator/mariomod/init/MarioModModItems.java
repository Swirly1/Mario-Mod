
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mariomod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mariomod.item.SuperMushroomItem;
import net.mcreator.mariomod.item.IceFlowerItem;
import net.mcreator.mariomod.item.FireFlowerItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MarioModModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item FIRE_FLOWER = register(new FireFlowerItem());
	public static final Item FIRE_FLOWER_BLOCK = register(MarioModModBlocks.FIRE_FLOWER_BLOCK, MarioModModTabs.TAB_MARIO);
	public static final Item SUPER_MUSHROOM = register(new SuperMushroomItem());
	public static final Item ICE_FLOWER = register(new IceFlowerItem());
	public static final Item ICE_FLOWER_BLOCK = register(MarioModModBlocks.ICE_FLOWER_BLOCK, MarioModModTabs.TAB_MARIO);
	public static final Item QUESTION_BLOCK = register(MarioModModBlocks.QUESTION_BLOCK, MarioModModTabs.TAB_MARIO);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
