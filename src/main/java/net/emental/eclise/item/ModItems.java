package net.emental.eclise.item;

import net.emental.eclise.Eclise;
import net.emental.eclise.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item PEA = registerItem("pea" ,
            new Item(new FabricItemSettings().maxCount(16).group(ModItemGroup.PEA).food(ModFoodComponents.PEA)));
    public static final Item ICE_PEA = registerItem("ice_pea" ,
            new Item(new FabricItemSettings().maxCount(16).group(ModItemGroup.PEA)));
    public static final Item GOO_PEA = registerItem("goo_pea" ,
            new Item(new FabricItemSettings().maxCount(16).group(ModItemGroup.PEA)));
    public static final Item ELECTRIC_PEA = registerItem("electric_pea" ,
            new Item(new FabricItemSettings().maxCount(16).group(ModItemGroup.PEA)));
    public static final Item SHADOW_PEA = registerItem("shadow_pea" ,
            new Item(new FabricItemSettings().maxCount(16).group(ModItemGroup.PEA)));

    public static final Item PEA_SEEDS = registerItem("pea_seeds" ,
            new AliasedBlockItem(ModBlocks.PEA_CROP, new FabricItemSettings().maxCount(64).group(ModItemGroup.PEA)));
    public static final Item COOKED_PEA = registerItem("cooked_pea" ,
            new Item(new FabricItemSettings().maxCount(16).group(ModItemGroup.PEA).food(ModFoodComponents.COOKED_PEA)));



private static Item registerItem(String name, Item item) {
    return Registry.register(Registry.ITEM, new Identifier(Eclise.MOD_ID, name), item);
}

    public static void registerModItems() {
        Eclise.LOGGER.debug("Registering Mod Item(s) for" + Eclise.MOD_ID);
    }
}
