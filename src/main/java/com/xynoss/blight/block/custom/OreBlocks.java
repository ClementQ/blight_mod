package com.xynoss.blight.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.world.BlockView;

import java.util.List;


public class OreBlocks extends ExperienceDroppingBlock {

    private final List<TagKey<Item>> neededTools;

    public OreBlocks(IntProvider experienceDropped, Settings settings, List<TagKey<Item>> neededTools) {
        super(experienceDropped,settings);
        this.neededTools = neededTools;
    }

    // function de detection
    @Override
    public float calcBlockBreakingDelta(BlockState state, PlayerEntity player, BlockView world, BlockPos pos) {
        float original = super.calcBlockBreakingDelta(state, player, world, pos);

        // Check if player use the correct tool for mining
        ItemStack tool = player.getMainHandStack();
        boolean validTool = neededTools.stream().anyMatch(tool::isIn);

        if (!validTool) {
            // Vastly reduce mining speed (0.05F = 20 times more lower)
            return original * 0.05F;
        }
        return original;
    }

}
