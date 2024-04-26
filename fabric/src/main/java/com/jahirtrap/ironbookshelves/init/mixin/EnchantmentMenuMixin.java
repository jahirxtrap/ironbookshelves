package com.jahirtrap.ironbookshelves.init.mixin;

import com.jahirtrap.ironbookshelves.util.EnchantmentBonusBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.inventory.EnchantmentMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.EnchantingTableBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(EnchantmentMenu.class)
public abstract class EnchantmentMenuMixin {
    @ModifyVariable(
            method = {"method_17411", "m_mpsetdhw", "lambda$slotsChanged$0"},
            at = @At(value = "STORE", ordinal = 0), ordinal = 0, remap = false
    )
    private int modifyEnchantValue(int obj, ItemStack stack, Level level, BlockPos pos) {
        for (BlockPos blockPos : EnchantingTableBlock.BOOKSHELF_OFFSETS) {
            BlockPos actualPos = pos.offset(blockPos);
            BlockState state = level.getBlockState(actualPos);
            if (state.getBlock() instanceof EnchantmentBonusBlock bonusBlock)
                obj += bonusBlock.getEnchantPowerBonus(state, level, actualPos);
        }
        return obj;
    }
}
