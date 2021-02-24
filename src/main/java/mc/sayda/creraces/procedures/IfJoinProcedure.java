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
public class IfJoinProcedure extends CreracesModElements.ModElement {
	public IfJoinProcedure(CreracesModElements instance) {
		super(instance, 18);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CreracesMod.LOGGER.warn("Failed to load dependency entity for procedure IfJoin!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			double _setval = (double) (entity.getPersistentData().getDouble("varUndead"));
			entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.IsUndead = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (double) (entity.getPersistentData().getDouble("varFlamekin"));
			entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.IsFlamekin = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (double) (entity.getPersistentData().getDouble("varDwarf"));
			entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.IsDwarf = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (double) (entity.getPersistentData().getDouble("varMermaid"));
			entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.IsMermaid = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (double) (entity.getPersistentData().getDouble("varRadix"));
			entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.IsRadix = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (double) (entity.getPersistentData().getDouble("varHarpie"));
			entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.IsHarpie = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}

	@SubscribeEvent
	public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
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
