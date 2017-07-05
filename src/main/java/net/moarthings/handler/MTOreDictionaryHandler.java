package net.moarthings.handler;

import net.minecraftforge.oredict.OreDictionary;
import net.moarthings.init.MTBlocks;
import net.moarthings.init.MTItems;

public class MTOreDictionaryHandler {
	
	public static void registerOreDictionary() {
		
		//Metals
		OreDictionary.registerOre("ingotCobalt", MTItems.cobaltIngot);
		OreDictionary.registerOre("ingotArdite", MTItems.arditeIngot);
		OreDictionary.registerOre("ingotLithium", MTItems.lithiumIngot);
		OreDictionary.registerOre("ingotSodium", MTItems.sodiumIngot);
		OreDictionary.registerOre("ingotPotassium", MTItems.potassiumIngot);
		OreDictionary.registerOre("ingotRubidium", MTItems.rubidiumIngot);
		OreDictionary.registerOre("ingotCesium", MTItems.cesiumIngot);
		OreDictionary.registerOre("ingotFrancium", MTItems.franciumIngot);
		OreDictionary.registerOre("ingotBeryllium", MTItems.berylliumIngot);
		OreDictionary.registerOre("ingotMagnesium", MTItems.magnesiumIngot);
		OreDictionary.registerOre("ingotCalcium", MTItems.calciumIngot);
		OreDictionary.registerOre("ingotStrontium", MTItems.strontiumIngot);
		OreDictionary.registerOre("ingotBarium", MTItems.bariumIngot);
		OreDictionary.registerOre("ingotRadium", MTItems.radiumIngot);
		
		//Metal Nuggets
		OreDictionary.registerOre("nuggetCobalt", MTItems.cobaltNugget);
		OreDictionary.registerOre("nuggetArdite", MTItems.arditeNugget);
		OreDictionary.registerOre("nuggetLithium", MTItems.lithiumNugget);
		OreDictionary.registerOre("nuggetSodium", MTItems.sodiumNugget);
		OreDictionary.registerOre("nuggetPotassium", MTItems.potassiumNugget);
		OreDictionary.registerOre("nuggetRubidium", MTItems.rubidiumNugget);
		OreDictionary.registerOre("nuggetCesium", MTItems.cesiumNugget);
		OreDictionary.registerOre("nuggetFrancium", MTItems.franciumNugget);
		OreDictionary.registerOre("nuggetBeryllium", MTItems.berylliumNugget);
		OreDictionary.registerOre("nuggetMagnesium", MTItems.magnesiumNugget);
		OreDictionary.registerOre("nuggetCalcium", MTItems.calciumNugget);
		OreDictionary.registerOre("nuggetStrontium", MTItems.strontiumNugget);
		OreDictionary.registerOre("nuggetBarium", MTItems.bariumNugget);
		OreDictionary.registerOre("nuggetRadium", MTItems.radiumNugget);
		
		//Metal Blocks
		OreDictionary.registerOre("blockCobalt", MTBlocks.cobaltBlock);
		OreDictionary.registerOre("blockArdite", MTBlocks.arditeBlock);
		OreDictionary.registerOre("blockLithium", MTBlocks.lithiumBlock);
		OreDictionary.registerOre("blockSodium", MTBlocks.sodiumBlock);
		OreDictionary.registerOre("blockPotassium", MTBlocks.potassiumBlock);
		OreDictionary.registerOre("blockRubidium", MTBlocks.rubidiumBlock);
		OreDictionary.registerOre("blockCesium", MTBlocks.cesiumBlock);
		OreDictionary.registerOre("blockFrancium", MTBlocks.franciumBlock);
		OreDictionary.registerOre("blockBeryllium", MTBlocks.berylliumBlock);
		OreDictionary.registerOre("blockMagnesium", MTBlocks.magnesiumBlock);
		OreDictionary.registerOre("blockCalcium", MTBlocks.calciumBlock);
		OreDictionary.registerOre("blockStrontium", MTBlocks.strontiumBlock);
		OreDictionary.registerOre("blockBarium", MTBlocks.bariumBlock);
		OreDictionary.registerOre("blockRadium", MTBlocks.radiumBlock);
		
		//Metal Ores
		
		//Alloys
		OreDictionary.registerOre("ingotAlnico", MTItems.alnicoIngot);
		
		//Alloy Nuggets
		OreDictionary.registerOre("nuggetAlnico", MTItems.alnicoNugget);
		
		//Alloy Blocks
		OreDictionary.registerOre("blockAlnico", MTBlocks.alnicoBlock);
		}

}
