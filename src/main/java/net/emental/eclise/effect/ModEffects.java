package net.emental.eclise.effect;

import net.emental.eclise.Eclise;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEffects {
    public static StatusEffect PARALYZE;

    public static StatusEffect registerStatusEffect(String name){
        return Registry.register(Registry.STATUS_EFFECT, new Identifier(Eclise.MOD_ID, name),
                new ParalyzeEffect(StatusEffectCategory.HARMFUL, 989020));
    }
    public static void registerEffects() {
    PARALYZE = registerStatusEffect("paralyze");

    }
}
