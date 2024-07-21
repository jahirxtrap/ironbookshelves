package com.jahirtrap.ironbookshelves.init.mixin;

import com.jahirtrap.ironbookshelves.util.EnchantmentBonusBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.EnchantmentTableBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EnchantmentTableBlock.class)
public abstract class EnchantmentTableBlockMixin {

    @Inject(method = "isValidBookShelf", at = @At("HEAD"), cancellable = true)
    private static void isValidBookShelf(Level level, BlockPos pos, BlockPos pos1, CallbackInfoReturnable<Boolean> cir) {
        BlockState state = level.getBlockState(pos.offset(pos1));
        if (state.getBlock() instanceof EnchantmentBonusBlock bonusBlock)
            cir.setReturnValue(bonusBlock.getEnchantPowerBonus(state, level, pos.offset(pos1)) != 0 && level.isEmptyBlock(pos.offset(pos1.getX() / 2, pos1.getY(), pos1.getZ() / 2)));
    }
}
