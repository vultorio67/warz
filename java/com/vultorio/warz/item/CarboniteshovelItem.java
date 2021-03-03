
package com.vultorio.warz.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.vultorio.warz.itemgroup.WarzItemGroup;
import com.vultorio.warz.WarZModElements;

@WarZModElements.ModElement.Tag
public class CarboniteshovelItem extends WarZModElements.ModElement {
	@ObjectHolder("war_z:carboniteshovel")
	public static final Item block = null;
	public CarboniteshovelItem(WarZModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 350;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CarboniteingotItem.block, (int) (1)));
			}
		}, 1, -2f, new Item.Properties().group(WarzItemGroup.tab)) {
		}.setRegistryName("carboniteshovel"));
	}
}
