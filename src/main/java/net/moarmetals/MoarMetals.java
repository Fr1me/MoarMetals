package net.moarmetals;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.moarmetals.init.Metals;
import net.moarmetals.proxy.IMMProxy;
import xfireeyez.core.util.Utils;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class MoarMetals {
	
	@Mod.Instance(Reference.MODID)
	public static MoarMetals instance;
	
	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static IMMProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Utils.getLogger().info("Pre-Initializing");
		
		proxy.preInit(event);
		
		Metals.createMetals();
		
		Utils.getLogger().info("Pre-Initialization Complete");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		Utils.getLogger().info("Initializing");
		
		proxy.init(event);
		
		Utils.getLogger().info("Initialization Complete");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		Utils.getLogger().info("Post-Initializing");
		
		proxy.postInit(event);
		
		Utils.getLogger().info("Post-Initialization Complete");
	}
	
}