package com.jabteam.redsys;

// ===== IMPORT =====
import com.jabteam.redsys.block.ModBlocks;
import com.jabteam.redsys.init.ModMenus;
import com.jabteam.redsys.item.ModItems;
import net.minecraft.client.gui.screens.MenuScreens;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


// ===== MAIN CLASS ======
@Mod(RedSys.MOD_ID)
public class RedSys  {

    // Main Constants
    public static final String MOD_ID = "redsys";
    public static final Logger LOGGER = LogUtils.getLogger();


    // Create a Tab
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> RED_SYS_TAB = CREATIVE_MODE_TABS.register(
            "red_sys_tab",
            () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.redsys"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ModItems.CRUSHED_COPPER_ORE.get().getDefaultInstance())
            .displayItems((parameters, output) -> {

                // ==== ITEMS ====
                // == Crushed ==
                output.accept(ModItems.CRUSHED_QUARTZ.get());
                output.accept(ModItems.CRUSHED_COPPER_ORE.get());
                output.accept(ModItems.CRUSHED_IRON_ORE.get());
                output.accept(ModItems.CRUSHED_GOLD_ORE.get());

                // == Raw resources ==
                output.accept(ModItems.QUARTZ_COAL_SAND.get());
                output.accept(ModItems.COPPER_REDSTONE_DUST.get());
                output.accept(ModItems.IRON_REDSTONE_DUST.get());
                output.accept(ModItems.GOLD_REDSTONE_DUST.get());

                // == Resources ==
                // Silicon
                output.accept((ModBlocks.SILICON_BLOCK.get()));
                output.accept(ModItems.SILICON_INGOT.get());
                output.accept(ModItems.SILICON_PLATE.get());
                output.accept(ModItems.SILICON_ROD.get());
                // Cuprite
                output.accept((ModBlocks.CUPRITE_BLOCK.get()));
                output.accept(ModItems.CUPRITE_INGOT.get());
                output.accept(ModItems.CUPRITE_ROD.get());
                output.accept(ModItems.CUPRITE_PLATE.get());
                output.accept(ModItems.CUPRITE_FOIL.get());
                output.accept(ModItems.CUPRITE_WIRE.get());
                // Ferrolin
                output.accept((ModBlocks.FERROLIN_BLOCK.get()));
                output.accept(ModItems.FERROLIN_INGOT.get());
                output.accept(ModItems.FERROLIN_ROD.get());
                output.accept(ModItems.FERROLIN_PLATE.get());
                output.accept(ModItems.FERROLIN_FOIL.get());
                output.accept(ModItems.FERROLIN_WIRE.get());
                // Aurium
                output.accept((ModBlocks.AURIUM_BLOCK.get()));
                output.accept(ModItems.AURIUM_INGOT.get());
                output.accept(ModItems.AURIUM_ROD.get());
                output.accept(ModItems.AURIUM_PLATE.get());
                output.accept(ModItems.AURIUM_FOIL.get());
                output.accept(ModItems.AURIUM_WIRE.get());

                // == Tools ==
                output.accept(ModItems.HAMMER.get());
                output.accept(ModItems.PLIERS.get());


                // == Other Stuff ==
                output.accept(ModItems.ACTIVE_REDSTONE_CRYSTAL.get());
                output.accept(ModItems.DISACTIVE_REDSTONE_CRYSTAL.get());
                output.accept(ModItems.STICKY_PAPER.get());

                // == Rigid paper ==
                output.accept(ModItems.WHITE_RIGID_PAPER.get());
                output.accept(ModItems.ORANGE_RIGID_PAPER.get());
                output.accept(ModItems.MAGENTA_RIGID_PAPER.get());
                output.accept(ModItems.LIGHT_BLUE_RIGID_PAPER.get());
                output.accept(ModItems.YELLOW_RIGID_PAPER.get());
                output.accept(ModItems.LIME_RIGID_PAPER.get());
                output.accept(ModItems.PINK_RIGID_PAPER.get());
                output.accept(ModItems.GRAY_RIGID_PAPER.get());
                output.accept(ModItems.LIGHT_GRAY_RIGID_PAPER.get());
                output.accept(ModItems.CYAN_RIGID_PAPER.get());
                output.accept(ModItems.PURPLE_RIGID_PAPER.get());
                output.accept(ModItems.BLUE_RIGID_PAPER.get());
                output.accept(ModItems.BROWN_RIGID_PAPER.get());
                output.accept(ModItems.GREEN_RIGID_PAPER.get());
                output.accept(ModItems.RED_RIGID_PAPER.get());
                output.accept(ModItems.BLACK_RIGID_PAPER.get());

                // == Schemes ==
                output.accept(ModItems.WHITE_EMPTY_SCHEME.get());
                output.accept(ModItems.ORANGE_EMPTY_SCHEME.get());
                output.accept(ModItems.MAGENTA_EMPTY_SCHEME.get());
                output.accept(ModItems.LIGHT_BLUE_EMPTY_SCHEME.get());
                output.accept(ModItems.YELLOW_EMPTY_SCHEME.get());
                output.accept(ModItems.LIME_EMPTY_SCHEME.get());
                output.accept(ModItems.PINK_EMPTY_SCHEME.get());
                output.accept(ModItems.GRAY_EMPTY_SCHEME.get());
                output.accept(ModItems.LIGHT_GRAY_EMPTY_SCHEME.get());
                output.accept(ModItems.CYAN_EMPTY_SCHEME.get());
                output.accept(ModItems.PURPLE_EMPTY_SCHEME.get());
                output.accept(ModItems.BLUE_EMPTY_SCHEME.get());
                output.accept(ModItems.BROWN_EMPTY_SCHEME.get());
                output.accept(ModItems.GREEN_EMPTY_SCHEME.get());
                output.accept(ModItems.RED_EMPTY_SCHEME.get());
                output.accept(ModItems.BLACK_EMPTY_SCHEME.get());

            }).build());



    // ==== INIT ====
    public RedSys(IEventBus modEventBus, ModContainer modContainer) {
        // Register (content)
        CREATIVE_MODE_TABS.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModMenus.register(modEventBus);



        // Register (mod)
        NeoForge.EVENT_BUS.register(this);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }




    // == Another ==
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) { }
    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {  @SubscribeEvent public static void onClientSetup(FMLClientSetupEvent event) { } }
}
