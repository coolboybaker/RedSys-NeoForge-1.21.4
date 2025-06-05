package com.jabteam.redsys.block;

// ===== IMPORT =====
import com.jabteam.redsys.RedSys;
import com.jabteam.redsys.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
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
    // == Resource Blocks ==
    public static final DeferredBlock<Block> SILICON_BLOCK = registerBlock("silicon_block", BlockBehaviour.Properties.of());
    public static final DeferredBlock<Block> CUPRITE_BLOCK = registerBlock("cuprite_block", BlockBehaviour.Properties.of());
    public static final DeferredBlock<Block> FERROLIN_BLOCK = registerBlock("ferrolin_block", BlockBehaviour.Properties.of());
    public static final DeferredBlock<Block> AURIUM_BLOCK = registerBlock("aurium_block", BlockBehaviour.Properties.of());

    // == Tables ==
    public static final DeferredBlock<Block> INDUSTRIAL_CRAFT_TABLE = registerBlock("industrial_craft_table", BlockBehaviour.Properties.of());
    public static final DeferredBlock<Block> SOLDERING_TABLE = registerBlock("soldering_table", BlockBehaviour.Properties.of());




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
