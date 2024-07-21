package com.jahirtrap.ironbookshelves.util;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab.TabVisibility;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.registries.RegistryObject;

public class CommonUtils {
    public static Component coloredTextComponent(String string, ChatFormatting color) {
        var textComponent = Component.literal(string);
        textComponent.withStyle(color);
        return textComponent;
    }

    public static String formatText(float amount) {
        if (amount % 1.0 == 0) {
            return String.format("%.0f", amount);
        } else {
            return String.valueOf(amount);
        }
    }

    @SafeVarargs
    public static void putAfter(BuildCreativeModeTabContentsEvent event, Item after, RegistryObject<? extends ItemLike>... next) {
        ItemStack prevIst = new ItemStack(after);
        for (RegistryObject<? extends ItemLike> item : next) {
            ItemStack currIst = new ItemStack(item.get());
            event.getEntries().putAfter(prevIst, currIst, TabVisibility.PARENT_AND_SEARCH_TABS);
            prevIst = currIst;
        }
    }
}
