package com.xynoss.blight.block;

import com.xynoss.blight.Blight;
import com.xynoss.blight.block.custom.*;
import com.xynoss.blight.item.ModItems;
import com.xynoss.blight.item.custom.HammerItem;
import com.xynoss.blight.sound.ModSounds;
import com.xynoss.blight.util.ModTags;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.BlockView;

import java.util.List;


public class ModBlocks {

//Tuto blocks/ores
    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block", new Block(AbstractBlock.Settings.create()
        .strength(4f)
        .requiresTool()
        .sounds(BlockSoundGroup.AMETHYST_BLOCK)
        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"pink_garnet_block")))
    ));
    public static final Block RAW_PINK_GARNET_BLOCK = registerBlock("raw_pink_garnet_block", new Block(AbstractBlock.Settings.create()
        .strength(3f)
        .requiresTool()
        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"raw_pink_garnet_block")))
    ));
    public static final Block MAGIC_BLOCK = registerBlock("magic_block", new MagicBlock(AbstractBlock.Settings.create()
        .strength(1f)
        .requiresTool()
            .sounds(ModSounds.MAGIC_BLOCK_SOUND)
        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"magic_block")))
    ));

    public static final Block PINK_GARNET_STAIRS = registerBlock("pink_garnet_stairs", new StairsBlock(ModBlocks.PINK_GARNET_BLOCK.getDefaultState(),
            AbstractBlock.Settings.create().strength(2f).requiresTool()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"pink_garnet_stairs")))
    ));
    public static final Block PINK_GARNET_SLAB = registerBlock("pink_garnet_slab", new SlabBlock(
                AbstractBlock.Settings.create().strength(2f).requiresTool()
                .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"pink_garnet_slab")))
    ));

    public static final Block PINK_GARNET_BUTTON = registerBlock("pink_garnet_button", new ButtonBlock(BlockSetType.IRON, 2,
                AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()
                .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"pink_garnet_button")))
    ));
    public static final Block PINK_GARNET_PRESSURE_PLATE = registerBlock("pink_garnet_pressure_plate", new PressurePlateBlock(BlockSetType.IRON,
                AbstractBlock.Settings.create().strength(2f).requiresTool()
                .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"pink_garnet_pressure_plate")))
    ));

    public static final Block PINK_GARNET_FENCE = registerBlock("pink_garnet_fence", new FenceBlock(
                AbstractBlock.Settings.create().strength(2f).requiresTool()
                .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"pink_garnet_fence")))
    ));
    public static final Block PINK_GARNET_FENCE_GATE = registerBlock("pink_garnet_fence_gate", new FenceGateBlock(WoodType.ACACIA,
                AbstractBlock.Settings.create().strength(2f).requiresTool()
                        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"pink_garnet_fence_gate")))
    ));
    public static final Block PINK_GARNET_WALL = registerBlock("pink_garnet_wall", new WallBlock(
                AbstractBlock.Settings.create().strength(2f).requiresTool()
                        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"pink_garnet_wall")))
    ));

    public static final Block PINK_GARNET_DOOR = registerBlock("pink_garnet_door", new DoorBlock(BlockSetType.IRON,
                AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()
                        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"pink_garnet_door")))
    ));
    public static final Block PINK_GARNET_TRAPDOOR = registerBlock("pink_garnet_trapdoor", new TrapdoorBlock(BlockSetType.IRON,
                AbstractBlock.Settings.create().strength(2f).requiresTool().nonOpaque()
                        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"pink_garnet_trapdoor")))
    ));

    public static final Block PINK_GARNET_LAMP = registerBlock("pink_garnet_lamp", new PinkGarnetLampBlock(
            AbstractBlock.Settings.create().strength(1f).luminance(state -> state.get(PinkGarnetLampBlock.CLICKED) ? 15 : 0)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"pink_garnet_lamp")))
    ));

    public static final Block CAULIFLOWER_CROP = registerBlockWithoutBlockItem("cauliflower_crop", new CauliflowerCropBlock(
            AbstractBlock.Settings.create().noCollision().ticksRandomly().breakInstantly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY).mapColor(MapColor.DARK_GREEN)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"cauliflower_crop")))
    ));
    public static final Block HONEY_BERRY_BUSH = registerBlockWithoutBlockItem("honey_berry_bush",
            new HoneyBerryBushBlock(AbstractBlock.Settings.copy(Blocks.SWEET_BERRY_BUSH)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"honey_berry_bush")))
            ));

//Blight Blocks
    public static final Block BLIGHT_BLOCK = registerBlock("blight_block", new Block(AbstractBlock.Settings.create()
        .strength(4f)
        .requiresTool()
        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"blight_block")))
    ));
    public static final Block RAW_BLIGHT_BLOCK = registerBlock("raw_blight_block", new Block(AbstractBlock.Settings.create()
        .strength(3f)
        .requiresTool()
        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"raw_blight_block")))
    ));

//Blight Ores
    public static final Block BLIGHT_ORE = registerBlock("blight_ore",new ExperienceDroppingBlock(
        UniformIntProvider.create(2, 5),
        AbstractBlock.Settings.create()
        .strength(3f)
        .requiresTool()
        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"blight_ore")))
    ));
    public static final Block DEEPSLATE_BLIGHT_ORE = registerBlock("deepslate_blight_ore",new ExperienceDroppingBlock(
        UniformIntProvider.create(3, 6),
        AbstractBlock.Settings.create().
        strength(10f, 1200f)
        .requiresTool()
        .sounds(BlockSoundGroup.DEEPSLATE)
        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"deepslate_blight_ore")))
    ));
    public static final Block BURNING_STONE = registerBlock("burning_stone", new BurningStone(AbstractBlock.Settings.create()
            .strength(4)
            .requiresTool()
            .luminance(state -> 5)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"burning_stone")))
    ){
        @Override
        public float calcBlockBreakingDelta(BlockState state, PlayerEntity player, BlockView world, BlockPos pos) {
            float original = super.calcBlockBreakingDelta(state, player, world, pos);

            // Vérifier si le joueur utilise un outil en blight
            ItemStack tool = player.getMainHandStack();
            if (!(tool.getItem() instanceof PickaxeItem) && !(tool.getItem() instanceof HammerItem) || !isMythrion(tool)) {
                // Réduire considérablement la vitesse de minage (0.05F = 20 fois plus lent)
                return original * 0.05F;
            }

            return original;
        }

        private boolean isMythrion(ItemStack stack) {
            // Vérifier si l'outil est en blight
            return stack.isOf(ModItems.MYTHRION_PICKAXE) || stack.isOf(ModItems.MYTHRION_HAMMER);
        }
    });

    //Mythrion
    public static final Block DEEPSLATE_MYTHRION_ORE = registerBlock("deepslate_mythrion_ore",new Block(
            AbstractBlock.Settings.create()
            .strength(4f)
            .requiresTool()
            .sounds(BlockSoundGroup.DEEPSLATE)
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"deepslate_mythrion_ore")))
    ));
    public static final Block MYTHRION_BLOCK = registerBlock("mythrion_block", new Block(AbstractBlock.Settings.create()
            .strength(4f)
            .requiresTool()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"mythrion_block")))
    ));
    public static final Block RAW_MYTHRION_BLOCK = registerBlock("raw_mythrion_block", new Block(AbstractBlock.Settings.create()
            .strength(4f)
            .requiresTool()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"raw_mythrion_block")))
    ));

    //ELDRANITE
    public static final Block NETHER_ELDRANITE_ORE = registerBlock("nether_eldranite_ore",new OreBlocks(
            UniformIntProvider.create(1, 1),
            AbstractBlock.Settings.create().
                    strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.NETHER_ORE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"nether_eldranite_ore"))),
            List.of(ModTags.Items.MYTHRION_TOOLS, ModTags.Items.ELDRANITE_TOOLS, ModTags.Items.TRIONITE_TOOLS, ModTags.Items.PYRALITE_TOOLS)
    ));
    public static final Block ELDRANITE_BLOCK = registerBlock("eldranite_block", new Block(AbstractBlock.Settings.create()
            .strength(4f)
            .requiresTool()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"eldranite_block")))
    ));
    public static final Block RAW_ELDRANITE_BLOCK = registerBlock("raw_eldranite_block", new Block(AbstractBlock.Settings.create()
            .strength(4f)
            .requiresTool()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"raw_eldranite_block")))
    ));

    //TRIONITE
    public static final Block NETHER_TRIONITE_ORE = registerBlock("nether_trionite_ore",new OreBlocks(
            UniformIntProvider.create(1, 1),
            AbstractBlock.Settings.create().
                    strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.NETHER_ORE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"nether_trionite_ore"))),
            List.of(ModTags.Items.ELDRANITE_TOOLS, ModTags.Items.TRIONITE_TOOLS, ModTags.Items.PYRALITE_TOOLS)
    ));
    public static final Block TRIONITE_BLOCK = registerBlock("trionite_block", new Block(AbstractBlock.Settings.create()
            .strength(4f)
            .requiresTool()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"trionite_block")))
    ));
    public static final Block RAW_TRIONITE_BLOCK = registerBlock("raw_trionite_block", new Block(AbstractBlock.Settings.create()
            .strength(4f)
            .requiresTool()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"raw_trionite_block")))
    ));

    //PYRALITE
    public static final Block NETHER_PYRALITE_ORE = registerBlock("nether_pyralite_ore",new OreBlocks(
            UniformIntProvider.create(1, 1),
            AbstractBlock.Settings.create().
                    strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.NETHER_ORE)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"nether_pyralite_ore"))),
            List.of(ModTags.Items.TRIONITE_TOOLS, ModTags.Items.PYRALITE_TOOLS)
    ));
    public static final Block PYRALITE_BLOCK = registerBlock("pyralite_block", new Block(AbstractBlock.Settings.create()
            .strength(4f)
            .requiresTool()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"pyralite_block")))
    ));
    public static final Block RAW_PYRALITE_BLOCK = registerBlock("raw_pyralite_block", new Block(AbstractBlock.Settings.create()
            .strength(4f)
            .requiresTool()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"raw_pyralite_block")))
    ));


    //Nyxium
    public static final Block NYXIUM_ORE = registerBlock("nyxium_ore", new OreBlocks(UniformIntProvider.create(1, 1), AbstractBlock.Settings.create()
                .strength(4f)
                .requiresTool()
                .sounds(BlockSoundGroup.STONE)
                .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"nyxium_ore"))),
            List.of(ModTags.Items.MYTHRION_TOOLS)
    ));
    public static final Block NYXIUM_BLOCK = registerBlock("nyxium_block", new Block(AbstractBlock.Settings.create()
            .strength(4f)
            .requiresTool()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"nyxium_block")))
    ));
    public static final Block RAW_NYXIUM_BLOCK = registerBlock("raw_nyxium_block", new Block(AbstractBlock.Settings.create()
            .strength(4f)
            .requiresTool()
            .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID,"raw_nyxium_block")))
    ));



//Function
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID, name)), block);
    }

    private static Block registerBlockWithoutBlockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Blight.MOD_ID, name)), block);
    }

    private static void registerBlockItem(String name, Block block) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Blight.MOD_ID, name));
        BlockItem item = new BlockItem(block, new Item.Settings().registryKey(key));
        Registry.register(Registries.ITEM, key, item);

    }

    public static void registerModBlocks(){
        Blight.LOGGER.info("Registering Mod Blocks for " + Blight.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.PINK_GARNET_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);
        });

    }
}
