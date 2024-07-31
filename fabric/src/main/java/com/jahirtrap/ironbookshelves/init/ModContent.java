package com.jahirtrap.ironbookshelves.init;

import com.jahirtrap.ironbookshelves.block.AmethystBookshelfBlock;
import com.jahirtrap.ironbookshelves.block.BaseBookshelfBlock;
import com.jahirtrap.ironbookshelves.block.CryingObsidianBookshelfBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;

import static com.jahirtrap.ironbookshelves.IronbookshelvesMod.MODID;

public class ModContent {
    public static final Block IRON_BOOKSHELF = registerBlock("iron_bookshelf", new BaseBookshelfBlock(SoundType.METAL, 5f, 6f, ModConfig.ironEnchantPower, 0, PushReaction.NORMAL), new Item.Properties());
    public static final Block GOLDEN_BOOKSHELF = registerBlock("golden_bookshelf", new BaseBookshelfBlock(SoundType.METAL, 3f, 6f, ModConfig.goldenEnchantPower, 0, PushReaction.NORMAL), new Item.Properties());
    public static final Block DIAMOND_BOOKSHELF = registerBlock("diamond_bookshelf", new BaseBookshelfBlock(SoundType.METAL, 5f, 6f, ModConfig.diamondEnchantPower, 0, PushReaction.NORMAL), new Item.Properties());
    public static final Block EMERALD_BOOKSHELF = registerBlock("emerald_bookshelf", new BaseBookshelfBlock(SoundType.METAL, 5f, 6f, ModConfig.emeraldEnchantPower, 0, PushReaction.NORMAL), new Item.Properties());
    public static final Block OBSIDIAN_BOOKSHELF = registerBlock("obsidian_bookshelf", new BaseBookshelfBlock(SoundType.STONE, 50f, 1200f, ModConfig.obsidianEnchantPower, 0, PushReaction.BLOCK), new Item.Properties());
    public static final Block NETHERITE_BOOKSHELF = registerBlock("netherite_bookshelf", new BaseBookshelfBlock(SoundType.NETHERITE_BLOCK, 50f, 1200f, ModConfig.netheriteEnchantPower, 0, PushReaction.NORMAL), new Item.Properties().fireResistant());
    public static final Block COPPER_BOOKSHELF = registerBlock("copper_bookshelf", new BaseBookshelfBlock(SoundType.COPPER, 3f, 6f, ModConfig.copperEnchantPower, 0, PushReaction.NORMAL), new Item.Properties());
    public static final Block AMETHYST_BOOKSHELF = registerBlock("amethyst_bookshelf", new AmethystBookshelfBlock(), new Item.Properties());
    public static final Block CRYING_OBSIDIAN_BOOKSHELF = registerBlock("crying_obsidian_bookshelf", new CryingObsidianBookshelfBlock(), new Item.Properties());
    public static final Block ENDERITE_BOOKSHELF = registerBlock("enderite_bookshelf", new BaseBookshelfBlock(SoundType.NETHERITE_BLOCK, 66f, 1200f, ModConfig.enderiteEnchantPower, 0, PushReaction.NORMAL), new Item.Properties().fireResistant());
    public static final Block STEEL_BOOKSHELF = registerBlock("steel_bookshelf", new BaseBookshelfBlock(SoundType.METAL, 5f, 6f, ModConfig.steelEnchantPower, 0, PushReaction.NORMAL), new Item.Properties());
    public static final Block BRONZE_BOOKSHELF = registerBlock("bronze_bookshelf", new BaseBookshelfBlock(SoundType.METAL, 5f, 6f, ModConfig.bronzeEnchantPower, 0, PushReaction.NORMAL), new Item.Properties());

    public static Block registerBlock(String name, Block block, Item.Properties properties) {
        Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name), new BlockItem(block, properties));
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, name), block);
    }

    public static void init() {
    }
}
