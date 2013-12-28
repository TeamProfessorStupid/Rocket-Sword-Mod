package com.biggles2206.rsm.config;

import java.io.File;

import com.biggles2206.rsm.lib.MiscStrings;

public class ConfigInit {

	public static void InitConfig(){
		//Initialising all the Config Classes
		File file = new File(MiscStrings.CONFIGLOCATION + "/BlockIds.cfg");
		BlockandItemIds.init(file);
        /*File file2 = new File(MiscStrings.CONFIGLOCATION + "/Chest Rareties.cfg");
        ChestFindsRareties.init(file2);*/
		File file3 = new File(MiscStrings.CONFIGLOCATION + "/MiscConfig.cfg");
		MiscConfig.init(file3);
		
	}
}
