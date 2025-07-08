package com.xynoss.blight.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.world.BlockView;


public class OreBlocks extends ExperienceDroppingBlock {

    private final TagKey<Item> neededTool;

    public OreBlocks(IntProvider experienceDropped, Settings settings, TagKey<Item> neededTool) {
        super(experienceDropped,settings);
        this.neededTool = neededTool;
    }

    // function de detection
    @Override
    public float calcBlockBreakingDelta(BlockState state, PlayerEntity player, BlockView world, BlockPos pos) {
        float original = super.calcBlockBreakingDelta(state, player, world, pos);

        // Check if player use the correct tool for mining
        ItemStack handedTool = player.getMainHandStack();
        if (!handedTool.isIn(neededTool)) {
            // Vastly reduce mining speed (0.05F = 20 times more lower)
            return original * 0.05F;
        }
        return original;
    }

}
