
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mariomod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.mariomod.block.QuestionBlockBlock;
import net.mcreator.mariomod.block.IceFlowerBlockBlock;
import net.mcreator.mariomod.block.FireFlowerBlockBlock;
import net.mcreator.mariomod.block.BrickBlockBlock;
import net.mcreator.mariomod.MarioModMod;

public class MarioModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MarioModMod.MODID);
	public static final RegistryObject<Block> FIRE_FLOWER_BLOCK = REGISTRY.register("fire_flower_block", () -> new FireFlowerBlockBlock());
	public static final RegistryObject<Block> ICE_FLOWER_BLOCK = REGISTRY.register("ice_flower_block", () -> new IceFlowerBlockBlock());
	public static final RegistryObject<Block> QUESTION_BLOCK = REGISTRY.register("question_block", () -> new QuestionBlockBlock());
	public static final RegistryObject<Block> BRICK_BLOCK = REGISTRY.register("brick_block", () -> new BrickBlockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			FireFlowerBlockBlock.registerRenderLayer();
			IceFlowerBlockBlock.registerRenderLayer();
		}
	}
}
