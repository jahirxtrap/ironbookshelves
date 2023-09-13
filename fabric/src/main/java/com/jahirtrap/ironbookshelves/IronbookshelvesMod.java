package com.jahirtrap.ironbookshelves;

import com.jahirtrap.ironbookshelves.init.IronbookshelvesModBlocks;
import com.jahirtrap.ironbookshelves.init.IronbookshelvesModConfig;
import eu.midnightdust.lib.config.MidnightConfig;
import net.fabricmc.api.ModInitializer;

public class IronbookshelvesMod implements ModInitializer {

    public static final String MODID = "ironbookshelves";

    @Override
    public void onInitialize() {
        MidnightConfig.init(MODID, IronbookshelvesModConfig.class);
        IronbookshelvesModBlocks.init();
    }
}
