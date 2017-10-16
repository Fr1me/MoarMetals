package xfireeyez.core.block;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import xfireeyez.core.util.IMetaName;

public class ItemBlockVariants extends ItemBlock
{
	public ItemBlockVariants(Block block) 
	{
		super(block);
		setHasSubtypes(true);
		setMaxDamage(0);
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		return ((IMetaName) this.block).getSpecialName(stack) + "_" + super.getUnlocalizedName();
	}
	
	@Override
	public int getMetadata(int damage) 
	{
		return damage;
	}	
}
