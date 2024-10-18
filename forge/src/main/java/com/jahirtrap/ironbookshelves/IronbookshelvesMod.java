package com.jahirtrap.ironbookshelves;

import com.jahirtrap.configlib.TXFConfig;
import com.jahirtrap.ironbookshelves.init.ModConfig;
import com.jahirtrap.ironbookshelves.init.ModContent;
import net.minecraft.world.item.CreativeModeTab.TabVisibility;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegistryObject;

@Mod(IronbookshelvesMod.MODID)
public class IronbookshelvesMod {

    public static final String MODID = "ironbookshelves";

    public IronbookshelvesMod(FMLJavaModLoadingContext context) {
        IEventBus bus = context.getModEventBus();

        TXFConfig.init(MODID, ModConfig.class);
        ModContent.init(bus);
        bus.addListener(this::buildContents);
    }

    public void buildContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            var prev = Items.BOOKSHELF;
            for (RegistryObject<Item> item : ModContent.ITEMS.getEntries()) {
                event.getEntries().putAfter(prev.getDefaultInstance(), item.get().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
                prev = item.get();
            }
        }
    }
}
