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
    public static final Block NETHERITE_BOOKSHELF = RegistryObjectFireproof("netherite_bookshelf", new NetheriteBookshelfBlock());
    public static final Block COPPER_BOOKSHELF = RegistryObject("copper_bookshelf", new CopperBookshelfBlock());
    public static final Block AMETHYST_BOOKSHELF = RegistryObject("amethyst_bookshelf", new AmethystBookshelfBlock());
    public static final Block CRYING_OBSIDIAN_BOOKSHELF = RegistryObject("crying_obsidian_bookshelf", new CryingObsidianBookshelfBlock());
    public static final Block ENDERITE_BOOKSHELF = RegistryObjectFireproof("enderite_bookshelf", new EnderiteBookshelfBlock());
    public static final Block STEEL_BOOKSHELF = RegistryObject("steel_bookshelf", new SteelBookshelfBlock());
    public static final Block BRONZE_BOOKSHELF = RegistryObject("bronze_bookshelf", new BronzeBookshelfBlock());

    public static void init() {
    }

    public static Block RegistryObject(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name), new BlockItem(block, new Item.Properties()));
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, name), block);
    }

    public static Block RegistryObjectFireproof(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name), new BlockItem(block, new Item.Properties().fireResistant()));
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, name), block);
    }
}
