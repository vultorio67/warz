
package com.vultorio.warz.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import com.vultorio.warz.itemgroup.WarzItemGroup;
import com.vultorio.warz.WarZModElements;

@WarZModElements.ModElement.Tag
public class RenforceCarboniteHoeItem extends WarZModElements.ModElement {
	@ObjectHolder("war_z:renforce_carbonite_hoe")
	public static final Item block = null;
	public RenforceCarboniteHoeItem(WarZModElements instance) {
		super(instance, 39);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 1400;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
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
		}, 0, -3f, new Item.Properties().group(WarzItemGroup.tab)) {
		}.setRegistryName("renforce_carbonite_hoe"));
	}
}
