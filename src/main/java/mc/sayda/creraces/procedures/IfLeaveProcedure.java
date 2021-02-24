package mc.sayda.creraces.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.entity.Entity;

import mc.sayda.creraces.CreracesModVariables;
import mc.sayda.creraces.CreracesModElements;
import mc.sayda.creraces.CreracesMod;

import java.util.Map;
import java.util.HashMap;

@CreracesModElements.ModElement.Tag
public class IfLeaveProcedure extends CreracesModElements.ModElement {
	public IfLeaveProcedure(CreracesModElements instance) {
		super(instance, 19);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CreracesMod.LOGGER.warn("Failed to load dependency entity for procedure IfLeave!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putDouble("varUndead", ((entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new CreracesModVariables.PlayerVariables())).IsUndead));
		entity.getPersistentData().putDouble("varFlamekin", ((entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new CreracesModVariables.PlayerVariables())).IsFlamekin));
		entity.getPersistentData().putDouble("varDwarf", ((entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new CreracesModVariables.PlayerVariables())).IsDwarf));
		entity.getPersistentData().putDouble("varMermaid", ((entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new CreracesModVariables.PlayerVariables())).IsMermaid));
		entity.getPersistentData().putDouble("varRadix", ((entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new CreracesModVariables.PlayerVariables())).IsRadix));
		entity.getPersistentData().putDouble("varHarpie", ((entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new CreracesModVariables.PlayerVariables())).IsHarpie));
	}

	@SubscribeEvent
	public void onPlayerLoggedOut(PlayerEvent.PlayerLoggedOutEvent event) {
		Entity entity = event.getPlayer();
		Map<String, Object> dependencies = new HashMap<>();
		dependencies.put("x", entity.getPosX());
		dependencies.put("y", entity.getPosY());
		dependencies.put("z", entity.getPosZ());
		dependencies.put("world", entity.world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}
}
