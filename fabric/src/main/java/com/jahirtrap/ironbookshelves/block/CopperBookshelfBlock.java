package com.jahirtrap.ironbookshelves.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;

import static com.jahirtrap.ironbookshelves.init.IronbookshelvesModConfig.copperEnchantPower;

public class CopperBookshelfBlock extends BaseBookshelfBlock {
    public CopperBookshelfBlock() {
        super(SoundType.COPPER, 3f, 6f, copperEnchantPower, 1, 0, PushReaction.NORMAL);
    }
}
