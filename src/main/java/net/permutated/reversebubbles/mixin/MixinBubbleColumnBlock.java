package net.permutated.reversebubbles.mixin;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BubbleColumnBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static net.minecraft.world.level.block.BubbleColumnBlock.DRAG_DOWN;

@SuppressWarnings({"java:S1118", "java:S1610"})
@Mixin(BubbleColumnBlock.class)
public abstract class MixinBubbleColumnBlock {
    @Inject(method = "getColumnState", at = @At("HEAD"), cancellable = true)
    private static void getColumnState(BlockState blockState, CallbackInfoReturnable<BlockState> cir) {
        if (blockState.is(Blocks.SOUL_SAND)) {
            cir.setReturnValue(Blocks.BUBBLE_COLUMN.defaultBlockState().setValue(DRAG_DOWN, true));
        } else if (blockState.is(Blocks.MAGMA_BLOCK)) {
            cir.setReturnValue(Blocks.BUBBLE_COLUMN.defaultBlockState().setValue(DRAG_DOWN, false));
        }
    }
}
