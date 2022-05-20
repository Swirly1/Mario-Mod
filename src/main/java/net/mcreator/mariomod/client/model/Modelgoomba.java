package net.mcreator.mariomod.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelgoomba<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("mario_mod", "modelgoomba"), "main");
	public final ModelPart leftLeg;
	public final ModelPart rightleg;
	public final ModelPart body;
	public final ModelPart head;

	public Modelgoomba(ModelPart root) {
		this.leftLeg = root.getChild("leftLeg");
		this.rightleg = root.getChild("rightleg");
		this.body = root.getChild("body");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = leftLeg.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(6, 2).addBox(-3.0F, -2.0F, -5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(7, 1)
						.addBox(-3.0F, -1.0F, -4.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(22, 33)
						.addBox(-2.0F, -1.0F, -4.0F, 0.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(7, 0)
						.addBox(-3.0F, -1.0F, 5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 4)
						.addBox(-3.0F, -2.0F, 5.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -2.0F, 5.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(-5.0F, -2.0F, -5.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 28).addBox(-6.0F, -2.0F, -5.0F, 1.0F,
								0.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r2 = leftLeg.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, 0.0F, -2.0F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(27, 11)
						.addBox(-10.0F, 0.0F, -3.0F, 3.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, 2.0F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition cube_r3 = leftLeg.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 2).addBox(3.0F, -2.0F, -6.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -2.0F, -6.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r4 = leftLeg.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 17).addBox(6.0F, -2.0F, -8.0F, 0.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F));
		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg",
				CubeListBuilder.create().texOffs(8, 10).addBox(-3.0F, -1.0F, -5.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 8)
						.addBox(-3.0F, -2.0F, -6.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(22, 34)
						.addBox(-2.0F, -1.0F, -5.0F, 0.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(8, 9)
						.addBox(-3.0F, -1.0F, 4.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(6, 6)
						.addBox(-3.0F, -2.0F, 4.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(-6.0F, -2.0F, 4.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 28)
						.addBox(-6.0F, -2.0F, -6.0F, 1.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(4, 2)
						.addBox(-5.0F, -2.0F, -6.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r5 = rightleg.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 4).addBox(-3.0F, -2.0F, -6.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(8.0F, -2.0F, -6.0F, 0.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r6 = rightleg.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 19).addBox(6.0F, -2.0F, -3.0F, 0.0F, 2.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition cube_r7 = rightleg.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(24, 0).addBox(-6.0F, 0.0F, -8.0F, 3.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(20, 11)
						.addBox(-3.0F, 0.0F, -7.0F, 1.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 2.0F));
		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(0, 11).addBox(-5.0F, -9.0F, -2.0F, 10.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 2.0F));
		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 32).addBox(-3.0F, -10.0F, 6.0F, 11.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(26, 28).addBox(-6.0F, -10.0F, 3.0F, 12.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));
		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 39).addBox(-8.0F, -10.0F, 6.0F, 11.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(26, 35).addBox(-6.0F, -10.0F, 8.0F, 12.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -10.0F, -3.0F, 12.0F, 0.0F, 11.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		leftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
