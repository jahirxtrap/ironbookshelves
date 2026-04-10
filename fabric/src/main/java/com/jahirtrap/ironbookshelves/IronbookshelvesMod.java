package com.jahirtrap.ironbookshelves;

import com.jahirtrap.configlib.TXFConfig;
import com.jahirtrap.ironbookshelves.init.ModConfig;
import com.jahirtrap.ironbookshelves.init.ModContent;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
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
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(event -> {
            var prev = Items.BOOKSHELF;
            for (Item item : ModContent.ITEMS) {
                event.insertAfter(prev, item);
                prev = item;
            }
        });
    }
}
