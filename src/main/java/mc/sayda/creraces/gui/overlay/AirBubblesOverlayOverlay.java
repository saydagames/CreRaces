
package mc.sayda.creraces.gui.overlay;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.Minecraft;

import mc.sayda.creraces.procedures.AirBubblesOverlayDisplayProcedure;
import mc.sayda.creraces.procedures.AirBubble9Procedure;
import mc.sayda.creraces.procedures.AirBubble8Procedure;
import mc.sayda.creraces.procedures.AirBubble7Procedure;
import mc.sayda.creraces.procedures.AirBubble6Procedure;
import mc.sayda.creraces.procedures.AirBubble5Procedure;
import mc.sayda.creraces.procedures.AirBubble4Procedure;
import mc.sayda.creraces.procedures.AirBubble3Procedure;
import mc.sayda.creraces.procedures.AirBubble2Procedure;
import mc.sayda.creraces.procedures.AirBubble1Procedure;
import mc.sayda.creraces.procedures.AirBubble10Procedure;
import mc.sayda.creraces.CreracesModElements;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

import com.google.common.collect.ImmutableMap;

@CreracesModElements.ModElement.Tag
public class AirBubblesOverlayOverlay extends CreracesModElements.ModElement {
	public AirBubblesOverlayOverlay(CreracesModElements instance) {
		super(instance, 55);
	}

	@Override
	public void initElements() {
		MinecraftForge.EVENT_BUS.register(this);
	}

	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public void eventHandler(RenderGameOverlayEvent event) {
		if (!event.isCancelable() && event.getType() == RenderGameOverlayEvent.ElementType.HELMET) {
			int posX = (event.getWindow().getScaledWidth()) / 2;
			int posY = (event.getWindow().getScaledHeight()) / 2;
			PlayerEntity entity = Minecraft.getInstance().player;
			World world = entity.world;
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			if (AirBubblesOverlayDisplayProcedure.executeProcedure(ImmutableMap.of("entity", entity))) {
				if (AirBubble1Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					RenderSystem.disableDepthTest();
					RenderSystem.depthMask(false);
					RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
							GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
					RenderSystem.disableAlphaTest();
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("creraces:textures/bubble.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + 82, posY + 87, 0, 0, 9, 9, 9, 9);
					RenderSystem.depthMask(true);
					RenderSystem.enableDepthTest();
					RenderSystem.enableAlphaTest();
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
				}
				if (AirBubble2Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					RenderSystem.disableDepthTest();
					RenderSystem.depthMask(false);
					RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
							GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
					RenderSystem.disableAlphaTest();
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("creraces:textures/bubble.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + 74, posY + 87, 0, 0, 9, 9, 9, 9);
					RenderSystem.depthMask(true);
					RenderSystem.enableDepthTest();
					RenderSystem.enableAlphaTest();
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
				}
				if (AirBubble3Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					RenderSystem.disableDepthTest();
					RenderSystem.depthMask(false);
					RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
							GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
					RenderSystem.disableAlphaTest();
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("creraces:textures/bubble.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + 66, posY + 87, 0, 0, 9, 9, 9, 9);
					RenderSystem.depthMask(true);
					RenderSystem.enableDepthTest();
					RenderSystem.enableAlphaTest();
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
				}
				if (AirBubble4Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					RenderSystem.disableDepthTest();
					RenderSystem.depthMask(false);
					RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
							GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
					RenderSystem.disableAlphaTest();
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("creraces:textures/bubble.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + 58, posY + 87, 0, 0, 9, 9, 9, 9);
					RenderSystem.depthMask(true);
					RenderSystem.enableDepthTest();
					RenderSystem.enableAlphaTest();
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
				}
				if (AirBubble5Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					RenderSystem.disableDepthTest();
					RenderSystem.depthMask(false);
					RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
							GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
					RenderSystem.disableAlphaTest();
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("creraces:textures/bubble.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + 50, posY + 87, 0, 0, 9, 9, 9, 9);
					RenderSystem.depthMask(true);
					RenderSystem.enableDepthTest();
					RenderSystem.enableAlphaTest();
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
				}
				if (AirBubble6Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					RenderSystem.disableDepthTest();
					RenderSystem.depthMask(false);
					RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
							GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
					RenderSystem.disableAlphaTest();
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("creraces:textures/bubble.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + 42, posY + 87, 0, 0, 9, 9, 9, 9);
					RenderSystem.depthMask(true);
					RenderSystem.enableDepthTest();
					RenderSystem.enableAlphaTest();
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
				}
				if (AirBubble7Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					RenderSystem.disableDepthTest();
					RenderSystem.depthMask(false);
					RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
							GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
					RenderSystem.disableAlphaTest();
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("creraces:textures/bubble.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + 34, posY + 87, 0, 0, 9, 9, 9, 9);
					RenderSystem.depthMask(true);
					RenderSystem.enableDepthTest();
					RenderSystem.enableAlphaTest();
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
				}
				if (AirBubble8Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					RenderSystem.disableDepthTest();
					RenderSystem.depthMask(false);
					RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
							GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
					RenderSystem.disableAlphaTest();
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("creraces:textures/bubble.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + 26, posY + 87, 0, 0, 9, 9, 9, 9);
					RenderSystem.depthMask(true);
					RenderSystem.enableDepthTest();
					RenderSystem.enableAlphaTest();
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
				}
				if (AirBubble9Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					RenderSystem.disableDepthTest();
					RenderSystem.depthMask(false);
					RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
							GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
					RenderSystem.disableAlphaTest();
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("creraces:textures/bubble.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + 18, posY + 87, 0, 0, 9, 9, 9, 9);
					RenderSystem.depthMask(true);
					RenderSystem.enableDepthTest();
					RenderSystem.enableAlphaTest();
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
				}
				if (AirBubble10Procedure.executeProcedure(ImmutableMap.of("entity", entity))) {
					RenderSystem.disableDepthTest();
					RenderSystem.depthMask(false);
					RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA,
							GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
					RenderSystem.disableAlphaTest();
					Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("creraces:textures/bubble.png"));
					Minecraft.getInstance().ingameGUI.blit(event.getMatrixStack(), posX + 10, posY + 87, 0, 0, 9, 9, 9, 9);
					RenderSystem.depthMask(true);
					RenderSystem.enableDepthTest();
					RenderSystem.enableAlphaTest();
					RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
				}
			}
		}
	}
}
