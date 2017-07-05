package net.moarthings.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.moarthings.MoarThings;
import net.moarthings.Reference;
import net.moarthings.item.ItemAlloyBase;
import net.moarthings.item.ItemMetalBase;
import xfireeyez.core.item.ItemBase;
import xfireeyez.core.util.Utils;

public class MTItems {
	
	//Metals
	public static Item cobaltIngot;
	public static Item arditeIngot;
	public static Item lithiumIngot;
	public static Item sodiumIngot;
	public static Item potassiumIngot;
	public static Item rubidiumIngot;
	public static Item cesiumIngot;
	public static Item franciumIngot;
	public static Item berylliumIngot;
	public static Item magnesiumIngot;
	public static Item calciumIngot;
	public static Item strontiumIngot;
	public static Item bariumIngot;
	public static Item radiumIngot;
	
	//Alloys
	public static Item alnicoIngot;
	
	//Metal Nuggets
	public static Item cobaltNugget;
	public static Item arditeNugget;
	public static Item lithiumNugget;
	public static Item sodiumNugget;
	public static Item potassiumNugget;
	public static Item rubidiumNugget;
	public static Item cesiumNugget;
	public static Item franciumNugget;
	public static Item berylliumNugget;
	public static Item magnesiumNugget;
	public static Item calciumNugget;
	public static Item strontiumNugget;
	public static Item bariumNugget;
	public static Item radiumNugget;
	
	//Alloy Nuggets
	public static Item alnicoNugget;
	
	public static void init() {
		//Metals
		cobaltIngot = new ItemMetalBase("cobalt_ingot", null, false);
		arditeIngot = new ItemMetalBase("ardite_ingot", null, false);
		lithiumIngot = new ItemMetalBase("lithium_ingot", null, false);
		sodiumIngot = new ItemMetalBase("sodium_ingot", null, false);
		potassiumIngot = new ItemMetalBase("potassium_ingot", null, false);
		rubidiumIngot = new ItemMetalBase("rubidium_ingot", null, false);
		cesiumIngot = new ItemMetalBase("cesium_ingot", null, false);
		franciumIngot = new ItemMetalBase("francium_ingot", null, false);
		berylliumIngot = new ItemMetalBase("beryllium_ingot", null, false);
		magnesiumIngot = new ItemMetalBase("magnesium_ingot", null, false);
		calciumIngot = new ItemMetalBase("calcium_ingot", null, false);
		strontiumIngot = new ItemMetalBase("strontium_ingot", null, false);
		bariumIngot = new ItemMetalBase("barium_ingot", null, false);
		radiumIngot = new ItemMetalBase("radium_ingot", null, false);
		
		//Alloys
		alnicoIngot = new ItemAlloyBase("alnico_ingot", null, false);
		
		//Metal Nuggets
		cobaltNugget = new ItemMetalBase("cobalt_nugget", null, false);
		arditeNugget = new ItemMetalBase("ardite_nugget", null, false);
		lithiumNugget = new ItemMetalBase("lithium_nugget", null, false);
		sodiumNugget = new ItemMetalBase("sodium_nugget", null, false);
		potassiumNugget = new ItemMetalBase("potassium_nugget", null, false);
		rubidiumNugget = new ItemMetalBase("rubidium_nugget", null, false);
		cesiumNugget = new ItemMetalBase("cesium_nugget", null, false);
		franciumNugget = new ItemMetalBase("francium_nugget", null, false);
		berylliumNugget = new ItemMetalBase("beryllium_nugget", null, false);
		magnesiumNugget = new ItemMetalBase("magnesium_nugget", null, false);
		calciumNugget = new ItemMetalBase("calcium_nugget", null, false);
		strontiumNugget = new ItemMetalBase("strontium_nugget", null, false);
		bariumNugget = new ItemMetalBase("barium_nugget", null, false);
		radiumNugget = new ItemMetalBase("radium_nugget", null, false);
		
		//Alloy Nuggets
		alnicoNugget = new ItemAlloyBase("alnico_nugget", null, false);
	}
	
	public static void register() {
		//Metals
		registerItem(lithiumIngot);
		registerItem(sodiumIngot);
		registerItem(potassiumIngot);
		registerItem(rubidiumIngot);
		registerItem(cesiumIngot);
		registerItem(franciumIngot);
		registerItem(berylliumIngot);
		registerItem(magnesiumIngot);
		registerItem(calciumIngot);
		registerItem(strontiumIngot);
		registerItem(bariumIngot);
		registerItem(radiumIngot);
		
		//Alloys
		registerItem(alnicoIngot);
		
		//Metal Nuggets
		registerItem(lithiumNugget);
		registerItem(sodiumNugget);
		registerItem(potassiumNugget);
		registerItem(rubidiumNugget);
		registerItem(cesiumNugget);
		registerItem(franciumNugget);
		registerItem(berylliumNugget);
		registerItem(magnesiumNugget);
		registerItem(calciumNugget);
		registerItem(strontiumNugget);
		registerItem(bariumNugget);
		registerItem(radiumNugget);
		
		//Alloy Nuggets
		registerItem(alnicoNugget);
		
		//ModLoaders
	    if(!Loader.isModLoaded("tconstruct")) {
	    	registerItem(cobaltIngot);
	    	registerItem(arditeIngot);
	    	registerItem(cobaltNugget);
	    	registerItem(arditeNugget);
	    }
	}
	
	public static void registerRenders() {
		//Metals
		registerRender(lithiumIngot);
		registerRender(sodiumIngot);
		registerRender(potassiumIngot);
		registerRender(rubidiumIngot);
		registerRender(cesiumIngot);
		registerRender(franciumIngot);
		registerRender(berylliumIngot);
		registerRender(magnesiumIngot);
		registerRender(calciumIngot);
		registerRender(strontiumIngot);
		registerRender(bariumIngot);
		registerRender(radiumIngot);
		
		//Alloys
		registerRender(alnicoIngot);
		
		//Metal Nuggets
		registerRender(lithiumNugget);
		registerRender(sodiumNugget);
		registerRender(potassiumNugget);
		registerRender(rubidiumNugget);
		registerRender(cesiumNugget);
		registerRender(franciumNugget);
		registerRender(berylliumNugget);
		registerRender(magnesiumNugget);
		registerRender(calciumNugget);
		registerRender(strontiumNugget);
		registerRender(bariumNugget);
		registerRender(radiumNugget);
		
		//Alloy Nuggets
		registerRender(alnicoNugget);
		
		//ModLoaders
		if(!Loader.isModLoaded("tconstruct")){
			registerRender(cobaltIngot);
			registerRender(arditeIngot);
			registerRender(cobaltNugget);
			registerRender(arditeNugget);
	    }
	}
	
	public static void registerItem(Item item) {
		GameRegistry.register(item);
		Utils.getLogger().info("Registered Item: " + item.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
		Utils.getLogger().info("Registered Render For " + item.getUnlocalizedName().substring(5));
	}

}
