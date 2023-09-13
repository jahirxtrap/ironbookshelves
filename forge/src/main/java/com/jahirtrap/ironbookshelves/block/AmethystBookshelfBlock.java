package com.jahirtrap.ironbookshelves.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;

import static com.jahirtrap.ironbookshelves.init.IronbookshelvesModConfig.AMETHYST_ENCHANT_POWER;

public class AmethystBookshelfBlock extends BaseBookshelfBlock {
    public AmethystBookshelfBlock() {
        super(SoundType.AMETHYST, 1.5f, 1.5f, AMETHYST_ENCHANT_POWER.get(), 0, 0, PushReaction.NORMAL);
    }
}
