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
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import java.util.ArrayList;
import java.util.List;

import static com.jahirtrap.ironbookshelves.IronbookshelvesMod.MODID;

public class ModContent {
    public static final List<Item> ITEMS = new ArrayList<>();

    public static final Block IRON_BOOKSHELF = registerBlock("iron_bookshelf", new BaseBookshelfBlock(ModConfig.ironEnchantPower, BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)), new Item.Properties());
    public static final Block GOLDEN_BOOKSHELF = registerBlock("golden_bookshelf", new BaseBookshelfBlock(ModConfig.goldenEnchantPower, BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)), new Item.Properties());
    public static final Block DIAMOND_BOOKSHELF = registerBlock("diamond_bookshelf", new BaseBookshelfBlock(ModConfig.diamondEnchantPower, BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)), new Item.Properties());
    public static final Block EMERALD_BOOKSHELF = registerBlock("emerald_bookshelf", new BaseBookshelfBlock(ModConfig.emeraldEnchantPower, BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)), new Item.Properties());
    public static final Block OBSIDIAN_BOOKSHELF = registerBlock("obsidian_bookshelf", new BaseBookshelfBlock(ModConfig.obsidianEnchantPower, BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)), new Item.Properties());
    public static final Block NETHERITE_BOOKSHELF = registerBlock("netherite_bookshelf", new BaseBookshelfBlock(ModConfig.netheriteEnchantPower, BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)), new Item.Properties().fireResistant());
    public static final Block COPPER_BOOKSHELF = registerBlock("copper_bookshelf", new BaseBookshelfBlock(ModConfig.copperEnchantPower, BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)), new Item.Properties());
    public static final Block AMETHYST_BOOKSHELF = registerBlock("amethyst_bookshelf", new AmethystBookshelfBlock(ModConfig.amethystEnchantPower, BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), new Item.Properties());
    public static final Block CRYING_OBSIDIAN_BOOKSHELF = registerBlock("crying_obsidian_bookshelf", new CryingObsidianBookshelfBlock(ModConfig.cryingObsidianEnchantPower, BlockBehaviour.Properties.copy(Blocks.CRYING_OBSIDIAN)), new Item.Properties());
    public static final Block ENDERITE_BOOKSHELF = registerBlock("enderite_bookshelf", new BaseBookshelfBlock(ModConfig.enderiteEnchantPower, BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_BLACK).sound(SoundType.NETHERITE_BLOCK).strength(66f, 1200f).requiresCorrectToolForDrops()), new Item.Properties().fireResistant());
    public static final Block STEEL_BOOKSHELF = registerBlock("steel_bookshelf", new BaseBookshelfBlock(ModConfig.steelEnchantPower, BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_GRAY).sound(SoundType.METAL).strength(5f, 6f).requiresCorrectToolForDrops()), new Item.Properties());
    public static final Block BRONZE_BOOKSHELF = registerBlock("bronze_bookshelf", new BaseBookshelfBlock(ModConfig.bronzeEnchantPower, BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_ORANGE).sound(SoundType.METAL).strength(5f, 6f).requiresCorrectToolForDrops()), new Item.Properties());

    public static Block registerBlock(String name, Block block, Item.Properties itemProp) {
        registerItem(name, new BlockItem(block, itemProp));
        return registerBlock(name, block);
    }

    public static Block registerBlock(String name, Block block) {
        return Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(MODID, name), block);
    }

    public static Item registerItem(String name, Item item) {
        var itemReg = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(MODID, name), item);
        ITEMS.add(itemReg);
        return itemReg;
    }

    public static void init() {
    }
}
