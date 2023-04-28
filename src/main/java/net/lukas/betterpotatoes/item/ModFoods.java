package net.lukas.betterpotatoes.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties SPEED_POTATO = (new FoodProperties.Builder()).fast().nutrition(1).saturationMod(0.5F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 2), 1F).build();
}
