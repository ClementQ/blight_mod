package com.xynoss.blight.util;

import com.xynoss.blight.Blight;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks{

        //BLIGHT
        public static final TagKey<Block> NEEDS_BLIGHT_TOOL = createTag("needs_blight_tool");
        public static final TagKey<Block> INCORRECT_FOR_BLIGHT_TOOL = createTag("incorrect_for_blight_tool");


        private static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID, name));
        }
    }

    public static class Items{
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");
        public static final TagKey<Item> BLIGHT_TOOLS = createTag("blight_tools");
        public static final TagKey<Item> BLIGHT_REPAIR = createTag("blight_repair");
        public static final TagKey<Item> BLIGHT_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID, "blight_armor"));

        private static TagKey<Item> createTag(String name){
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID, name));
        }
    }
}
