package com.biggles2206.rsm.items;
/**
 * @author biggles2206
 */

import com.biggles2206.rsm.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class diamondRocketSword extends ItemSword {

	public diamondRocketSword(ToolMaterial emerald) {
		super(emerald);
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setMaxStackSize(1);
		this.setMaxDamage(400);
		this.setUnlocalizedName(Reference.modItems.DIAMONDROCKETSWORD.getUnlocalizedName());
		this.setRegistryName(Reference.modItems.DIAMONDROCKETSWORD.getRegistryName());
	}
	public boolean func_111207_a(ItemStack itemstack, EntityPlayer player,
			EntityLivingBase target) {
		if (!target.worldObj.isRemote) {
			target.motionY = 4;
			itemstack.damageItem(1, target);
		}
		return false;
	}	
}

