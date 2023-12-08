package com.jahirtrap.ironbookshelves;

import com.jahirtrap.ironbookshelves.init.IronbookshelvesModBlocks;
import com.jahirtrap.ironbookshelves.init.IronbookshelvesModConfig;
import com.jahirtrap.ironbookshelves.init.IronbookshelvesModItems;
import com.jahirtrap.ironbookshelves.util.configlib.TXFConfig;
import net.minecraftforge.client.ConfigGuiHandler;
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
        ModLoadingContext.get().registerExtensionPoint(ConfigGuiHandler.ConfigGuiFactory.class, () ->
                new ConfigGuiHandler.ConfigGuiFactory((client, parent) -> TXFConfig.getScreen(parent, MODID)));

        IronbookshelvesModBlocks.REGISTRY.register(bus);
        IronbookshelvesModItems.REGISTRY.register(bus);
    }
}
