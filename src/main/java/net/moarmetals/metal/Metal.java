package net.moarmetals.metal;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.moarmetals.Reference;
import net.moarmetals.init.Tabs;

public class Metal {
	
	public static MetalItem item;
	public static MetalBlock block;

	public Metal(String name) {
		this.item = new MetalItem(name);
		this.block = new MetalBlock(name);
	}
	
	public static Block getBlock() {
		return block;
	}
	
	public static Item getItem() {
		return item;
	}
	
	public static class MetalItem extends Item {
	
		public MetalItem(String name) {
			super();
			setUnlocalizedName(name + "_ingot");
			setRegistryName(new ResourceLocation(Reference.MODID, name + "_ingot"));
			setCreativeTab(CreativeTabs.COMBAT);
		}
	}
	
	public static class MetalBlock extends Block {

		public MetalBlock(String name) {
			super(Material.IRON);
			setUnlocalizedName(name + "_block");
			setRegistryName(new ResourceLocation(Reference.MODID, name + "_block"));
			setCreativeTab(CreativeTabs.COMBAT);
		}
		
	}

}
