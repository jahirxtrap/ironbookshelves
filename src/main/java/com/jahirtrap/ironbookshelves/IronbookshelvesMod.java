package com.jahirtrap.ironbookshelves;

import com.jahirtrap.ironbookshelves.init.IronbookshelvesModBlocks;
import com.jahirtrap.ironbookshelves.init.IronbookshelvesModItems;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab.TabVisibility;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Mod("ironbookshelves")
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class IronbookshelvesMod {
    public static final Logger LOGGER = LogManager.getLogger(IronbookshelvesMod.class);
    public static final String MODID = "ironbookshelves";
    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> PROTOCOL_VERSION,
            PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);
    private static int messageID = 0;

    public IronbookshelvesMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

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
        }
    }

    public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder,
                                             BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
        PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
        messageID++;
    }
}
