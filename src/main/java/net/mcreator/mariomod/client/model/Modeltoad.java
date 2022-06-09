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
public class Modeltoad<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("mario_mod", "modeltoad"), "main");
	public final ModelPart rightFoot;
	public final ModelPart leftFoot;
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart leftarm;
	public final ModelPart rightarm;

	public Modeltoad(ModelPart root) {
		this.rightFoot = root.getChild("rightFoot");
		this.leftFoot = root.getChild("leftFoot");
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.leftarm = root.getChild("leftarm");
		this.rightarm = root.getChild("rightarm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition rightFoot = partdefinition.addOrReplaceChild("rightFoot",
				CubeListBuilder.create().texOffs(62, 63).addBox(-5.0F, -2.0F, -3.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition leftFoot = partdefinition.addOrReplaceChild("leftFoot",
				CubeListBuilder.create().texOffs(44, 63).addBox(2.0F, -2.0F, -3.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(62, 49).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(22, 62)
						.addBox(-4.0F, -4.0F, -3.0F, 8.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(30, 55)
						.addBox(-5.0F, -5.0F, -3.0F, 10.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 47)
						.addBox(-6.0F, -10.0F, -3.0F, 12.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(54, 8).addBox(-5.0F, 6.5F, -3.0F, 10.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.5F, 0.0F, 3.1416F, 0.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 58).addBox(-4.0F, 4.0F, -3.0F, 8.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(46, 26)
						.addBox(-6.0F, 0.0F, -3.0F, 12.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(50, 0)
						.addBox(-5.0F, 3.0F, -3.0F, 10.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-9.0F, 9.0F, -5.0F, 18.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 36)
						.addBox(-8.0F, 10.0F, -5.0F, 16.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(42, 37).addBox(-7.0F, 11.0F, -5.0F, 14.0F,
								1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.0F, 0.0F, 3.1416F, 0.0F, 0.0F));
		PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, 5.0F, -5.0F, 20.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(46, 15)
						.addBox(-7.0F, 10.0F, -5.0F, 14.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 25).addBox(-9.0F, 9.0F, -5.0F, 18.0F,
								1.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 14.0F, 0.0F, 3.1416F, 0.0F, 0.0F));
		PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(56, 56).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(36, 48)
						.addBox(-5.0F, -1.0F, -3.0F, 10.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 0.0F, 3.1416F, 0.0F, 0.0F));
		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r4 = leftarm.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 16).addBox(1.25F, -0.5F, 1.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(1.25F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(1.25F, -0.5F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(1.25F, -0.5F, -1.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(1.25F, 1.25F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 69).addBox(-2.5F, 0.0F, -2.0F, 4.0F,
								2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.6545F));
		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r5 = rightarm.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 0).addBox(1.25F, -0.5F, 1.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(1.25F, -0.5F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(1.25F, -0.5F, -2.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(1.25F, -0.5F, -1.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 8)
						.addBox(1.25F, 1.25F, 1.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 65).addBox(-2.5F, 0.0F, -2.0F, 4.0F, 2.0F,
								4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.6545F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		rightFoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftFoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.leftFoot.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rightarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.rightFoot.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}
