package com.jabteam.redsys.block;

// ===== IMPORT =====
import com.jabteam.redsys.RedSys;
import com.jabteam.redsys.block.behaviours.ContainerBlockBehaviour;
import com.jabteam.redsys.block.behaviours.PossiblePoweredBlock;
import com.jabteam.redsys.block.behaviours.RedstoneAllowDusts;
import com.jabteam.redsys.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;


// ===== MAIN CLASS ======
public class ModBlocks {

    // == List of Blocks ==
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(RedSys.MOD_ID);

    // ==== Blocks =====
    // == Dusts ==
    public static final DeferredBlock<Block> CUPRITE_DUST = registerAdvancedBlock("cuprite_dust", BlockBehaviour.Properties.of()
            .strength(5.0f, 6.0f)
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()
    );
    // == Resource Blocks ==
    public static final DeferredBlock<Block> SILICON_BLOCK = registerSimpleBlock("silicon_block", BlockBehaviour.Properties.of()
            .strength(7.0f, 8.0f)
            .sound(SoundType.BONE_BLOCK)
            .requiresCorrectToolForDrops()
    );
    public static final DeferredBlock<Block> CUPRITE_BLOCK = registerAdvancedBlock("cuprite_block", BlockBehaviour.Properties.of()
            .strength(5.0f, 6.0f)
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()
    );
    public static final DeferredBlock<Block> FERROLIN_BLOCK = registerAdvancedBlock("ferrolin_block", BlockBehaviour.Properties.of()
            .strength(5.0f, 6.0f)
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()
    );
    public static final DeferredBlock<Block> AURIUM_BLOCK = registerAdvancedBlock("aurium_block", BlockBehaviour.Properties.of()
            .strength(5.0f, 6.0f)
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()
    );

    // == Tables ==
    public static final DeferredBlock<Block> INDUSTRIAL_CRAFT_TABLE = registerSimpleBlock("industrial_craft_table", BlockBehaviour.Properties.of());
    public static final DeferredBlock<Block> SOLDERING_TABLE = registerSimpleBlock("soldering_table", BlockBehaviour.Properties.of());


    public static final DeferredBlock<Block> CHECK = BLOCKS.register("check", id -> new RedstoneAllowDusts(BlockBehaviour.Properties.of()
            .strength(5.0f, 6.0f)
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()
            .setId(ResourceKey.create(Registries.BLOCK, id))
    ));



    // == Block-Registers ==
    private static DeferredBlock<Block> registerSimpleBlock(String name, BlockBehaviour.Properties blockProperties) {
        DeferredBlock<Block> currentBlock = BLOCKS.registerSimpleBlock(name, blockProperties);
        DeferredItem<BlockItem> currentBlockItem = ModItems.ITEMS.register(name, id ->
                new BlockItem(currentBlock.get(),
                        new Item.Properties()
                                .stacksTo(64)
                                .setId(ResourceKey.create(Registries.ITEM, id)))
        );
        return currentBlock;
    }

    private static DeferredBlock<Block> registerAdvancedBlock(String name, BlockBehaviour.Properties blockProperties) {
        DeferredBlock<Block> currentBlock = BLOCKS.register(name, id -> new PossiblePoweredBlock(
                blockProperties.setId(ResourceKey.create(Registries.BLOCK, id))
        ));
        DeferredItem<BlockItem> currentBlockItem = ModItems.ITEMS.register(name, id ->
                new BlockItem(currentBlock.get(),
                new Item.Properties()
                        .stacksTo(64)
                        .setId(ResourceKey.create(Registries.ITEM, id)))
        );
        return currentBlock;
    }



    // ==== REGISTER ====
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}