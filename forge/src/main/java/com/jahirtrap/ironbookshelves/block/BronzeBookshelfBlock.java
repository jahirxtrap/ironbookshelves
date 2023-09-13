package com.jahirtrap.ironbookshelves.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;

import static com.jahirtrap.ironbookshelves.init.IronbookshelvesModConfig.BRONZE_ENCHANT_POWER;

public class BronzeBookshelfBlock extends BaseBookshelfBlock {
    public BronzeBookshelfBlock() {
        super(SoundType.METAL, 5f, 6f, BRONZE_ENCHANT_POWER.get(), 2, 0, PushReaction.NORMAL);
    }
}
