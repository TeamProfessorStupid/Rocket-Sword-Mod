package com.biggles2206.rsm.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * @author biggles2206
 * @license Minecraft Mod 1.0
 */
class reinforced_string extends Item {

    public reinforced_string(int par1) {
		super(par1);
		this.setCreativeTab(CreativeTabs.tabMaterials);
                this.setMaxStackSize(64);
    }
    
}
