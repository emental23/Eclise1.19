package net.emental.eclise.block;

import net.emental.eclise.Eclise;
import net.emental.eclise.block.custom.PeaCropBlock;
import net.emental.eclise.item.ModItemGroup;
import net.emental.eclise.item.ModItems;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block PEA_BLOCK = registerBlock("pea_block",
            new Block(FabricBlockSettings.of(Material.SOIL).strength(2f).requiresTool()), ModItemGroup.PEA);
    public static final Block ICE_PEA_BLOCK = registerBlock("ice_pea_block",
            new Block(FabricBlockSettings.of(Material.SOIL).strength(3f).requiresTool().slipperiness(1f).nonOpaque()), ModItemGroup.PEA);
    public static final Block PEA_TABLE = registerBlock("pea_table",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(1f)), ModItemGroup.PEA);
    public static final Block PEA_CROP = registerBlockWithoutItem("pea_crop",
            new PeaCropBlock(FabricBlockSettings.copy(Blocks.WHEAT)));

    private static Block registerBlockWithoutItem(String name, Block block){
        return  Registry.register(Registry.BLOCK , new Identifier(Eclise.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block, ItemGroup tab){
        registerBlockItem(name, block, tab);
        return  Registry.register(Registry.BLOCK , new Identifier(Eclise.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM, new Identifier(Eclise.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }




    public static void  registerModBlocks() {
        Eclise.LOGGER.debug("Registering MobBlock(s)" + Eclise.MOD_ID);
    }
}
/*
{
  "parent": "minecraft:block/cube",
  "textures": {
    "down": "minecraft:block/oak_planks",
    "east": "minecraft:block/crafting_table_side",
    "north": "minecraft:block/crafting_table_front",
    "particle": "minecraft:block/crafting_table_front",
    "south": "minecraft:block/crafting_table_side",
    "up": "minecraft:block/crafting_table_top",
    "west": "minecraft:block/crafting_table_front"
  }
}
 */
