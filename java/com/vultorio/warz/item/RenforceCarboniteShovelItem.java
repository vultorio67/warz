
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
public class RenforceCarboniteShovelItem extends WarZModElements.ModElement {
	@ObjectHolder("war_z:renforce_carbonite_shovel")
	public static final Item block = null;
	public RenforceCarboniteShovelItem(WarZModElements instance) {
		super(instance, 38);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 1300;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 3f;
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
		}, 1, -3f, new Item.Properties().group(WarzItemGroup.tab)) {
		}.setRegistryName("renforce_carbonite_shovel"));
	}
}
