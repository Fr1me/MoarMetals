package frime.moarmetals.init;

import java.util.ArrayList;
import java.util.List;

import frime.moarmetals.object.item.ItemBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Items {
	
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot", CreativeTabs.MATERIALS);
	
}
