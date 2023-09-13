package com.jahirtrap.ironbookshelves.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;

import static com.jahirtrap.ironbookshelves.init.IronbookshelvesModConfig.COPPER_ENCHANT_POWER;

public class CopperBookshelfBlock extends BaseBookshelfBlock {
    public CopperBookshelfBlock() {
        super(SoundType.COPPER, 3f, 6f, COPPER_ENCHANT_POWER.get(), 1, 0, PushReaction.NORMAL);
    }
}
