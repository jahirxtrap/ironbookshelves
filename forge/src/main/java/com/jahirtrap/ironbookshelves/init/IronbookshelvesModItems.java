package com.jahirtrap.ironbookshelves.init;

import com.jahirtrap.ironbookshelves.IronbookshelvesMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class IronbookshelvesModItems {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, IronbookshelvesMod.MODID);
    public static final RegistryObject<Item> IRON_BOOKSHELF = block(IronbookshelvesModBlocks.IRON_BOOKSHELF);
    public static final RegistryObject<Item> GOLDEN_BOOKSHELF = block(IronbookshelvesModBlocks.GOLDEN_BOOKSHELF);
    public static final RegistryObject<Item> DIAMOND_BOOKSHELF = block(IronbookshelvesModBlocks.DIAMOND_BOOKSHELF);
    public static final RegistryObject<Item> EMERALD_BOOKSHELF = block(IronbookshelvesModBlocks.EMERALD_BOOKSHELF);
    public static final RegistryObject<Item> OBSIDIAN_BOOKSHELF = block(IronbookshelvesModBlocks.OBSIDIAN_BOOKSHELF);
    public static final RegistryObject<Item> NETHERITE_BOOKSHELF = block(IronbookshelvesModBlocks.NETHERITE_BOOKSHELF);

    private static RegistryObject<Item> block(RegistryObject<Block> block) {
        return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
