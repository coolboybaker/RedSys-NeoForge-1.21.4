package com.jabteam.redsys.block.behaviours;


import com.jabteam.redsys.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.redstone.Orientation;
import org.jetbrains.annotations.Nullable;


public class PossiblePoweredBlock extends Block {
    public PossiblePoweredBlock(Properties properties) {
        super(properties);
    }
}
