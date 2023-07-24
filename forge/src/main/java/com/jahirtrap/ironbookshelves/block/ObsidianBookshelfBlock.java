package com.jahirtrap.ironbookshelves.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;

public class ObsidianBookshelfBlock extends BaseBookshelfBlock {
    public ObsidianBookshelfBlock() {
        super(SoundType.STONE, 50f, 1200f, 7f, 3, PushReaction.BLOCK);
    }
}
