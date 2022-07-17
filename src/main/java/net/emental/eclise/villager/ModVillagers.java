package net.emental.eclise.villager;

import com.google.common.collect.ImmutableSet;
import net.emental.eclise.Eclise;
import net.emental.eclise.block.ModBlocks;
import net.emental.eclise.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {


    public static final PointOfInterestType PEA_POI = registerPOI("pea_poi", ModBlocks.PEA_TABLE);
    public static final VillagerProfession PEA_VETERAN = registerProfession("peaveteran",
            RegistryKey.of(Registry.POINT_OF_INTEREST_TYPE_KEY, new Identifier(Eclise.MOD_ID, "pea_poi")));

    public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type){
        return Registry.register(Registry.VILLAGER_PROFESSION, new Identifier(Eclise.MOD_ID, name),
                VillagerProfessionBuilder.create().id(new Identifier(Eclise.MOD_ID, name)).workstation(type)
                        .workSound(SoundEvents.ENTITY_VILLAGER_WORK_FARMER).build());

    }

    public static PointOfInterestType registerPOI(String name, Block block){
        return PointOfInterestHelper.register(new Identifier(Eclise.MOD_ID, name),
                1, 1, ImmutableSet.copyOf(block.getStateManager().getStates()));
    }


    public static void registerVillagers() {
        Eclise.LOGGER.debug("registering villagers for" + Eclise.MOD_ID);

    }

    public static void registerTrades(){
        TradeOfferHelper.registerVillagerOffers( PEA_VETERAN, 1,
                factories -> {
                factories.add(((entity, random) -> new TradeOffer(
                        new ItemStack(Items.EMERALD, 1),
                        new ItemStack(ModItems.PEA_SEEDS, 3),
                    6, 2, 0.02f
                  )));
                });

    }

}