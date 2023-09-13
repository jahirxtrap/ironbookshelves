package com.jahirtrap.ironbookshelves.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;

import static com.jahirtrap.ironbookshelves.init.IronbookshelvesModConfig.IRON_ENCHANT_POWER;

public class IronBookshelfBlock extends BaseBookshelfBlock {
    public IronBookshelfBlock() {
        super(SoundType.METAL, 5f, 6f, IRON_ENCHANT_POWER.get(), 1, 0, PushReaction.NORMAL);
    }
}
