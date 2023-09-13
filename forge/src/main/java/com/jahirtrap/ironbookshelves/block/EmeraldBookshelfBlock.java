package com.jahirtrap.ironbookshelves.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;

import static com.jahirtrap.ironbookshelves.init.IronbookshelvesModConfig.EMERALD_ENCHANT_POWER;

public class EmeraldBookshelfBlock extends BaseBookshelfBlock {
    public EmeraldBookshelfBlock() {
        super(SoundType.METAL, 5f, 6f, EMERALD_ENCHANT_POWER.get(), 2, 0, PushReaction.NORMAL);
    }
}
