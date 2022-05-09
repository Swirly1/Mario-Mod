package net.mcreator.mariomod.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

public class GoombaPlayerCollidesWithThisEntityProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double goomY = 0;
		double playerY = 0;
		goomY = entity.getY();
		playerY = sourceentity.getY();
		if (playerY > goomY + 0.5 && sourceentity.getDeltaMovement().y() <= -0.2) {
			entity.hurt(DamageSource.GENERIC, 99);
			if (sourceentity instanceof Player _player)
				_player.giveExperiencePoints(1);
		}
	}
}
