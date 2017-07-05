package net.moarthings.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MTCreativeTabs {

    public static CreativeTabs blocks;
    public static CreativeTabs decoration;
    public static CreativeTabs combat;
    public static CreativeTabs items;
    public static CreativeTabs machines;
    public static CreativeTabs tools;
    public static CreativeTabs worldgen;
    public static CreativeTabs metals;
    public static CreativeTabs alloys;

    public static void initTabs(){
        blocks = new CreativeTabs("blocks_mt"){
            @Override
            public ItemStack getTabIconItem() {
                return new ItemStack(Item.getItemFromBlock(MTBlocks.alnicoBlock));
            }
        };
        decoration = new CreativeTabs("decoration_mt"){
        	@Override
        	public ItemStack getTabIconItem() {
        		return new ItemStack(Items.ITEM_FRAME);
        	}
        };
        combat = new CreativeTabs("combat_mt"){
            @Override
            public ItemStack getTabIconItem() {
                return new ItemStack(Items.IRON_SWORD);
            } 
        };
        items = new CreativeTabs("items_mt"){
            @Override
            public ItemStack getTabIconItem() {
                return new ItemStack(Items.STICK);
            }
        };
        machines = new CreativeTabs("machines_mt"){
            @Override
            public ItemStack getTabIconItem() {
                return new ItemStack(Item.getItemFromBlock(Blocks.FURNACE));
            }

        };
        tools = new CreativeTabs("tools_mt"){
            @Override
            public ItemStack getTabIconItem() {
                return new ItemStack(Items.GOLDEN_PICKAXE);
            }
        };
        worldgen = new CreativeTabs("worldgen_mt"){
            @Override
            public ItemStack getTabIconItem() {
                return new ItemStack(Item.getItemFromBlock(Blocks.DIAMOND_ORE));
            }
        };
        metals = new CreativeTabs("metals_mt"){
            @Override
            public ItemStack getTabIconItem() {
                return new ItemStack(MTItems.franciumIngot);
            }
        };
        alloys = new CreativeTabs("alloys_mt"){
            @Override
            public ItemStack getTabIconItem() {
                return new ItemStack(MTItems.alnicoIngot);
            }
        };
    }

}