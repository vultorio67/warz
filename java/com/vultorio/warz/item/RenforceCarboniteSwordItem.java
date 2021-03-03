
package com.vultorio.warz.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import com.vultorio.warz.itemgroup.WarzItemGroup;
import com.vultorio.warz.WarZModElements;

@WarZModElements.ModElement.Tag
public class RenforceCarboniteSwordItem extends WarZModElements.ModElement {
	@ObjectHolder("war_z:renforce_carbonite_sword")
	public static final Item block = null;
	public RenforceCarboniteSwordItem(WarZModElements instance) {
		super(instance, 36);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1300;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 6f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 30;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ReinforceCarboniteIngotItem.block, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(WarzItemGroup.tab)) {
		}.setRegistryName("renforce_carbonite_sword"));
	}
}
