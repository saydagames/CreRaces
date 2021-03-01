package mc.sayda.creraces.procedures;

import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.DamageSource;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import mc.sayda.creraces.item.CloudStaffItem;
import mc.sayda.creraces.CreracesModVariables;
import mc.sayda.creraces.CreracesModElements;
import mc.sayda.creraces.CreracesMod;

import java.util.Map;

@CreracesModElements.ModElement.Tag
public class CloudStaffHarpieAllowProcedure extends CreracesModElements.ModElement {
	public CloudStaffHarpieAllowProcedure(CreracesModElements instance) {
		super(instance, 47);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CreracesMod.LOGGER.warn("Failed to load dependency entity for procedure CloudStaffHarpieAllow!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof PlayerEntity)
				? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(CloudStaffItem.block, (int) (1)))
				: false)
				&& (!(((entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new CreracesModVariables.PlayerVariables())).IsRadix) == 1)))) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WEAKNESS, (int) 400, (int) 1));
			entity.setMotionMultiplier(null, new Vector3d(0.25D, (double) 0.05F, 0.25D));
			entity.attackEntityFrom(DamageSource.DRYOUT, (float) 2);
		}
	}
}
