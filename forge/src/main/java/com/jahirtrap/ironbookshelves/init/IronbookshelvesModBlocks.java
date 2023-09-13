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
    public static final RegistryObject<Block> COPPER_BOOKSHELF = REGISTRY.register("copper_bookshelf", CopperBookshelfBlock::new);
    public static final RegistryObject<Block> AMETHYST_BOOKSHELF = REGISTRY.register("amethyst_bookshelf", AmethystBookshelfBlock::new);
    public static final RegistryObject<Block> CRYING_OBSIDIAN_BOOKSHELF = REGISTRY.register("crying_obsidian_bookshelf", CryingObsidianBookshelfBlock::new);
    public static final RegistryObject<Block> ENDERITE_BOOKSHELF = REGISTRY.register("enderite_bookshelf", EnderiteBookshelfBlock::new);
    public static final RegistryObject<Block> STEEL_BOOKSHELF = REGISTRY.register("steel_bookshelf", SteelBookshelfBlock::new);
    public static final RegistryObject<Block> BRONZE_BOOKSHELF = REGISTRY.register("bronze_bookshelf", BronzeBookshelfBlock::new);
}
