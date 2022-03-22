package net.mcreator.mariomod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class SuperMushroomOnPlayerStoppedUsingProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
						"attribute @s minecraft:generic.max_health base set 20");
		}
		if (entity instanceof LivingEntity _entity)
			_entity.setHealth(20);
	}
}
