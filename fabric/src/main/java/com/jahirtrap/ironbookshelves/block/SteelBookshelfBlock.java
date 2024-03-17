package com.jahirtrap.ironbookshelves.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;

import static com.jahirtrap.ironbookshelves.init.IronbookshelvesModConfig.steelEnchantPower;

public class SteelBookshelfBlock extends BaseBookshelfBlock {
    public SteelBookshelfBlock() {
        super(SoundType.METAL, 5f, 6f, steelEnchantPower, 0, PushReaction.NORMAL);
    }
}
