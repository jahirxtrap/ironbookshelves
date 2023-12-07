package com.jahirtrap.ironbookshelves;

import com.jahirtrap.configlib.TXFConfig;
import com.jahirtrap.ironbookshelves.init.IronbookshelvesModBlocks;
import com.jahirtrap.ironbookshelves.init.IronbookshelvesModConfig;
import com.jahirtrap.ironbookshelves.init.IronbookshelvesModItems;
import net.minecraft.world.item.CreativeModeTab.TabVisibility;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.client.ConfigScreenHandler;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(IronbookshelvesMod.MODID)
public class IronbookshelvesMod {

    public static final String MODID = "ironbookshelves";

    public IronbookshelvesMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        TXFConfig.init(MODID, IronbookshelvesModConfig.class);
        ModLoadingContext.get().registerExtensionPoint(ConfigScreenHandler.ConfigScreenFactory.class, () ->
                new ConfigScreenHandler.ConfigScreenFactory((client, parent) -> TXFConfig.getScreen(parent, MODID)));

        IronbookshelvesModBlocks.REGISTRY.register(bus);
        IronbookshelvesModItems.REGISTRY.register(bus);
        bus.addListener(this::buildContents);
    }

    public void buildContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            event.getEntries().putAfter(new ItemStack(Items.BOOKSHELF), new ItemStack(IronbookshelvesModItems.IRON_BOOKSHELF.get()), TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(IronbookshelvesModItems.IRON_BOOKSHELF.get()), new ItemStack(IronbookshelvesModItems.GOLDEN_BOOKSHELF.get()), TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(IronbookshelvesModItems.GOLDEN_BOOKSHELF.get()), new ItemStack(IronbookshelvesModItems.DIAMOND_BOOKSHELF.get()), TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(IronbookshelvesModItems.DIAMOND_BOOKSHELF.get()), new ItemStack(IronbookshelvesModItems.EMERALD_BOOKSHELF.get()), TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(IronbookshelvesModItems.EMERALD_BOOKSHELF.get()), new ItemStack(IronbookshelvesModItems.OBSIDIAN_BOOKSHELF.get()), TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(IronbookshelvesModItems.OBSIDIAN_BOOKSHELF.get()), new ItemStack(IronbookshelvesModItems.NETHERITE_BOOKSHELF.get()), TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(IronbookshelvesModItems.NETHERITE_BOOKSHELF.get()), new ItemStack(IronbookshelvesModItems.COPPER_BOOKSHELF.get()), TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(IronbookshelvesModItems.COPPER_BOOKSHELF.get()), new ItemStack(IronbookshelvesModItems.AMETHYST_BOOKSHELF.get()), TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(IronbookshelvesModItems.AMETHYST_BOOKSHELF.get()), new ItemStack(IronbookshelvesModItems.CRYING_OBSIDIAN_BOOKSHELF.get()), TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(IronbookshelvesModItems.CRYING_OBSIDIAN_BOOKSHELF.get()), new ItemStack(IronbookshelvesModItems.ENDERITE_BOOKSHELF.get()), TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(IronbookshelvesModItems.ENDERITE_BOOKSHELF.get()), new ItemStack(IronbookshelvesModItems.STEEL_BOOKSHELF.get()), TabVisibility.PARENT_AND_SEARCH_TABS);
            event.getEntries().putAfter(new ItemStack(IronbookshelvesModItems.STEEL_BOOKSHELF.get()), new ItemStack(IronbookshelvesModItems.BRONZE_BOOKSHELF.get()), TabVisibility.PARENT_AND_SEARCH_TABS);
        }
    }
}
