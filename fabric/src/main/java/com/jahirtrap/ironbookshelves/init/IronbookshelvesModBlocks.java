package com.jahirtrap.ironbookshelves.init;

import com.jahirtrap.ironbookshelves.block.*;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import static com.jahirtrap.ironbookshelves.IronbookshelvesMod.MODID;

public class IronbookshelvesModBlocks {
    public static final Block IRON_BOOKSHELF = RegistryObject("iron_bookshelf", new IronBookshelfBlock());
    public static final Block GOLDEN_BOOKSHELF = RegistryObject("golden_bookshelf", new GoldenBookshelfBlock());
    public static final Block DIAMOND_BOOKSHELF = RegistryObject("diamond_bookshelf", new DiamondBookshelfBlock());
    public static final Block EMERALD_BOOKSHELF = RegistryObject("emerald_bookshelf", new EmeraldBookshelfBlock());
    public static final Block OBSIDIAN_BOOKSHELF = RegistryObject("obsidian_bookshelf", new ObsidianBookshelfBlock());
    public static final Block NETHERITE_BOOKSHELF = RegistryObject("netherite_bookshelf", new NetheriteBookshelfBlock());

    public static void init() {
    }

    public static Block RegistryObject(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MODID, name), new BlockItem(block, new Item.Properties()));
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MODID, name), block);
    }
}
