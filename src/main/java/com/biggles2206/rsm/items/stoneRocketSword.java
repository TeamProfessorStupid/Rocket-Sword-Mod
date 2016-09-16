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

public class stoneRocketSword extends ItemSword {
	public stoneRocketSword(ToolMaterial stone) {
		super(stone);
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setMaxStackSize(1);
		this.setMaxDamage(50);
		this.setUnlocalizedName(Reference.modItems.STONEROCKETSWORD.getUnlocalizedName());
		this.setRegistryName(Reference.modItems.STONEROCKETSWORD.getRegistryName());
	}
	public boolean func_111207_a(ItemStack itemstack, EntityPlayer player,
			EntityLivingBase target) {
		if (!target.worldObj.isRemote) {
			target.motionY = 0.5;
			itemstack.damageItem(1, target);
		}
		return false;
	}

}



