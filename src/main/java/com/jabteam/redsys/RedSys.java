package com.jabteam.redsys;

// ===== IMPORT =====
import com.jabteam.redsys.Items.ModItems;
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
    private static final Logger LOGGER = LogUtils.getLogger();


    // Create a Tab
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> RED_SYS_TAB = CREATIVE_MODE_TABS.register(
            "red_sys_tab",
            () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.redsys"))
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> ModItems.COPPER_DUST.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                //
                output.accept(ModItems.COPPER_DUST.get());
                output.accept(ModItems.QUARTZ_DUST.get());
                output.accept(ModItems.IRON_DUST.get());
                output.accept(ModItems.GOLD_DUST.get());

                //
                output.accept(ModItems.RAW_COPPER_REDSTONE_ALLOW.get());
                output.accept(ModItems.RAW_IRON_REDSTONE_ALLOW.get());

                //
                output.accept(ModItems.SILICON_INGOT.get());
                output.accept(ModItems.COPPER_REDSTONE_ALLOW.get());
                output.accept(ModItems.IRON_REDSTONE_ALLOW.get());

                //
                output.accept(ModItems.COPPER_REDSTONE_PLATE.get());
                output.accept(ModItems.COPPER_REDSTONE_WIRE.get());
                output.accept(ModItems.COPPER_REDSTONE_FOIL.get());

                //
                output.accept(ModItems.IRON_REDSTONE_PLATE.get());
                output.accept(ModItems.IRON_REDSTONE_WIRE.get());
                output.accept(ModItems.IRON_REDSTONE_FOIL.get());
            }).build());



    // ==== INIT ====
    public RedSys(IEventBus modEventBus, ModContainer modContainer) {
        // Register (content)
        CREATIVE_MODE_TABS.register(modEventBus);
        ModItems.register(modEventBus);

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
