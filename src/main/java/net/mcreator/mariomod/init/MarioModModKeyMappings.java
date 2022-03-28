
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mariomod.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fmlclient.registry.ClientRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.mariomod.network.TrippleJumpMessage;
import net.mcreator.mariomod.MarioModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MarioModModKeyMappings {
	public static final KeyMapping TRIPPLE_JUMP = new KeyMapping("key.mario_mod.tripple_jump", GLFW.GLFW_KEY_SPACE, "key.categories.movement");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(TRIPPLE_JUMP);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == TRIPPLE_JUMP.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						MarioModMod.PACKET_HANDLER.sendToServer(new TrippleJumpMessage(0, 0));
						TrippleJumpMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
