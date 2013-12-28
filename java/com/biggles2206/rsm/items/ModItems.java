package com.biggles2206.rsm.items;
/**
 * @author biggles2206
 * @license Minecraft Mod Public Licence 1.0
 */

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.biggles2206.rsm.lib.ItemIds;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModItems {
	
	//Declare Items
	public static Item woodRocketSword;
	public static Item stoneRocketSword;
	public static Item ironRocketSword;
	public static Item goldRocketSword;
	public static Item diamondRocketSword;
	public static Item ironStick;
    //public static Item reinforced_string;
    //public static Item bungee;
	//public static Item maileeBow;

	public static void init(){
		
		//Initialise all the Items
		woodRocketSword = new woodRocketSword(ItemIds.WOOD_ROCKET_SWORD_ID, EnumToolMaterial.WOOD);
		stoneRocketSword = new stoneRocketSword(ItemIds.STONE_ROCKET_SWORD_ID, EnumToolMaterial.STONE);
		ironRocketSword = new ironRocketSword(ItemIds.IRON_ROCKET_SWORD_ID, EnumToolMaterial.IRON);
		goldRocketSword = new goldRocketSword(ItemIds.GOLD_ROCKET_SWORD_ID, EnumToolMaterial.GOLD);
		diamondRocketSword = new diamondRocketSword(ItemIds.DIAMOND_ROCKET_SWORD_ID, EnumToolMaterial.EMERALD);
		ironStick = new ironStick(ItemIds.IRON_STICK_ID);
        //reinforced_string = new reinforced_string(ItemIds.REINFORCED_STRING_ID);
        //bungee = new bungee(ItemIds.BUNGEE_ID);
		//maileeBow = new MaleeWepon(3147, EnumToolMaterial.STONE);
	}
	
	public static void addNames(){
		
		//Give Items Names
		LanguageRegistry.addName(woodRocketSword, "Wooden Rocket Sword");
		LanguageRegistry.addName(stoneRocketSword, "Stone Rocket Sword");
		LanguageRegistry.addName(ironRocketSword, "Iron Rocket Sword");
		LanguageRegistry.addName(goldRocketSword, "Gold Rocket Sword");
		LanguageRegistry.addName(diamondRocketSword, "Diamond Rocket Sword");
		LanguageRegistry.addName(ironStick, "Iron Stick");
		
		
	}
	
	public static void registerCrafting(){
		
		//Register Crafting
		GameRegistry.addShapedRecipe(new ItemStack(woodRocketSword), new Object[]{
				
				"YXY",
				" X ",
				" Z ",
				'Y', Item.silk, 'X', Block.planks, 'Z', ironStick
					
		});
		
		GameRegistry.addShapedRecipe(new ItemStack(woodRocketSword), new Object[]{
			
			"YXY",
			" X ",
			" Z ",
			'Y', Item.silk, 'X', Block.wood, 'Z', ironStick
				
	});
		GameRegistry.addShapedRecipe(new ItemStack(stoneRocketSword), new Object[]{
			
			"YXY",
			" X ",
			" Z ",
			'Y', Item.silk, 'X', Block.cobblestone, 'Z', ironStick
				
	});
		
		GameRegistry.addShapedRecipe(new ItemStack(stoneRocketSword), new Object[]{
			
			"YXY",
			" X ",
			" Z ",
			'Y', Item.silk, 'X', Block.stone, 'Z', ironStick	
			
		});
		
		GameRegistry.addShapedRecipe(new ItemStack(ironRocketSword), new Object[]{
	
			"YXY",
			" X ",
			" Z ",
			'Y', Item.silk, 'X', Item.ingotIron, 'Z', ironStick
	
		});

		GameRegistry.addShapedRecipe(new ItemStack(goldRocketSword), new Object[]{
	
			"YXY",
			" X ",
			" Z ",
			'Y', Item.silk, 'X', Item.ingotGold, 'Z', ironStick
	
		});
		
		GameRegistry.addShapedRecipe(new ItemStack(diamondRocketSword), new Object[]{
			
			"YXY",
			" X ",
			" Z ",
			'Y', Item.silk, 'X', Item.diamond, 'Z', ironStick
	
		});
		
		GameRegistry.addShapedRecipe(new ItemStack(ironStick), new Object[]{
			"X  ",
			"X  ",
			"   ",
			'X', Item.ingotIron
						
		});
		GameRegistry.addShapedRecipe(new ItemStack(ironStick), new Object[]{
			" X ",
			" X ",
			"   ",
			'X', Item.ingotIron		
			
		});
		GameRegistry.addShapedRecipe(new ItemStack(ironStick), new Object[]{
			"  X",
			"  X",
			"   ",
			'X', Item.ingotIron			
			
		});
		GameRegistry.addShapedRecipe(new ItemStack(ironStick), new Object[]{
			"   ",
			"X  ",
			"X  ",
			'X', Item.ingotIron	
			
		});
		GameRegistry.addShapedRecipe(new ItemStack(ironStick), new Object[]{
			"   ",
			" X ",
			" X ",
			'X', Item.ingotIron
			
		});	GameRegistry.addShapedRecipe(new ItemStack(ironStick), new Object[]{
			"   ",
			"  X",
			"  X",
			'X', Item.ingotIron
			
		});
                /*GameRegistry.addShapedRecipe(new ItemStack(reinforced_string), new Object[]{
                        "XXX",
                        "XXX",
                        "XXX",
                        'X', Item.silk
                    
                    
                }); */
	} 
}
