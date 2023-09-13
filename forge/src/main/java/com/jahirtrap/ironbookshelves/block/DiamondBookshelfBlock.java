package com.jahirtrap.ironbookshelves.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;

import static com.jahirtrap.ironbookshelves.init.IronbookshelvesModConfig.DIAMOND_ENCHANT_POWER;

public class DiamondBookshelfBlock extends BaseBookshelfBlock {
    public DiamondBookshelfBlock() {
        super(SoundType.METAL, 5f, 6f, DIAMOND_ENCHANT_POWER.get(), 2, 0, PushReaction.NORMAL);
    }
}
