package com.jahirtrap.ironbookshelves.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;

import static com.jahirtrap.ironbookshelves.init.IronbookshelvesModConfig.diamondEnchantPower;

public class DiamondBookshelfBlock extends BaseBookshelfBlock {
    public DiamondBookshelfBlock() {
        super(SoundType.METAL, 5f, 6f, diamondEnchantPower, 0, PushReaction.NORMAL);
    }
}
