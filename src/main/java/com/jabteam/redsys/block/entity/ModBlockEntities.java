package com.jabteam.redsys.block.entity;

import com.jabteam.redsys.RedSys;
import com.jabteam.redsys.block.ModBlocks;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, RedSys.MOD_ID);


    public static final Supplier<BlockEntityType<ContainerBlockEntity>> CONTAINER_BE = BLOCK_ENTITIES.register("container_be",
            () -> new BlockEntityType(ContainerBlockEntity::new, false, ModBlocks.currentBlock)
            );




    public static void register(IEventBus eventBus){


    BLOCK_ENTITIES.register(eventBus);
    }
}
