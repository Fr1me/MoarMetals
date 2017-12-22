package net.moarmetals.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.moarmetals.metal.Metal;

public class Tabs {
	
	    public static CreativeTabs combat;
	    public static CreativeTabs items;
	    public static CreativeTabs machines;
	    public static CreativeTabs tools;
	    public static CreativeTabs worldgen;
	    public static CreativeTabs metals;

	    public static void initTabs() {
	    	metals = new CreativeTabs("metals_mm"){
	            @Override
	            public Item getTabIconItem() {
	                return Metals.lithium.getIngot();
	            }
	        };
	    	
//	        combat = new CreativeTabs("combat_mm"){
//	            @Override
//	            public Item getTabIconItem() {
//	                return;
//	            } 
//	        };
//	        
//	        tools = new CreativeTabs("tools_mm"){
//	            @Override
//	            public Item getTabIconItem() {
//	                return;
//	            }
//	        };
//	        worldgen = new CreativeTabs("worldgen_mm"){
//	            @Override
//	            public Item getTabIconItem() {
//	                return;
//	            }
//	        };
	    }

}
