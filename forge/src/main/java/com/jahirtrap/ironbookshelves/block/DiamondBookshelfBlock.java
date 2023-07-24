package com.jahirtrap.ironbookshelves.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;

public class DiamondBookshelfBlock extends BaseBookshelfBlock {
    public DiamondBookshelfBlock() {
        super(SoundType.METAL, 5f, 6f, 5f, 2, PushReaction.NORMAL);
    }
}
