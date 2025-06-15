package com.jabteam.redsys.block.behaviours.IndustrialCraftTable;

import com.jabteam.redsys.RedSys;
import com.jabteam.redsys.init.Menus.IndustrialCraftTable_Menu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

import javax.annotation.Nullable;



public class IndustrialCraftTable_BlockBeh extends Block {
    public IndustrialCraftTable_BlockBeh(Properties properties) {
        super(properties);
    }


    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hitResult) {
        if (level.isClientSide) {
            return InteractionResult.SUCCESS;
        }

        else {
            RedSys.LOGGER.debug("0");
            player.openMenu(state.getMenuProvider(level, pos));
            return InteractionResult.CONSUME;
        }
    }



    @Nullable
    @Override
    public MenuProvider getMenuProvider(BlockState state, Level level, BlockPos pos) {
        RedSys.LOGGER.debug("1");
        return new SimpleMenuProvider(
                (containerId, playerInventory, player) -> new IndustrialCraftTable_Menu(containerId, playerInventory, ContainerLevelAccess.create(level, pos)),
                Component.translatable("container.redsys.industrial_craft_table")
        );
    }
}