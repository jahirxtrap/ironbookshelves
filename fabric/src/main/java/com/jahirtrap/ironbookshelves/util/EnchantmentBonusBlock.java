package com.jahirtrap.ironbookshelves.util;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public interface EnchantmentBonusBlock {
    default float getEnchantPowerBonus(BlockState state, LevelReader level, BlockPos pos) {
        return state.is(Blocks.BOOKSHELF) ? 1 : 0;
    }
}
