package com.jabteam.redsys.block;

// ===== IMPORT =====
import com.jabteam.redsys.RedSys;
import com.jabteam.redsys.block.behaviours.ContainerBlockBehaviour;
import com.jabteam.redsys.block.behaviours.PossiblePoweredBlock;
import com.jabteam.redsys.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;


// ===== MAIN CLASS ======
public class ModBlocks {

    // == List of Blocks ==
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(RedSys.MOD_ID);

    // ==== Blocks =====
    // == Dusts ==
    public static final DeferredBlock<Block> CUPRITE_DUST = registerBlock("cuprite_dust", PossiblePoweredBlock.Properties.of()
            .strength(5.0f, 6.0f)
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()
    );
    // == Resource Blocks ==
    public static final DeferredBlock<Block> SILICON_BLOCK = registerBlock("silicon_block", BlockBehaviour.Properties.of()
            .strength(7.0f, 8.0f)
            .sound(SoundType.BONE_BLOCK)
            .requiresCorrectToolForDrops()
    );
    public static final DeferredBlock<Block> CUPRITE_BLOCK = registerBlock("cuprite_block", PossiblePoweredBlock.Properties.of()
            .strength(5.0f, 6.0f)
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()
    );
    public static final DeferredBlock<Block> FERROLIN_BLOCK = registerBlock("ferrolin_block", PossiblePoweredBlock.Properties.of()
            .strength(5.0f, 6.0f)
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()
    );
    public static final DeferredBlock<Block> AURIUM_BLOCK = BLOCKS.register("aurium_block", id -> new PossiblePoweredBlock(BlockBehaviour.Properties.of()
            .strength(5.0f, 6.0f)
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()
            .setId(ResourceKey.create(Registries.BLOCK, id))
    ));
    public static final DeferredItem<BlockItem> AURIUM_BLOCK_ITEM = ModItems.ITEMS.register("aurium_block", id ->
            new BlockItem(AURIUM_BLOCK.get(), new Item.Properties().stacksTo(64).setId(ResourceKey.create(Registries.ITEM, id)))
    );

    // == Tables ==
    public static final DeferredBlock<Block> INDUSTRIAL_CRAFT_TABLE = registerBlock("industrial_craft_table", BlockBehaviour.Properties.of());
    public static final DeferredBlock<Block> SOLDERING_TABLE = registerBlock("soldering_table", BlockBehaviour.Properties.of());


    public static final DeferredBlock<Block> CHECK = BLOCKS.register("check", id -> new ContainerBlockBehaviour(BlockBehaviour.Properties.of()
            .strength(5.0f, 6.0f)
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()
            .setId(ResourceKey.create(Registries.BLOCK, id))
    ));



    // == Block-Registers ==
    private static DeferredBlock<Block> registerBlock(String name, BlockBehaviour.Properties blockProperties) {
        DeferredBlock<Block> currentBlock = BLOCKS.registerSimpleBlock(name, blockProperties);
        DeferredItem<BlockItem> currentBlockItem = ModItems.ITEMS.registerSimpleBlockItem(name + "_item", currentBlock);
        return currentBlock;
    }


    // ==== REGISTER ====
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}