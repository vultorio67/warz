
package com.vultorio.warz.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.LivingEntity;
import net.minecraft.block.BlockState;

import java.util.Map;
import java.util.HashMap;

import com.vultorio.warz.procedures.CarboniteHammerBlockDestroyedWithToolProcedure;
import com.vultorio.warz.itemgroup.WarzItemGroup;
import com.vultorio.warz.WarZModElements;

@WarZModElements.ModElement.Tag
public class CarboniteHammerItem extends WarZModElements.ModElement {
	@ObjectHolder("war_z:carbonite_hammer")
	public static final Item block = null;
	public CarboniteHammerItem(WarZModElements instance) {
		super(instance, 26);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 130;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CarboniteingotItem.block, (int) (1)));
			}
		}, 1, -2.0999999999999999f, new Item.Properties().group(WarzItemGroup.tab)) {
			@Override
			public boolean onBlockDestroyed(ItemStack itemstack, World world, BlockState bl, BlockPos pos, LivingEntity entity) {
				boolean retval = super.onBlockDestroyed(itemstack, world, bl, pos, entity);
				int x = pos.getX();
				int y = pos.getY();
				int z = pos.getZ();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					CarboniteHammerBlockDestroyedWithToolProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}
		}.setRegistryName("carbonite_hammer"));
	}
}
