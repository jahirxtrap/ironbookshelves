package com.jahirtrap.ironbookshelves.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;

import static com.jahirtrap.ironbookshelves.init.IronbookshelvesModConfig.emeraldEnchantPower;

public class EmeraldBookshelfBlock extends BaseBookshelfBlock {
    public EmeraldBookshelfBlock() {
        super(SoundType.METAL, 5f, 6f, emeraldEnchantPower, 0, PushReaction.NORMAL);
    }
}
