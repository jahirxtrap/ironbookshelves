package com.jahirtrap.ironbookshelves.block;

import com.jahirtrap.ironbookshelves.IronbookshelvesModElements;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.ObjectHolder;

import java.util.Collections;
import java.util.List;

@IronbookshelvesModElements.ModElement.Tag
public class NetheriteBookshelfBlock extends IronbookshelvesModElements.ModElement {
    @ObjectHolder("ironbookshelves:netherite_bookshelf")
    public static final Block block = null;

    public NetheriteBookshelfBlock(IronbookshelvesModElements instance) {
        super(instance, 6);
    }

    @Override
    public void initElements() {
        elements.blocks.add(() -> new CustomBlock());
        elements.items
                .add(() -> new BlockItem(block, new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
    }

    @Override
    @OnlyIn(Dist.CLIENT)
    public void clientLoad(FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(block, RenderType.cutout());
    }

    public static class CustomBlock extends Block {
        public CustomBlock() {
            super(Block.Properties.of(Material.METAL).sound(SoundType.NETHERITE_BLOCK).strength(50f, 1200f).lightLevel(s -> 0)
                    .harvestLevel(3).harvestTool(ToolType.PICKAXE).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
            setRegistryName("netherite_bookshelf");
        }

        @Override
        public int getLightBlock(BlockState state, IBlockReader worldIn, BlockPos pos) {
            return 15;
        }

        @Override
        public float getEnchantPowerBonus(BlockState state, IWorldReader world, BlockPos pos) {
            return 10f;
        }

        @Override
        public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
            List<ItemStack> dropsOriginal = super.getDrops(state, builder);
            if (!dropsOriginal.isEmpty())
                return dropsOriginal;
            return Collections.singletonList(new ItemStack(this, 1));
        }
    }
}
