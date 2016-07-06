package com.biggles2206.rsm.config;

/**
 * @author biggles2206
 * @license Minecraft Mod Public Licence 1.0
 */

/* import com.biggles2206.rsm.lib.BlockIds;
import com.biggles2206.rsm.lib.BlockStrings; */
import java.io.File;

import net.minecraftforge.common.Configuration;

import com.biggles2206.rsm.lib.MiscStrings;

public class MiscConfig {
  public static void init(File file3) {
        Configuration config = new Configuration(file3);


        config.load();
        MiscStrings.CONFIGLOCATION = config.get("Config Location", "Location for the Config files", MiscStrings.CONFIGLOCATIONDEFAULT).getString();
        config.save();
  }
}