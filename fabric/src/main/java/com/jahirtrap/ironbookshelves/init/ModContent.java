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
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import java.util.ArrayList;
import java.util.List;

import static com.jahirtrap.ironbookshelves.IronbookshelvesMod.MODID;

public class ModContent {
    public static final List<Item> ITEMS = new ArrayList<>();

    public static final Block IRON_BOOKSHELF = registerBlock("iron_bookshelf", new BaseBookshelfBlock(ModConfig.ironEnchantPower, BlockBehaviour.Properties.ofLegacyCopy(Blocks.IRON_BLOCK)), new Item.Properties());
    public static final Block GOLDEN_BOOKSHELF = registerBlock("golden_bookshelf", new BaseBookshelfBlock(ModConfig.goldenEnchantPower, BlockBehaviour.Properties.ofLegacyCopy(Blocks.GOLD_BLOCK)), new Item.Properties());
    public static final Block DIAMOND_BOOKSHELF = registerBlock("diamond_bookshelf", new BaseBookshelfBlock(ModConfig.diamondEnchantPower, BlockBehaviour.Properties.ofLegacyCopy(Blocks.DIAMOND_BLOCK)), new Item.Properties());
    public static final Block EMERALD_BOOKSHELF = registerBlock("emerald_bookshelf", new BaseBookshelfBlock(ModConfig.emeraldEnchantPower, BlockBehaviour.Properties.ofLegacyCopy(Blocks.EMERALD_BLOCK)), new Item.Properties());
    public static final Block OBSIDIAN_BOOKSHELF = registerBlock("obsidian_bookshelf", new BaseBookshelfBlock(ModConfig.obsidianEnchantPower, BlockBehaviour.Properties.ofLegacyCopy(Blocks.OBSIDIAN)), new Item.Properties());
    public static final Block NETHERITE_BOOKSHELF = registerBlock("netherite_bookshelf", new BaseBookshelfBlock(ModConfig.netheriteEnchantPower, BlockBehaviour.Properties.ofLegacyCopy(Blocks.NETHERITE_BLOCK)), new Item.Properties().fireResistant());
    public static final Block COPPER_BOOKSHELF = registerBlock("copper_bookshelf", new BaseBookshelfBlock(ModConfig.copperEnchantPower, BlockBehaviour.Properties.ofLegacyCopy(Blocks.COPPER_BLOCK)), new Item.Properties());
    public static final Block AMETHYST_BOOKSHELF = registerBlock("amethyst_bookshelf", new AmethystBookshelfBlock(ModConfig.amethystEnchantPower, BlockBehaviour.Properties.ofLegacyCopy(Blocks.AMETHYST_BLOCK)), new Item.Properties());
    public static final Block CRYING_OBSIDIAN_BOOKSHELF = registerBlock("crying_obsidian_bookshelf", new CryingObsidianBookshelfBlock(ModConfig.cryingObsidianEnchantPower, BlockBehaviour.Properties.ofLegacyCopy(Blocks.CRYING_OBSIDIAN)), new Item.Properties());
    public static final Block ENDERITE_BOOKSHELF = registerBlock("enderite_bookshelf", new BaseBookshelfBlock(ModConfig.enderiteEnchantPower, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).sound(SoundType.NETHERITE_BLOCK).strength(66f, 1200f).requiresCorrectToolForDrops()), new Item.Properties().fireResistant());
    public static final Block STEEL_BOOKSHELF = registerBlock("steel_bookshelf", new BaseBookshelfBlock(ModConfig.steelEnchantPower, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).sound(SoundType.METAL).strength(5f, 6f).requiresCorrectToolForDrops()), new Item.Properties());
    public static final Block BRONZE_BOOKSHELF = registerBlock("bronze_bookshelf", new BaseBookshelfBlock(ModConfig.bronzeEnchantPower, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).sound(SoundType.METAL).strength(5f, 6f).requiresCorrectToolForDrops()), new Item.Properties());

    private static Block registerBlock(String name, Block block, Item.Properties itemProp) {
        registerItem(name, new BlockItem(block, itemProp));
        return registerBlock(name, block);
    }

    private static Block registerBlock(String name, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, name), block);
    }

    private static Item registerItem(String name, Item item) {
        var itemReg = Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name), item);
        ITEMS.add(itemReg);
        return itemReg;
    }

    public static void init() {
    }
}
