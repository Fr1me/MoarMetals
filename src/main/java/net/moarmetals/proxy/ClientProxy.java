package net.moarmetals.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.moarmetals.init.Metals;
import net.moarmetals.init.Tabs;

public class ClientProxy extends CommonProxy implements IMMProxy {

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		
		Tabs.initTabs();
		
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);

	}
	@Override
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);

	}

}