package com.jahirtrap.ironbookshelves.util;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;

public class TextUtils {
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
}
