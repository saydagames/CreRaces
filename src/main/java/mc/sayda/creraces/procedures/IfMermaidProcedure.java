package mc.sayda.creraces.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.DamageSource;
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
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				CreracesMod.LOGGER.warn("Failed to load dependency world for procedure IfMermaid!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new CreracesModVariables.PlayerVariables())).IsMermaid) == 1)) {
			if ((!(world.getWorldInfo().isRaining() || world.getWorldInfo().isThundering()))) {
				if ((!(entity.isInWaterRainOrBubbleColumn()))) {
					if ((!(world.isRemote()))) {
						if (entity instanceof LivingEntity) {
							((LivingEntity) entity).removePotionEffect(Effects.SLOW_FALLING);
						}
						new Object() {
							private int ticks = 0;
							private float waitTicks;
							private IWorld world;
							public void start(IWorld world, int waitTicks) {
								this.waitTicks = waitTicks;
								MinecraftForge.EVENT_BUS.register(this);
								this.world = world;
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									this.ticks += 1;
									if (this.ticks >= this.waitTicks)
										run();
								}
							}

							private void run() {
								if ((((entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
										.orElse(new CreracesModVariables.PlayerVariables())).AirBubbles) == 10)) {
									{
										double _setval = (double) (((entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new CreracesModVariables.PlayerVariables())).AirBubbles) - 1);
										entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.AirBubbles = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
								}
								new Object() {
									private int ticks = 0;
									private float waitTicks;
									private IWorld world;
									public void start(IWorld world, int waitTicks) {
										this.waitTicks = waitTicks;
										MinecraftForge.EVENT_BUS.register(this);
										this.world = world;
									}

									@SubscribeEvent
									public void tick(TickEvent.ServerTickEvent event) {
										if (event.phase == TickEvent.Phase.END) {
											this.ticks += 1;
											if (this.ticks >= this.waitTicks)
												run();
										}
									}

									private void run() {
										if ((((entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new CreracesModVariables.PlayerVariables())).AirBubbles) == 9)) {
											{
												double _setval = (double) (((entity
														.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
														.orElse(new CreracesModVariables.PlayerVariables())).AirBubbles) - 1);
												entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.AirBubbles = _setval;
													capability.syncPlayerVariables(entity);
												});
											}
										}
										new Object() {
											private int ticks = 0;
											private float waitTicks;
											private IWorld world;
											public void start(IWorld world, int waitTicks) {
												this.waitTicks = waitTicks;
												MinecraftForge.EVENT_BUS.register(this);
												this.world = world;
											}

											@SubscribeEvent
											public void tick(TickEvent.ServerTickEvent event) {
												if (event.phase == TickEvent.Phase.END) {
													this.ticks += 1;
													if (this.ticks >= this.waitTicks)
														run();
												}
											}

											private void run() {
												if ((((entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
														.orElse(new CreracesModVariables.PlayerVariables())).AirBubbles) == 8)) {
													{
														double _setval = (double) (((entity
																.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																.orElse(new CreracesModVariables.PlayerVariables())).AirBubbles) - 1);
														entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																.ifPresent(capability -> {
																	capability.AirBubbles = _setval;
																	capability.syncPlayerVariables(entity);
																});
													}
												}
												new Object() {
													private int ticks = 0;
													private float waitTicks;
													private IWorld world;
													public void start(IWorld world, int waitTicks) {
														this.waitTicks = waitTicks;
														MinecraftForge.EVENT_BUS.register(this);
														this.world = world;
													}

													@SubscribeEvent
													public void tick(TickEvent.ServerTickEvent event) {
														if (event.phase == TickEvent.Phase.END) {
															this.ticks += 1;
															if (this.ticks >= this.waitTicks)
																run();
														}
													}

													private void run() {
														if ((((entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																.orElse(new CreracesModVariables.PlayerVariables())).AirBubbles) == 7)) {
															{
																double _setval = (double) (((entity
																		.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																		.orElse(new CreracesModVariables.PlayerVariables())).AirBubbles) - 1);
																entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																		.ifPresent(capability -> {
																			capability.AirBubbles = _setval;
																			capability.syncPlayerVariables(entity);
																		});
															}
														}
														new Object() {
															private int ticks = 0;
															private float waitTicks;
															private IWorld world;
															public void start(IWorld world, int waitTicks) {
																this.waitTicks = waitTicks;
																MinecraftForge.EVENT_BUS.register(this);
																this.world = world;
															}

															@SubscribeEvent
															public void tick(TickEvent.ServerTickEvent event) {
																if (event.phase == TickEvent.Phase.END) {
																	this.ticks += 1;
																	if (this.ticks >= this.waitTicks)
																		run();
																}
															}

															private void run() {
																if ((((entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																		.orElse(new CreracesModVariables.PlayerVariables())).AirBubbles) == 6)) {
																	{
																		double _setval = (double) (((entity
																				.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																				.orElse(new CreracesModVariables.PlayerVariables())).AirBubbles) - 1);
																		entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																				.ifPresent(capability -> {
																					capability.AirBubbles = _setval;
																					capability.syncPlayerVariables(entity);
																				});
																	}
																}
																new Object() {
																	private int ticks = 0;
																	private float waitTicks;
																	private IWorld world;
																	public void start(IWorld world, int waitTicks) {
																		this.waitTicks = waitTicks;
																		MinecraftForge.EVENT_BUS.register(this);
																		this.world = world;
																	}

																	@SubscribeEvent
																	public void tick(TickEvent.ServerTickEvent event) {
																		if (event.phase == TickEvent.Phase.END) {
																			this.ticks += 1;
																			if (this.ticks >= this.waitTicks)
																				run();
																		}
																	}

																	private void run() {
																		if ((((entity
																				.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																				.orElse(new CreracesModVariables.PlayerVariables())).AirBubbles) == 5)) {
																			{
																				double _setval = (double) (((entity.getCapability(
																						CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																						.orElse(new CreracesModVariables.PlayerVariables())).AirBubbles)
																						- 1);
																				entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY,
																						null).ifPresent(capability -> {
																							capability.AirBubbles = _setval;
																							capability.syncPlayerVariables(entity);
																						});
																			}
																		}
																		new Object() {
																			private int ticks = 0;
																			private float waitTicks;
																			private IWorld world;
																			public void start(IWorld world, int waitTicks) {
																				this.waitTicks = waitTicks;
																				MinecraftForge.EVENT_BUS.register(this);
																				this.world = world;
																			}

																			@SubscribeEvent
																			public void tick(TickEvent.ServerTickEvent event) {
																				if (event.phase == TickEvent.Phase.END) {
																					this.ticks += 1;
																					if (this.ticks >= this.waitTicks)
																						run();
																				}
																			}

																			private void run() {
																				if ((((entity.getCapability(
																						CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																						.orElse(new CreracesModVariables.PlayerVariables())).AirBubbles) == 4)) {
																					{
																						double _setval = (double) (((entity.getCapability(
																								CreracesModVariables.PLAYER_VARIABLES_CAPABILITY,
																								null)
																								.orElse(new CreracesModVariables.PlayerVariables())).AirBubbles)
																								- 1);
																						entity.getCapability(
																								CreracesModVariables.PLAYER_VARIABLES_CAPABILITY,
																								null).ifPresent(capability -> {
																									capability.AirBubbles = _setval;
																									capability.syncPlayerVariables(entity);
																								});
																					}
																				}
																				new Object() {
																					private int ticks = 0;
																					private float waitTicks;
																					private IWorld world;
																					public void start(IWorld world, int waitTicks) {
																						this.waitTicks = waitTicks;
																						MinecraftForge.EVENT_BUS.register(this);
																						this.world = world;
																					}

																					@SubscribeEvent
																					public void tick(TickEvent.ServerTickEvent event) {
																						if (event.phase == TickEvent.Phase.END) {
																							this.ticks += 1;
																							if (this.ticks >= this.waitTicks)
																								run();
																						}
																					}

																					private void run() {
																						if ((((entity.getCapability(
																								CreracesModVariables.PLAYER_VARIABLES_CAPABILITY,
																								null)
																								.orElse(new CreracesModVariables.PlayerVariables())).AirBubbles) == 3)) {
																							{
																								double _setval = (double) (((entity.getCapability(
																										CreracesModVariables.PLAYER_VARIABLES_CAPABILITY,
																										null)
																										.orElse(new CreracesModVariables.PlayerVariables())).AirBubbles)
																										- 1);
																								entity.getCapability(
																										CreracesModVariables.PLAYER_VARIABLES_CAPABILITY,
																										null).ifPresent(capability -> {
																											capability.AirBubbles = _setval;
																											capability.syncPlayerVariables(entity);
																										});
																							}
																						}
																						new Object() {
																							private int ticks = 0;
																							private float waitTicks;
																							private IWorld world;
																							public void start(IWorld world, int waitTicks) {
																								this.waitTicks = waitTicks;
																								MinecraftForge.EVENT_BUS.register(this);
																								this.world = world;
																							}

																							@SubscribeEvent
																							public void tick(TickEvent.ServerTickEvent event) {
																								if (event.phase == TickEvent.Phase.END) {
																									this.ticks += 1;
																									if (this.ticks >= this.waitTicks)
																										run();
																								}
																							}

																							private void run() {
																								if ((((entity.getCapability(
																										CreracesModVariables.PLAYER_VARIABLES_CAPABILITY,
																										null)
																										.orElse(new CreracesModVariables.PlayerVariables())).AirBubbles) == 2)) {
																									{
																										double _setval = (double) (((entity
																												.getCapability(
																														CreracesModVariables.PLAYER_VARIABLES_CAPABILITY,
																														null)
																												.orElse(new CreracesModVariables.PlayerVariables())).AirBubbles)
																												- 1);
																										entity.getCapability(
																												CreracesModVariables.PLAYER_VARIABLES_CAPABILITY,
																												null).ifPresent(capability -> {
																													capability.AirBubbles = _setval;
																													capability.syncPlayerVariables(
																															entity);
																												});
																									}
																								}
																								new Object() {
																									private int ticks = 0;
																									private float waitTicks;
																									private IWorld world;
																									public void start(IWorld world, int waitTicks) {
																										this.waitTicks = waitTicks;
																										MinecraftForge.EVENT_BUS.register(this);
																										this.world = world;
																									}

																									@SubscribeEvent
																									public void tick(
																											TickEvent.ServerTickEvent event) {
																										if (event.phase == TickEvent.Phase.END) {
																											this.ticks += 1;
																											if (this.ticks >= this.waitTicks)
																												run();
																										}
																									}

																									private void run() {
																										if ((((entity.getCapability(
																												CreracesModVariables.PLAYER_VARIABLES_CAPABILITY,
																												null)
																												.orElse(new CreracesModVariables.PlayerVariables())).AirBubbles) == 1)) {
																											{
																												double _setval = (double) (((entity
																														.getCapability(
																																CreracesModVariables.PLAYER_VARIABLES_CAPABILITY,
																																null)
																														.orElse(new CreracesModVariables.PlayerVariables())).AirBubbles)
																														- 1);
																												entity.getCapability(
																														CreracesModVariables.PLAYER_VARIABLES_CAPABILITY,
																														null)
																														.ifPresent(capability -> {
																															capability.AirBubbles = _setval;
																															capability
																																	.syncPlayerVariables(
																																			entity);
																														});
																											}
																										}
																										new Object() {
																											private int ticks = 0;
																											private float waitTicks;
																											private IWorld world;
																											public void start(IWorld world,
																													int waitTicks) {
																												this.waitTicks = waitTicks;
																												MinecraftForge.EVENT_BUS
																														.register(this);
																												this.world = world;
																											}

																											@SubscribeEvent
																											public void tick(
																													TickEvent.ServerTickEvent event) {
																												if (event.phase == TickEvent.Phase.END) {
																													this.ticks += 1;
																													if (this.ticks >= this.waitTicks)
																														run();
																												}
																											}

																											private void run() {
																												if ((((entity.getCapability(
																														CreracesModVariables.PLAYER_VARIABLES_CAPABILITY,
																														null)
																														.orElse(new CreracesModVariables.PlayerVariables())).AirBubbles) == 0)) {
																													{
																														double _setval = (double) (((entity
																																.getCapability(
																																		CreracesModVariables.PLAYER_VARIABLES_CAPABILITY,
																																		null)
																																.orElse(new CreracesModVariables.PlayerVariables())).AirBubbles)
																																- 1);
																														entity.getCapability(
																																CreracesModVariables.PLAYER_VARIABLES_CAPABILITY,
																																null).ifPresent(
																																		capability -> {
																																			capability.AirBubbles = _setval;
																																			capability
																																					.syncPlayerVariables(
																																							entity);
																																		});
																													}
																												}
																												MinecraftForge.EVENT_BUS
																														.unregister(this);
																											}
																										}.start(world, (int) 40);
																										MinecraftForge.EVENT_BUS.unregister(this);
																									}
																								}.start(world, (int) 40);
																								MinecraftForge.EVENT_BUS.unregister(this);
																							}
																						}.start(world, (int) 40);
																						MinecraftForge.EVENT_BUS.unregister(this);
																					}
																				}.start(world, (int) 40);
																				MinecraftForge.EVENT_BUS.unregister(this);
																			}
																		}.start(world, (int) 40);
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 40);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 40);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 40);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 40);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 40);
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) 40);
					}
					if ((((entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new CreracesModVariables.PlayerVariables())).AirBubbles) <= (-1))) {
						if ((!(new Object() {
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
						}.check(entity)))) {
							if (entity instanceof LivingEntity)
								((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WEAKNESS, (int) 30, (int) 1, (false), (false)));
							entity.attackEntityFrom(DamageSource.DROWN, (float) 2);
						}
					}
				}
			}
			if ((entity.isInWaterRainOrBubbleColumn())) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOW_FALLING, (int) 1000000, (int) 0, (false), (false)));
				{
					double _setval = (double) 10;
					entity.getCapability(CreracesModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.AirBubbles = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
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
