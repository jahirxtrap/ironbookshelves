package com.jahirtrap.ironbookshelves.init;

import com.jahirtrap.ironbookshelves.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class IronbookshelvesModBlocks {
    private static final List<Block> REGISTRY = new ArrayList<>();
    public static final Block IRON_BOOKSHELF = register(new IronBookshelfBlock());
    public static final Block GOLDEN_BOOKSHELF = register(new GoldenBookshelfBlock());
    public static final Block DIAMOND_BOOKSHELF = register(new DiamondBookshelfBlock());
    public static final Block EMERALD_BOOKSHELF = register(new EmeraldBookshelfBlock());
    public static final Block OBSIDIAN_BOOKSHELF = register(new ObsidianBookshelfBlock());
    public static final Block NETHERITE_BOOKSHELF = register(new NetheriteBookshelfBlock());

    private static Block register(Block block) {
        REGISTRY.add(block);
        return block;
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientSideHandler {
        @SubscribeEvent
        public static void clientSetup(FMLClientSetupEvent event) {
            IronBookshelfBlock.registerRenderLayer();
            GoldenBookshelfBlock.registerRenderLayer();
            DiamondBookshelfBlock.registerRenderLayer();
            EmeraldBookshelfBlock.registerRenderLayer();
            ObsidianBookshelfBlock.registerRenderLayer();
            NetheriteBookshelfBlock.registerRenderLayer();
        }
    }
}
