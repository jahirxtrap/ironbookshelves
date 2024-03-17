package com.jahirtrap.ironbookshelves.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;

import static com.jahirtrap.ironbookshelves.init.IronbookshelvesModConfig.obsidianEnchantPower;

public class ObsidianBookshelfBlock extends BaseBookshelfBlock {
    public ObsidianBookshelfBlock() {
        super(SoundType.STONE, 50f, 1200f, obsidianEnchantPower, 0, PushReaction.BLOCK);
    }
}
