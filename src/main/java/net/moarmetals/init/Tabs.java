package net.moarmetals.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.moarmetals.metal.Metal;

public class Tabs {
	
	    public static CreativeTabs mm;

	    public static void initTabs() {
	    	mm = new CreativeTabs("moarmetals") {
	            @Override
	            public Item getTabIconItem() {
	                return Metals.lithium.getIngot();
	            }
	        };
	    }
	    
}
