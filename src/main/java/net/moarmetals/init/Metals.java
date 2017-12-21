package net.moarmetals.init;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.moarmetals.metal.Metal;
import xfireeyez.core.Reference;

public class Metals {
	
	public static Metal lithium = new Metal("lithium");
	
	
	public static void createMetals() {
		createMetal(lithium.getBlock(), lithium.getItem());
		
	}
	
	public static void createMetal(Block block, Item item) {
		//Blocks
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID), "inventory"));
		
		//Items
		GameRegistry.register(item);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
		
	}
}
