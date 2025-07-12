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

        //MYTHRION
        public static final TagKey<Block> NEEDS_MYTHRION_TOOL = createTag("needs_mythrion_tool");
        public static final TagKey<Block> INCORRECT_FOR_MYTHRION_TOOL = createTag("incorrect_for_mythrion_tool");

        //ELDRANITE
        public static final TagKey<Block> NEEDS_ELDRANITE_TOOL = createTag("needs_eldranite_tool");
        public static final TagKey<Block> INCORRECT_FOR_ELDRANITE_TOOL = createTag("incorrect_for_eldranite_tool");

        //ELDRANITE
        public static final TagKey<Block> NEEDS_TRIONITE_TOOL = createTag("needs_trionite_tool");
        public static final TagKey<Block> INCORRECT_FOR_TRIONITE_TOOL = createTag("incorrect_for_trionite_tool");

        //PYRALITE
        public static final TagKey<Block> NEEDS_PYRALITE_TOOL = createTag("needs_pyralite_tool");
        public static final TagKey<Block> INCORRECT_FOR_PYRALITE_TOOL = createTag("incorrect_for_pyralite_tool");

        //VALTHERIUM
        public static final TagKey<Block> NEEDS_VALTHERIUM_TOOL = createTag("needs_valtherium_tool");
        public static final TagKey<Block> INCORRECT_FOR_VALTHERIUM_TOOL = createTag("incorrect_for_valtherium_tool");

        //OBRYTHIUM
        public static final TagKey<Block> NEEDS_OBRYTHIUM_TOOL = createTag("needs_obrythium_tool");
        public static final TagKey<Block> INCORRECT_FOR_OBRYTHIUM_TOOL = createTag("incorrect_for_obrythium_tool");

        //NYXIUM
        public static final TagKey<Block> NEEDS_NYXIUM_TOOL = createTag("needs_nyxium_tool");
        public static final TagKey<Block> INCORRECT_FOR_NYXIUM_TOOL = createTag("incorrect_for_nyxium_tool");



        private static TagKey<Block> createTag(String name){
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID, name));
        }
    }

    public static class Items{
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");

        //BLIGHT
        public static final TagKey<Item> BLIGHT_TOOLS = createTag("blight_tools");
        public static final TagKey<Item> BLIGHT_REPAIR = createTag("blight_repair");
        public static final TagKey<Item> BLIGHT_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID, "blight_armor"));

        //MYTHRION
        public static final TagKey<Item> MYTHRION_TOOLS = createTag("mythrion_tools");
        public static final TagKey<Item> MYTHRION_REPAIR = createTag("mythrion_repair");
        public static final TagKey<Item> MYTHRION_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID, "mythrion_armor"));

        //ELDRANITE
        public static final TagKey<Item> ELDRANITE_TOOLS = createTag("eldranite_tools");
        public static final TagKey<Item> ELDRANITE_REPAIR = createTag("eldrtanite_repair");
        public static final TagKey<Item> ELDRANITE_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID, "eldranite_armor"));

        //TRIONITE
        public static final TagKey<Item> TRIONITE_TOOLS = createTag("trionite_tools");
        public static final TagKey<Item> TRIONITE_REPAIR = createTag("trionite_repair");
        public static final TagKey<Item> TRIONITE_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID, "trionite_armor"));

        //PYRALITE
        public static final TagKey<Item> PYRALITE_TOOLS = createTag("pyralite_tools");
        public static final TagKey<Item> PYRALITE_REPAIR = createTag("pyralite_repair");
        public static final TagKey<Item> PYRALITE_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID, "pyralite_armor"));

        //VALTHERIUM
        public static final TagKey<Item> VALTHERIUM_TOOLS = createTag("valtherium_tools");
        public static final TagKey<Item> VALTHERIUM_REPAIR = createTag("valtherium_repair");
        public static final TagKey<Item> VALTHERIUM_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID, "valtherium_armor"));

        //OBRYTHIUM
        public static final TagKey<Item> OBRYTHIUM_TOOLS = createTag("obrythium_tools");
        public static final TagKey<Item> OBRYTHIUM_REPAIR = createTag("obrythium_repair");
        public static final TagKey<Item> OBRYTHIUM_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID, "obrythium_armor"));

        //NYXIUM
        public static final TagKey<Item> NYXIUM_TOOLS = createTag("nyxium_tools");
        public static final TagKey<Item> NYXIUM_REPAIR = createTag("eldrtanite_repair");
        public static final TagKey<Item> NYXIUM_ARMOR = TagKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID, "nyxium_armor"));

        private static TagKey<Item> createTag(String name){
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID, name));
        }
    }
}
