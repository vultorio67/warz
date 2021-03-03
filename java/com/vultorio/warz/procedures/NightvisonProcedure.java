package com.vultorio.warz.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import com.vultorio.warz.WarZModElements;
import com.vultorio.warz.WarZMod;

@WarZModElements.ModElement.Tag
public class NightvisonProcedure extends WarZModElements.ModElement {
	public NightvisonProcedure(WarZModElements instance) {
		super(instance, 51);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				WarZMod.LOGGER.warn("Failed to load dependency entity for procedure Nightvison!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, (int) 20, (int) 1));
	}
}
