package mc.sayda.creraces.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import mc.sayda.creraces.CreracesModVariables;
import mc.sayda.creraces.CreracesModElements;
import mc.sayda.creraces.CreracesMod;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

@CreracesModElements.ModElement.Tag
public class IfMermaidProcedure extends CreracesModElements.ModElement {
	public IfMermaidProcedure(CreracesModElements instance) {
		super(instance, 11);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CreracesMod.LOGGER.warn("Failed to load dependency entity for procedure IfMermaid!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				CreracesMod.LOGGER.warn("Failed to load dependency x for procedure IfMermaid!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				CreracesMod.LOGGER.warn("Failed to load dependency y for procedure IfMermaid!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				CreracesMod.LOGGER.warn("Failed to load dependency z for procedure IfMermaid!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				CreracesMod.LOGGER.warn("Failed to load dependency world for procedure IfMermaid!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new CreracesModVariables.PlayerVariables())).IsMermaid) == 1)) {
			if ((world.canBlockSeeSky(new BlockPos((int) (x - 1), (int) y, (int) z)))) {
				if ((!(world.getWorldInfo().isRaining() || world.getWorldInfo().isThundering()))) {
					if ((!(entity.isInWaterRainOrBubbleColumn()))) {
						if ((!((new Object() {
							boolean check(Entity _entity) {
								if (_entity instanceof LivingEntity) {
									Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
									for (EffectInstance effect : effects) {
										if (effect.getPotion() == Effects.WEAKNESS)
											return true;
									}
								}
								return false;
							}
						}.check(entity)) || (new Object() {
							boolean check(Entity _entity) {
								if (_entity instanceof LivingEntity) {
									Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
									for (EffectInstance effect : effects) {
										if (effect.getPotion() == Effects.POISON)
											return true;
									}
								}
								return false;
							}
						}.check(entity))))) {
							if ((!(world.isRemote()))) {
								if (entity instanceof LivingEntity)
									((LivingEntity) entity)
											.addPotionEffect(new EffectInstance(Effects.WEAKNESS, (int) 90, (int) 3, (false), (false)));
								if (entity instanceof LivingEntity)
									((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 90, (int) 1, (false), (false)));
							}
						}
					}
				}
				if ((world.getWorldInfo().isRaining() || world.getWorldInfo().isThundering())) {
					if ((!(world.isRemote()))) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).clearActivePotions();
					}
				}
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.DOLPHINS_GRACE, (int) 1000000, (int) 0, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.CONDUIT_POWER, (int) 1000000, (int) 0, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, (int) 1000000, (int) 1, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.LUCK, (int) 1000000, (int) 10, (false), (false)));
		}
	}

	@SubscribeEvent
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			Entity entity = event.player;
			World world = entity.world;
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}
}
