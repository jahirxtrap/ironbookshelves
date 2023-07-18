package com.jahirtrap.ironbookshelves.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class IronbookshelvesModItems {
    private static final List<Item> REGISTRY = new ArrayList<>();
    public static final Item IRON_BOOKSHELF = register(IronbookshelvesModBlocks.IRON_BOOKSHELF, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final Item GOLDEN_BOOKSHELF = register(IronbookshelvesModBlocks.GOLDEN_BOOKSHELF, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final Item DIAMOND_BOOKSHELF = register(IronbookshelvesModBlocks.DIAMOND_BOOKSHELF, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final Item EMERALD_BOOKSHELF = register(IronbookshelvesModBlocks.EMERALD_BOOKSHELF, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final Item OBSIDIAN_BOOKSHELF = register(IronbookshelvesModBlocks.OBSIDIAN_BOOKSHELF, CreativeModeTab.TAB_BUILDING_BLOCKS);
    public static final Item NETHERITE_BOOKSHELF = register(IronbookshelvesModBlocks.NETHERITE_BOOKSHELF, CreativeModeTab.TAB_BUILDING_BLOCKS);

    private static Item register(Item item) {
        REGISTRY.add(item);
        return item;
    }

    private static Item register(Block block, CreativeModeTab tab) {
        return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
    }

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
    }
}
