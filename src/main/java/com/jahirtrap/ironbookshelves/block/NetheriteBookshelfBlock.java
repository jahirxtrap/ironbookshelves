package com.jahirtrap.ironbookshelves.block;

import com.jahirtrap.ironbookshelves.init.IronbookshelvesModBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
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
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Collections;
import java.util.List;

public class NetheriteBookshelfBlock extends Block {
    public NetheriteBookshelfBlock() {
        super(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.NETHERITE_BLOCK).strength(50f, 1200f).requiresCorrectToolForDrops()
                .noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        ItemBlockRenderTypes.setRenderLayer(IronbookshelvesModBlocks.NETHERITE_BOOKSHELF.get(), renderType -> renderType == RenderType.cutout());
    }

    @Override
    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 15;
    }

    @Override
    public float getEnchantPowerBonus(BlockState state, LevelReader world, BlockPos pos) {
        return 10f;
    }

    @Override
    public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
        if (player.getInventory().getSelected().getItem() instanceof TieredItem tieredItem)
            return tieredItem.getTier().getLevel() >= 3;
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
