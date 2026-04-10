package com.jahirtrap.ironbookshelves.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class BaseBookshelfBlock extends Block {
    private final float power;

    public BaseBookshelfBlock(double power, Properties properties) {
        super(properties);
        this.power = (float) power;
    }

    @Override
    public float getEnchantPowerBonus(BlockState state, BlockGetter level, BlockPos pos) {
        return power;
    }
}
