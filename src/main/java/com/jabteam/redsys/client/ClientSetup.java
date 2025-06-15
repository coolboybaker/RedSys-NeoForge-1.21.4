package com.jabteam.redsys.client;

import com.jabteam.redsys.RedSys;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber(modid = RedSys.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {
}

/*
import com.redsys.init.ModMenuTypes;
import com.redsys.gui.IndustrialCraftTableScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = "redsys", bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        System.out.println("[DEBUG] Клиентская настройка начата");

        event.enqueueWork(() -> {
            System.out.println("[DEBUG] Регистрируем экран для промышленного верстака");

            MenuScreens.register(
                    ModMenuTypes.INDUSTRIAL_CRAFT_TABLE.get(),
                    IndustrialCraftTableScreen::new
            );

            // Для дебага проверяем регистрацию
            if (MenuScreens.getScreenFactory(ModMenuTypes.INDUSTRIAL_CRAFT_TABLE.get()) != null) {
                System.out.println("[SUCCESS] Экран успешно зарегистрирован!");
            } else {
                System.err.println("[ERROR] Экран не зарегистрирован!");
            }
        });
    }
}
*/