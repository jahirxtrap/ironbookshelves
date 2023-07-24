package com.jahirtrap.ironbookshelves.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;

public class GoldenBookshelfBlock extends BaseBookshelfBlock {
    public GoldenBookshelfBlock() {
        super(SoundType.METAL, 3f, 6f, 3f, 2, PushReaction.NORMAL);
    }
}
