package com.jahirtrap.ironbookshelves.init.mixin;

import com.jahirtrap.ironbookshelves.util.EnchantmentBonusBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.EnchantmentTableBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.Iterator;
import java.util.Random;

@Mixin(EnchantmentTableBlock.class)
public abstract class EnchantmentTableBlockMixin {

    private static boolean isValid(Level level, BlockPos blockPos, BlockPos blockPos2) {
        BlockState state = level.getBlockState(blockPos.offset(blockPos2));
        if (state.getBlock() instanceof EnchantmentBonusBlock bonusBlock)
            return bonusBlock.getEnchantPowerBonus(state, level, blockPos.offset(blockPos2)) != 0 && level.isEmptyBlock(blockPos.offset(blockPos2.getX() / 2, blockPos2.getY(), blockPos2.getZ() / 2));
        return false;
    }

    @Inject(method = "isValidBookShelf", at = @At("HEAD"), cancellable = true)
    private static void isValidBookShelf(Level level, BlockPos blockPos, BlockPos blockPos2, CallbackInfoReturnable<Boolean> cir) {
        BlockState state = level.getBlockState(blockPos.offset(blockPos2));
        if (state.getBlock() instanceof EnchantmentBonusBlock bonusBlock)
            cir.setReturnValue(bonusBlock.getEnchantPowerBonus(state, level, blockPos.offset(blockPos2)) != 0 && level.isEmptyBlock(blockPos.offset(blockPos2.getX() / 2, blockPos2.getY(), blockPos2.getZ() / 2)));
    }

    @Inject(method = "animateTick", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I"), locals = LocalCapture.CAPTURE_FAILHARD)
    public void particles(BlockState state, Level level, BlockPos pos, Random random, CallbackInfo ci, Iterator var5, BlockPos blockPos) {
        if (random.nextInt(16) == 0 && isValid(level, pos, blockPos)) {
            level.addParticle(ParticleTypes.ENCHANT, (double) pos.getX() + 0.5D, (double) pos.getY() + 2.0D, (double) pos.getZ() + 0.5D, (double) ((float) blockPos.getX() + random.nextFloat()) - 0.5D, (float) blockPos.getY() - random.nextFloat() - 1.0F, (double) ((float) blockPos.getZ() + random.nextFloat()) - 0.5D);
        }
    }
}
