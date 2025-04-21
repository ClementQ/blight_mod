package com.xynoss.blight.sound;

import com.xynoss.blight.Blight;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.*;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import static net.minecraft.registry.Registry.registerReference;

public class ModSounds {
    public static final SoundEvent CHISEL_USED = registerSoundEvent("chisel_use");

    public static final SoundEvent MAGIC_BLOCK_BREAK = registerSoundEvent("magic_block_break");
    public static final SoundEvent MAGIC_BLOCK_STEP = registerSoundEvent("magic_block_step");
    public static final SoundEvent MAGIC_BLOCK_PLACE = registerSoundEvent("magic_block_place");
    public static final SoundEvent MAGIC_BLOCK_HIT = registerSoundEvent("magic_block_hit");
    public static final SoundEvent MAGIC_BLOCK_FALL = registerSoundEvent("magic_block_fall");

    public static final BlockSoundGroup MAGIC_BLOCK_SOUND = new BlockSoundGroup(1f,1f,
            MAGIC_BLOCK_BREAK,MAGIC_BLOCK_STEP,MAGIC_BLOCK_PLACE,MAGIC_BLOCK_HIT,MAGIC_BLOCK_FALL);

    //music disc
    public static final SoundEvent ARISE = registerSoundEvent("arise");
    public static final RegistryKey<JukeboxSong> ARISE_KEY = RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Blight.MOD_ID, "arise"));


    //Global Sounds
    private static SoundEvent registerSoundEvent(String name){
        Identifier id = Identifier.of(Blight.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT,id, SoundEvent.of(id));
    }

    public static void registerSounds(){
        Blight.LOGGER.info("Registering Mod Sounds for " + Blight.MOD_ID);
    }
}
