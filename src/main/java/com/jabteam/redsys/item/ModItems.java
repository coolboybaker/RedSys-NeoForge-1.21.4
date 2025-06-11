package com.jabteam.redsys.item;

// ===== IMPORT =====
import com.jabteam.redsys.RedSys;
import com.jabteam.redsys.item.behaviours.SchemeBehaviour;
import com.jabteam.redsys.item.behaviours.ToolBehaviour;
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
    public static final DeferredItem<Item> CRUSHED_QUARTZ = ITEMS.registerItem("crushed_quartz", Item::new, new Item.Properties());
    public static final DeferredItem<Item> CRUSHED_COPPER_ORE = ITEMS.registerItem("crushed_copper_ore", Item::new, new Item.Properties());
    public static final DeferredItem<Item> CRUSHED_IRON_ORE = ITEMS.registerItem("crushed_iron_ore", Item::new, new Item.Properties());
    public static final DeferredItem<Item> CRUSHED_GOLD_ORE = ITEMS.registerItem("crushed_gold_ore", Item::new, new Item.Properties());

    // == Raw resources ==
    public static final DeferredItem<Item> QUARTZ_COAL_SAND = ITEMS.registerItem("quartz_coal_sand", Item::new, new Item.Properties());
    public static final DeferredItem<Item> COPPER_REDSTONE_DUST = ITEMS.registerItem("copper_redstone_dust", Item::new, new Item.Properties());
    public static final DeferredItem<Item> IRON_REDSTONE_DUST = ITEMS.registerItem("iron_redstone_dust", Item::new, new Item.Properties());
    public static final DeferredItem<Item> GOLD_REDSTONE_DUST = ITEMS.registerItem("gold_redstone_dust", Item::new, new Item.Properties());

    // == Resources ==
    // Silicon
    public static final DeferredItem<Item> SILICON_INGOT = ITEMS.registerItem("silicon_ingot", Item::new, new Item.Properties());
    public static final DeferredItem<Item> SILICON_PLATE = ITEMS.registerItem("silicon_plate", Item::new, new Item.Properties());
    public static final DeferredItem<Item> SILICON_ROD = ITEMS.registerItem("silicon_rod", Item::new, new Item.Properties());
    // Cuprite
    public static final DeferredItem<Item> CUPRITE_INGOT = ITEMS.registerItem("cuprite_ingot", Item::new, new Item.Properties());
    public static final DeferredItem<Item> CUPRITE_ROD = ITEMS.registerItem("cuprite_rod", Item::new, new Item.Properties());
    public static final DeferredItem<Item> CUPRITE_PLATE = ITEMS.registerItem("cuprite_plate", Item::new, new Item.Properties());
    public static final DeferredItem<Item> CUPRITE_FOIL = ITEMS.registerItem("cuprite_foil", Item::new, new Item.Properties());
    public static final DeferredItem<Item> CUPRITE_WIRE = ITEMS.registerItem("cuprite_wire", Item::new, new Item.Properties());
    // Ferrolin
    public static final DeferredItem<Item> FERROLIN_INGOT = ITEMS.registerItem("ferrolin_ingot", Item::new, new Item.Properties());
    public static final DeferredItem<Item> FERROLIN_ROD = ITEMS.registerItem("ferrolin_rod", Item::new, new Item.Properties());
    public static final DeferredItem<Item> FERROLIN_PLATE = ITEMS.registerItem("ferrolin_plate", Item::new, new Item.Properties());
    public static final DeferredItem<Item> FERROLIN_FOIL = ITEMS.registerItem("ferrolin_foil", Item::new, new Item.Properties());
    public static final DeferredItem<Item> FERROLIN_WIRE = ITEMS.registerItem("ferrolin_wire", Item::new, new Item.Properties());
    // Aurium
    public static final DeferredItem<Item> AURIUM_INGOT = ITEMS.registerItem("aurium_ingot", Item::new, new Item.Properties());
    public static final DeferredItem<Item> AURIUM_ROD = ITEMS.registerItem("aurium_rod", Item::new, new Item.Properties());
    public static final DeferredItem<Item> AURIUM_PLATE = ITEMS.registerItem("aurium_plate", Item::new, new Item.Properties());
    public static final DeferredItem<Item> AURIUM_FOIL = ITEMS.registerItem("aurium_foil", Item::new, new Item.Properties());
    public static final DeferredItem<Item> AURIUM_WIRE = ITEMS.registerItem("aurium_wire", Item::new, new Item.Properties());


    // == Tools ==
    public static final DeferredItem<ToolBehaviour> HAMMER = ITEMS.registerItem("hammer", ToolBehaviour::new, new Item.Properties());
    public static final DeferredItem<ToolBehaviour> PLIERS = ITEMS.registerItem("pliers", ToolBehaviour::new, new Item.Properties());


    // == Another Stuff
    public static final DeferredItem<Item> STICKY_PAPER = ITEMS.registerItem("sticky_paper", Item::new, new Item.Properties());
    public static final DeferredItem<Item> ACTIVE_REDSTONE_CRYSTAL = ITEMS.registerItem("active_redstone_crystal", Item::new, new Item.Properties());
    public static final DeferredItem<Item> DISACTIVE_REDSTONE_CRYSTAL = ITEMS.registerItem("disactive_redstone_crystal", Item::new, new Item.Properties());


    // == Paper ==
    public static final DeferredItem<Item> WHITE_RIGID_PAPER = ITEMS.registerItem("white_rigid_paper", Item::new, new Item.Properties());
    public static final DeferredItem<Item> ORANGE_RIGID_PAPER = ITEMS.registerItem("orange_rigid_paper", Item::new, new Item.Properties());
    public static final DeferredItem<Item> MAGENTA_RIGID_PAPER = ITEMS.registerItem("magenta_rigid_paper", Item::new, new Item.Properties());
    public static final DeferredItem<Item> LIGHT_BLUE_RIGID_PAPER = ITEMS.registerItem("light_blue_rigid_paper", Item::new, new Item.Properties());
    public static final DeferredItem<Item> YELLOW_RIGID_PAPER = ITEMS.registerItem("yellow_rigid_paper", Item::new, new Item.Properties());
    public static final DeferredItem<Item> LIME_RIGID_PAPER = ITEMS.registerItem("lime_rigid_paper", Item::new, new Item.Properties());
    public static final DeferredItem<Item> PINK_RIGID_PAPER = ITEMS.registerItem("pink_rigid_paper", Item::new, new Item.Properties());
    public static final DeferredItem<Item> GRAY_RIGID_PAPER = ITEMS.registerItem("gray_rigid_paper", Item::new, new Item.Properties());
    public static final DeferredItem<Item> LIGHT_GRAY_RIGID_PAPER = ITEMS.registerItem("light_gray_rigid_paper", Item::new, new Item.Properties());
    public static final DeferredItem<Item> CYAN_RIGID_PAPER = ITEMS.registerItem("cyan_rigid_paper", Item::new, new Item.Properties());
    public static final DeferredItem<Item> PURPLE_RIGID_PAPER = ITEMS.registerItem("purple_rigid_paper", Item::new, new Item.Properties());
    public static final DeferredItem<Item> BLUE_RIGID_PAPER = ITEMS.registerItem("blue_rigid_paper", Item::new, new Item.Properties());
    public static final DeferredItem<Item> BROWN_RIGID_PAPER = ITEMS.registerItem("brown_rigid_paper", Item::new, new Item.Properties());
    public static final DeferredItem<Item> GREEN_RIGID_PAPER = ITEMS.registerItem("green_rigid_paper", Item::new, new Item.Properties());
    public static final DeferredItem<Item> RED_RIGID_PAPER = ITEMS.registerItem("red_rigid_paper", Item::new, new Item.Properties());
    public static final DeferredItem<Item> BLACK_RIGID_PAPER = ITEMS.registerItem("black_rigid_paper", Item::new, new Item.Properties());


    // ==== Schemes ====
        // == Empty ==
    public static final DeferredItem<SchemeBehaviour> WHITE_EMPTY_SCHEME = ITEMS.registerItem("white_empty_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> ORANGE_EMPTY_SCHEME = ITEMS.registerItem("orange_empty_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> MAGENTA_EMPTY_SCHEME = ITEMS.registerItem("magenta_empty_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> LIGHT_BLUE_EMPTY_SCHEME = ITEMS.registerItem("light_blue_empty_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> YELLOW_EMPTY_SCHEME = ITEMS.registerItem("yellow_empty_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> LIME_EMPTY_SCHEME = ITEMS.registerItem("lime_empty_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> PINK_EMPTY_SCHEME = ITEMS.registerItem("pink_empty_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> GRAY_EMPTY_SCHEME = ITEMS.registerItem("gray_empty_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> LIGHT_GRAY_EMPTY_SCHEME = ITEMS.registerItem("light_gray_empty_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> CYAN_EMPTY_SCHEME = ITEMS.registerItem("cyan_empty_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> PURPLE_EMPTY_SCHEME = ITEMS.registerItem("purple_empty_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> BLUE_EMPTY_SCHEME = ITEMS.registerItem("blue_empty_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> BROWN_EMPTY_SCHEME = ITEMS.registerItem("brown_empty_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> GREEN_EMPTY_SCHEME = ITEMS.registerItem("green_empty_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> RED_EMPTY_SCHEME = ITEMS.registerItem("red_empty_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> BLACK_EMPTY_SCHEME = ITEMS.registerItem("black_empty_scheme", SchemeBehaviour::new, new Item.Properties());
        // == Simple ==
    public static final DeferredItem<SchemeBehaviour> WHITE_SIMPLE_SCHEME = ITEMS.registerItem("white_simple_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> ORANGE_SIMPLE_SCHEME = ITEMS.registerItem("orange_simple_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> MAGENTA_SIMPLE_SCHEME = ITEMS.registerItem("magenta_simple_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> LIGHT_BLUE_SIMPLE_SCHEME = ITEMS.registerItem("light_blue_simple_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> YELLOW_SIMPLE_SCHEME = ITEMS.registerItem("yellow_simple_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> LIME_SIMPLE_SCHEME = ITEMS.registerItem("lime_simple_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> PINK_SIMPLE_SCHEME = ITEMS.registerItem("pink_simple_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> GRAY_SIMPLE_SCHEME = ITEMS.registerItem("gray_simple_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> LIGHT_GRAY_SIMPLE_SCHEME = ITEMS.registerItem("light_gray_simple_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> CYAN_SIMPLE_SCHEME = ITEMS.registerItem("cyan_simple_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> PURPLE_SIMPLE_SCHEME = ITEMS.registerItem("purple_simple_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> BLUE_SIMPLE_SCHEME = ITEMS.registerItem("blue_simple_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> BROWN_SIMPLE_SCHEME = ITEMS.registerItem("brown_simple_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> GREEN_SIMPLE_SCHEME = ITEMS.registerItem("green_simple_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> RED_SIMPLE_SCHEME = ITEMS.registerItem("red_simple_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> BLACK_SIMPLE_SCHEME = ITEMS.registerItem("black_simple_scheme", SchemeBehaviour::new, new Item.Properties());
        // == Advanced ==
    public static final DeferredItem<SchemeBehaviour> WHITE_ADVANCED_SCHEME = ITEMS.registerItem("white_advanced_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> ORANGE_ADVANCED_SCHEME = ITEMS.registerItem("orange_advanced_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> MAGENTA_ADVANCED_SCHEME = ITEMS.registerItem("magenta_advanced_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> LIGHT_BLUE_ADVANCED_SCHEME = ITEMS.registerItem("light_blue_advanced_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> YELLOW_ADVANCED_SCHEME = ITEMS.registerItem("yellow_advanced_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> LIME_ADVANCED_SCHEME = ITEMS.registerItem("lime_advanced_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> PINK_ADVANCED_SCHEME = ITEMS.registerItem("pink_advanced_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> GRAY_ADVANCED_SCHEME = ITEMS.registerItem("gray_advanced_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> LIGHT_GRAY_ADVANCED_SCHEME = ITEMS.registerItem("light_gray_advanced_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> CYAN_ADVANCED_SCHEME = ITEMS.registerItem("cyan_advanced_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> PURPLE_ADVANCED_SCHEME = ITEMS.registerItem("purple_advanced_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> BLUE_ADVANCED_SCHEME = ITEMS.registerItem("blue_advanced_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> BROWN_ADVANCED_SCHEME = ITEMS.registerItem("brown_advanced_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> GREEN_ADVANCED_SCHEME = ITEMS.registerItem("green_advanced_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> RED_ADVANCED_SCHEME = ITEMS.registerItem("red_advanced_scheme", SchemeBehaviour::new, new Item.Properties());
    public static final DeferredItem<SchemeBehaviour> BLACK_ADVANCED_SCHEME = ITEMS.registerItem("black_advanced_scheme", SchemeBehaviour::new, new Item.Properties());








    // ==== REGISTER ====
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}




