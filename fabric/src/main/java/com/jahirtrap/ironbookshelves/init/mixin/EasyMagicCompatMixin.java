package com.jahirtrap.ironbookshelves.init.mixin;

import com.jahirtrap.ironbookshelves.util.EnchantmentBonusBlock;
import fuzs.easymagic.world.inventory.ModEnchantmentMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.EnchantmentTableBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ModEnchantmentMenu.class)
public class EasyMagicCompatMixin {

    @Inject(method = "getEnchantingPower", at = @At("HEAD"), cancellable = true)
    private void getEnchantingPower(Level level, BlockPos pos, CallbackInfoReturnable<Integer> cir) {
        float i = 0;
        for (BlockPos blockpos : EnchantmentTableBlock.BOOKSHELF_OFFSETS) {
            BlockPos actualPos = pos.offset(blockpos);
            BlockState state = level.getBlockState(actualPos);
            if (state.getBlock() instanceof EnchantmentBonusBlock bonusBlock)
                i += bonusBlock.getEnchantPowerBonus(state, level, actualPos);
        }
        cir.setReturnValue((int) i);
    }
}
