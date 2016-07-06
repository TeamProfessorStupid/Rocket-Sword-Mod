package com.biggles2206.rsm.config;

/**
 * @author biggles2206
 * @license Minecraft Mod Public Licence 1.0
 */

/* import com.biggles2206.rsm.lib.BlockIds;
import com.biggles2206.rsm.lib.BlockStrings; */
import java.io.File;

import net.minecraftforge.common.Configuration;

import com.biggles2206.rsm.lib.ItemIds;
import com.biggles2206.rsm.lib.ItemStrings;

public class BlockandItemIds {
  public static void init(File file) {
        Configuration config = new Configuration(file);


        config.load();
        //Items
        ItemIds.WOOD_ROCKET_SWORD_ID = config.get("Item" ,ItemStrings.WOOD_ROCKET_SWORD_NAME, ItemIds.WOOD_ROCKET_SWORD_ID_DEFAULT).getInt() - 256;
        ItemIds.STONE_ROCKET_SWORD_ID = config.get("Item" ,ItemStrings.STONE_ROCKET_SWORD_NAME, ItemIds.STONE_ROCKET_SWORD_ID_DEFAULT).getInt() - 256;
        ItemIds.IRON_ROCKET_SWORD_ID = config.get("Item" ,ItemStrings.IRON_ROCKET_SWORD_NAME, ItemIds.IRON_ROCKET_SWORD_ID_DEFAULT).getInt() - 256;
        ItemIds.GOLD_ROCKET_SWORD_ID = config.get("Item" ,ItemStrings.GOLD_ROCKET_SWORD_NAME, ItemIds.GOLD_ROCKET_SWORD_ID_DEFAULT).getInt() - 256;
        ItemIds.DIAMOND_ROCKET_SWORD_ID = config.get("Item" ,ItemStrings.DIAMOND_ROCKET_SWORD_NAME, ItemIds.DIAMOND_ROCKET_SWORD_ID_DEFAULT).getInt() - 256;
        ItemIds.ELECTRIC_ROCKET_SWORD_ID = config.get("Item", "",ItemIds.ELECTRIC_ROCKET_SWORD_ID_DEFAULT).getInt() - 256;
        
        //Blocks
        //BlockIds.BOUNDER_ID = config.get("Block", BlockStrings.BOUNDER_NAME, BlockIds.BOUNDER_ID_DEFAULT) - 256 .getInt();
        config.save();
  }
}