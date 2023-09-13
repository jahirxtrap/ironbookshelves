package com.jahirtrap.ironbookshelves.block;

import com.jahirtrap.ironbookshelves.util.TextUtils;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.storage.loot.LootParams;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;

import static com.jahirtrap.ironbookshelves.init.IronbookshelvesModConfig.ENABLE_TOOLTIPS;

public class BaseBookshelfBlock extends Block {
    float power;
    int harvestLevel;

    public BaseBookshelfBlock(SoundType soundType, float hardness, float resistance, double enchantPower, int canHarvestLevel, int lightLevel, PushReaction pushReaction) {
        super(BlockBehaviour.Properties.of().mapColor(MapColor.METAL).sound(soundType).strength(hardness, resistance).requiresCorrectToolForDrops().noOcclusion()
                .isRedstoneConductor((bs, br, bp) -> false).lightLevel($ -> lightLevel).pushReaction(pushReaction));
        power = (float) enchantPower;
        harvestLevel = canHarvestLevel;
    }

    @Override
    public float getEnchantPowerBonus(BlockState state, LevelReader world, BlockPos pos) {
        return power;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter world, List<Component> tooltip, TooltipFlag flag) {
        if (ENABLE_TOOLTIPS.get()) {
            tooltip.add(TextUtils.coloredTextComponent("Ench Power: " + TextUtils.formatText(power), ChatFormatting.GRAY));
        }
    }

    @Override
    public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
        if (player.getInventory().getSelected().getItem() instanceof TieredItem tieredItem)
            return tieredItem.getTier().getLevel() >= harvestLevel;
        return false;
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(this, 1));
    }
}
