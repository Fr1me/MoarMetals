package net.moarthings.item;

import net.minecraft.creativetab.CreativeTabs;
import net.moarthings.init.MTCreativeTabs;
import xfireeyez.core.item.ItemBase;

public class ItemAlloyBase extends ItemBase {

	public ItemAlloyBase(String name, CreativeTabs tab, boolean effect) {
		super(name, tab, effect);
		setCreativeTab(MTCreativeTabs.alloys);
	}

}
