package com.xynoss.blight.item.custom;


import com.xynoss.blight.block.ModBlocks;
import com.xynoss.blight.component.ModDataComponentTypes;
import com.xynoss.blight.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.world.World;

import java.util.List;
import java.util.Map;

public class ChiselItem extends Item {

    public static final Map<Block, Block> CHISEL_MAP =
        Map.of(
            Blocks.STONE, Blocks.STONE_BRICKS,
            Blocks.END_STONE, Blocks.END_STONE_BRICKS,
            Blocks.OAK_LOG, ModBlocks.BLIGHT_BLOCK,
            Blocks.GOLD_BLOCK, Blocks.NETHERITE_BLOCK
        );
    public ChiselItem(Settings settings) {super(settings);}

    public static void createChiselItem() {
        ItemStack stack = new ItemStack(ModItems.CHISEL_ITEM);
        stack.set(ModDataComponentTypes.CHISEL_USED, false);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        Block clickedBlock = world.getBlockState(context.getBlockPos()).getBlock();
        context.getStack().set(ModDataComponentTypes.CHISEL_USED, false);

        if(CHISEL_MAP.containsKey(clickedBlock)){
            if (!world.isClient()){
                world.setBlockState(context.getBlockPos(), CHISEL_MAP.get(clickedBlock).getDefaultState());

                context.getStack().damage(1, ((ServerWorld) world), ((ServerPlayerEntity) context.getPlayer()),
                        item -> context.getPlayer().sendEquipmentBreakStatus(item, EquipmentSlot.MAINHAND));

                world.playSound(null, context.getBlockPos(), SoundEvents.BLOCK_GRINDSTONE_USE, SoundCategory.BLOCKS);

                context.getStack().set(ModDataComponentTypes.COORDINATES, context.getBlockPos());
                context.getStack().set(ModDataComponentTypes.CHISEL_USED, true);


            }
        }

        return ActionResult.SUCCESS;
    }

    @Override
    public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
        if (Screen.hasShiftDown()){
            tooltip.add(Text.translatable("tooltip.blight.chisel.shift_down"));
        } else {
            tooltip.add(Text.translatable("tooltip.blight.chisel"));
        }
        tooltip.add(Text.literal("Used " + stack.get(ModDataComponentTypes.CHISEL_USED)));
        if (stack.get(ModDataComponentTypes.COORDINATES) != null){
            tooltip.add(Text.literal("Last block changed at " + stack.get(ModDataComponentTypes.COORDINATES)));
            tooltip.add(Text.literal("Used " + stack.get(ModDataComponentTypes.CHISEL_USED)));
        }

        super.appendTooltip(stack, context, tooltip, type);
    }
}
