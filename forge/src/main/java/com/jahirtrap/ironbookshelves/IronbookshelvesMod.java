package com.jahirtrap.ironbookshelves;

import com.jahirtrap.ironbookshelves.init.ModConfig;
import com.jahirtrap.ironbookshelves.init.ModContent;
import com.jahirtrap.ironbookshelves.util.configlib.TXFConfig;
import com.jahirtrap.ironbookshelves.util.configlib.TXFConfigClient;
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
                new ConfigScreenHandler.ConfigScreenFactory((client, parent) -> TXFConfigClient.getScreen(parent, MODID)));

        ModContent.init(bus);
        bus.addListener(this::buildContents);
    }

    public void buildContents(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
            putAfter(event, Items.BOOKSHELF, ModContent.IRON_BOOKSHELF, ModContent.GOLDEN_BOOKSHELF, ModContent.DIAMOND_BOOKSHELF, ModContent.EMERALD_BOOKSHELF, ModContent.OBSIDIAN_BOOKSHELF, ModContent.NETHERITE_BOOKSHELF, ModContent.COPPER_BOOKSHELF, ModContent.AMETHYST_BOOKSHELF, ModContent.CRYING_OBSIDIAN_BOOKSHELF, ModContent.ENDERITE_BOOKSHELF, ModContent.STEEL_BOOKSHELF, ModContent.BRONZE_BOOKSHELF);
        }
    }
}
