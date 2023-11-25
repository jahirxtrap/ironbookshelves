package com.jahirtrap.ironbookshelves.init;

import com.jahirtrap.ironbookshelves.IronbookshelvesMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class IronbookshelvesModItems {
    public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(IronbookshelvesMod.MODID);
    public static final DeferredItem<Item> IRON_BOOKSHELF = block(IronbookshelvesModBlocks.IRON_BOOKSHELF);
    public static final DeferredItem<Item> GOLDEN_BOOKSHELF = block(IronbookshelvesModBlocks.GOLDEN_BOOKSHELF);
    public static final DeferredItem<Item> DIAMOND_BOOKSHELF = block(IronbookshelvesModBlocks.DIAMOND_BOOKSHELF);
    public static final DeferredItem<Item> EMERALD_BOOKSHELF = block(IronbookshelvesModBlocks.EMERALD_BOOKSHELF);
    public static final DeferredItem<Item> OBSIDIAN_BOOKSHELF = block(IronbookshelvesModBlocks.OBSIDIAN_BOOKSHELF);
    public static final DeferredItem<Item> NETHERITE_BOOKSHELF = blockFireproof(IronbookshelvesModBlocks.NETHERITE_BOOKSHELF);
    public static final DeferredItem<Item> COPPER_BOOKSHELF = block(IronbookshelvesModBlocks.COPPER_BOOKSHELF);
    public static final DeferredItem<Item> AMETHYST_BOOKSHELF = block(IronbookshelvesModBlocks.AMETHYST_BOOKSHELF);
    public static final DeferredItem<Item> CRYING_OBSIDIAN_BOOKSHELF = block(IronbookshelvesModBlocks.CRYING_OBSIDIAN_BOOKSHELF);
    public static final DeferredItem<Item> ENDERITE_BOOKSHELF = blockFireproof(IronbookshelvesModBlocks.ENDERITE_BOOKSHELF);
    public static final DeferredItem<Item> STEEL_BOOKSHELF = block(IronbookshelvesModBlocks.STEEL_BOOKSHELF);
    public static final DeferredItem<Item> BRONZE_BOOKSHELF = block(IronbookshelvesModBlocks.BRONZE_BOOKSHELF);

    private static DeferredItem<Item> block(DeferredBlock<Block> block) {
        return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static DeferredItem<Item> blockFireproof(DeferredBlock<Block> block) {
        return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().fireResistant()));
    }
}
