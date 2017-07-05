package net.moarthings.block;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.moarthings.init.MTCreativeTabs;
import xfireeyez.core.block.BlockBase;

public class BlockMetalBase extends BlockBase {

	public BlockMetalBase(String name, CreativeTabs tab, float hardness, float resistance, String harvestTool, int harvestLevel, Material material) {
		super(name, MTCreativeTabs.metals, 6.0F, 24.0F, "pickaxe", 1, Material.IRON);
	}

}
