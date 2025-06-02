package com.jabteam.redsys.Items;

// ===== IMPORT =====
import com.jabteam.redsys.RedSys;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;



// ===== MAIN CLASS ======
public class ModItems {

    // == List of Items ==
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(RedSys.MOD_ID);



    // ==== Items ====
    // == Dusts ==
    public static final DeferredItem<Item> COPPER_DUST = ITEMS.registerItem("copper_dust", Item::new, new Item.Properties());
    public static final DeferredItem<Item> IRON_DUST = ITEMS.registerItem("iron_dust", Item::new, new Item.Properties());
    public static final DeferredItem<Item> GOLD_DUST = ITEMS.registerItem("gold_dust", Item::new, new Item.Properties());
    public static final DeferredItem<Item> QUARTZ_DUST = ITEMS.registerItem("quartz_dust", Item::new, new Item.Properties());

    // == Raw resources ==
    public static final DeferredItem<Item> RAW_COPPER_REDSTONE_ALLOW = ITEMS.registerItem("raw_copper_redstone_allow", Item::new, new Item.Properties());
    public static final DeferredItem<Item> RAW_IRON_REDSTONE_ALLOW = ITEMS.registerItem("raw_iron_redstone_allow", Item::new, new Item.Properties());

    // == Resources ==
    public static final DeferredItem<Item> SILICON_INGOT = ITEMS.registerItem("silicon_ingot", Item::new, new Item.Properties());
    public static final DeferredItem<Item> COPPER_REDSTONE_ALLOW = ITEMS.registerItem("copper_redstone_allow", Item::new, new Item.Properties());
    public static final DeferredItem<Item> IRON_REDSTONE_ALLOW = ITEMS.registerItem("iron_redstone_allow", Item::new, new Item.Properties());


    // == Details ==
    // Copper-redstone
    public static final DeferredItem<Item> COPPER_REDSTONE_PLATE = ITEMS.registerItem("copper_redstone_plate", Item::new, new Item.Properties());
    public static final DeferredItem<Item> COPPER_REDSTONE_WIRE = ITEMS.registerItem("copper_redstone_wire", Item::new, new Item.Properties());
    public static final DeferredItem<Item> COPPER_REDSTONE_FOIL = ITEMS.registerItem("copper_redstone_foil", Item::new, new Item.Properties());

    // Iron-redstone
    public static final DeferredItem<Item> IRON_REDSTONE_PLATE = ITEMS.registerItem("iron_redstone_plate", Item::new, new Item.Properties());
    public static final DeferredItem<Item> IRON_REDSTONE_WIRE = ITEMS.registerItem("iron_redstone_wire", Item::new, new Item.Properties());
    public static final DeferredItem<Item> IRON_REDSTONE_FOIL = ITEMS.registerItem("iron_redstone_foil", Item::new, new Item.Properties());






    // ==== REGISTER ====
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
