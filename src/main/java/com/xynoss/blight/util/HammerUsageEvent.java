package com.xynoss.blight.util;

import com.xynoss.blight.Blight;
import com.xynoss.blight.item.custom.HammerItem;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class HammerUsageEvent implements PlayerBlockBreakEvents.Before{
    // Done with the help of https://github.com/CoFH/CoFHCore/blob/c23d117dcd3b3b3408a138716b15507f709494cd/src/main/java/cofh/core/event/AreaEffectEvents.java
    private static final Set<BlockPos> HARVESTED_BLOCKS = new HashSet<>();

    @Override
    public boolean beforeBlockBreak(World world, PlayerEntity player, BlockPos pos,
                                    BlockState state, @Nullable BlockEntity blockEntity) {
        ItemStack mainHandItem = player.getMainHandStack();

        if(mainHandItem.getItem() instanceof HammerItem hammer && player instanceof ServerPlayerEntity serverPlayer) {
            if(HARVESTED_BLOCKS.contains(pos)) {
                return true;
            }
            for(BlockPos position : HammerItem.getBlocksToBeDestroyed(1, pos, serverPlayer)) {
                if(pos == position || !hammer.isCorrectForDrops(mainHandItem, world.getBlockState(position))) {

//                    if (state.streamTags().anyMatch(tag))
                    if (blockAndItemShareTagByName(world.getBlockState(pos), mainHandItem)) {
                        continue;
                    }
//                    continue;
                }

                HARVESTED_BLOCKS.add(position);
                serverPlayer.interactionManager.tryBreakBlock(position);
                HARVESTED_BLOCKS.remove(position);
            }
        }

        return true;
    }

    public static boolean blockAndItemShareTagByName(BlockState state, ItemStack stack) {
        Set<String> itemTagPaths = stack.streamTags()
                .map(tag -> tag.id().getPath()) // ex: mythrion_tools
                .collect(Collectors.toSet());
        Blight.LOGGER.info("1- itemtags : " + itemTagPaths);

        return state.streamTags()
                .map(tag -> tag.id().getPath()) // ex: needs_mythrion_tool
                .anyMatch(blockTag -> {
                    if (blockTag.startsWith("needs_") && blockTag.endsWith("_tool")) {
                        String material = blockTag.substring(6, blockTag.length() - 5);

                        Blight.LOGGER.info("blocktag : " + blockTag);
                        Blight.LOGGER.info("Material : " + material);
                        Blight.LOGGER.info("2- itemtag : " + itemTagPaths.contains(material + "_tools"));


                        return itemTagPaths.contains(material + "_tools");
                    } else {
                        Blight.LOGGER.info("2- itemtag : " + false);
                        return false;
                    }


//                    return false;
                });
    }
}
