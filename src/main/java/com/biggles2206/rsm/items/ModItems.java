package com.biggles2206.rsm.items;
/**
 * @author biggles2206
 */

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static Item woodRocketSword;
	public static Item stoneRocketSword;
	public static Item ironRocketSword;
	public static Item goldRocketSword;
	public static Item diamondRocketSword;
	public static Item ironStick;

	public static void addItems(){
		
		woodRocketSword = new woodRocketSword(ToolMaterial.WOOD);
		stoneRocketSword = new stoneRocketSword(ToolMaterial.STONE);
		ironRocketSword = new ironRocketSword(ToolMaterial.IRON);
		goldRocketSword = new goldRocketSword(ToolMaterial.GOLD);
		diamondRocketSword = new diamondRocketSword(ToolMaterial.DIAMOND);
		ironStick = new ironStick();
	}
	
	public static void addNames(){
		
		GameRegistry.register(woodRocketSword);
		GameRegistry.register(stoneRocketSword);
		GameRegistry.register(ironRocketSword);
		GameRegistry.register(goldRocketSword);
		GameRegistry.register(diamondRocketSword);
		GameRegistry.register(ironStick);
		
		
	}
	
	public static void registerRenders(){
		registerRender(woodRocketSword);
		registerRender(stoneRocketSword);
		registerRender(ironRocketSword);
		registerRender(goldRocketSword);
		registerRender(diamondRocketSword);
		registerRender(ironStick);
	}
	
	public static void registerRender(Item item){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
	public static void addItemCraftingRecipes(){
		
		GameRegistry.addShapedRecipe(new ItemStack(woodRocketSword), new Object[]{
				
				"YXY",
				" X ",
				" Z ",
				'Y',Items.STRING ,'X', Blocks.PLANKS, 'Z', ironStick
					
		});
		
		GameRegistry.addShapedRecipe(new ItemStack(woodRocketSword), new Object[]{
			
			"YXY",
			" X ",
			" Z ",
			'Y', Items.STRING, 'X', Blocks.LOG, 'Z', ironStick
				
	});
		GameRegistry.addShapedRecipe(new ItemStack(stoneRocketSword), new Object[]{
			
			"YXY",
			" X ",
			" Z ",
			'Y', Items.STRING, 'X', Blocks.COBBLESTONE, 'Z', ironStick
				
	});
		
		GameRegistry.addShapedRecipe(new ItemStack(stoneRocketSword), new Object[]{
			
			"YXY",
			" X ",
			" Z ",
			'Y', Items.STRING, 'X', Blocks.STONE, 'Z', ironStick	
			
		});
		
		GameRegistry.addShapedRecipe(new ItemStack(ironRocketSword), new Object[]{
	
			"YXY",
			" X ",
			" Z ",
			'Y', Items.STRING, 'X', Items.GOLD_INGOT, 'Z', ironStick
	
		});

		GameRegistry.addShapedRecipe(new ItemStack(goldRocketSword), new Object[]{
	
			"YXY",
			" X ",
			" Z ",
			'Y', Items.STRING, 'X', Items.GOLD_INGOT, 'Z', ironStick
	
		});
		
		GameRegistry.addShapedRecipe(new ItemStack(diamondRocketSword), new Object[]{
			
			"YXY",
			" X ",
			" Z ",
			'Y', Items.STRING, 'X', Items.DIAMOND, 'Z', ironStick
	
		});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ironStick), new Object[]{
			new ItemStack(Items.IRON_INGOT, 0, 2)
		});
	} 
}
