package com.biggles2206.rsm.items;
/**
 * @author biggles2206
 */

import com.biggles2206.rsm.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ironStick extends Item {

	public ironStick() {
		super();
		this.setCreativeTab(CreativeTabs.MATERIALS);
		this.setUnlocalizedName(Reference.modItems.IRONSTICK.getUnlocalizedName());
		this.setRegistryName(Reference.modItems.IRONSTICK.getRegistryName());
	}
}