package com.jahirtrap.ironbookshelves.util;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;

import static com.jahirtrap.ironbookshelves.util.CommonUtils.isCorrectToolForDrops;

public interface HarvestableBlock {
    default boolean canHarvestBlock(BlockState state, BlockGetter level, BlockPos pos, Player player) {
        return isCorrectToolForDrops(state, player);
    }
}
