package com.jahirtrap.ironbookshelves.block;

import com.jahirtrap.ironbookshelves.init.ModConfig;
import com.jahirtrap.ironbookshelves.util.EnchantmentBonusBlock;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static com.jahirtrap.ironbookshelves.util.CommonUtils.coloredTextComponent;
import static com.jahirtrap.ironbookshelves.util.CommonUtils.formatText;

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

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter level, List<Component> tooltip, TooltipFlag flag) {
        if (ModConfig.enableTooltips && power != 0)
            tooltip.add(coloredTextComponent(new TranslatableComponent("ironbookshelves.bookshelf.power").getString() + formatText(power), ChatFormatting.GRAY));
    }
}
