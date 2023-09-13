package com.jahirtrap.ironbookshelves.block;

import com.jahirtrap.ironbookshelves.util.EnchantmentBonusBlock;
import com.jahirtrap.ironbookshelves.util.HarvestableBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.storage.loot.LootContext;

import java.util.Collections;
import java.util.List;

public class BaseBookshelfBlock extends Block implements EnchantmentBonusBlock, HarvestableBlock {
    float power;
    int harvestLevel;
    PushReaction reaction;

    public BaseBookshelfBlock(SoundType soundType, float hardness, float resistance, double enchantPower, int canHarvestLevel, int lightLevel, PushReaction pushReaction) {
        super(BlockBehaviour.Properties.of(Material.METAL).sound(soundType).strength(hardness, resistance).requiresCorrectToolForDrops().noOcclusion()
                .isRedstoneConductor((bs, br, bp) -> false).lightLevel($ -> lightLevel));
        power = (float) enchantPower;
        harvestLevel = canHarvestLevel;
        reaction = pushReaction;
    }

    @Override
    public float getEnchantPowerBonus(BlockState state, LevelReader world, BlockPos pos) {
        return power;
    }

    @Override
    public PushReaction getPistonPushReaction(BlockState state) {
        return reaction;
    }

    @Override
    public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
        if (player.getInventory().getSelected().getItem() instanceof TieredItem tieredItem)
            return tieredItem.getTier().getLevel() >= harvestLevel;
        return false;
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        if (!dropsOriginal.isEmpty())
            return dropsOriginal;
        return Collections.singletonList(new ItemStack(this, 1));
    }
}
