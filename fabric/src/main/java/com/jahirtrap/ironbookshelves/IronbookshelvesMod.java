package com.jahirtrap.ironbookshelves;

import com.jahirtrap.configlib.TXFConfig;
import com.jahirtrap.ironbookshelves.init.ModConfig;
import com.jahirtrap.ironbookshelves.init.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;

public class IronbookshelvesMod implements ModInitializer {

    public static final String MODID = "ironbookshelves";

    @Override
    public void onInitialize() {
        TXFConfig.init(MODID, ModConfig.class);
        ModItems.init();
        buildContents();
    }

    public void buildContents() {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(event -> {
            event.addAfter(Items.BOOKSHELF, ModItems.IRON_BOOKSHELF, ModItems.GOLDEN_BOOKSHELF, ModItems.DIAMOND_BOOKSHELF, ModItems.EMERALD_BOOKSHELF, ModItems.OBSIDIAN_BOOKSHELF, ModItems.NETHERITE_BOOKSHELF, ModItems.COPPER_BOOKSHELF, ModItems.AMETHYST_BOOKSHELF, ModItems.CRYING_OBSIDIAN_BOOKSHELF, ModItems.ENDERITE_BOOKSHELF, ModItems.STEEL_BOOKSHELF, ModItems.BRONZE_BOOKSHELF);
        });
    }
}
