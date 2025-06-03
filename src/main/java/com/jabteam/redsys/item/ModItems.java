package com.jabteam.redsys.item;

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
    // == Crushed ==
    public static final DeferredItem<Item> CRUSHED_COPPER_ORE = ITEMS.registerItem("crushed_copper_ore", Item::new, new Item.Properties());
    public static final DeferredItem<Item> CRUSHED_IRON_ORE = ITEMS.registerItem("crushed_iron_ore", Item::new, new Item.Properties());
    public static final DeferredItem<Item> CRUSHED_GOLD_ORE = ITEMS.registerItem("crushed_gold_ore", Item::new, new Item.Properties());
    public static final DeferredItem<Item> CRUSHED_QUARTZ = ITEMS.registerItem("crushed_quartz", Item::new, new Item.Properties());

    // == Raw resources ==
    public static final DeferredItem<Item> QUARTZ_SAND_WITH_COAL = ITEMS.registerItem("quartz_sand_with_coal", Item::new, new Item.Properties());
    public static final DeferredItem<Item> RAW_COPPER_REDSTONE_ALLOW = ITEMS.registerItem("raw_copper_redstone_allow", Item::new, new Item.Properties());
    public static final DeferredItem<Item> RAW_IRON_REDSTONE_ALLOW = ITEMS.registerItem("raw_iron_redstone_allow", Item::new, new Item.Properties());
    public static final DeferredItem<Item> RAW_GOLD_REDSTONE_ALLOW = ITEMS.registerItem("raw_gold_redstone_allow", Item::new, new Item.Properties());

    // == Resources ==
    // Silicon
    public static final DeferredItem<Item> SILICON_INGOT = ITEMS.registerItem("silicon_ingot", Item::new, new Item.Properties());
    // Cuprite
    public static final DeferredItem<Item> CUPRITE_INGOT = ITEMS.registerItem("cuprite_ingot", Item::new, new Item.Properties());
    public static final DeferredItem<Item> CUPRITE_PLATE = ITEMS.registerItem("cuprite_plate", Item::new, new Item.Properties());
    // Ferrolin
    public static final DeferredItem<Item> FERROLIN_INGOT = ITEMS.registerItem("ferrolin_ingot", Item::new, new Item.Properties());
    public static final DeferredItem<Item> FERROLIN_PLATE = ITEMS.registerItem("ferrolin_plate", Item::new, new Item.Properties());
    // Aurium
    public static final DeferredItem<Item> AURIUM_INGOT = ITEMS.registerItem("aurium_ingot", Item::new, new Item.Properties());
    public static final DeferredItem<Item> AURIUM_PLATE = ITEMS.registerItem("aurium_plate", Item::new, new Item.Properties());



    // == Details ==
    // Silicon
    public static final DeferredItem<Item> SILICON_PLATE = ITEMS.registerItem("silicon_plate", Item::new, new Item.Properties());
    public static final DeferredItem<Item> SILICON_ROD = ITEMS.registerItem("silicon_rod", Item::new, new Item.Properties());

    // Copper-redstone
    public static final DeferredItem<Item> COPPER_REDSTONE_WIRE = ITEMS.registerItem("copper_redstone_wire", Item::new, new Item.Properties());
    public static final DeferredItem<Item> COPPER_REDSTONE_FOIL = ITEMS.registerItem("copper_redstone_foil", Item::new, new Item.Properties());
    public static final DeferredItem<Item> COPPER_REDSTONE_ROD = ITEMS.registerItem("copper_redstone_rod", Item::new, new Item.Properties());

    // Iron-redstone
    public static final DeferredItem<Item> IRON_REDSTONE_WIRE = ITEMS.registerItem("iron_redstone_wire", Item::new, new Item.Properties());
    public static final DeferredItem<Item> IRON_REDSTONE_FOIL = ITEMS.registerItem("iron_redstone_foil", Item::new, new Item.Properties());
    public static final DeferredItem<Item> IRON_REDSTONE_ROD = ITEMS.registerItem("iron_redstone_rod", Item::new, new Item.Properties());

    // Gold-redstone
    public static final DeferredItem<Item> GOLD_REDSTONE_WIRE = ITEMS.registerItem("gold_redstone_wire", Item::new, new Item.Properties());
    public static final DeferredItem<Item> GOLD_REDSTONE_FOIL = ITEMS.registerItem("gold_redstone_foil", Item::new, new Item.Properties());
    public static final DeferredItem<Item> GOLD_REDSTONE_ROD = ITEMS.registerItem("gold_redstone_rod", Item::new, new Item.Properties());

    // == Other Stuff ==
    public static final DeferredItem<Item> STICKY_PAPER = ITEMS.registerItem("sticky_paper", Item::new, new Item.Properties());






    // ==== REGISTER ====
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
