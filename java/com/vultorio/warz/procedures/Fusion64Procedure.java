package com.vultorio.warz.procedures;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.function.Supplier;
import java.util.Map;

import com.vultorio.warz.item.RenforcecarboniteItem;
import com.vultorio.warz.item.ReinforiumItemItem;
import com.vultorio.warz.item.CarboniteItem;
import com.vultorio.warz.item.CarboneItem;
import com.vultorio.warz.WarZModElements;
import com.vultorio.warz.WarZMod;

@WarZModElements.ModElement.Tag
public class Fusion64Procedure extends WarZModElements.ModElement {
	public Fusion64Procedure(WarZModElements instance) {
		super(instance, 48);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WarZMod.LOGGER.warn("Failed to load dependency entity for procedure Fusion64!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((new Object() {
			public int getAmount(int sltid) {
				if (entity instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) entity).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
							if (stack != null)
								return stack.getCount();
						}
					}
				}
				return 0;
			}
		}.getAmount((int) (3))) <= 1)) {
			if ((((new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
								if (stack != null)
									return stack.getCount();
							}
						}
					}
					return 0;
				}
			}.getAmount((int) (0))) >= 32) && (((new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
								if (stack != null)
									return stack.getCount();
							}
						}
					}
					return 0;
				}
			}.getAmount((int) (1))) >= 32) && ((new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
								if (stack != null)
									return stack.getCount();
							}
						}
					}
					return 0;
				}
			}.getAmount((int) (2))) >= 32)))) {
				if (((new Object() {
					public ItemStack getItemStack(int sltid) {
						Entity _ent = entity;
						if (_ent instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) _ent).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									return ((Slot) ((Map) invobj).get(sltid)).getStack();
								}
							}
						}
						return ItemStack.EMPTY;
					}
				}.getItemStack((int) (0))).getItem() == new ItemStack(CarboneItem.block, (int) (1)).getItem())) {
					if (((new Object() {
						public ItemStack getItemStack(int sltid) {
							Entity _ent = entity;
							if (_ent instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) _ent).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (1))).getItem() == new ItemStack(Items.IRON_INGOT, (int) (1)).getItem())) {
						if (((new Object() {
							public ItemStack getItemStack(int sltid) {
								Entity _ent = entity;
								if (_ent instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) _ent).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											return ((Slot) ((Map) invobj).get(sltid)).getStack();
										}
									}
								}
								return ItemStack.EMPTY;
							}
						}.getItemStack((int) (2))).getItem() == new ItemStack(Items.COAL, (int) (1)).getItem())) {
							{
								Entity _ent = entity;
								if (_ent instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) _ent).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (32));
											_current.detectAndSendChanges();
										}
									}
								}
							}
							{
								Entity _ent = entity;
								if (_ent instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) _ent).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											((Slot) ((Map) invobj).get((int) (1))).decrStackSize((int) (32));
											_current.detectAndSendChanges();
										}
									}
								}
							}
							{
								Entity _ent = entity;
								if (_ent instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) _ent).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											((Slot) ((Map) invobj).get((int) (2))).decrStackSize((int) (32));
											_current.detectAndSendChanges();
										}
									}
								}
							}
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(CarboniteItem.block, (int) (1));
										_setstack.setCount((int) ((new Object() {
											public int getAmount(int sltid) {
												if (entity instanceof ServerPlayerEntity) {
													Container _current = ((ServerPlayerEntity) entity).openContainer;
													if (_current instanceof Supplier) {
														Object invobj = ((Supplier) _current).get();
														if (invobj instanceof Map) {
															ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
															if (stack != null)
																return stack.getCount();
														}
													}
												}
												return 0;
											}
										}.getAmount((int) (3))) + 64));
										((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
					}
				}
				if (((new Object() {
					public ItemStack getItemStack(int sltid) {
						Entity _ent = entity;
						if (_ent instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) _ent).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									return ((Slot) ((Map) invobj).get(sltid)).getStack();
								}
							}
						}
						return ItemStack.EMPTY;
					}
				}.getItemStack((int) (0))).getItem() == new ItemStack(CarboneItem.block, (int) (1)).getItem())) {
					if (((new Object() {
						public ItemStack getItemStack(int sltid) {
							Entity _ent = entity;
							if (_ent instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) _ent).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (1))).getItem() == new ItemStack(Items.COAL, (int) (1)).getItem())) {
						if (((new Object() {
							public ItemStack getItemStack(int sltid) {
								Entity _ent = entity;
								if (_ent instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) _ent).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											return ((Slot) ((Map) invobj).get(sltid)).getStack();
										}
									}
								}
								return ItemStack.EMPTY;
							}
						}.getItemStack((int) (2))).getItem() == new ItemStack(Items.IRON_INGOT, (int) (1)).getItem())) {
							{
								Entity _ent = entity;
								if (_ent instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) _ent).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (32));
											_current.detectAndSendChanges();
										}
									}
								}
							}
							{
								Entity _ent = entity;
								if (_ent instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) _ent).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											((Slot) ((Map) invobj).get((int) (1))).decrStackSize((int) (32));
											_current.detectAndSendChanges();
										}
									}
								}
							}
							{
								Entity _ent = entity;
								if (_ent instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) _ent).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											((Slot) ((Map) invobj).get((int) (2))).decrStackSize((int) (32));
											_current.detectAndSendChanges();
										}
									}
								}
							}
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(CarboniteItem.block, (int) (1));
										_setstack.setCount((int) ((new Object() {
											public int getAmount(int sltid) {
												if (entity instanceof ServerPlayerEntity) {
													Container _current = ((ServerPlayerEntity) entity).openContainer;
													if (_current instanceof Supplier) {
														Object invobj = ((Supplier) _current).get();
														if (invobj instanceof Map) {
															ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
															if (stack != null)
																return stack.getCount();
														}
													}
												}
												return 0;
											}
										}.getAmount((int) (3))) + 64));
										((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
					}
				}
				if (((new Object() {
					public ItemStack getItemStack(int sltid) {
						Entity _ent = entity;
						if (_ent instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) _ent).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									return ((Slot) ((Map) invobj).get(sltid)).getStack();
								}
							}
						}
						return ItemStack.EMPTY;
					}
				}.getItemStack((int) (0))).getItem() == new ItemStack(Items.COAL, (int) (1)).getItem())) {
					if (((new Object() {
						public ItemStack getItemStack(int sltid) {
							Entity _ent = entity;
							if (_ent instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) _ent).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (1))).getItem() == new ItemStack(CarboneItem.block, (int) (1)).getItem())) {
						if (((new Object() {
							public ItemStack getItemStack(int sltid) {
								Entity _ent = entity;
								if (_ent instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) _ent).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											return ((Slot) ((Map) invobj).get(sltid)).getStack();
										}
									}
								}
								return ItemStack.EMPTY;
							}
						}.getItemStack((int) (2))).getItem() == new ItemStack(Items.IRON_INGOT, (int) (1)).getItem())) {
							{
								Entity _ent = entity;
								if (_ent instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) _ent).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (32));
											_current.detectAndSendChanges();
										}
									}
								}
							}
							{
								Entity _ent = entity;
								if (_ent instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) _ent).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											((Slot) ((Map) invobj).get((int) (1))).decrStackSize((int) (32));
											_current.detectAndSendChanges();
										}
									}
								}
							}
							{
								Entity _ent = entity;
								if (_ent instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) _ent).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											((Slot) ((Map) invobj).get((int) (2))).decrStackSize((int) (32));
											_current.detectAndSendChanges();
										}
									}
								}
							}
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(CarboniteItem.block, (int) (1));
										_setstack.setCount((int) ((new Object() {
											public int getAmount(int sltid) {
												if (entity instanceof ServerPlayerEntity) {
													Container _current = ((ServerPlayerEntity) entity).openContainer;
													if (_current instanceof Supplier) {
														Object invobj = ((Supplier) _current).get();
														if (invobj instanceof Map) {
															ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
															if (stack != null)
																return stack.getCount();
														}
													}
												}
												return 0;
											}
										}.getAmount((int) (3))) + 64));
										((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
					}
				}
				if (((new Object() {
					public ItemStack getItemStack(int sltid) {
						Entity _ent = entity;
						if (_ent instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) _ent).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									return ((Slot) ((Map) invobj).get(sltid)).getStack();
								}
							}
						}
						return ItemStack.EMPTY;
					}
				}.getItemStack((int) (0))).getItem() == new ItemStack(Items.IRON_INGOT, (int) (1)).getItem())) {
					if (((new Object() {
						public ItemStack getItemStack(int sltid) {
							Entity _ent = entity;
							if (_ent instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) _ent).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (1))).getItem() == new ItemStack(CarboneItem.block, (int) (1)).getItem())) {
						if (((new Object() {
							public ItemStack getItemStack(int sltid) {
								Entity _ent = entity;
								if (_ent instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) _ent).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											return ((Slot) ((Map) invobj).get(sltid)).getStack();
										}
									}
								}
								return ItemStack.EMPTY;
							}
						}.getItemStack((int) (2))).getItem() == new ItemStack(Items.COAL, (int) (1)).getItem())) {
							{
								Entity _ent = entity;
								if (_ent instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) _ent).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (32));
											_current.detectAndSendChanges();
										}
									}
								}
							}
							{
								Entity _ent = entity;
								if (_ent instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) _ent).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											((Slot) ((Map) invobj).get((int) (1))).decrStackSize((int) (32));
											_current.detectAndSendChanges();
										}
									}
								}
							}
							{
								Entity _ent = entity;
								if (_ent instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) _ent).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											((Slot) ((Map) invobj).get((int) (2))).decrStackSize((int) (32));
											_current.detectAndSendChanges();
										}
									}
								}
							}
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(CarboniteItem.block, (int) (1));
										_setstack.setCount((int) ((new Object() {
											public int getAmount(int sltid) {
												if (entity instanceof ServerPlayerEntity) {
													Container _current = ((ServerPlayerEntity) entity).openContainer;
													if (_current instanceof Supplier) {
														Object invobj = ((Supplier) _current).get();
														if (invobj instanceof Map) {
															ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
															if (stack != null)
																return stack.getCount();
														}
													}
												}
												return 0;
											}
										}.getAmount((int) (3))) + 64));
										((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
					}
				}
				if (((new Object() {
					public ItemStack getItemStack(int sltid) {
						Entity _ent = entity;
						if (_ent instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) _ent).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									return ((Slot) ((Map) invobj).get(sltid)).getStack();
								}
							}
						}
						return ItemStack.EMPTY;
					}
				}.getItemStack((int) (0))).getItem() == new ItemStack(Items.IRON_INGOT, (int) (1)).getItem())) {
					if (((new Object() {
						public ItemStack getItemStack(int sltid) {
							Entity _ent = entity;
							if (_ent instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) _ent).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (1))).getItem() == new ItemStack(Items.COAL, (int) (1)).getItem())) {
						if (((new Object() {
							public ItemStack getItemStack(int sltid) {
								Entity _ent = entity;
								if (_ent instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) _ent).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											return ((Slot) ((Map) invobj).get(sltid)).getStack();
										}
									}
								}
								return ItemStack.EMPTY;
							}
						}.getItemStack((int) (2))).getItem() == new ItemStack(CarboneItem.block, (int) (1)).getItem())) {
							{
								Entity _ent = entity;
								if (_ent instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) _ent).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (32));
											_current.detectAndSendChanges();
										}
									}
								}
							}
							{
								Entity _ent = entity;
								if (_ent instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) _ent).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											((Slot) ((Map) invobj).get((int) (1))).decrStackSize((int) (32));
											_current.detectAndSendChanges();
										}
									}
								}
							}
							{
								Entity _ent = entity;
								if (_ent instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) _ent).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											((Slot) ((Map) invobj).get((int) (2))).decrStackSize((int) (32));
											_current.detectAndSendChanges();
										}
									}
								}
							}
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(CarboniteItem.block, (int) (1));
										_setstack.setCount((int) ((new Object() {
											public int getAmount(int sltid) {
												if (entity instanceof ServerPlayerEntity) {
													Container _current = ((ServerPlayerEntity) entity).openContainer;
													if (_current instanceof Supplier) {
														Object invobj = ((Supplier) _current).get();
														if (invobj instanceof Map) {
															ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
															if (stack != null)
																return stack.getCount();
														}
													}
												}
												return 0;
											}
										}.getAmount((int) (3))) + 64));
										((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
					}
				}
				if (((new Object() {
					public ItemStack getItemStack(int sltid) {
						Entity _ent = entity;
						if (_ent instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) _ent).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									return ((Slot) ((Map) invobj).get(sltid)).getStack();
								}
							}
						}
						return ItemStack.EMPTY;
					}
				}.getItemStack((int) (0))).getItem() == new ItemStack(Items.COAL, (int) (1)).getItem())) {
					if (((new Object() {
						public ItemStack getItemStack(int sltid) {
							Entity _ent = entity;
							if (_ent instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) _ent).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (1))).getItem() == new ItemStack(Items.IRON_INGOT, (int) (1)).getItem())) {
						if (((new Object() {
							public ItemStack getItemStack(int sltid) {
								Entity _ent = entity;
								if (_ent instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) _ent).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											return ((Slot) ((Map) invobj).get(sltid)).getStack();
										}
									}
								}
								return ItemStack.EMPTY;
							}
						}.getItemStack((int) (2))).getItem() == new ItemStack(CarboneItem.block, (int) (1)).getItem())) {
							{
								Entity _ent = entity;
								if (_ent instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) _ent).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (32));
											_current.detectAndSendChanges();
										}
									}
								}
							}
							{
								Entity _ent = entity;
								if (_ent instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) _ent).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											((Slot) ((Map) invobj).get((int) (1))).decrStackSize((int) (32));
											_current.detectAndSendChanges();
										}
									}
								}
							}
							{
								Entity _ent = entity;
								if (_ent instanceof ServerPlayerEntity) {
									Container _current = ((ServerPlayerEntity) _ent).openContainer;
									if (_current instanceof Supplier) {
										Object invobj = ((Supplier) _current).get();
										if (invobj instanceof Map) {
											((Slot) ((Map) invobj).get((int) (2))).decrStackSize((int) (32));
											_current.detectAndSendChanges();
										}
									}
								}
							}
							if (entity instanceof PlayerEntity) {
								Container _current = ((PlayerEntity) entity).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										ItemStack _setstack = new ItemStack(CarboniteItem.block, (int) (1));
										_setstack.setCount((int) ((new Object() {
											public int getAmount(int sltid) {
												if (entity instanceof ServerPlayerEntity) {
													Container _current = ((ServerPlayerEntity) entity).openContainer;
													if (_current instanceof Supplier) {
														Object invobj = ((Supplier) _current).get();
														if (invobj instanceof Map) {
															ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
															if (stack != null)
																return stack.getCount();
														}
													}
												}
												return 0;
											}
										}.getAmount((int) (3))) + 64));
										((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
										_current.detectAndSendChanges();
									}
								}
							}
						}
					}
				}
			}
			if ((((new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
								if (stack != null)
									return stack.getCount();
							}
						}
					}
					return 0;
				}
			}.getAmount((int) (0))) >= 64) && ((new Object() {
				public int getAmount(int sltid) {
					if (entity instanceof ServerPlayerEntity) {
						Container _current = ((ServerPlayerEntity) entity).openContainer;
						if (_current instanceof Supplier) {
							Object invobj = ((Supplier) _current).get();
							if (invobj instanceof Map) {
								ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
								if (stack != null)
									return stack.getCount();
							}
						}
					}
					return 0;
				}
			}.getAmount((int) (1))) >= 64))) {
				if (((new Object() {
					public ItemStack getItemStack(int sltid) {
						Entity _ent = entity;
						if (_ent instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) _ent).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									return ((Slot) ((Map) invobj).get(sltid)).getStack();
								}
							}
						}
						return ItemStack.EMPTY;
					}
				}.getItemStack((int) (0))).getItem() == new ItemStack(ReinforiumItemItem.block, (int) (1)).getItem())) {
					if (((new Object() {
						public ItemStack getItemStack(int sltid) {
							Entity _ent = entity;
							if (_ent instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) _ent).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (1))).getItem() == new ItemStack(CarboniteItem.block, (int) (1)).getItem())) {
						{
							Entity _ent = entity;
							if (_ent instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) _ent).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (64));
										_current.detectAndSendChanges();
									}
								}
							}
						}
						{
							Entity _ent = entity;
							if (_ent instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) _ent).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										((Slot) ((Map) invobj).get((int) (1))).decrStackSize((int) (64));
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if (entity instanceof PlayerEntity) {
							Container _current = ((PlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									ItemStack _setstack = new ItemStack(RenforcecarboniteItem.block, (int) (1));
									_setstack.setCount((int) ((new Object() {
										public int getAmount(int sltid) {
											if (entity instanceof ServerPlayerEntity) {
												Container _current = ((ServerPlayerEntity) entity).openContainer;
												if (_current instanceof Supplier) {
													Object invobj = ((Supplier) _current).get();
													if (invobj instanceof Map) {
														ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
														if (stack != null)
															return stack.getCount();
													}
												}
											}
											return 0;
										}
									}.getAmount((int) (3))) + 64));
									((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
									_current.detectAndSendChanges();
								}
							}
						}
					}
				}
				if (((new Object() {
					public ItemStack getItemStack(int sltid) {
						Entity _ent = entity;
						if (_ent instanceof ServerPlayerEntity) {
							Container _current = ((ServerPlayerEntity) _ent).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									return ((Slot) ((Map) invobj).get(sltid)).getStack();
								}
							}
						}
						return ItemStack.EMPTY;
					}
				}.getItemStack((int) (1))).getItem() == new ItemStack(ReinforiumItemItem.block, (int) (1)).getItem())) {
					if (((new Object() {
						public ItemStack getItemStack(int sltid) {
							Entity _ent = entity;
							if (_ent instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) _ent).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										return ((Slot) ((Map) invobj).get(sltid)).getStack();
									}
								}
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) (0))).getItem() == new ItemStack(CarboniteItem.block, (int) (1)).getItem())) {
						{
							Entity _ent = entity;
							if (_ent instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) _ent).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										((Slot) ((Map) invobj).get((int) (0))).decrStackSize((int) (64));
										_current.detectAndSendChanges();
									}
								}
							}
						}
						{
							Entity _ent = entity;
							if (_ent instanceof ServerPlayerEntity) {
								Container _current = ((ServerPlayerEntity) _ent).openContainer;
								if (_current instanceof Supplier) {
									Object invobj = ((Supplier) _current).get();
									if (invobj instanceof Map) {
										((Slot) ((Map) invobj).get((int) (1))).decrStackSize((int) (64));
										_current.detectAndSendChanges();
									}
								}
							}
						}
						if (entity instanceof PlayerEntity) {
							Container _current = ((PlayerEntity) entity).openContainer;
							if (_current instanceof Supplier) {
								Object invobj = ((Supplier) _current).get();
								if (invobj instanceof Map) {
									ItemStack _setstack = new ItemStack(RenforcecarboniteItem.block, (int) (1));
									_setstack.setCount((int) ((new Object() {
										public int getAmount(int sltid) {
											if (entity instanceof ServerPlayerEntity) {
												Container _current = ((ServerPlayerEntity) entity).openContainer;
												if (_current instanceof Supplier) {
													Object invobj = ((Supplier) _current).get();
													if (invobj instanceof Map) {
														ItemStack stack = ((Slot) ((Map) invobj).get(sltid)).getStack();;
														if (stack != null)
															return stack.getCount();
													}
												}
											}
											return 0;
										}
									}.getAmount((int) (3))) + 64));
									((Slot) ((Map) invobj).get((int) (3))).putStack(_setstack);
									_current.detectAndSendChanges();
								}
							}
						}
					}
				}
			}
		}
	}
}
