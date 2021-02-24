package mc.sayda.creraces.procedures;

import net.minecraft.entity.Entity;

import mc.sayda.creraces.CreracesModVariables;
import mc.sayda.creraces.CreracesModElements;
import mc.sayda.creraces.CreracesMod;

import java.util.Map;

@CreracesModElements.ModElement.Tag
public class RaceGuiSelectProcedure extends CreracesModElements.ModElement {
	public RaceGuiSelectProcedure(CreracesModElements instance) {
		super(instance, 7);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CreracesMod.LOGGER.warn("Failed to load dependency entity for procedure RaceGuiSelect!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			double _setval = (double) 1;
			entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.IsMermaid = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
