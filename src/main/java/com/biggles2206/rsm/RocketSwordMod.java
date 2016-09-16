package com.biggles2206.rsm;

import com.biggles2206.rsm.items.ModItems;
import com.biggles2206.rsm.proxy.CommonProxy;
import com.biggles2206.rsm.util.config;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(name = config.NAME, modid = config.MODID, version = config.VERSION)
public class rsm {

	@SidedProxy(clientSide = config.CLIENT_PROXY_LOC, serverSide = config.COMMON_PROXY_LOC)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event){

		ModItems.addItems();
		ModItems.addNames();
		ModItems.addItemCraftingRecipes();
		
		
        }	
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){

	}
}
