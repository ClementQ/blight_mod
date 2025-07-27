package com.xynoss.blight.util;

import com.xynoss.blight.item.custom.HammerItem;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class HammerUsageEvent implements PlayerBlockBreakEvents.Before {
    private static final Set<BlockPos> HARVESTED_BLOCKS = new HashSet<>();

    @Override
    public boolean beforeBlockBreak(World world, PlayerEntity player, BlockPos pos,BlockState state, @Nullable BlockEntity blockEntity) {
        if (!(player instanceof ServerPlayerEntity serverPlayer)) return true;

        ItemStack mainHandItem = player.getMainHandStack();

        if (!(mainHandItem.getItem() instanceof HammerItem hammer)) return true;

        // Empêche de re-casser le même bloc dans la boucle
        if (HARVESTED_BLOCKS.contains(pos)) return true;

        // Récupère tous les blocs affectés par le marteau
        List<BlockPos> area = HammerItem.getBlocksToBeDestroyed(1, pos, serverPlayer);

        for (BlockPos targetPos : area) {
            // On évite de traiter plusieurs fois le même bloc
            if (HARVESTED_BLOCKS.contains(targetPos)) continue;

            BlockState targetState = world.getBlockState(targetPos);

            // Vérifie que le marteau peut casser ce bloc (avec tags custom)
            if (!blockAndItemShareTagByName(targetState, mainHandItem)) continue;

            HARVESTED_BLOCKS.add(targetPos);
            serverPlayer.interactionManager.tryBreakBlock(targetPos);
        }

        // Nettoie les blocs déjà cassés après exécution
        HARVESTED_BLOCKS.clear();

        return true; // Laisse Minecraft casser le bloc initial
    }

    public static boolean blockAndItemShareTagByName(BlockState state, ItemStack stack) {
        Set<String> itemTagPaths = stack.streamTags()
                .map(tag -> tag.id().getPath()) // ex: trionite_tools
                .collect(Collectors.toSet());

        boolean hasSpecialRequirement = false;

        for (TagKey<Block> blockTag : state.streamTags().toList()) {
            String path = blockTag.id().getPath(); // ex: needs_trionite_tool
            if (path.startsWith("needs_") && path.endsWith("_tool")) {
                hasSpecialRequirement = true;
                String material = path.substring(6, path.length() - 5);
                if (itemTagPaths.contains(material + "_tools")) {
                    return true;
                }
            }
        }

        // Si aucun tag "needs_<x>_tool" trouvé, on accepte si c'est un bloc pickaxe
        return !hasSpecialRequirement && state.isIn(BlockTags.PICKAXE_MINEABLE);
    }
}
