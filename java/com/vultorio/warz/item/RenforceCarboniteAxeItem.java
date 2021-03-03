
package com.vultorio.warz.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import com.vultorio.warz.itemgroup.WarzItemGroup;
import com.vultorio.warz.WarZModElements;

@WarZModElements.ModElement.Tag
public class RenforceCarboniteAxeItem extends WarZModElements.ModElement {
	@ObjectHolder("war_z:renforce_carbonite_axe")
	public static final Item block = null;
	public RenforceCarboniteAxeItem(WarZModElements instance) {
		super(instance, 37);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1300;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 30;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ReinforceCarboniteIngotItem.block, (int) (1)));
			}
		}, 1, -1f, new Item.Properties().group(WarzItemGroup.tab)) {
		}.setRegistryName("renforce_carbonite_axe"));
	}
}
