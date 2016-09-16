package com.biggles2206.rsm.items;
/**
 * @author biggles2206
 */

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class goldRocketSword extends ItemSword {

	public goldRocketSword(ToolMaterial gold) {
		super(gold);
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setMaxStackSize(1);
		this.setMaxDamage(200);
		this.setUnlocalizedName("GRS");
	}
	public boolean func_111207_a(ItemStack itemstack, EntityPlayer player,
			EntityLivingBase target) {
		if (!target.worldObj.isRemote) {
			target.motionY = 2;
			itemstack.damageItem(1, target);
		}
		return false;
	}

	@SideOnly(Side.CLIENT)
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}

}

