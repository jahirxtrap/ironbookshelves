package com.jahirtrap.ironbookshelves.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;

import static com.jahirtrap.ironbookshelves.init.IronbookshelvesModConfig.ENDERITE_ENCHANT_POWER;

public class EnderiteBookshelfBlock extends BaseBookshelfBlock {
    public EnderiteBookshelfBlock() {
        super(SoundType.NETHERITE_BLOCK, 66f, 1200f, ENDERITE_ENCHANT_POWER.get(), 4, 0, PushReaction.NORMAL);
    }
}
