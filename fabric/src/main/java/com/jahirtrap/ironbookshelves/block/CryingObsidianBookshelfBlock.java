package com.jahirtrap.ironbookshelves.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Random;

public class CryingObsidianBookshelfBlock extends BaseBookshelfBlock {
    public CryingObsidianBookshelfBlock(double power, Properties properties) {
        super(power, properties);
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, Random random) {
        if (random.nextInt(5) == 0) {
            Direction direction = Direction.getRandom(random);
            if (direction != Direction.UP) {
                BlockPos blockpos = pos.relative(direction);
                BlockState blockstate = level.getBlockState(blockpos);
                if (!state.canOcclude() || !blockstate.isFaceSturdy(level, blockpos, direction.getOpposite())) {
                    double d = direction.getStepX() == 0 ? random.nextDouble() : 0.5 + direction.getStepX() * 0.6;
                    double e = direction.getStepY() == 0 ? random.nextDouble() : 0.5 + direction.getStepY() * 0.6;
                    double f = direction.getStepZ() == 0 ? random.nextDouble() : 0.5 + direction.getStepZ() * 0.6;
                    level.addParticle(ParticleTypes.DRIPPING_OBSIDIAN_TEAR, pos.getX() + d, pos.getY() + e, pos.getZ() + f, 0, 0, 0);
                }
            }
        }
    }
}
