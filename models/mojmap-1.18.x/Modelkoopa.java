// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelkoopa<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "koopa"), "main");
	private final ModelPart rightleg;
	private final ModelPart leftleg;
	private final ModelPart body;
	private final ModelPart shell;
	private final ModelPart leftarm;
	private final ModelPart rightarm;
	private final ModelPart head;
	private final ModelPart eyes;

	public Modelkoopa(ModelPart root) {
		this.rightleg = root.getChild("rightleg");
		this.leftleg = root.getChild("leftleg");
		this.body = root.getChild("body");
		this.shell = root.getChild("shell");
		this.leftarm = root.getChild("leftarm");
		this.rightarm = root.getChild("rightarm");
		this.head = root.getChild("head");
		this.eyes = root.getChild("eyes");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg",
				CubeListBuilder.create().texOffs(18, 58)
						.addBox(-6.0F, -1.0F, -7.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(27, 20)
						.addBox(-5.5F, -6.0F, -4.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 22)
						.addBox(-6.0F, -2.0F, -5.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg",
				CubeListBuilder.create().texOffs(0, 20)
						.addBox(4.5F, -6.0F, 0.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 18)
						.addBox(4.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(56, 56)
						.addBox(4.0F, -1.0F, -3.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, -4.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(0, 50)
						.addBox(-4.5F, -6.0F, -4.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-5.5F, -16.5F, -4.25F, 11.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = body.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(39, 9).addBox(-5.0F, -1.0F, -0.5F, 11.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -4.8152F, -2.7249F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r2 = body.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(46, 32).addBox(-5.5F, 0.26F, -9.23F, 11.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(46, 34).addBox(-5.5F, -2.63F, -8.17F, 11.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -1.1781F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(36, 43).addBox(-5.5F, -6.089F, -5.917F, 11.0F, 2.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.25F, -9.75F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 30).addBox(-5.5F, -3.514F, -11.03F, 11.0F, 2.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.25F, -9.75F, -1.9635F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(0, 0).addBox(-5.5F, -3.68F, -14.06F, 11.0F, 5.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -5.25F, -9.75F, -2.3126F, 0.0F, 0.0F));

		PartDefinition cube_r7 = body.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(39, 0).addBox(-5.5F, -8.25F, -6.0F, 11.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, -4.0F, 2.6616F, 0.0F, -3.1416F));

		PartDefinition cube_r8 = body.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(36, 6)
						.addBox(-5.5F, 1.378F, -13.04F, 11.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(34, 19)
						.addBox(-5.5F, -4.622F, -10.04F, 11.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.25F, 3.0F, 1.1345F, 0.0F, -3.1416F));

		PartDefinition cube_r9 = body.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(46, 28).addBox(-5.5F, -1.456F, -8.03F, 11.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.25F, 3.0F, 1.4835F, 0.0F, 3.1416F));

		PartDefinition cube_r10 = body.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 20).addBox(-5.5F, -7.27F, -9.022F, 11.0F, 3.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.1F, 3.2F, 1.8762F, 0.0F, -3.1416F));

		PartDefinition cube_r11 = body.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(28, 37).addBox(-5.5F, -4.63F, -9.17F, 11.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, -4.0F, 2.2689F, 0.0F, -3.1416F));

		PartDefinition cube_r12 = body.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 36).addBox(-5.5F, 2.26F, -9.23F, 11.0F, 0.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, -4.0F, 1.9199F, 0.0F, -3.1416F));

		PartDefinition cube_r13 = body.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(0, 37).addBox(-5.5F, -6.25F, -6.0F, 11.0F, 2.0F, 3.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition shell = partdefinition.addOrReplaceChild("shell", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, -1.0F));

		PartDefinition cube_r14 = shell.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(0, 29)
						.addBox(-6.0F, 1.5F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 30)
						.addBox(-6.0F, 1.5F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(4.0F, 1.5F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 32)
						.addBox(3.0F, 1.5F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 42)
						.addBox(-4.0F, -3.5F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 42)
						.addBox(-3.0F, -3.5F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(63, 61)
						.addBox(-5.0F, -2.5F, 3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(46, 68)
						.addBox(-4.0F, -2.5F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 4)
						.addBox(-5.0F, -1.5F, 6.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 17)
						.addBox(-6.0F, -1.5F, 3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(56, 11)
						.addBox(-7.0F, -0.5F, 3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(36, 12)
						.addBox(3.0F, 2.5F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 68)
						.addBox(-6.0F, 2.5F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(25, 37)
						.addBox(-6.0F, 2.5F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 52)
						.addBox(0.0F, 3.5F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 11)
						.addBox(0.0F, 3.5F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 13)
						.addBox(-3.0F, 3.5F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 59)
						.addBox(-3.0F, 3.5F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 17)
						.addBox(-7.0F, 0.5F, -4.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(60, 22)
						.addBox(4.0F, 0.5F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(63, 12)
						.addBox(0.0F, 0.5F, -4.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 56)
						.addBox(0.0F, 0.5F, 7.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 24)
						.addBox(3.0F, 0.5F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(4.0F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(8, 55)
						.addBox(3.0F, -1.5F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 15)
						.addBox(0.0F, -3.5F, 1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(68, 25)
						.addBox(2.0F, -2.5F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-2.0F, 3.5F, 8.0F, 2.0F, 1.0F, -1.0F, new CubeDeformation(0.0F)).texOffs(0, 69)
						.addBox(-2.0F, 3.5F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 0)
						.addBox(4.0F, 0.5F, -3.0F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).texOffs(59, 43)
						.addBox(4.0F, 1.5F, 4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(65, 39)
						.addBox(4.0F, 1.5F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(63, 0)
						.addBox(0.0F, 2.5F, -4.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 66)
						.addBox(0.0F, 2.5F, 7.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 60)
						.addBox(-7.0F, 1.5F, 4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(63, 48)
						.addBox(-7.0F, 1.5F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(67, 2)
						.addBox(-5.0F, 2.5F, 7.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(69, 7)
						.addBox(-4.0F, 2.5F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -12.5F, 3.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r15 = shell.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(60, 22).addBox(-8.0F, -0.5F, -6.0F, 1.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -12.5F, 3.0F, -1.5708F, 0.0F, -1.5708F));

		PartDefinition cube_r16 = shell.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(64, 57)
						.addBox(2.0F, 0.5F, 3.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(57, 61)
						.addBox(5.0F, 0.5F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(65, 43)
						.addBox(0.0F, 0.5F, -8.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 62)
						.addBox(5.0F, 0.5F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(65, 65)
						.addBox(2.0F, -3.5F, -3.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 55)
						.addBox(4.0F, -2.5F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 48)
						.addBox(5.0F, -1.5F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 53)
						.addBox(6.0F, -0.5F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -12.5F, 3.0F, -1.5708F, 0.0F, -3.1416F));

		PartDefinition cube_r17 = shell.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(0, 45)
						.addBox(-4.0F, -3.5F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 45)
						.addBox(-3.0F, -3.5F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 53)
						.addBox(-5.0F, -2.5F, 3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(68, 60)
						.addBox(-4.0F, -2.5F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(61, 2)
						.addBox(-6.0F, -1.5F, 3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(14, 60)
						.addBox(-5.0F, -1.5F, 6.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -8.5F, 3.0F, -1.5708F, 0.0F, 3.1416F));

		PartDefinition cube_r18 = shell.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(29, 56)
						.addBox(-8.0F, -0.5F, 2.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(8, 52)
						.addBox(-5.0F, -3.5F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(-4.0F, -3.5F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(39, 65)
						.addBox(-6.0F, -2.5F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(63, 68)
						.addBox(-5.0F, -2.5F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 66)
						.addBox(-6.0F, -1.5F, 5.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 63)
						.addBox(-7.0F, -1.5F, 2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -12.5F, 3.0F, -1.5708F, 0.0F, -1.5708F));

		PartDefinition cube_r19 = shell.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(8, 62).addBox(-7.0F, -0.5F, -4.0F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -12.5F, 3.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r20 = shell.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(57, 61).addBox(-4.0F, -0.5F, 2.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -12.5F, 3.0F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r21 = shell.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(26, 62)
						.addBox(-7.0F, -1.5F, 2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 63)
						.addBox(-6.0F, -1.5F, 5.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 65)
						.addBox(-6.0F, -2.5F, 2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(68, 62)
						.addBox(-5.0F, -2.5F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 51)
						.addBox(-5.0F, -3.5F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-4.0F, -3.5F, 2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -8.5F, 3.0F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r22 = shell.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(63, 7).addBox(-7.0F, -0.5F, -7.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -12.5F, 3.0F, -1.5708F, 0.0F, 3.1416F));

		PartDefinition cube_r23 = shell.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(14, 62).addBox(-6.0F, -0.5F, 3.0F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -12.5F, 3.0F, -1.5708F, 0.0F, 3.1416F));

		PartDefinition cube_r24 = shell.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(32, 63).addBox(-4.0F, -0.5F, -6.0F, 1.0F, 1.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -12.5F, 3.0F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r25 = shell.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(0, 66)
						.addBox(4.0F, -3.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 66)
						.addBox(5.0F, -2.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(27, 67)
						.addBox(6.0F, -1.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(7.0F, 2.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -12.5F, 3.0F, -1.5708F, 0.0F, 1.5708F));

		PartDefinition cube_r26 = shell.addOrReplaceChild("cube_r26",
				CubeListBuilder.create().texOffs(46, 56)
						.addBox(0.0F, -3.5F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(11, 68)
						.addBox(5.0F, -2.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(17, 68)
						.addBox(6.0F, -1.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.5F, 3.0F, -1.5708F, 0.0F, -1.5708F));

		PartDefinition cube_r27 = shell.addOrReplaceChild("cube_r27",
				CubeListBuilder.create().texOffs(0, 11).addBox(3.0F, -0.5F, -1.0F, 1.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -12.5F, 3.0F, -1.5708F, 0.0F, -1.5708F));

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm",
				CubeListBuilder.create().texOffs(50, 51)
						.addBox(5.0F, -13.5F, -4.0F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(68, 36)
						.addBox(10.0F, -13.5F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(67, 4)
						.addBox(10.0F, -13.5F, -4.25F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(33, 68)
						.addBox(10.0F, -13.5F, -1.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r28 = leftarm.addOrReplaceChild("cube_r28",
				CubeListBuilder.create().texOffs(11, 65).addBox(-1.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, -12.0F, -4.25F, 0.0F, 0.4363F, 0.0F));

		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm",
				CubeListBuilder.create().texOffs(34, 51)
						.addBox(-5.3F, -0.8F, -1.15F, 5.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(61, 7)
						.addBox(-0.3F, -0.8F, -1.4F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 19)
						.addBox(-0.3F, -0.8F, -0.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 47)
						.addBox(-0.3F, -0.8F, 1.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.7F, 11.3F, -2.1F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r29 = rightarm.addOrReplaceChild("cube_r29",
				CubeListBuilder.create().texOffs(5, 60).addBox(0.25F, -0.5F, 3.0F, 2.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.7F, 0.7F, -1.4F, 0.0F, -0.4363F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(26, 12)
						.addBox(-2.0F, -17.0F, -4.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 11)
						.addBox(-5.0F, -22.0F, -7.0F, 10.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(18, 43)
						.addBox(-3.0F, -18.0F, -7.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(34, 12)
						.addBox(-4.0F, -19.0F, -7.0F, 8.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(54, 36)
						.addBox(-3.0F, -23.0F, -8.0F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 50)
						.addBox(-3.0F, -23.0F, -9.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r30 = head.addOrReplaceChild("cube_r30",
				CubeListBuilder.create().texOffs(0, 42)
						.addBox(-3.0F, 1.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(24, 30)
						.addBox(-4.0F, 0.0F, -3.0F, 8.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -22.0F, -4.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition eyes = partdefinition.addOrReplaceChild("eyes",
				CubeListBuilder.create().texOffs(49, 59)
						.addBox(3.0F, -26.0F, -8.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 59)
						.addBox(-4.0F, -26.0F, -8.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(42, 47)
						.addBox(-4.0F, -26.0F, -5.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 57)
						.addBox(-3.0F, -26.0F, -8.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 0)
						.addBox(0.0F, -26.0F, -8.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r31 = eyes.addOrReplaceChild("cube_r31",
				CubeListBuilder.create().texOffs(7, 65)
						.addBox(1.0F, -0.5F, 1.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 56)
						.addBox(1.0F, -0.5F, -1.5F, 1.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, -25.0F, -6.5F, 0.0F, 0.0F, -1.5708F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		shell.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		eyes.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.rightleg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.rightarm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.leftleg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leftarm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}