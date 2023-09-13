package com.jahirtrap.ironbookshelves.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;

import static com.jahirtrap.ironbookshelves.init.IronbookshelvesModConfig.amethystEnchantPower;

public class AmethystBookshelfBlock extends BaseBookshelfBlock {
    public AmethystBookshelfBlock() {
        super(SoundType.AMETHYST, 1.5f, 1.5f, amethystEnchantPower, 0, 0, PushReaction.NORMAL);
    }
}
