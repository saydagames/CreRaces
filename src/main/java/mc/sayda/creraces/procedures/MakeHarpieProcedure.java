package mc.sayda.creraces.procedures;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import mc.sayda.creraces.CreracesModVariables;
import mc.sayda.creraces.CreracesModElements;
import mc.sayda.creraces.CreracesMod;

import java.util.Map;

@CreracesModElements.ModElement.Tag
public class MakeHarpieProcedure extends CreracesModElements.ModElement {
	public MakeHarpieProcedure(CreracesModElements instance) {
		super(instance, 10);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CreracesMod.LOGGER.warn("Failed to load dependency entity for procedure MakeHarpie!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			double _setval = (double) 1;
			entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.IsHarpie = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).closeScreen();
	}
}
