package com.xynoss.blight.item.custom;

import net.minecraft.block.Block;
import net.minecraft.item.Items;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

import java.util.ArrayList;
import java.util.List;

public class HammerItem extends MiningToolItem {
    public HammerItem(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, BlockTags.PICKAXE_MINEABLE,attackDamage,attackSpeed,settings);
    }

    public static List<BlockPos> getBlocksToBeDestroyed(int range, BlockPos initialBlockPos, ServerPlayerEntity player){
        List<BlockPos> positions = new ArrayList<>();
        HitResult hit = player.raycast(20,0,false);

        if (hit.getType() == HitResult.Type.BLOCK){
            BlockHitResult blockHit = (BlockHitResult) hit;

            if (blockHit.getSide() == Direction.DOWN || blockHit.getSide() == Direction.UP){
                for(int x = -range; x <= range ; x++){
                    for(int y =-range ; y <= range ; y++) {
                        positions.add(new BlockPos(initialBlockPos.getX() + x , initialBlockPos.getY(), initialBlockPos.getZ() + y));
                    }
                }
            }
            if (blockHit.getSide() == Direction.NORTH || blockHit.getSide() == Direction.SOUTH){
                for(int x = -range; x <= range ; x++){
                    for(int y =-range ; y <= range ; y++) {
                        positions.add(new BlockPos(initialBlockPos.getX() + x , initialBlockPos.getY()+y, initialBlockPos.getZ()));
                    }
                }
            }
            if (blockHit.getSide() == Direction.EAST || blockHit.getSide() == Direction.WEST){
                for(int x = -range; x <= range ; x++){
                    for(int y =-range ; y <= range ; y++) {
                        positions.add(new BlockPos(initialBlockPos.getX(), initialBlockPos.getY()+ y, initialBlockPos.getZ() + x));
                    }
                }
            }
        }
        return positions;
    }
}
