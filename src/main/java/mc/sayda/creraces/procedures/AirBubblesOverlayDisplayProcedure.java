package mc.sayda.creraces.procedures;

import net.minecraft.entity.Entity;

import mc.sayda.creraces.CreracesModVariables;
import mc.sayda.creraces.CreracesModElements;
import mc.sayda.creraces.CreracesMod;

import java.util.Map;

@CreracesModElements.ModElement.Tag
public class AirBubblesOverlayDisplayProcedure extends CreracesModElements.ModElement {
	public AirBubblesOverlayDisplayProcedure(CreracesModElements instance) {
		super(instance, 55);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CreracesMod.LOGGER.warn("Failed to load dependency entity for procedure AirBubblesOverlayDisplay!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((((entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new CreracesModVariables.PlayerVariables())).IsMermaid) == 1) && (!(entity.isInWaterRainOrBubbleColumn())))) {
			return (true);
		}
		return (false);
	}
}
