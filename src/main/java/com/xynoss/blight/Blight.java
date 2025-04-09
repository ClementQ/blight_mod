package com.xynoss.blight;

import com.xynoss.blight.block.ModBlocks;
import com.xynoss.blight.component.ModDataComponentTypes;
import com.xynoss.blight.item.ModFuelItems;
import com.xynoss.blight.item.ModItemGroups;
import com.xynoss.blight.item.ModItems;
import com.xynoss.blight.util.HammerUsageEvent;
import com.xynoss.blight.util.ModRegisterEvents;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.block.Portal;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
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


	}
}