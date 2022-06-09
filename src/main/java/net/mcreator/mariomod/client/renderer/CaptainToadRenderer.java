
package net.mcreator.mariomod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.mariomod.entity.CaptainToadEntity;
import net.mcreator.mariomod.client.model.Modeltoad;

public class CaptainToadRenderer extends MobRenderer<CaptainToadEntity, Modeltoad<CaptainToadEntity>> {
	public CaptainToadRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltoad(context.bakeLayer(Modeltoad.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CaptainToadEntity entity) {
		return new ResourceLocation("mario_mod:textures/toadtexture.png");
	}
}
