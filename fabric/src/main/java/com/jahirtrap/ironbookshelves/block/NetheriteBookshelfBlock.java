package com.jahirtrap.ironbookshelves.block;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.PushReaction;

import static com.jahirtrap.ironbookshelves.init.IronbookshelvesModConfig.netheriteEnchantPower;

public class NetheriteBookshelfBlock extends BaseBookshelfBlock {
    public NetheriteBookshelfBlock() {
        super(SoundType.NETHERITE_BLOCK, 50f, 1200f, netheriteEnchantPower, 0, PushReaction.NORMAL);
    }
}
