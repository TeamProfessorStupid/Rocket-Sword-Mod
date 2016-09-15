package com.biggles2206.rsm.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

/**
 * @author biggles2206
 * @license Minecraft mod licence 1.0
 */
class Bounder extends Block {

    
    
	public Bounder(int par1, Material par2Material) {
		super(par1, par2Material);
		setUnlocalizedName("bndr");
		setCreativeTab(CreativeTabs.tabMisc);
		setHardness(0.4F);
	}
	public String getTextureFile(){
		return "/resources/assets/rocket sword mod/textures/blocks/bndr.png";
		
	}
	

	 /*@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemstack, EntityPlayer player,
			List info, boolean useExtraInfomation) {
		info.add("Make Bungee!");

	} */
}
