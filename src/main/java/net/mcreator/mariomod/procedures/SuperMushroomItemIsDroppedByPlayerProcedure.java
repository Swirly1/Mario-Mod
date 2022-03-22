package net.mcreator.mariomod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.mariomod.network.MarioModModVariables;

public class SuperMushroomItemIsDroppedByPlayerProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		MarioModModVariables.MapVariables.get(world).shroomCount = MarioModModVariables.MapVariables.get(world).shroomCount - 1;
		MarioModModVariables.MapVariables.get(world).syncData(world);
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
						"attribute @s minecraft:generic.max_health base set 20");
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) > 20) {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) - 20));
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1);
		}
	}
}
