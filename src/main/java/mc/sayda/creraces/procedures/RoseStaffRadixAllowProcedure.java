package mc.sayda.creraces.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import mc.sayda.creraces.item.RoseStaffItem;
import mc.sayda.creraces.CreracesModVariables;
import mc.sayda.creraces.CreracesModElements;
import mc.sayda.creraces.CreracesMod;

import java.util.Map;

@CreracesModElements.ModElement.Tag
public class RoseStaffRadixAllowProcedure extends CreracesModElements.ModElement {
	public RoseStaffRadixAllowProcedure(CreracesModElements instance) {
		super(instance, 27);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CreracesMod.LOGGER.warn("Failed to load dependency entity for procedure RoseStaffRadixAllow!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof PlayerEntity)
				? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(RoseStaffItem.block, (int) (1)))
				: false)
				&& (!(((entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new CreracesModVariables.PlayerVariables())).IsRadix) == 1)))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.POISON, (int) 90, (int) 1));
			entity.attackEntityFrom(DamageSource.CACTUS, (float) 1);
		}
	}
}
