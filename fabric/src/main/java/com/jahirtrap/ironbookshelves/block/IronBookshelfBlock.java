package com.jahirtrap.ironbookshelves.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;

public class IronBookshelfBlock extends BaseBookshelfBlock {
    public IronBookshelfBlock() {
        super(SoundType.METAL, 5f, 6f, 2f, 1, PushReaction.NORMAL);
    }
}
