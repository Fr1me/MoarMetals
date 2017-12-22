package net.moarmetals.metal;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.moarmetals.Reference;
import net.moarmetals.init.Tabs;

public class Metal {
	
	public static MetalIngot ingot;
	public static MetalNugget nugget;
	public static MetalBlock block;

	public Metal(String name) {
		this.ingot = new MetalIngot(name);
		this.nugget = new MetalNugget(name);
		this.block = new MetalBlock(name);
	}
	
	public static Item getIngot() {
		return ingot;
	}
	
	public static Item getNugget() {
		return nugget;
	}
	
	public static Block getBlock() {
		return block;
	}
	
	public static class MetalIngot extends Item {
	
		public MetalIngot(String name) {
			super();
			setUnlocalizedName(name + "_ingot");
			setRegistryName(new ResourceLocation(Reference.MODID, name + "_ingot"));
			setCreativeTab(Tabs.metals);
		}
	}
	
	public static class MetalNugget extends Item {

		public MetalNugget(String name) {
			super();
			setUnlocalizedName(name + "_nugget");
			setRegistryName(new ResourceLocation(Reference.MODID, name + "_nugget"));
			setCreativeTab(Tabs.metals);
		}
		
	}
	
	public static class MetalBlock extends Block {

		public MetalBlock(String name) {
			super(Material.IRON);
			setUnlocalizedName(name + "_block");
			setRegistryName(new ResourceLocation(Reference.MODID, name + "_block"));
			setCreativeTab(Tabs.metals);
			setSoundType(SoundType.METAL);
		}
		
	}

}
