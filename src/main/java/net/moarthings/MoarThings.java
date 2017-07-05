package net.moarthings;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.moarthings.init.MTBlocks;
import net.moarthings.init.MTCreativeTabs;
import net.moarthings.init.MTItems;
import net.moarthings.proxy.IMTProxy;
import xfireeyez.core.util.Utils;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class MoarThings {
	
	@Mod.Instance(Reference.MODID)
	public static MoarThings instance;
	
	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static IMTProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Utils.getLogger().info("Pre-Initializing");
		
		proxy.preInit(event);
		
		MTItems.init();
		MTItems.register();
		MTBlocks.init();
		MTBlocks.register();
		
		proxy.registerRenders();
		
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
