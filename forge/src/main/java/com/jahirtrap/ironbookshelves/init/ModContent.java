package com.jahirtrap.ironbookshelves.init;

import com.jahirtrap.ironbookshelves.block.AmethystBookshelfBlock;
import com.jahirtrap.ironbookshelves.block.BaseBookshelfBlock;
import com.jahirtrap.ironbookshelves.block.CryingObsidianBookshelfBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.jahirtrap.ironbookshelves.IronbookshelvesMod.MODID;

public class ModContent {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Registries.BLOCK, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Registries.ITEM, MODID);

    public static final RegistryObject<Block> IRON_BOOKSHELF = registerBlock("iron_bookshelf", () -> new BaseBookshelfBlock(SoundType.METAL, 5f, 6f, ModConfig.ironEnchantPower, 0, PushReaction.NORMAL), new Item.Properties());
    public static final RegistryObject<Block> GOLDEN_BOOKSHELF = registerBlock("golden_bookshelf", () -> new BaseBookshelfBlock(SoundType.METAL, 3f, 6f, ModConfig.goldenEnchantPower, 0, PushReaction.NORMAL), new Item.Properties());
    public static final RegistryObject<Block> DIAMOND_BOOKSHELF = registerBlock("diamond_bookshelf", () -> new BaseBookshelfBlock(SoundType.METAL, 5f, 6f, ModConfig.diamondEnchantPower, 0, PushReaction.NORMAL), new Item.Properties());
    public static final RegistryObject<Block> EMERALD_BOOKSHELF = registerBlock("emerald_bookshelf", () -> new BaseBookshelfBlock(SoundType.METAL, 5f, 6f, ModConfig.emeraldEnchantPower, 0, PushReaction.NORMAL), new Item.Properties());
    public static final RegistryObject<Block> OBSIDIAN_BOOKSHELF = registerBlock("obsidian_bookshelf", () -> new BaseBookshelfBlock(SoundType.STONE, 50f, 1200f, ModConfig.obsidianEnchantPower, 0, PushReaction.BLOCK), new Item.Properties());
    public static final RegistryObject<Block> NETHERITE_BOOKSHELF = registerBlock("netherite_bookshelf", () -> new BaseBookshelfBlock(SoundType.NETHERITE_BLOCK, 50f, 1200f, ModConfig.netheriteEnchantPower, 0, PushReaction.NORMAL), new Item.Properties().fireResistant());
    public static final RegistryObject<Block> COPPER_BOOKSHELF = registerBlock("copper_bookshelf", () -> new BaseBookshelfBlock(SoundType.COPPER, 3f, 6f, ModConfig.copperEnchantPower, 0, PushReaction.NORMAL), new Item.Properties());
    public static final RegistryObject<Block> AMETHYST_BOOKSHELF = registerBlock("amethyst_bookshelf", AmethystBookshelfBlock::new, new Item.Properties());
    public static final RegistryObject<Block> CRYING_OBSIDIAN_BOOKSHELF = registerBlock("crying_obsidian_bookshelf", CryingObsidianBookshelfBlock::new, new Item.Properties());
    public static final RegistryObject<Block> ENDERITE_BOOKSHELF = registerBlock("enderite_bookshelf", () -> new BaseBookshelfBlock(SoundType.NETHERITE_BLOCK, 66f, 1200f, ModConfig.enderiteEnchantPower, 0, PushReaction.NORMAL), new Item.Properties().fireResistant());
    public static final RegistryObject<Block> STEEL_BOOKSHELF = registerBlock("steel_bookshelf", () -> new BaseBookshelfBlock(SoundType.METAL, 5f, 6f, ModConfig.steelEnchantPower, 0, PushReaction.NORMAL), new Item.Properties());
    public static final RegistryObject<Block> BRONZE_BOOKSHELF = registerBlock("bronze_bookshelf", () -> new BaseBookshelfBlock(SoundType.METAL, 5f, 6f, ModConfig.bronzeEnchantPower, 0, PushReaction.NORMAL), new Item.Properties());

    public static RegistryObject<Block> registerBlock(String name, Supplier<Block> supplier, Item.Properties properties) {
        var blockReg = BLOCKS.register(name, supplier);
        registerItem(name, () -> new BlockItem(blockReg.get(), properties));
        return blockReg;
    }

    public static RegistryObject<Item> registerItem(String name, Supplier<Item> supplier) {
        return ITEMS.register(name, supplier);
    }

    public static void init(IEventBus bus) {
        BLOCKS.register(bus);
        ITEMS.register(bus);
    }
}
