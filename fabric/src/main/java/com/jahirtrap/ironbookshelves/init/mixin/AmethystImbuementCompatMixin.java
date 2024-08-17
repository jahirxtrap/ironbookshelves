package com.jahirtrap.ironbookshelves.init.mixin;

import com.jahirtrap.ironbookshelves.util.EnchantmentBonusBlock;
import me.fzzyhmstrs.amethyst_imbuement.screen.ImbuingTableScreenHandler;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.EnchantmentTableBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ImbuingTableScreenHandler.class)
public abstract class AmethystImbuementCompatMixin {

    @Inject(method = "checkBookshelves", at = @At("HEAD"), cancellable = true)
    private void getEnchantPowerBonus(Level level, BlockPos pos, CallbackInfoReturnable<Integer> cir) {
        float i = 0;
        for (BlockPos blockPos : EnchantmentTableBlock.BOOKSHELF_OFFSETS) {
            BlockPos actualPos = pos.offset(blockPos);
            BlockState state = level.getBlockState(actualPos);
            if (state.getBlock() instanceof EnchantmentBonusBlock bonusBlock)
                i += bonusBlock.getEnchantPowerBonus(state, level, actualPos) - 1;
            if (!EnchantmentTableBlock.isValidBookShelf(level, pos, blockPos)) continue;
            i++;
        }
        cir.setReturnValue(Math.round(i));
    }
}
