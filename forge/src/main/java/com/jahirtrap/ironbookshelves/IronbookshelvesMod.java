package com.jahirtrap.ironbookshelves;

import com.jahirtrap.ironbookshelves.init.IronbookshelvesModBlocks;
import com.jahirtrap.ironbookshelves.init.IronbookshelvesModConfig;
import com.jahirtrap.ironbookshelves.init.IronbookshelvesModItems;
import net.minecraft.world.item.CreativeModeTab.TabVisibility;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(IronbookshelvesMod.MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class IronbookshelvesMod {

    public static final String MODID = "ironbookshelves";

    public IronbookshelvesMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, IronbookshelvesModConfig.COMMON_CONFIG);

        IronbookshelvesModBlocks.REGISTRY.register(bus);
        IronbookshelvesModItems.REGISTRY.register(bus);
    }

    @SubscribeEvent
    public static void onCreativeModeTabBuildContents(CreativeModeTabEvent.BuildContents event) {
        if (event.getTab() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
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
