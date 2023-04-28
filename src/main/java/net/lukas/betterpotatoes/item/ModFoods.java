package net.lukas.betterpotatoes.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties SPEED_POTATO = (new FoodProperties.Builder()).fast().alwaysEat().nutrition(4).saturationMod(1F).effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 2), 1F).build();
    public static final FoodProperties GOLDEN_POTATO = (new FoodProperties.Builder()).fast().alwaysEat().nutrition(4).saturationMod(2F).effect(new MobEffectInstance(MobEffects.ABSORPTION, 3600, 4), 1F).build();
    public static final FoodProperties STRENGTH_POTATO = (new FoodProperties.Builder()).fast().alwaysEat().nutrition(4).saturationMod(2F).effect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1800, 1), 1F).build();
}
