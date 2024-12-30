package com.jahirtrap.ironbookshelves.init.mixin;

import com.jahirtrap.ironbookshelves.util.EnchantmentBonusBlock;
import com.jahirtrap.tooltips.init.ModTooltips;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ModTooltips.class)
public abstract class TooltipsCompatMixin {

    @Inject(method = "getEnchantPowerBonus", at = @At("HEAD"), cancellable = true)
    private static void getEnchantPowerBonus(Level level, Block block, CallbackInfoReturnable<Float> cir) {
        if (block instanceof EnchantmentBonusBlock bonusBlock) {
            cir.setReturnValue(bonusBlock.getEnchantPowerBonus(block.defaultBlockState(), level, BlockPos.ZERO));
        }
    }
}
