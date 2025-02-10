package com.jahirtrap.ironbookshelves.init;

import com.jahirtrap.ironbookshelves.block.AmethystBookshelfBlock;
import com.jahirtrap.ironbookshelves.block.BaseBookshelfBlock;
import com.jahirtrap.ironbookshelves.block.CryingObsidianBookshelfBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
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
import java.util.function.Function;

import static com.jahirtrap.ironbookshelves.IronbookshelvesMod.MODID;

public class ModContent {
    public static final List<Item> ITEMS = new ArrayList<>();

    public static final Block IRON_BOOKSHELF = registerBlock("iron_bookshelf", (p) -> new BaseBookshelfBlock(ModConfig.ironEnchantPower, p), BlockBehaviour.Properties.ofLegacyCopy(Blocks.IRON_BLOCK), new Item.Properties());
    public static final Block GOLDEN_BOOKSHELF = registerBlock("golden_bookshelf", (p) -> new BaseBookshelfBlock(ModConfig.goldenEnchantPower, p), BlockBehaviour.Properties.ofLegacyCopy(Blocks.GOLD_BLOCK), new Item.Properties());
    public static final Block DIAMOND_BOOKSHELF = registerBlock("diamond_bookshelf", (p) -> new BaseBookshelfBlock(ModConfig.diamondEnchantPower, p), BlockBehaviour.Properties.ofLegacyCopy(Blocks.DIAMOND_BLOCK), new Item.Properties());
    public static final Block EMERALD_BOOKSHELF = registerBlock("emerald_bookshelf", (p) -> new BaseBookshelfBlock(ModConfig.emeraldEnchantPower, p), BlockBehaviour.Properties.ofLegacyCopy(Blocks.EMERALD_BLOCK), new Item.Properties());
    public static final Block OBSIDIAN_BOOKSHELF = registerBlock("obsidian_bookshelf", (p) -> new BaseBookshelfBlock(ModConfig.obsidianEnchantPower, p), BlockBehaviour.Properties.ofLegacyCopy(Blocks.OBSIDIAN), new Item.Properties());
    public static final Block NETHERITE_BOOKSHELF = registerBlock("netherite_bookshelf", (p) -> new BaseBookshelfBlock(ModConfig.netheriteEnchantPower, p), BlockBehaviour.Properties.ofLegacyCopy(Blocks.NETHERITE_BLOCK), new Item.Properties().fireResistant());
    public static final Block COPPER_BOOKSHELF = registerBlock("copper_bookshelf", (p) -> new BaseBookshelfBlock(ModConfig.copperEnchantPower, p), BlockBehaviour.Properties.ofLegacyCopy(Blocks.COPPER_BLOCK), new Item.Properties());
    public static final Block AMETHYST_BOOKSHELF = registerBlock("amethyst_bookshelf", (p) -> new AmethystBookshelfBlock(ModConfig.amethystEnchantPower, p), BlockBehaviour.Properties.ofLegacyCopy(Blocks.AMETHYST_BLOCK), new Item.Properties());
    public static final Block CRYING_OBSIDIAN_BOOKSHELF = registerBlock("crying_obsidian_bookshelf", (p) -> new CryingObsidianBookshelfBlock(ModConfig.cryingObsidianEnchantPower, p), BlockBehaviour.Properties.ofLegacyCopy(Blocks.CRYING_OBSIDIAN), new Item.Properties());
    public static final Block ENDERITE_BOOKSHELF = registerBlock("enderite_bookshelf", (p) -> new BaseBookshelfBlock(ModConfig.enderiteEnchantPower, p), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).sound(SoundType.NETHERITE_BLOCK).strength(66f, 1200f).requiresCorrectToolForDrops(), new Item.Properties().fireResistant());
    public static final Block STEEL_BOOKSHELF = registerBlock("steel_bookshelf", (p) -> new BaseBookshelfBlock(ModConfig.steelEnchantPower, p), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).sound(SoundType.METAL).strength(5f, 6f).requiresCorrectToolForDrops(), new Item.Properties());
    public static final Block BRONZE_BOOKSHELF = registerBlock("bronze_bookshelf", (p) -> new BaseBookshelfBlock(ModConfig.bronzeEnchantPower, p), BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).sound(SoundType.METAL).strength(5f, 6f).requiresCorrectToolForDrops(), new Item.Properties());
    public static final Block ZURITE_BOOKSHELF = registerBlock("zurite_bookshelf", (p) -> new BaseBookshelfBlock(ModConfig.zuriteEnchantPower, p), BlockBehaviour.Properties.ofLegacyCopy(Blocks.NETHERITE_BLOCK).mapColor(MapColor.COLOR_GRAY), new Item.Properties().fireResistant());

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties blockProp, Item.Properties itemProp) {
        var blockReg = registerBlock(name, function, blockProp);
        registerItem(name, (p) -> new BlockItem(blockReg, p), itemProp.useBlockDescriptionPrefix());
        return blockReg;
    }

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function, BlockBehaviour.Properties blockProp) {
        return Registry.register(BuiltInRegistries.BLOCK, ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, name)), function.apply(blockProp.setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, name)))));
    }

    private static Item registerItem(String name, Function<Item.Properties, Item> function, Item.Properties itemProp) {
        var itemReg = Registry.register(BuiltInRegistries.ITEM, ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name)), function.apply(itemProp.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name)))));
        ITEMS.add(itemReg);
        return itemReg;
    }

    public static void init() {
    }
}
