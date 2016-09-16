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

public class stoneRocketSword extends ItemSword {
	public stoneRocketSword(ToolMaterial stone) {
		super(stone);
		this.setCreativeTab(CreativeTabs.COMBAT);
		this.setMaxStackSize(1);
		this.setMaxDamage(50);
		this.setUnlocalizedName("SRS");
	}
	public boolean func_111207_a(ItemStack itemstack, EntityPlayer player,
			EntityLivingBase target) {
		if (!target.worldObj.isRemote) {
			target.motionY = 0.5;
			itemstack.damageItem(1, target);
		}
		return false;
	}

	@SideOnly(Side.CLIENT)
	public void initModel() {
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}
}



