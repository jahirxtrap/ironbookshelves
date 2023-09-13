package com.jahirtrap.ironbookshelves;

import com.jahirtrap.ironbookshelves.init.IronbookshelvesModBlocks;
import com.jahirtrap.ironbookshelves.init.IronbookshelvesModConfig;
import eu.midnightdust.lib.config.MidnightConfig;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class IronbookshelvesMod implements ModInitializer {

    public static final String MODID = "ironbookshelves";

    @Override
    public void onInitialize() {
        MidnightConfig.init(MODID, IronbookshelvesModConfig.class);
        IronbookshelvesModBlocks.init();
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(event -> {
            event.addAfter(new ItemStack(Items.BOOKSHELF), IronbookshelvesModBlocks.IRON_BOOKSHELF);
            event.addAfter(new ItemStack(IronbookshelvesModBlocks.IRON_BOOKSHELF), new ItemStack(IronbookshelvesModBlocks.GOLDEN_BOOKSHELF));
            event.addAfter(new ItemStack(IronbookshelvesModBlocks.GOLDEN_BOOKSHELF), new ItemStack(IronbookshelvesModBlocks.DIAMOND_BOOKSHELF));
            event.addAfter(new ItemStack(IronbookshelvesModBlocks.DIAMOND_BOOKSHELF), new ItemStack(IronbookshelvesModBlocks.EMERALD_BOOKSHELF));
            event.addAfter(new ItemStack(IronbookshelvesModBlocks.EMERALD_BOOKSHELF), new ItemStack(IronbookshelvesModBlocks.OBSIDIAN_BOOKSHELF));
            event.addAfter(new ItemStack(IronbookshelvesModBlocks.OBSIDIAN_BOOKSHELF), new ItemStack(IronbookshelvesModBlocks.NETHERITE_BOOKSHELF));
            event.addAfter(new ItemStack(IronbookshelvesModBlocks.NETHERITE_BOOKSHELF), new ItemStack(IronbookshelvesModBlocks.COPPER_BOOKSHELF));
            event.addAfter(new ItemStack(IronbookshelvesModBlocks.COPPER_BOOKSHELF), new ItemStack(IronbookshelvesModBlocks.AMETHYST_BOOKSHELF));
            event.addAfter(new ItemStack(IronbookshelvesModBlocks.AMETHYST_BOOKSHELF), new ItemStack(IronbookshelvesModBlocks.CRYING_OBSIDIAN_BOOKSHELF));
            event.addAfter(new ItemStack(IronbookshelvesModBlocks.CRYING_OBSIDIAN_BOOKSHELF), new ItemStack(IronbookshelvesModBlocks.ENDERITE_BOOKSHELF));
            event.addAfter(new ItemStack(IronbookshelvesModBlocks.ENDERITE_BOOKSHELF), new ItemStack(IronbookshelvesModBlocks.STEEL_BOOKSHELF));
            event.addAfter(new ItemStack(IronbookshelvesModBlocks.STEEL_BOOKSHELF), new ItemStack(IronbookshelvesModBlocks.BRONZE_BOOKSHELF));
        });
    }
}
