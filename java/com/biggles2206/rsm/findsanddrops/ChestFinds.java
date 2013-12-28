package com.biggles2206.rsm.findsanddrops;
/**
 * @author biggles2206
 * @license Minecraft Mod Public Licence 1.0
 */

import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

import com.biggles2206.rsm.items.ModItems;
import com.biggles2206.rsm.lib.RaritiesInts;

public class ChestFinds {

	public static void Finds(){
		//Wood Rocket Sword Chest Find
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.woodRocketSword),1,1,RaritiesInts.Wood_Rocket_Sword_Chest_Village_Find_Actual));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.woodRocketSword),1,1,RaritiesInts.Wood_Rocket_Sword_Chest_Dungeon_Find_Actual));
		
                //Stone Rocket Sword Chest Finds
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.stoneRocketSword),1,1,RaritiesInts.Stone_Rocket_Sword_Chest_Village_Find_Actual));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.stoneRocketSword),1,1,RaritiesInts.Stone_Rocket_Sword_Chest_Dungeon_Find_Actual));
		
                //Iron Rocket Sword Chest Finds
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.ironRocketSword),1,1,RaritiesInts.Iron_Rocket_Sword_Chest_Village_Find_Actual));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.ironRocketSword),1,1,RaritiesInts.Iron_Rocket_Sword_Chest_Dungeon_Find_Actual));
		
                //Gold Rocket Sword Chest Find
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.goldRocketSword),1,1,RaritiesInts.Gold_Rocket_Sword_Chest_Village_Find_Actual));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.goldRocketSword),1,1,RaritiesInts.Gold_Rocket_Sword_Chest_Dungeon_Find_Actual));
		
                //Diamond Rocket Sword Chest Find
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.diamondRocketSword),1,1,RaritiesInts.Diamond_Rocket_Sword_Chest_Village_Find_Actual));
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.diamondRocketSword),1,1,RaritiesInts.Diamond_Rocket_Sword_Chest_Dungeon_Find_Actual));
	}
}
