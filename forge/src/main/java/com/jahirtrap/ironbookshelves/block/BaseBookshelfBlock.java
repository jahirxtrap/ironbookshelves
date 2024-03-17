package com.jahirtrap.ironbookshelves.block;

import com.jahirtrap.ironbookshelves.util.TextUtils;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.PushReaction;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static com.jahirtrap.ironbookshelves.init.IronbookshelvesModConfig.enableTooltips;

public class BaseBookshelfBlock extends Block {
    float power;
    PushReaction reaction;

    public BaseBookshelfBlock(SoundType soundType, float hardness, float resistance, double enchantPower, int lightLevel, PushReaction pushReaction) {
        super(Properties.of(Material.METAL).sound(soundType).strength(hardness, resistance).requiresCorrectToolForDrops()
                .lightLevel($ -> lightLevel));
        power = (float) enchantPower;
        reaction = pushReaction;
    }

    @Override
    public float getEnchantPowerBonus(BlockState state, LevelReader world, BlockPos pos) {
        return power;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter world, List<Component> tooltip, TooltipFlag flag) {
        if (enableTooltips && power != 0) {
            tooltip.add(TextUtils.coloredTextComponent("Ench Power: " + TextUtils.formatText(power), ChatFormatting.GRAY));
        }
    }

    @Override
    public PushReaction getPistonPushReaction(BlockState state) {
        return reaction;
    }
}
