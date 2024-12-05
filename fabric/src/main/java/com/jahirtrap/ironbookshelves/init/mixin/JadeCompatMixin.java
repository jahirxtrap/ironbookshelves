package com.jahirtrap.ironbookshelves.init.mixin;

import com.jahirtrap.ironbookshelves.util.EnchantmentBonusBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import snownee.jade.util.ClientProxy;

@Mixin(ClientProxy.class)
public abstract class JadeCompatMixin {

    @Inject(method = "getEnchantPowerBonus", at = @At("HEAD"), cancellable = true)
    private static void getEnchantPowerBonus(BlockState state, Level level, BlockPos pos, CallbackInfoReturnable<Float> cir) {
        if (state.getBlock() instanceof EnchantmentBonusBlock bonusBlock) {
            cir.setReturnValue(bonusBlock.getEnchantPowerBonus(state, level, pos));
        }
    }
}
