package frime.moarmetals.init;

import java.util.ArrayList;
import java.util.List;

import frime.moarmetals.object.block.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Blocks {
	
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block COPPER_BLOCK = new BlockBase("copper_block", Material.IRON, CreativeTabs.BUILDING_BLOCKS);
	public static final Block COPPER_ORE = new BlockBase("copper_ore", Material.ROCK, CreativeTabs.BUILDING_BLOCKS);

}
