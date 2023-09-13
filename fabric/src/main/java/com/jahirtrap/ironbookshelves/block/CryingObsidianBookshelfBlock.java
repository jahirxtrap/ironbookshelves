package com.jahirtrap.ironbookshelves.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.PushReaction;

import java.util.Random;

import static com.jahirtrap.ironbookshelves.init.IronbookshelvesModConfig.cryingObsidianEnchantPower;

public class CryingObsidianBookshelfBlock extends BaseBookshelfBlock {
    public CryingObsidianBookshelfBlock() {
        super(SoundType.STONE, 50f, 1200f, cryingObsidianEnchantPower, 3, 10, PushReaction.BLOCK);
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, Random rand) {
        if (rand.nextInt(5) == 0) {
            Direction direction = Direction.getRandom(rand);
            if (direction != Direction.UP) {
                BlockPos blockpos = pos.relative(direction);
                BlockState blockstate = level.getBlockState(blockpos);
                if (!state.canOcclude() || !blockstate.isFaceSturdy(level, blockpos, direction.getOpposite())) {
                    double d0 = direction.getStepX() == 0 ? rand.nextDouble() : 0.5D + (double) direction.getStepX() * 0.6D;
                    double d1 = direction.getStepY() == 0 ? rand.nextDouble() : 0.5D + (double) direction.getStepY() * 0.6D;
                    double d2 = direction.getStepZ() == 0 ? rand.nextDouble() : 0.5D + (double) direction.getStepZ() * 0.6D;
                    level.addParticle(ParticleTypes.DRIPPING_OBSIDIAN_TEAR, (double) pos.getX() + d0, (double) pos.getY() + d1, (double) pos.getZ() + d2, 0.0D, 0.0D, 0.0D);
                }
            }
        }
    }
}
