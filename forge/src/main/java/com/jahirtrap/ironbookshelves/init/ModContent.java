package com.jahirtrap.ironbookshelves.init;

import com.jahirtrap.ironbookshelves.block.AmethystBookshelfBlock;
import com.jahirtrap.ironbookshelves.block.BaseBookshelfBlock;
import com.jahirtrap.ironbookshelves.block.CryingObsidianBookshelfBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.jahirtrap.ironbookshelves.IronbookshelvesMod.MODID;

public class ModContent {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, MODID);

    public static final RegistryObject<Block> IRON_BOOKSHELF = registerBlock("iron_bookshelf", () -> new BaseBookshelfBlock(ModConfig.ironEnchantPower, BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)), new Item.Properties());
    public static final RegistryObject<Block> GOLDEN_BOOKSHELF = registerBlock("golden_bookshelf", () -> new BaseBookshelfBlock(ModConfig.goldenEnchantPower, BlockBehaviour.Properties.copy(Blocks.GOLD_BLOCK)), new Item.Properties());
    public static final RegistryObject<Block> DIAMOND_BOOKSHELF = registerBlock("diamond_bookshelf", () -> new BaseBookshelfBlock(ModConfig.diamondEnchantPower, BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK)), new Item.Properties());
    public static final RegistryObject<Block> EMERALD_BOOKSHELF = registerBlock("emerald_bookshelf", () -> new BaseBookshelfBlock(ModConfig.emeraldEnchantPower, BlockBehaviour.Properties.copy(Blocks.EMERALD_BLOCK)), new Item.Properties());
    public static final RegistryObject<Block> OBSIDIAN_BOOKSHELF = registerBlock("obsidian_bookshelf", () -> new BaseBookshelfBlock(ModConfig.obsidianEnchantPower, BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)), new Item.Properties());
    public static final RegistryObject<Block> NETHERITE_BOOKSHELF = registerBlock("netherite_bookshelf", () -> new BaseBookshelfBlock(ModConfig.netheriteEnchantPower, BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK)), new Item.Properties().fireResistant());
    public static final RegistryObject<Block> COPPER_BOOKSHELF = registerBlock("copper_bookshelf", () -> new BaseBookshelfBlock(ModConfig.copperEnchantPower, BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK)), new Item.Properties());
    public static final RegistryObject<Block> AMETHYST_BOOKSHELF = registerBlock("amethyst_bookshelf", () -> new AmethystBookshelfBlock(ModConfig.amethystEnchantPower, BlockBehaviour.Properties.copy(Blocks.AMETHYST_BLOCK)), new Item.Properties());
    public static final RegistryObject<Block> CRYING_OBSIDIAN_BOOKSHELF = registerBlock("crying_obsidian_bookshelf", () -> new CryingObsidianBookshelfBlock(ModConfig.cryingObsidianEnchantPower, BlockBehaviour.Properties.copy(Blocks.CRYING_OBSIDIAN)), new Item.Properties());
    public static final RegistryObject<Block> ENDERITE_BOOKSHELF = registerBlock("enderite_bookshelf", () -> new BaseBookshelfBlock(ModConfig.enderiteEnchantPower, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BLACK).sound(SoundType.NETHERITE_BLOCK).strength(66f, 1200f).requiresCorrectToolForDrops()), new Item.Properties().fireResistant());
    public static final RegistryObject<Block> STEEL_BOOKSHELF = registerBlock("steel_bookshelf", () -> new BaseBookshelfBlock(ModConfig.steelEnchantPower, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_GRAY).sound(SoundType.METAL).strength(5f, 6f).requiresCorrectToolForDrops()), new Item.Properties());
    public static final RegistryObject<Block> BRONZE_BOOKSHELF = registerBlock("bronze_bookshelf", () -> new BaseBookshelfBlock(ModConfig.bronzeEnchantPower, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_ORANGE).sound(SoundType.METAL).strength(5f, 6f).requiresCorrectToolForDrops()), new Item.Properties());
    public static final RegistryObject<Block> ZURITE_BOOKSHELF = registerBlock("zurite_bookshelf", () -> new BaseBookshelfBlock(ModConfig.zuriteEnchantPower, BlockBehaviour.Properties.copy(Blocks.NETHERITE_BLOCK).mapColor(MapColor.COLOR_GRAY)), new Item.Properties().fireResistant());

    private static RegistryObject<Block> registerBlock(String name, Supplier<Block> supplier, Item.Properties itemProp) {
        var blockReg = registerBlock(name, supplier);
        registerItem(name, () -> new BlockItem(blockReg.get(), itemProp));
        return blockReg;
    }

    private static RegistryObject<Block> registerBlock(String name, Supplier<Block> supplier) {
        return BLOCKS.register(name, supplier);
    }

    private static RegistryObject<Item> registerItem(String name, Supplier<Item> supplier) {
        return ITEMS.register(name, supplier);
    }

    public static void init(IEventBus bus) {
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }
}
