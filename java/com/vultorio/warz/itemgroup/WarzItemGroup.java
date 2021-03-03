
package com.vultorio.warz.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import com.vultorio.warz.item.CarboneItem;
import com.vultorio.warz.WarZModElements;

@WarZModElements.ModElement.Tag
public class WarzItemGroup extends WarZModElements.ModElement {
	public WarzItemGroup(WarZModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabwarz") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CarboneItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
