package com.jahirtrap.ironbookshelves.init;

import com.jahirtrap.ironbookshelves.block.AmethystBookshelfBlock;
import com.jahirtrap.ironbookshelves.block.BaseBookshelfBlock;
import com.jahirtrap.ironbookshelves.block.CryingObsidianBookshelfBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.jahirtrap.ironbookshelves.IronbookshelvesMod.MODID;

public class ModItems {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredBlock<Block> IRON_BOOKSHELF = registerBlock("iron_bookshelf", () -> new BaseBookshelfBlock(SoundType.METAL, 5f, 6f, ModConfig.ironEnchantPower, 0, PushReaction.NORMAL), new Item.Properties());
    public static final DeferredBlock<Block> GOLDEN_BOOKSHELF = registerBlock("golden_bookshelf", () -> new BaseBookshelfBlock(SoundType.METAL, 3f, 6f, ModConfig.goldenEnchantPower, 0, PushReaction.NORMAL), new Item.Properties());
    public static final DeferredBlock<Block> DIAMOND_BOOKSHELF = registerBlock("diamond_bookshelf", () -> new BaseBookshelfBlock(SoundType.METAL, 5f, 6f, ModConfig.diamondEnchantPower, 0, PushReaction.NORMAL), new Item.Properties());
    public static final DeferredBlock<Block> EMERALD_BOOKSHELF = registerBlock("emerald_bookshelf", () -> new BaseBookshelfBlock(SoundType.METAL, 5f, 6f, ModConfig.emeraldEnchantPower, 0, PushReaction.NORMAL), new Item.Properties());
    public static final DeferredBlock<Block> OBSIDIAN_BOOKSHELF = registerBlock("obsidian_bookshelf", () -> new BaseBookshelfBlock(SoundType.STONE, 50f, 1200f, ModConfig.obsidianEnchantPower, 0, PushReaction.BLOCK), new Item.Properties());
    public static final DeferredBlock<Block> NETHERITE_BOOKSHELF = registerBlock("netherite_bookshelf", () -> new BaseBookshelfBlock(SoundType.NETHERITE_BLOCK, 50f, 1200f, ModConfig.netheriteEnchantPower, 0, PushReaction.NORMAL), new Item.Properties().fireResistant());
    public static final DeferredBlock<Block> COPPER_BOOKSHELF = registerBlock("copper_bookshelf", () -> new BaseBookshelfBlock(SoundType.COPPER, 3f, 6f, ModConfig.copperEnchantPower, 0, PushReaction.NORMAL), new Item.Properties());
    public static final DeferredBlock<Block> AMETHYST_BOOKSHELF = registerBlock("amethyst_bookshelf", AmethystBookshelfBlock::new, new Item.Properties());
    public static final DeferredBlock<Block> CRYING_OBSIDIAN_BOOKSHELF = registerBlock("crying_obsidian_bookshelf", CryingObsidianBookshelfBlock::new, new Item.Properties());
    public static final DeferredBlock<Block> ENDERITE_BOOKSHELF = registerBlock("enderite_bookshelf", () -> new BaseBookshelfBlock(SoundType.NETHERITE_BLOCK, 66f, 1200f, ModConfig.enderiteEnchantPower, 0, PushReaction.NORMAL), new Item.Properties().fireResistant());
    public static final DeferredBlock<Block> STEEL_BOOKSHELF = registerBlock("steel_bookshelf", () -> new BaseBookshelfBlock(SoundType.METAL, 5f, 6f, ModConfig.steelEnchantPower, 0, PushReaction.NORMAL), new Item.Properties());
    public static final DeferredBlock<Block> BRONZE_BOOKSHELF = registerBlock("bronze_bookshelf", () -> new BaseBookshelfBlock(SoundType.METAL, 5f, 6f, ModConfig.bronzeEnchantPower, 0, PushReaction.NORMAL), new Item.Properties());

    public static DeferredBlock<Block> registerBlock(String name, Supplier<Block> supplier, Item.Properties properties) {
        var block = BLOCKS.register(name, supplier);
        ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }

    public static void init(IEventBus bus) {
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }
}
