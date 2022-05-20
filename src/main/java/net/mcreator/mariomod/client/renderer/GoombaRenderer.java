
package net.mcreator.mariomod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.mariomod.entity.GoombaEntity;
import net.mcreator.mariomod.client.model.Modelgoomba;

public class GoombaRenderer extends MobRenderer<GoombaEntity, Modelgoomba<GoombaEntity>> {
	public GoombaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgoomba(context.bakeLayer(Modelgoomba.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(GoombaEntity entity) {
		return new ResourceLocation("mario_mod:textures/goomba_texture.png");
	}
}
