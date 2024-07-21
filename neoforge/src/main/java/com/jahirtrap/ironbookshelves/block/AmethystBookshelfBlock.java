package com.jahirtrap.ironbookshelves.block;

import com.jahirtrap.ironbookshelves.init.ModConfig;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.BlockHitResult;

public class AmethystBookshelfBlock extends BaseBookshelfBlock {
    public AmethystBookshelfBlock() {
        super(SoundType.AMETHYST, 1.5f, 1.5f, ModConfig.amethystEnchantPower, 0, PushReaction.NORMAL);
    }

    @Override
    public void onProjectileHit(Level level, BlockState state, BlockHitResult hitResult, Projectile projectile) {
        if (!level.isClientSide) {
            BlockPos pos = hitResult.getBlockPos();
            level.playSound(null, pos, SoundEvents.AMETHYST_BLOCK_HIT, SoundSource.BLOCKS, 1, 0.5f + level.random.nextFloat() * 1.2f);
            level.playSound(null, pos, SoundEvents.AMETHYST_BLOCK_CHIME, SoundSource.BLOCKS, 1, 0.5f + level.random.nextFloat() * 1.2f);
        }
    }
}
