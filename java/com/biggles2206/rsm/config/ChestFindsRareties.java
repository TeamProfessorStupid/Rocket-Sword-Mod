package com.biggles2206.rsm.config;

/**
 * @author biggles2206
 * @license Minecraft Mod Public Licence 1.0
 */

import java.io.File;

import net.minecraftforge.common.Configuration;

import com.biggles2206.rsm.lib.RaritiesInts;

public class ChestFindsRareties {
  public static void init(File file2) {
        Configuration config = new Configuration(file2);


        config.load();
        RaritiesInts.Wood_Rocket_Sword_Chest_Village_Find_Actual = config.get("Village Chest", "Wood Rocket Sword - Village Chests", RaritiesInts.Wood_Rocket_Sword_Chest_Village_Find_Default).getInt();
        RaritiesInts.Wood_Rocket_Sword_Chest_Dungeon_Find_Actual = config.get("Dungeon Chest", "Wood Rocket Sword - Dungeon Chests", RaritiesInts.Wood_Rocket_Sword_Chest_Dungeon_Find_Default).getInt();
        RaritiesInts.Stone_Rocket_Sword_Chest_Village_Find_Actual = config.get("Village Chest", "Stone Rocket Sword - Village Chests", RaritiesInts.Stone_Rocket_Sword_Chest_Village_Find_Default).getInt();
        RaritiesInts.Stone_Rocket_Sword_Chest_Dungeon_Find_Actual = config.get("Dungeon Chest","Stone Rocket Sword - Dungeon Chests", RaritiesInts.Stone_Rocket_Sword_Chest_Dungeon_Find_Default).getInt();
        RaritiesInts.Iron_Rocket_Sword_Chest_Village_Find_Actual = config.get("Village Chest","Iron Rocket Sword - Village Chests", RaritiesInts.Iron_Rocket_Sword_Chest_Village_Find_Default).getInt();
        RaritiesInts.Iron_Rocket_Sword_Chest_Dungeon_Find_Actual = config.get("Dungeon Chest", "Iron Rocket Sword - Dungeon Chests", RaritiesInts.Iron_Rocket_Sword_Chest_Dungeon_Find_Default).getInt();
        RaritiesInts.Gold_Rocket_Sword_Chest_Village_Find_Actual = config.get("Village Chest", "Gold Rocket Sword - Village Chests", RaritiesInts.Gold_Rocket_Sword_Chest_Village_Find_Default).getInt();
        RaritiesInts.Gold_Rocket_Sword_Chest_Dungeon_Find_Actual = config.get("Dungeon Chest", "Gold Rocket Sword - Dungeon Chests", RaritiesInts.Gold_Rocket_Sword_Chest_Dungeon_Find_Default).getInt();
        RaritiesInts.Diamond_Rocket_Sword_Chest_Village_Find_Actual = config.get("Village Chest", "Diamond Rocket Sword - Village Chests", RaritiesInts.Diamond_Rocket_Sword_Chest_Village_Find_Default).getInt();
        RaritiesInts.Diamond_Rocket_Sword_Chest_Dungeon_Find_Actual = config.get("Dungeon Chest", "Diamond Rocket Sword - Dungeon Chests", RaritiesInts.Diamond_Rocket_Sword_Chest_Dungeon_Find_Default).getInt();
        config.save();
  }
}