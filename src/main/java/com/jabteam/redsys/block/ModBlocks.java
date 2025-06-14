package com.jabteam.redsys.block;

// ===== IMPORT =====
import com.jabteam.redsys.RedSys;
import com.jabteam.redsys.block.behaviours.ContainerBlockBehaviour;
import com.jabteam.redsys.block.behaviours.PossiblePoweredBlock;
import com.jabteam.redsys.item.ModItems;
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
    public static final DeferredBlock<Block> AURIUM_BLOCK = testRegisterBlock("aurium_block", PossiblePoweredBlock.class, PossiblePoweredBlock.Properties.of()
            .strength(5.0f, 6.0f)
            .sound(SoundType.METAL)
            .requiresCorrectToolForDrops()
    );

    // == Tables ==
    public static final DeferredBlock<Block> INDUSTRIAL_CRAFT_TABLE = registerBlock("industrial_craft_table", BlockBehaviour.Properties.of());
    public static final DeferredBlock<Block> SOLDERING_TABLE = registerBlock("soldering_table", BlockBehaviour.Properties.of());


    public static final DeferredBlock<Block> CHECK = registerBlock("check", ContainerBlockBehaviour.Properties.of());



    // == Block-Registers ==
    private static DeferredBlock<Block> registerBlock(String name, BlockBehaviour.Properties blockProperties) {
        DeferredBlock<Block> currentBlock = BLOCKS.registerSimpleBlock(name, blockProperties);
        DeferredItem<BlockItem> currentBlockItem = ModItems.ITEMS.registerSimpleBlockItem(name + "_item", currentBlock);
        return currentBlock;
    }

    public static <T extends Block> DeferredBlock<T> testRegisterBlock(String name, Class<T> blockClass, BlockBehaviour.Properties props) {
        return BLOCKS.register(name, () -> {
            try {
                return blockClass.getDeclaredConstructor(BlockBehaviour.Properties.class).newInstance(props);
            } catch (Exception e) {
                throw new RuntimeException("Failed to instantiate block class", e);
            }
        });
    }



    // ==== REGISTER ====
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
