package net.emental.eclise.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent PEA = new FoodComponent.Builder().hunger(3).saturationModifier(1.2f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 300, 0), 1.0f).build();
    public static final FoodComponent COOKED_PEA = new FoodComponent.Builder().hunger(5).saturationModifier(1.2f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 300, 0), 1.0f).build();
}
