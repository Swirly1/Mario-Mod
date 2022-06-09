
package net.mcreator.mariomod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.mariomod.entity.YoshiEntity;
import net.mcreator.mariomod.client.model.Modelcustom_model;

public class YoshiRenderer extends MobRenderer<YoshiEntity, Modelcustom_model<YoshiEntity>> {
	public YoshiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcustom_model(context.bakeLayer(Modelcustom_model.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(YoshiEntity entity) {
		return new ResourceLocation("mario_mod:textures/yoshitexture.png");
	}
}
