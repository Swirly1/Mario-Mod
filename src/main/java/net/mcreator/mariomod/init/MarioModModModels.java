
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mariomod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.mariomod.client.model.Modeltoad;
import net.mcreator.mariomod.client.model.ModelkoopaShell;
import net.mcreator.mariomod.client.model.Modelkoopa;
import net.mcreator.mariomod.client.model.Modelgoomba;
import net.mcreator.mariomod.client.model.Modelcustom_model;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class MarioModModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelgoomba.LAYER_LOCATION, Modelgoomba::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(Modeltoad.LAYER_LOCATION, Modeltoad::createBodyLayer);
		event.registerLayerDefinition(Modelkoopa.LAYER_LOCATION, Modelkoopa::createBodyLayer);
		event.registerLayerDefinition(ModelkoopaShell.LAYER_LOCATION, ModelkoopaShell::createBodyLayer);
	}
}
