package com.jahirtrap.ironbookshelves.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;

public class NetheriteBookshelfBlock extends BaseBookshelfBlock {
    public NetheriteBookshelfBlock() {
        super(SoundType.NETHERITE_BLOCK, 50f, 1200f, 10f, 3, PushReaction.NORMAL);
    }
}
