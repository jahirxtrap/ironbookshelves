package com.jahirtrap.ironbookshelves.init.mixin;

import com.jahirtrap.ironbookshelves.util.HarvestableBlock;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerPlayerGameMode;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ServerPlayerGameMode.class)
public class ServerPlayerGameModeMixin {
    protected ServerLevel level;

    @WrapOperation(method = "destroyBlock", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/level/ServerPlayer;hasCorrectToolForDrops(Lnet/minecraft/world/level/block/state/BlockState;)Z"))
    private boolean canHarvest(ServerPlayer player, BlockState blockstate, Operation<Boolean> operation, BlockPos pos) {
        if (blockstate.getBlock() instanceof HarvestableBlock harvestableBlock)
            return harvestableBlock.canHarvestBlock(blockstate, this.level, pos, player);
        else
            return operation.call(player, blockstate);
    }
}
