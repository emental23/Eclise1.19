package net.emental.eclise;

import net.emental.eclise.block.ModBlocks;
import net.emental.eclise.effect.ModEffects;
import net.emental.eclise.item.ModItems;
import net.emental.eclise.potion.ModPotions;
import net.emental.eclise.villager.ModVillagers;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Eclise implements ModInitializer {
	public static final String MOD_ID = "eclise";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModEffects.registerEffects();
		ModPotions.registerPotion();
		ModVillagers.registerVillagers();
		ModVillagers.registerTrades();
	}
}
