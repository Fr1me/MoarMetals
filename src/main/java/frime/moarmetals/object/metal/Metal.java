package frime.moarmetals.object.metal;

import frime.moarmetals.MoarMetals;
import frime.moarmetals.init.Metals;
import frime.moarmetals.object.item.ItemBase;
import frime.moarmetals.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class Metal {
	
	public Metal(String name, Material material) {
		 new MetalItemIngot(name);
		 new MetalBlock(name, material);
	}
	
	//Creates the metal ingot
	public static class MetalItemIngot extends Item implements IHasModel {
		
		public MetalItemIngot(String name) {
			setUnlocalizedName(name + "_ingot");
			setRegistryName(name + "_ingot");
			setCreativeTab(CreativeTabs.MATERIALS);
			
			Metals.ITEMS.add(this);
		}

		@Override
		public void registerModels() {
			MoarMetals.proxy.registerItemRenderer(this, 0, "inventory");
			
		}
		
	}
	
	//Creates the metal block
	public static class MetalBlock extends Block implements IHasModel {

		public MetalBlock(String name, Material material) {
			super(Material.IRON);
			setUnlocalizedName(name + "_block");
			setRegistryName(name + "_block");
			setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
					
			Metals.BLOCKS.add(this);
			Metals.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		}

		@Override
		public void registerModels() {
			MoarMetals.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
					
				}
				
			}

}
