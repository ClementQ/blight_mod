package com.xynoss.blight;

import com.xynoss.blight.block.ModBlocks;
import com.xynoss.blight.component.ModDataComponentTypes;
import com.xynoss.blight.item.ModFuelItems;
import com.xynoss.blight.item.ModItemGroups;
import com.xynoss.blight.item.ModItems;
import com.xynoss.blight.sound.ModSounds;
import com.xynoss.blight.util.ModRegisterEvents;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//important things
public class Blight implements ModInitializer {
	public static final String MOD_ID = "blight";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModFuelItems.registerModFuelItem();
		ModDataComponentTypes.registerDataComponentTypes();
		ModRegisterEvents.registerEvents();
		ModSounds.registerSounds();


	}
}