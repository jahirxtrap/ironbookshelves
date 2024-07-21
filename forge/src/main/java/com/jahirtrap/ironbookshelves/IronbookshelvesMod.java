package com.jahirtrap.ironbookshelves;

import com.jahirtrap.ironbookshelves.init.ModConfig;
import com.jahirtrap.ironbookshelves.init.ModItems;
import com.jahirtrap.ironbookshelves.util.configlib.TXFConfig;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.minecraftforge.client.ConfigScreenHandler;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static com.jahirtrap.ironbookshelves.util.CommonUtils.putAfter;

@Mod(IronbookshelvesMod.MODID)
public class IronbookshelvesMod {

    public static final String MODID = "ironbookshelves";

    public IronbookshelvesMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        TXFConfig.init(MODID, ModConfig.class);
        ModLoadingContext.get().registerExtensionPoint(ConfigScreenHandler.ConfigScreenFactory.class, () ->
                new ConfigScreenHandler.ConfigScreenFactory((client, parent) -> TXFConfig.getScreen(parent, MODID)));

        ModItems.init(bus);
        bus.addListener(this::buildContents);
    }

    public void buildContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            putAfter(event, Items.BOOKSHELF, ModItems.IRON_BOOKSHELF, ModItems.GOLDEN_BOOKSHELF, ModItems.DIAMOND_BOOKSHELF, ModItems.EMERALD_BOOKSHELF, ModItems.OBSIDIAN_BOOKSHELF, ModItems.NETHERITE_BOOKSHELF, ModItems.COPPER_BOOKSHELF, ModItems.AMETHYST_BOOKSHELF, ModItems.CRYING_OBSIDIAN_BOOKSHELF, ModItems.ENDERITE_BOOKSHELF, ModItems.STEEL_BOOKSHELF, ModItems.BRONZE_BOOKSHELF);
        }
    }
}
