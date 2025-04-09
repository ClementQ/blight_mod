package com.xynoss.blight.util;

import com.xynoss.blight.Blight;
import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;

public class ModRegisterEvents {

    public static void registerEvents() {
        Blight.LOGGER.info("Registering Events for " + Blight.MOD_ID);

        //hammer
        PlayerBlockBreakEvents.BEFORE.register(new HammerUsageEvent());

        //tuto
        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            if (player.getMainHandStack().getItem() == Items.END_ROD && !world.isClient){
                if (entity instanceof SheepEntity sheepEntity){
                    player.sendMessage(Text.literal("UI"), false);
                    sheepEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, 40, 6));
                }
                return ActionResult.PASS;
            }
            return ActionResult.PASS;
        });

    }
}
