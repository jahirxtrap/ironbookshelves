package com.jahirtrap.ironbookshelves;

import com.jahirtrap.configlib.TXFConfig;
import com.jahirtrap.ironbookshelves.init.ModConfig;
import com.jahirtrap.ironbookshelves.init.ModContent;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;

public class IronbookshelvesMod implements ModInitializer {

    public static final String MODID = "ironbookshelves";

    @Override
    public void onInitialize() {
        TXFConfig.init(MODID, ModConfig.class);
        ModContent.init();
        buildContents();
    }

    public void buildContents() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(event -> {
            event.addAfter(Items.BOOKSHELF, ModContent.IRON_BOOKSHELF, ModContent.GOLDEN_BOOKSHELF, ModContent.DIAMOND_BOOKSHELF, ModContent.EMERALD_BOOKSHELF, ModContent.OBSIDIAN_BOOKSHELF, ModContent.NETHERITE_BOOKSHELF, ModContent.COPPER_BOOKSHELF, ModContent.AMETHYST_BOOKSHELF, ModContent.CRYING_OBSIDIAN_BOOKSHELF, ModContent.ENDERITE_BOOKSHELF, ModContent.STEEL_BOOKSHELF, ModContent.BRONZE_BOOKSHELF);
        });
    }
}
