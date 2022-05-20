
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mariomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mariomod.item.SuperStarItem;
import net.mcreator.mariomod.item.SuperMushroomItem;
import net.mcreator.mariomod.item.KoopaShellItem;
import net.mcreator.mariomod.item.IceFlowerItem;
import net.mcreator.mariomod.item.FireFlowerItem;
import net.mcreator.mariomod.MarioModMod;

public class MarioModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MarioModMod.MODID);
	public static final RegistryObject<Item> FIRE_FLOWER = REGISTRY.register("fire_flower", () -> new FireFlowerItem());
	public static final RegistryObject<Item> FIRE_FLOWER_BLOCK = block(MarioModModBlocks.FIRE_FLOWER_BLOCK, MarioModModTabs.TAB_MARIO);
	public static final RegistryObject<Item> SUPER_MUSHROOM = REGISTRY.register("super_mushroom", () -> new SuperMushroomItem());
	public static final RegistryObject<Item> ICE_FLOWER = REGISTRY.register("ice_flower", () -> new IceFlowerItem());
	public static final RegistryObject<Item> ICE_FLOWER_BLOCK = block(MarioModModBlocks.ICE_FLOWER_BLOCK, MarioModModTabs.TAB_MARIO);
	public static final RegistryObject<Item> QUESTION_BLOCK = block(MarioModModBlocks.QUESTION_BLOCK, MarioModModTabs.TAB_MARIO);
	public static final RegistryObject<Item> BRICK_BLOCK = block(MarioModModBlocks.BRICK_BLOCK, MarioModModTabs.TAB_MARIO);
	public static final RegistryObject<Item> GOOMBA = REGISTRY.register("goomba_spawn_egg",
			() -> new ForgeSpawnEggItem(MarioModModEntities.GOOMBA, -3381760, -16777216, new Item.Properties().tab(MarioModModTabs.TAB_MARIO)));
	public static final RegistryObject<Item> SUPER_STAR = REGISTRY.register("super_star", () -> new SuperStarItem());
	public static final RegistryObject<Item> KOOPA = REGISTRY.register("koopa_spawn_egg",
			() -> new ForgeSpawnEggItem(MarioModModEntities.KOOPA, -256, -16737997, new Item.Properties().tab(MarioModModTabs.TAB_MARIO)));
	public static final RegistryObject<Item> KOOPA_SHELL_HELMET = REGISTRY.register("koopa_shell_helmet", () -> new KoopaShellItem.Helmet());
	public static final RegistryObject<Item> EMPTY_BLOCK = block(MarioModModBlocks.EMPTY_BLOCK, MarioModModTabs.TAB_MARIO);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
