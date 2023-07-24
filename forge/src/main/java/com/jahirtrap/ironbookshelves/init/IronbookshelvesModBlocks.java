package com.jahirtrap.ironbookshelves.init;

import com.jahirtrap.ironbookshelves.IronbookshelvesMod;
import com.jahirtrap.ironbookshelves.block.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class IronbookshelvesModBlocks {
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, IronbookshelvesMod.MODID);
    public static final RegistryObject<Block> IRON_BOOKSHELF = REGISTRY.register("iron_bookshelf", IronBookshelfBlock::new);
    public static final RegistryObject<Block> GOLDEN_BOOKSHELF = REGISTRY.register("golden_bookshelf", GoldenBookshelfBlock::new);
    public static final RegistryObject<Block> DIAMOND_BOOKSHELF = REGISTRY.register("diamond_bookshelf", DiamondBookshelfBlock::new);
    public static final RegistryObject<Block> EMERALD_BOOKSHELF = REGISTRY.register("emerald_bookshelf", EmeraldBookshelfBlock::new);
    public static final RegistryObject<Block> OBSIDIAN_BOOKSHELF = REGISTRY.register("obsidian_bookshelf", ObsidianBookshelfBlock::new);
    public static final RegistryObject<Block> NETHERITE_BOOKSHELF = REGISTRY.register("netherite_bookshelf", NetheriteBookshelfBlock::new);
}
