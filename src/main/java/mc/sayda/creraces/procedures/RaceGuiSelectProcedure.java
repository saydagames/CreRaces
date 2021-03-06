package mc.sayda.creraces.procedures;

import net.minecraftforge.fml.network.NetworkHooks;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.network.PacketBuffer;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import mc.sayda.creraces.gui.RaceSelectorGui;
import mc.sayda.creraces.CreracesModVariables;
import mc.sayda.creraces.CreracesModElements;
import mc.sayda.creraces.CreracesMod;

import java.util.Map;

import io.netty.buffer.Unpooled;

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
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				CreracesMod.LOGGER.warn("Failed to load dependency x for procedure RaceGuiSelect!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				CreracesMod.LOGGER.warn("Failed to load dependency y for procedure RaceGuiSelect!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				CreracesMod.LOGGER.warn("Failed to load dependency z for procedure RaceGuiSelect!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				CreracesMod.LOGGER.warn("Failed to load dependency world for procedure RaceGuiSelect!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((((entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new CreracesModVariables.PlayerVariables())).IsUndead) == 1)
				|| ((((entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new CreracesModVariables.PlayerVariables())).IsFlamekin) == 1)
						|| ((((entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new CreracesModVariables.PlayerVariables())).IsDwarf) == 1)
								|| ((((entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new CreracesModVariables.PlayerVariables())).IsMermaid) == 1)
										|| ((((entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new CreracesModVariables.PlayerVariables())).IsRadix) == 1)
												|| (((entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
														.orElse(new CreracesModVariables.PlayerVariables())).IsHarpie) == 1))))))) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).closeScreen();
		} else {
			{
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
					NetworkHooks.openGui((ServerPlayerEntity) _ent, new INamedContainerProvider() {
						@Override
						public ITextComponent getDisplayName() {
							return new StringTextComponent("RaceSelector");
						}

						@Override
						public Container createMenu(int id, PlayerInventory inventory, PlayerEntity player) {
							return new RaceSelectorGui.GuiContainerMod(id, inventory, new PacketBuffer(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
	}
}
