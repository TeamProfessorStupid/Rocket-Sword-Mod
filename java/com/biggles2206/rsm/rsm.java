package com.biggles2206.rsm;

/**
 * @author biggles2206
 * @licence Minecraft Mod Public Licence 1.0
 */

import com.biggles2206.rsm.config.ConfigInit;
import com.biggles2206.rsm.findsanddrops.ChestFinds;
import com.biggles2206.rsm.items.ModItems;
import com.biggles2206.rsm.lib.Refence;
import com.biggles2206.rsm.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(name = Refence.NAME, modid = Refence.MODID, version = Refence.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class rsm {

	@SidedProxy(clientSide = Refence.CLIENT_PROXY_LOC, serverSide = Refence.COMMON_PROXY_LOC)
			public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		//Configuration Initialisation
		ConfigInit.InitConfig();
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){
		//Initialise all the items
		ModItems.init();
		//Add Names to the Items
		ModItems.addNames();
		//Add in the Crafting
		ModItems.registerCrafting();
        //Add In Blocks
		//ModBlocks.Blocks();
		
		
        }	
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		//Add Chest Finds
		ChestFinds.Finds();
	}
}
