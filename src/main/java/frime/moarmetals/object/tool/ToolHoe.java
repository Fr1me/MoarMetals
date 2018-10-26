package frime.moarmetals.object.tool;

import frime.moarmetals.MoarMetals;
import frime.moarmetals.init.Items;
import frime.moarmetals.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe implements IHasModel {

	public ToolHoe(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.TOOLS);
		
		Items.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		MoarMetals.proxy.registerRenderer(this, 0, "inventory");
	}

}
