package com.biggles2206.rsm.items;
/**
 * @author biggles2206
 * @license Minecraft Mod Public Licence 1.0
 */
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemBow;

public class MaleeWepon extends ItemBow{

	public MaleeWepon(int par1, EnumToolMaterial stone) {
		super(par1);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setMaxStackSize(1);
	}

}
