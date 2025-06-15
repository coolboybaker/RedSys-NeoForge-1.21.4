package com.jabteam.redsys.block.behaviours;

import com.jabteam.redsys.RedSys;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class ContainerBlockBehaviour extends Block {

    // Init
    public ContainerBlockBehaviour(Properties properties) {
        super(properties);
    }


    // == On RMB ==


    @Override
    protected void attack(BlockState state, Level level, BlockPos pos, Player player) {
        super.attack(state, level, pos, player);
        RedSys.LOGGER.debug("dfsgsdffsdfsd");
    }


    

    @Override
    protected InteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        RedSys.LOGGER.debug("A1");
        if (player.isCrouching())
        {
            RedSys.LOGGER.debug("A2");
        }

        return super.useItemOn(stack, state, level, pos, player, hand, hitResult);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        RedSys.LOGGER.debug("B1");
        if (player.isCrouching())
        {
            RedSys.LOGGER.debug("B2");
        }
        return super.useWithoutItem(state, level, pos, player, hitResult);
    }



    /*
    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (!level.isClientSide && hand == InteractionHand.MAIN_HAND) {
            ItemStack heldItem = player.getItemInHand(hand);

            if (heldItem.getItem() instanceof CircuitItem) {
                // Логика вставки схемы
                level.setBlock(pos, state.setValue(HAS_CIRCUIT, true), 3);
                if (!player.isCreative()) {
                    heldItem.shrink(1);
                }
                return InteractionResult.SUCCESS;
            }
        }
        return super.useItemOn(state, level, pos, player, hand, hit);
    }


    @Override
    public InteractionResult use(Level level, Player player, InteractionHand hand) {
        // Get stack
        ItemStack currentStack = player.getItemInHand(hand);

        // Put/Get A Scheme
        if (player.isCrouching()) { return PutOrGetScheme(level, player, hand, currentStack); }

        // Average Interaction
        return Interact(level, player, hand, currentStack);
    }
*/

    // == Put/Get A Scheme ==
    private InteractionResult PutOrGetScheme(Level level, Player player, InteractionHand hand, ItemStack currentStack) {
        return new InteractionResult.Fail();
    }


    // == Interact ==
    private InteractionResult Interact(Level level, Player player, InteractionHand hand, ItemStack currentStack) {
        return new InteractionResult.Fail();
    }
}

/*
public class ElectricShieldBlock extends Block {
    public ElectricShieldBlock(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (!level.isClientSide && hand == InteractionHand.MAIN_HAND) {
            ItemStack heldItem = player.getItemInHand(hand);

            if (heldItem.getItem() instanceof CircuitItem) {
                // Логика вставки схемы
                level.setBlock(pos, state.setValue(HAS_CIRCUIT, true), 3);
                if (!player.isCreative()) {
                    heldItem.shrink(1);
                }
                return InteractionResult.SUCCESS;
            }
        }
        return super.use(state, level, pos, player, hand, hit);
    }
}
* */