package com.jahirtrap.ironbookshelves.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;

import static com.jahirtrap.ironbookshelves.init.IronbookshelvesModConfig.goldenEnchantPower;

public class GoldenBookshelfBlock extends BaseBookshelfBlock {
    public GoldenBookshelfBlock() {
        super(SoundType.METAL, 3f, 6f, goldenEnchantPower, 2, 0, PushReaction.NORMAL);
    }
}
