package net.mcreator.mariomod.client.model;

import net.minecraft.world.entity.Entity;
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
public class ModelkoopaShell<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("mario_mod", "modelkoopa_shell"), "main");
	public final ModelPart bb_main;

	public ModelkoopaShell(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(26, 27).addBox(-5.0F, -2.0F, -8.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 14)
						.addBox(-2.0F, -1.0F, -8.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 25)
						.addBox(2.0F, -2.0F, 7.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 18)
						.addBox(-7.0F, -3.0F, -8.0F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(18, 1)
						.addBox(6.0F, -3.0F, -8.0F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(28, 35)
						.addBox(6.0F, -5.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(14, 35)
						.addBox(5.0F, -6.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(18, 25)
						.addBox(4.0F, -7.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(2.0F, -9.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(18, 18)
						.addBox(3.0F, -8.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(6.0F, -4.0F, -8.0F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(26, 10)
						.addBox(2.0F, -4.0F, -8.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 31)
						.addBox(5.0F, -4.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, -4.0F, -8.0F, 1.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(26, 0)
						.addBox(2.0F, -4.0F, 7.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(30, 29)
						.addBox(5.0F, -4.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 29)
						.addBox(-3.0F, -1.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 29)
						.addBox(-6.0F, -2.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 14)
						.addBox(5.0F, -2.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 28)
						.addBox(2.0F, -1.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-2.0F, -1.0F, 7.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 28)
						.addBox(2.0F, -1.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 28)
						.addBox(-3.0F, -1.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 22)
						.addBox(2.0F, -2.0F, -8.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 20)
						.addBox(-5.0F, -2.0F, 7.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 18)
						.addBox(-7.0F, -5.0F, 3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(43, 0)
						.addBox(-6.0F, -6.0F, 3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(26, 18)
						.addBox(-5.0F, -6.0F, 6.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 27)
						.addBox(-6.0F, -2.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 26)
						.addBox(5.0F, -2.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 2)
						.addBox(-4.0F, -7.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 24)
						.addBox(-5.0F, -7.0F, 3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(18, 25)
						.addBox(-3.0F, -8.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 10)
						.addBox(-4.0F, -8.0F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 21)
						.addBox(5.0F, -3.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 20)
						.addBox(5.0F, -3.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 19)
						.addBox(-6.0F, -3.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 18)
						.addBox(-6.0F, -3.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(18, 4).addBox(2.0F, -17.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 8.0F, -1.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r2 = bb_main.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(18, 7).addBox(-3.0F, -23.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -23.0F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(10, 14)
						.addBox(-4.0F, -22.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 0)
						.addBox(-5.0F, -22.0F, 3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(8, 4)
						.addBox(-5.0F, -21.0F, 6.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 12).addBox(-6.0F, -21.0F, 3.0F, 1.0F,
								1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, 15.0F, -1.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r3 = bb_main.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(22, 35).addBox(-7.0F, -23.0F, 7.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 18.0F, -1.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r4 = bb_main.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 41).addBox(-12.0F, -23.0F, -6.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 18.0F, -1.0F, 0.0F, 0.0F, 0.0F));
		PartDefinition cube_r5 = bb_main.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(6, 42).addBox(-6.0F, -21.0F, 3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(8, 11)
						.addBox(-5.0F, -21.0F, 6.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(-4.0F, -22.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 7)
						.addBox(-5.0F, -22.0F, 3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(18, 9)
						.addBox(-3.0F, -23.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 3).addBox(-4.0F, -23.0F, 3.0F, 1.0F,
								1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 15.0F, 1.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r6 = bb_main.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(18, 11).addBox(2.0F, -17.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 8.0F, 1.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r7 = bb_main.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(16, 42).addBox(-12.0F, -23.0F, -6.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 18.0F, 1.0F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(36, 0).addBox(-7.0F, -23.0F, 7.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, 18.0F, 1.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r9 = bb_main.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(26, 42).addBox(-12.0F, -23.0F, -6.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 18.0F, 4.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r10 = bb_main.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(36, 6).addBox(-7.0F, -23.0F, 7.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 18.0F, 4.0F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition cube_r11 = bb_main.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(8, 21).addBox(-5.0F, -21.0F, 6.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 28)
						.addBox(-6.0F, -21.0F, 3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 0)
						.addBox(-4.0F, -22.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 17)
						.addBox(-5.0F, -22.0F, 3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(18, 22)
						.addBox(-3.0F, -23.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 7).addBox(-4.0F, -23.0F, 3.0F, 1.0F,
								1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 15.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));
		PartDefinition cube_r12 = bb_main.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 24).addBox(2.0F, -17.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.0F));
		PartDefinition cube_r13 = bb_main.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(43, 6).addBox(-12.0F, -23.0F, -6.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 18.0F, -4.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r14 = bb_main.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(0, 31).addBox(5.0F, -12.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 3)
						.addBox(2.0F, -12.0F, 7.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 31)
						.addBox(5.0F, -12.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 7)
						.addBox(2.0F, -12.0F, -8.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 31)
						.addBox(2.0F, -17.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(6.0F, -13.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(5.0F, -14.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 17)
						.addBox(4.0F, -15.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(18, 0)
						.addBox(3.0F, -16.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(18, 7).addBox(2.0F, -17.0F, -3.0F, 1.0F,
								1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r15 = bb_main.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(36, 24).addBox(7.0F, -13.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(43, 18)
						.addBox(6.0F, -14.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 43)
						.addBox(5.0F, -15.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 11)
						.addBox(4.0F, -16.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(6, 47).addBox(-3.0F, -17.0F, -2.0F, 7.0F,
								1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r16 = bb_main.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(38, 38).addBox(7.0F, -13.0F, -2.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 35)
						.addBox(6.0F, -14.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 42)
						.addBox(5.0F, -15.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 46)
						.addBox(4.0F, -16.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(38, 46).addBox(3.0F, -17.0F, -2.0F, 1.0F,
								1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
