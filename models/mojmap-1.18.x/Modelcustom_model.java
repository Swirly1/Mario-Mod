// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart rightFoot;
	private final ModelPart leftFoot;
	private final ModelPart body;
	private final ModelPart head;
	private final ModelPart eyes;
	private final ModelPart leftArm;
	private final ModelPart rightArm;
	private final ModelPart saddle;

	public Modelcustom_model(ModelPart root) {
		this.rightFoot = root.getChild("rightFoot");
		this.leftFoot = root.getChild("leftFoot");
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.eyes = root.getChild("eyes");
		this.leftArm = root.getChild("leftArm");
		this.rightArm = root.getChild("rightArm");
		this.saddle = root.getChild("saddle");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition rightFoot = partdefinition.addOrReplaceChild("rightFoot",
				CubeListBuilder.create().texOffs(24, 7)
						.addBox(-5.0F, -4.0F, -5.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 41)
						.addBox(-4.0F, -10.0F, -2.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(29, 47)
						.addBox(-5.0F, -9.0F, -2.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 2.0F));

		PartDefinition leftFoot = partdefinition.addOrReplaceChild("leftFoot",
				CubeListBuilder.create().texOffs(0, 22)
						.addBox(-5.0F, -4.0F, -3.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(35, 40)
						.addBox(-5.0F, -10.0F, 0.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 46)
						.addBox(-2.0F, -9.0F, 0.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(6.0F, 24.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.75F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(47, 40).addBox(-0.5F, -1.75F, -2.25F, 1.0F, 3.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -13.1957F, 9.5093F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(12, 41).addBox(-1.0F, -2.35F, -2.6F, 2.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.1456F, 8.5455F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(37, 22).addBox(-2.0F, -4.0F, -2.5F, 4.0F, 3.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.4965F, 6.2686F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(38, 0).addBox(-3.0F, -1.0F, -3.0F, 6.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -14.8363F, -1.9393F, -1.8762F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 32).addBox(-3.0F, -1.5F, -2.0F, 6.0F, 5.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -14.8363F, -1.9393F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 13).addBox(-4.0F, -4.0F, -1.75F, 8.0F, 5.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -12.262F, -3.4919F, -1.3526F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(38, 32).addBox(-3.0F, -3.75F, 0.0F, 6.0F, 5.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -10.6957F, -2.8927F, -0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(19, 17).addBox(-3.0F, -3.25F, -2.5F, 6.0F, 4.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, 1.5F, -0.3054F, 0.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-5.0F, -24.25F, -4.0F, 9.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(19, 26)
						.addBox(-1.0F, -18.25F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 19)
						.addBox(-1.0F, -23.25F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(14, 22)
						.addBox(-1.0F, -24.25F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-1.0F, -22.25F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 2)
						.addBox(-1.0F, -20.25F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 29)
						.addBox(-1.0F, -19.25F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(20, 26)
						.addBox(-3.5F, -23.0F, -8.0F, 6.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.5F, 24.0F, 0.0F));

		PartDefinition eyes = partdefinition.addOrReplaceChild("eyes", CubeListBuilder.create().texOffs(20, 35)
				.addBox(-3.0F, -29.25F, -2.0F, 6.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition leftArm = partdefinition.addOrReplaceChild("leftArm", CubeListBuilder.create(),
				PartPose.offset(6.689F, 12.2256F, -1.2287F));

		PartDefinition cube_r9 = leftArm.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 0).addBox(0.3005F, 0.2496F, 0.289F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8789F, 0.6582F, -0.7064F, 0.2376F, -0.9787F, -2.4918F));

		PartDefinition cube_r10 = leftArm.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 3).addBox(-1.639F, -0.7194F, 0.7563F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8789F, 0.6582F, -0.7064F, -3.0692F, -0.7345F, 1.2433F));

		PartDefinition cube_r11 = leftArm.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(0, 22).addBox(-1.5746F, 0.2496F, 0.211F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8789F, 0.6582F, -0.7064F, 2.7992F, -1.1687F, 1.1651F));

		PartDefinition cube_r12 = leftArm.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(14, 24).addBox(-0.5971F, 0.2496F, -0.0757F, 1.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8789F, 0.6582F, -0.7064F, 0.9301F, -1.4062F, 3.0662F));

		PartDefinition cube_r13 = leftArm.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(24, 0).addBox(-1.2192F, -0.7504F, -3.9731F, 2.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.8789F, 0.6582F, -0.7064F, 1.8071F, -1.4352F, 2.1806F));

		PartDefinition cube_r14 = leftArm.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(0, 13)
						.addBox(1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(38, 8)
						.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.689F, -2.2256F, -0.7713F, -1.7017F, 0.0F, 0.0F));

		PartDefinition rightArm = partdefinition.addOrReplaceChild("rightArm", CubeListBuilder.create(),
				PartPose.offset(-6.689F, 12.2256F, -1.2287F));

		PartDefinition cube_r15 = rightArm.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(0, 0).mirror()
						.addBox(-1.3005F, 0.2496F, 0.289F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.8789F, 0.6582F, -0.7064F, 0.2376F, 0.9787F, 2.4918F));

		PartDefinition cube_r16 = rightArm.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(0, 3).mirror()
						.addBox(0.639F, -0.7194F, 0.7563F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.8789F, 0.6582F, -0.7064F, -3.0692F, 0.7345F, -1.2433F));

		PartDefinition cube_r17 = rightArm.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(0, 22).mirror()
						.addBox(0.5746F, 0.2496F, 0.211F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.8789F, 0.6582F, -0.7064F, 2.7992F, 1.1687F, -1.1651F));

		PartDefinition cube_r18 = rightArm.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(14, 24).mirror()
						.addBox(-0.4029F, 0.2496F, -0.0757F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-0.8789F, 0.6582F, -0.7064F, 0.9301F, 1.4062F, -3.0662F));

		PartDefinition cube_r19 = rightArm.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(24, 0).mirror()
						.addBox(-0.7808F, -0.7504F, -3.9731F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offsetAndRotation(-0.8789F, 0.6582F, -0.7064F, 1.8071F, 1.4352F, -2.1806F));

		PartDefinition cube_r20 = rightArm.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(0, 13).mirror()
						.addBox(-2.0F, -1.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(38, 8).mirror()
						.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(2.689F, -2.2256F, -0.7713F, -1.7017F, 0.0F, 0.0F));

		PartDefinition saddle = partdefinition.addOrReplaceChild("saddle", CubeListBuilder.create().texOffs(8, 48)
				.addBox(-2.0F, -13.25F, 3.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		rightFoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftFoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		eyes.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		saddle.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.leftFoot.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.rightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.rightFoot.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}