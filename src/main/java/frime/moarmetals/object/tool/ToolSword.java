package frime.moarmetals.object.tool;

import frime.moarmetals.MoarMetals;
import frime.moarmetals.init.Items;
import frime.moarmetals.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel {

	public ToolSword(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.COMBAT);
		
		Items.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		MoarMetals.proxy.registerRenderer(this, 0, "inventory");
	}

}
