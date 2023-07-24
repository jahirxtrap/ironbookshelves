package com.jahirtrap.ironbookshelves.util;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class CommonUtils {
    public static boolean isCorrectToolForDrops(@NotNull BlockState state, @NotNull Player player) {
        if (!state.requiresCorrectToolForDrops())
            return true;

        return player.hasCorrectToolForDrops(state);
    }
}
