package com.biggles2206.rsm.proxy;

import com.biggles2206.rsm.items.ModItems;

/**
 * @author biggles2206
 */
public class ClientProxy implements CommonProxy{

	@Override
	public void init() {
		ModItems.registerRenders();		
	}

}
