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
import xfireeyez.core.block.BlockBase;
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
	
	//Alloy Blocks
	public static Block alnicoBlock;
	
	public static void init() {
		
		//Metal Blocks
		cobaltBlock = new BlockMetalBase("cobalt_block", null, 6.0F, 24.0F, null, 0, null);
		arditeBlock = new BlockMetalBase("ardite_block", null, 6.0F, 24.0F, null, 0, null);
		lithiumBlock = new BlockMetalBase("lithium_block", null, 6.0F, 24.0F, null, 0, null);
		sodiumBlock = new BlockMetalBase("sodium_block", null, 6.0F, 24.0F, null, 0, null);
		potassiumBlock = new BlockMetalBase("potassium_block", null, 6.0F, 24.0F, null, 0, null);
		rubidiumBlock = new BlockMetalBase("rubidium_block", null, 6.0F, 24.0F, null, 0, null);
		cesiumBlock = new BlockMetalBase("cesium_block", null, 6.0F, 24.0F, null, 0, null);
		franciumBlock = new BlockMetalBase("francium_block", null, 6.0F, 24.0F, null, 0, null);
		berylliumBlock = new BlockMetalBase("beryllium_block", null, 6.0F, 24.0F, null, 0, null);
		magnesiumBlock = new BlockMetalBase("magnesium_block", null, 6.0F, 24.0F, null, 0, null);
		calciumBlock = new BlockMetalBase("calcium_block", null, 6.0F, 24.0F, null, 0, null);
		strontiumBlock = new BlockMetalBase("strontium_block", null, 6.0F, 24.0F, null, 0, null);
		bariumBlock = new BlockMetalBase("barium_block", null, 6.0F, 24.0F, null, 0, null);
		radiumBlock = new BlockMetalBase("radium_block", null, 6.0F, 24.0F, null, 0, null);
		
		//Alloy Blocks
		alnicoBlock = new BlockAlloyBase("alnico_block", null, 6.0F, 24.0F, null, 0, null);
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
		
		//ModLoaders
		if(!Loader.isModLoaded("tconstruct")) {
			registerBlock(cobaltBlock);
			registerBlock(arditeBlock);
		}
	}

	public static void registerRenders() {
		
		//Metal BLocks
		registerRender(lithiumBlock);
		registerRender(sodiumBlock);
		registerRender(potassiumBlock);
		registerRender(rubidiumBlock);
		registerRender(cesiumBlock);
		registerRender(franciumBlock);
		registerRender(berylliumBlock);
		registerRender(magnesiumBlock);
		registerRender(calciumBlock);
		registerRender(strontiumBlock);
		registerRender(bariumBlock);
		registerRender(radiumBlock);
		
		//Alloy Blocks
		registerRender(alnicoBlock);
		
		//ModLoaders
		if(!Loader.isModLoaded("tconstruct")) {
			registerRender(cobaltBlock);
			registerRender(arditeBlock);
		}
	}
	
	public static void registerBlock (Block block) {
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
		Utils.getLogger().info("Registered Block: " + block.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("Registered Render For " + block.getUnlocalizedName().substring(5));
	}
}
