package frime.moarmetals.object.item;

import frime.moarmetals.MoarMetals;
import frime.moarmetals.init.Metals;
import frime.moarmetals.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	
	public ItemBase(String name, CreativeTabs tab) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		
		Metals.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		MoarMetals.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
