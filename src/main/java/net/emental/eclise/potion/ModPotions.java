package net.emental.eclise.potion;

import net.emental.eclise.Eclise;
import net.emental.eclise.effect.ModEffects;
import net.emental.eclise.item.ModItems;
import net.emental.eclise.mixin.BrewingRecipeRegistryMixin;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModPotions {
    public static Potion PARALYZE_POTION;

    public static Potion registerPotion(String name) {
        return Registry.register(Registry.POTION, new Identifier(Eclise.MOD_ID, name),
                new Potion(new StatusEffectInstance(ModEffects.PARALYZE, 600, 0 )));
    }
    public static void registerPotion(){

        PARALYZE_POTION = registerPotion("paralyze_potion");

        registerPotionRecipes();
    }

    public static void registerPotionRecipes() {
        BrewingRecipeRegistryMixin.invokeRegisterPotionRecipe(Potions.AWKWARD, ModItems.COOKED_PEA,

                ModPotions.PARALYZE_POTION);


    }
}
