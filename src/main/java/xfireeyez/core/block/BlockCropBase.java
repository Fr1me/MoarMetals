package xfireeyez.core.block;

import net.minecraft.block.BlockCrops;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockCropBase extends BlockCrops {
    
    private Item seed;
    private Item crop;
    
    public BlockCropBase(String name, CreativeTabs tab, Item seed, Item drop) {
    	setCreativeTab(tab);
        this.seed = seed;
    	crop = drop;
        
        setUnlocalizedName(name);
        setRegistryName(name);
    }
    
    @Override
    protected Item getSeed() {
        return seed;
    }
    
    @Override
    protected Item getCrop() {
        return crop;
    }

}