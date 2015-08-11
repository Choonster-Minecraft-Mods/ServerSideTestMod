package com.choonster.serversidetestmod;

import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ServerSideTestMod.MODID, name = ServerSideTestMod.NAME, serverSideOnly = true, acceptableRemoteVersions = "*")
public class ServerSideTestMod {
	public static final String MODID = "serversidetestmod";
	public static final String NAME = "Server Side Test Mod";

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		Logger.info("preInit! Server? %s", event.getSide().isServer());
	}

	@EventHandler
	public void init(FMLInitializationEvent event){
		Logger.info("init! Server? %s", event.getSide().isServer());
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		Logger.info("postInit! Server? %s", event.getSide().isServer());
	}
}
