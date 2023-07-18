package com.jahirtrap.ironbookshelves.init;

import com.jahirtrap.ironbookshelves.IronbookshelvesMod;
import com.jahirtrap.ironbookshelves.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class IronbookshelvesModBlocks {
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, IronbookshelvesMod.MODID);
    public static final RegistryObject<Block> IRON_BOOKSHELF = REGISTRY.register("iron_bookshelf", () -> new IronBookshelfBlock());
    public static final RegistryObject<Block> GOLDEN_BOOKSHELF = REGISTRY.register("golden_bookshelf", () -> new GoldenBookshelfBlock());
    public static final RegistryObject<Block> DIAMOND_BOOKSHELF = REGISTRY.register("diamond_bookshelf", () -> new DiamondBookshelfBlock());
    public static final RegistryObject<Block> EMERALD_BOOKSHELF = REGISTRY.register("emerald_bookshelf", () -> new EmeraldBookshelfBlock());
    public static final RegistryObject<Block> OBSIDIAN_BOOKSHELF = REGISTRY.register("obsidian_bookshelf", () -> new ObsidianBookshelfBlock());
    public static final RegistryObject<Block> NETHERITE_BOOKSHELF = REGISTRY.register("netherite_bookshelf", () -> new NetheriteBookshelfBlock());

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
