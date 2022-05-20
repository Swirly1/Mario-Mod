
package net.mcreator.mariomod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.mariomod.entity.KoopaEntity;
import net.mcreator.mariomod.client.model.Modelkoopa;

public class KoopaRenderer extends MobRenderer<KoopaEntity, Modelkoopa<KoopaEntity>> {
	public KoopaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkoopa(context.bakeLayer(Modelkoopa.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KoopaEntity entity) {
		return new ResourceLocation("mario_mod:textures/koopa_texture.png");
	}
}
