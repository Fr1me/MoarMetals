package net.moarthings.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.moarthings.MoarThings;
import net.moarthings.Reference;
import net.moarthings.block.BlockAlloyBase;
import net.moarthings.block.BlockMetalBase;
import net.moarthings.block.MTPlanks;
import xfireeyez.core.block.BlockBase;
import xfireeyez.core.block.ItemBlockVariants;
import xfireeyez.core.util.Utils;

public class MTBlocks {
	
	//Metal Blocks
	public static Block cobaltBlock;
	public static Block arditeBlock;
	public static Block lithiumBlock;
	public static Block sodiumBlock;
	public static Block potassiumBlock;
	public static Block rubidiumBlock;
	public static Block cesiumBlock;
	public static Block franciumBlock;
	public static Block berylliumBlock;
	public static Block magnesiumBlock;
	public static Block calciumBlock;
	public static Block strontiumBlock;
	public static Block bariumBlock;
	public static Block radiumBlock;
	public static Block planks, leaves, log;
	
	//Alloy Blocks
	public static Block alnicoBlock;
	
	public static void init() {
		
		//Metal Blocks
		cobaltBlock = new BlockMetalBase("cobalt_block");
		arditeBlock = new BlockMetalBase("ardite_block");
		lithiumBlock = new BlockMetalBase("lithium_block");
		sodiumBlock = new BlockMetalBase("sodium_block");
		potassiumBlock = new BlockMetalBase("potassium_block");
		rubidiumBlock = new BlockMetalBase("rubidium_block");
		cesiumBlock = new BlockMetalBase("cesium_block");
		franciumBlock = new BlockMetalBase("francium_block");
		berylliumBlock = new BlockMetalBase("beryllium_block");
		magnesiumBlock = new BlockMetalBase("magnesium_block");
		calciumBlock = new BlockMetalBase("calcium_block");
		strontiumBlock = new BlockMetalBase("strontium_block");
		bariumBlock = new BlockMetalBase("barium_block");
		radiumBlock = new BlockMetalBase("radium_block");
		
		//Alloy Blocks
		alnicoBlock = new BlockAlloyBase("alnico_block");
		
		//Logs
		planks = new MTPlanks("planks");
	}
	
	public static void register() {
		
		//Metal BLocks
		registerBlock(lithiumBlock);
		registerBlock(sodiumBlock);
		registerBlock(potassiumBlock);
		registerBlock(rubidiumBlock);
		registerBlock(cesiumBlock);
		registerBlock(franciumBlock);
		registerBlock(berylliumBlock);
		registerBlock(magnesiumBlock);
		registerBlock(calciumBlock);
		registerBlock(strontiumBlock);
		registerBlock(bariumBlock);
		registerBlock(radiumBlock);
		
		//Alloy Blocks
		registerBlock(alnicoBlock);
		
		//Tree Blocks
		registerBlockWithVariants(planks, new ItemBlockVariants(planks));
		registerBlockWithVariants(log, new ItemBlockVariants(log));
		registerBlockWithVariants(leaves, new ItemBlockVariants(leaves));
//		registerBlockWithVariants(sapling, new ItemBlockVariants(sapling));
		
		//ModLoaders
		if(!Loader.isModLoaded("tconstruct")) {
			registerBlock(cobaltBlock);
			registerBlock(arditeBlock);
			
		}
	}

	public static void registerRenders() {
		
		//Metal BLocks
		registerRender(lithiumBlock, 0, null);
		registerRender(sodiumBlock, 0, null);
		registerRender(potassiumBlock, 0, null);
		registerRender(rubidiumBlock, 0, null);
		registerRender(cesiumBlock, 0, null);
		registerRender(franciumBlock, 0, null);
		registerRender(berylliumBlock, 0, null);
		registerRender(magnesiumBlock, 0, null);
		registerRender(calciumBlock, 0, null);
		registerRender(strontiumBlock, 0, null);
		registerRender(bariumBlock, 0, null);
		registerRender(radiumBlock, 0, null);
		
		//Alloy Blocks
		registerRender(alnicoBlock, 0, null);
		
		//Tree Blocks
		for(int i = 0; i < MTPlanks.EnumType.values().length; i++) {
			registerRender(planks, i, MTPlanks.EnumType.values()[i].getName() + "_planks");
		}
		
		//ModLoaders
		if(!Loader.isModLoaded("tconstruct")) {
			registerRender(cobaltBlock, 0, null);
			registerRender(arditeBlock, 0, null);
			
		}
		
	}
	
	public static void registerBlock (Block block) {
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		Utils.getLogger().info("Registered Block: " + block.getUnlocalizedName().substring(5));
	}
	
	public static void registerBlockWithItem (Block block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		Utils.getLogger().info("Registered Block: " + block.getUnlocalizedName().substring(5));
		GameRegistry.register(itemBlock);
	}
	
	public static void registerBlockWithVariants (Block block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		Utils.getLogger().info("Registered Block: " + block.getUnlocalizedName().substring(5));
		GameRegistry.register(itemBlock);
	}
	
	public static void registerRender(Block block, int meta, String fileName) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(Reference.MODID, fileName), "inventory"));
		Utils.getLogger().info("Registered Render For " + block.getUnlocalizedName().substring(5));
	}
}
