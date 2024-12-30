package com.jahirtrap.ironbookshelves.block;

import com.jahirtrap.ironbookshelves.util.EnchantmentBonusBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class BaseBookshelfBlock extends Block implements EnchantmentBonusBlock {
    private final float power;

    public BaseBookshelfBlock(double power, Properties properties) {
        super(properties);
        this.power = (float) power;
    }

    @Override
    public float getEnchantPowerBonus(BlockState state, LevelReader level, BlockPos pos) {
        return power;
    }
}
