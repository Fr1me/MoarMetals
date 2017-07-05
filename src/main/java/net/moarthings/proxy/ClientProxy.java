package net.moarthings.proxy;

//import net.magicaltech.init.MTArmor;
//import net.magicaltech.init.MTTools;
//import net.magicaltech.proxy.IMTProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.moarthings.init.MTBlocks;
import net.moarthings.init.MTCreativeTabs;
import net.moarthings.init.MTItems;

public class ClientProxy extends CommonProxy implements IMTProxy {
	
	@Override
	public void registerRenders() {
		MTItems.registerRenders();
		MTBlocks.registerRenders();
//		MTTools.registerRenders();
//		MTArmor.registerRenders();
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		MTItems.init();
		MTBlocks.init();
//		MTTools.init();
//		MTArmor.init();
		
        MTCreativeTabs.initTabs();
	}

	@Override
	public void init(FMLInitializationEvent event) {

	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {

	}

	@Override
	public void registerTileEntities() {
		// TODO Auto-generated method stub
		
	}

}