package com.jahirtrap.ironbookshelves.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;

public class EmeraldBookshelfBlock extends BaseBookshelfBlock {
    public EmeraldBookshelfBlock() {
        super(SoundType.METAL, 5f, 6f, 6f, 2, PushReaction.NORMAL);
    }
}
