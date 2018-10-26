package frime.moarmetals;

import frime.moarmetals.proxy.CommonProxy;
import frime.moarmetals.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class MoarMetals {
	
	@Instance
	public static MoarMetals instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent e) {
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent e) {
		
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent e) {
		
	}

}
