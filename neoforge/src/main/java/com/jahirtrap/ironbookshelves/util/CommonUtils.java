package com.jahirtrap.ironbookshelves.util;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab.TabVisibility;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.DeferredHolder;

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
    public static void insertAfter(BuildCreativeModeTabContentsEvent event, Item after, DeferredHolder<?, ? extends ItemLike>... next) {
        ItemStack prevIst = new ItemStack(after);
        for (DeferredHolder<?, ? extends ItemLike> item : next) {
            ItemStack currIst = new ItemStack(item.get());
            event.insertAfter(prevIst, currIst, TabVisibility.PARENT_AND_SEARCH_TABS);
            prevIst = currIst;
        }
    }
}
