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

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod;


@Mod(name = Refence.NAME, modid = Refence.MODID, version = Refence.VERSION)
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
