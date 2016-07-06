package com.biggles2206.rsm.items;
/**
 * @author biggles2206
 * @license Minecraft Mod Public Licence 1.0
 */
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class goldRocketSword extends ItemSword {

	public goldRocketSword(int id, EnumToolMaterial gold) {
		super(id, gold);
		this.setCreativeTab(CreativeTabs.tabCombat);
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

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister register) {
		itemIcon = register.registerIcon("rocket sword mod:grs");
	}

}

