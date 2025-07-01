package com.jabteam.redsys.block.behaviours;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

public class ContainerBlockBeh extends BaseEntityBlock {

    public static final VoxelShape SHAPE = Block.box(2, 0, 2, 14,  13, 14);
    public static final MapCodec<ContainerBlockBeh> CODEC = simpleCodec(ContainerBlockBeh::new);

    public ContainerBlockBeh(Properties properties) {
        super(properties);
    }



    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context){
        return super.getShape(state, level, pos, context);
    }


    @Override
    protected MapCodec<? extends BaseEntityBlock> codec(){ return CODEC;  }


    @Override
    protected RenderShape getRenderShape(BlockState blockState){
        return RenderShape.MODEL;
    }



    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState){
        return null;
    }


    @Override
    protected InteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        return super.useItemOn(stack, state, level, pos, player, hand, hitResult);
    }




    @Override
    protected void onRemove(BlockState blockState, Level level, BlockPos blockPos, BlockState newBlockState, boolean movedByPiston){
        if (blockState.getBlock() != newBlockState.getBlock()){
            if (level.getBlockEntity(blockPos) instanceof ContainerBlockEntity containerBlockEntity) {
                containerBlockEntity.drops();
                level.updateNeighbourForOutputSignal(blockPos, this);
            }
        }
        super.onRemove(blockState, level, blockPos, newBlockState, movedByPiston);
    }
}
