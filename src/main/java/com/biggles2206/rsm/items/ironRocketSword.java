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

public class ironRocketSword extends ItemSword {
	public ironRocketSword(ToolMaterial iron) {
		super(iron);
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setMaxStackSize(1);
		this.setMaxDamage(100);
		this.setUnlocalizedName(Reference.modItems.IRONROCKETSWORD.getUnlocalizedName());
		this.setRegistryName(Reference.modItems.IRONROCKETSWORD.getRegistryName());
	}
	public boolean func_111207_a(ItemStack itemstack, EntityPlayer player,
			EntityLivingBase target) {
		if (!target.worldObj.isRemote) {
			target.motionY = 1;
			itemstack.damageItem(1, target);
		}
		return false;
	}
}