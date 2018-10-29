package frime.moarmetals.init;

import java.util.ArrayList;
import java.util.List;

import frime.moarmetals.object.block.BlockBase;
import frime.moarmetals.object.item.ItemBase;
import frime.moarmetals.object.metal.Metal;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Metals {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
//	public static final Item COPPER_INGOT = new ItemBase("copper_ingot", CreativeTabs.MATERIALS);
//	
//	public static final Block COPPER_BLOCK = new BlockBase("copper_block", Material.IRON, CreativeTabs.BUILDING_BLOCKS);
	
	public static final Metal ALUMINIUM = new Metal("aluminium", Material.IRON);
	public static final Metal COPPER = new Metal("copper", Material.IRON);

}
