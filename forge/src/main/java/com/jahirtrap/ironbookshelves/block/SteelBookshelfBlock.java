package com.jahirtrap.ironbookshelves.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;

import static com.jahirtrap.ironbookshelves.init.IronbookshelvesModConfig.STEEL_ENCHANT_POWER;

public class SteelBookshelfBlock extends BaseBookshelfBlock {
    public SteelBookshelfBlock() {
        super(SoundType.METAL, 5f, 6f, STEEL_ENCHANT_POWER.get(), 2, 0, PushReaction.NORMAL);
    }
}
