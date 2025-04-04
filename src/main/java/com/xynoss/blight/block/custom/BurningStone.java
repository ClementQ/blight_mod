package com.xynoss.blight.block.custom;


import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class BurningStone extends Block {

    public BurningStone(Settings settings) {
        super(settings);
    }


    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (!entity.bypassesSteppingEffects() && entity instanceof LivingEntity livingEntity) {
            if (world instanceof ServerWorld serverWorld) {
                livingEntity.damage(serverWorld, serverWorld.getDamageSources().hotFloor(), 1.0F);
            }
        }
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (random.nextInt(5) == 0) {
            Direction direction = Direction.random(random);
            BlockPos blockPos = pos.offset(direction);
            BlockState blockState = world.getBlockState(blockPos);
            if (!state.isOpaque() || !blockState.isSideSolidFullSquare(world, blockPos, direction.getOpposite())) {
                double d = direction.getOffsetX() == 0 ? random.nextDouble() : (double)0.5F + (double)direction.getOffsetX() * 0.6;
                double e = direction.getOffsetY() == 0 ? random.nextDouble() : (double)0.5F + (double)direction.getOffsetY() * 0.6;
                double f = direction.getOffsetZ() == 0 ? random.nextDouble() : (double)0.5F + (double)direction.getOffsetZ() * 0.6;
                world.addParticle(ParticleTypes.FLAME, (double)pos.getX() + d, (double)pos.getY() + e, (double)pos.getZ() + f, (double)0.0F, (double)0.0F, (double)0.0F);
            }
        }
        if (random.nextInt(50) == 0) {
            world.playSound((double)pos.getX() + (double)0.5F, (double)pos.getY() + (double)0.5F, (double)pos.getZ() + (double)0.5F, SoundEvents.BLOCK_FIRE_AMBIENT, SoundCategory.BLOCKS, 0.5F + random.nextFloat(), random.nextFloat() * 0.2F + 0.3F, false);
        }

    }
}
