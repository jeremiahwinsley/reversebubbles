package net.permutated.reversebubbles.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.BubbleColumnBlock;
import net.minecraft.block.SoulSandBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import java.util.Random;

@SuppressWarnings({"java:S1118", "java:S1610"})
@Mixin(SoulSandBlock.class)
public abstract class MixinSoulSandBlock {
    @Overwrite
    public void tick(BlockState p_225534_1_, ServerWorld p_225534_2_, BlockPos p_225534_3_, Random p_225534_4_) {
        BubbleColumnBlock.growColumn(p_225534_2_, p_225534_3_.above(), true);
    }
}
