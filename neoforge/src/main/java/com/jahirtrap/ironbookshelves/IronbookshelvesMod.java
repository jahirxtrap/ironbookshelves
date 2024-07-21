package com.jahirtrap.ironbookshelves;

import com.jahirtrap.ironbookshelves.init.ModConfig;
import com.jahirtrap.ironbookshelves.init.ModItems;
import com.jahirtrap.ironbookshelves.util.configlib.TXFConfig;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

import static com.jahirtrap.ironbookshelves.util.CommonUtils.insertAfter;

@Mod(IronbookshelvesMod.MODID)
public class IronbookshelvesMod {

    public static final String MODID = "ironbookshelves";

    public IronbookshelvesMod(IEventBus bus) {
        TXFConfig.init(MODID, ModConfig.class);
        ModLoadingContext.get().registerExtensionPoint(IConfigScreenFactory.class, () ->
                (client, parent) -> TXFConfig.getScreen(parent, MODID));

        ModItems.init(bus);
        bus.addListener(this::buildContents);
    }

    public void buildContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            insertAfter(event, Items.BOOKSHELF, ModItems.IRON_BOOKSHELF, ModItems.GOLDEN_BOOKSHELF, ModItems.DIAMOND_BOOKSHELF, ModItems.EMERALD_BOOKSHELF, ModItems.OBSIDIAN_BOOKSHELF, ModItems.NETHERITE_BOOKSHELF, ModItems.COPPER_BOOKSHELF, ModItems.AMETHYST_BOOKSHELF, ModItems.CRYING_OBSIDIAN_BOOKSHELF, ModItems.ENDERITE_BOOKSHELF, ModItems.STEEL_BOOKSHELF, ModItems.BRONZE_BOOKSHELF);
        }
    }
}
