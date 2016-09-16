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


public class goldRocketSword extends ItemSword {

	public goldRocketSword(ToolMaterial gold) {
		super(gold);
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setMaxStackSize(1);
		this.setMaxDamage(200);
		this.setUnlocalizedName("GoldRocketSword");
		this.setUnlocalizedName(Reference.modItems.GOLDROCKETSWORD.getUnlocalizedName());
		this.setRegistryName(Reference.modItems.GOLDROCKETSWORD.getRegistryName());
	}
	public boolean func_111207_a(ItemStack itemstack, EntityPlayer player,
			EntityLivingBase target) {
		if (!target.worldObj.isRemote) {
			target.motionY = 2;
			itemstack.damageItem(1, target);
		}
		return false;
	}
}

