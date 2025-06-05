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
    public static final DeferredBlock<Block> CUPRITE_BLOCK = BLOCKS.registerSimpleBlock("cuprite_block", BlockBehaviour.Properties.of());
    public static final DeferredItem<BlockItem> CUPRITE_BLOCK_ITEM = ModItems.ITEMS.registerSimpleBlockItem("cuprite_block_item", CUPRITE_BLOCK);



    // == Block-Registers ==
    private static void registerBlock(String Name, DeferredBlock<Block> a) {

    }


    // ==== REGISTER ====
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
