package com.jahirtrap.ironbookshelves.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;

import static com.jahirtrap.ironbookshelves.init.IronbookshelvesModConfig.NETHERITE_ENCHANT_POWER;

public class NetheriteBookshelfBlock extends BaseBookshelfBlock {
    public NetheriteBookshelfBlock() {
        super(SoundType.NETHERITE_BLOCK, 50f, 1200f, NETHERITE_ENCHANT_POWER.get(), 3, 0, PushReaction.NORMAL);
    }
}
