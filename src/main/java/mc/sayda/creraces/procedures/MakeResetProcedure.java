package mc.sayda.creraces.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import mc.sayda.creraces.CreracesModVariables;
import mc.sayda.creraces.CreracesModElements;
import mc.sayda.creraces.CreracesMod;

import java.util.Map;

@CreracesModElements.ModElement.Tag
public class MakeResetProcedure extends CreracesModElements.ModElement {
	public MakeResetProcedure(CreracesModElements instance) {
		super(instance, 4);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CreracesMod.LOGGER.warn("Failed to load dependency entity for procedure MakeReset!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((((((entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new CreracesModVariables.PlayerVariables())).IsUndead) == 1)
				|| (((entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new CreracesModVariables.PlayerVariables())).IsFlamekin) == 1))
				|| ((((entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new CreracesModVariables.PlayerVariables())).IsDwarf) == 1)
						|| (((entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new CreracesModVariables.PlayerVariables())).IsMermaid) == 1)))
				|| ((((entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new CreracesModVariables.PlayerVariables())).IsRadix) == 1)
						|| (((entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new CreracesModVariables.PlayerVariables())).IsHarpie) == 1)))) {
			{
				double _setval = (double) 0;
				entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.IsUndead = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (double) 0;
				entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.IsFlamekin = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (double) 0;
				entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.IsDwarf = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (double) 0;
				entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.IsMermaid = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (double) 0;
				entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.IsRadix = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = (double) 0;
				entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.IsHarpie = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).clearActivePotions();
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"say has reset their Race.");
				}
			}
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).closeScreen();
		}
	}
}
