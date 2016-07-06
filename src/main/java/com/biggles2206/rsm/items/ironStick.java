package com.biggles2206.rsm.items;
/**
 * @author biggles2206
 * @license Minecraft Mod Public Licence 1.0
 */
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ironStick extends Item {

	public ironStick(int par1) {
		super(par1);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon("rocket sword mod:ironstick");
	}
}