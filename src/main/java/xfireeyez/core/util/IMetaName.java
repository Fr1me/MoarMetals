package xfireeyez.core.util;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public interface IMetaName {
	
	public String getSpecialName(ItemStack stack);

	void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items);

}
