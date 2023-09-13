package com.jahirtrap.ironbookshelves.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;

import static com.jahirtrap.ironbookshelves.init.IronbookshelvesModConfig.OBSIDIAN_ENCHANT_POWER;

public class ObsidianBookshelfBlock extends BaseBookshelfBlock {
    public ObsidianBookshelfBlock() {
        super(SoundType.STONE, 50f, 1200f, OBSIDIAN_ENCHANT_POWER.get(), 3, 0, PushReaction.BLOCK);
    }
}
