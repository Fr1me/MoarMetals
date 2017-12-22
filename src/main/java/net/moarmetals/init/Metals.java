package net.moarmetals.init;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.moarmetals.Reference;
import net.moarmetals.metal.Metal;

public class Metals {
	
	public static Metal lithium = new Metal("lithium", 3, 1274, 8.0F, 3.0F, 10);
//	public static Metal francium = new Metal("francium");
	
	
	public static void createMetals() {
		createMetal(lithium.getBlock(), lithium.getIngot(), lithium.getNugget());
//		createMetal(francium.getBlock(), francium.getIngot(), francium.getNugget());
		
		
	}
	
	public static void createMetal(Block block, Item ingot, Item nugget) {
		//Blocks
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setUnlocalizedName(block.getUnlocalizedName()).setRegistryName(block.getRegistryName()));
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID), "inventory"));
		
		//Items
		GameRegistry.register(ingot);
		GameRegistry.register(nugget);
		ModelLoader.setCustomModelResourceLocation(ingot, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, ingot.getUnlocalizedName().substring(5)), "inventory"));
		ModelLoader.setCustomModelResourceLocation(nugget, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, nugget.getUnlocalizedName().substring(5)), "inventory"));
		
	}
}
