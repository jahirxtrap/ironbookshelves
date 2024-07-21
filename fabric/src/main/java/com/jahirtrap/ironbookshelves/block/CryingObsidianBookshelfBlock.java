package com.jahirtrap.ironbookshelves.block;

import com.jahirtrap.ironbookshelves.init.ModConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.PushReaction;

import java.util.Random;

public class CryingObsidianBookshelfBlock extends BaseBookshelfBlock {
    public CryingObsidianBookshelfBlock() {
        super(SoundType.STONE, 50f, 1200f, ModConfig.cryingObsidianEnchantPower, 10, PushReaction.BLOCK);
    }

    @Override
    public void animateTick(BlockState state, Level level, BlockPos pos, Random rand) {
        if (rand.nextInt(5) == 0) {
            Direction direction = Direction.getRandom(rand);
            if (direction != Direction.UP) {
                BlockPos blockpos = pos.relative(direction);
                BlockState blockstate = level.getBlockState(blockpos);
                if (!state.canOcclude() || !blockstate.isFaceSturdy(level, blockpos, direction.getOpposite())) {
                    double d = direction.getStepX() == 0 ? rand.nextDouble() : 0.5 + direction.getStepX() * 0.6;
                    double e = direction.getStepY() == 0 ? rand.nextDouble() : 0.5 + direction.getStepY() * 0.6;
                    double f = direction.getStepZ() == 0 ? rand.nextDouble() : 0.5 + direction.getStepZ() * 0.6;
                    level.addParticle(ParticleTypes.DRIPPING_OBSIDIAN_TEAR, pos.getX() + d, pos.getY() + e, pos.getZ() + f, 0, 0, 0);
                }
            }
        }
    }
}
