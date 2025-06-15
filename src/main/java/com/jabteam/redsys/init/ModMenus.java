package com.jabteam.redsys.init;

import com.jabteam.redsys.RedSys;
import com.jabteam.redsys.block.behaviours.PossiblePoweredBlock;
import com.jabteam.redsys.init.Menus.IndustrialCraftTable_Menu;
import com.jabteam.redsys.init.Menus.IndustrialCraftTable_Screen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import java.util.function.Supplier;





public class ModMenus {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(Registries.MENU, RedSys.MOD_ID);



    public static final Supplier<MenuType<IndustrialCraftTable_Menu>> INDUSTRIAL_CRAFT_TABLE_MENU = MENUS.register(
            "industrial_craft_table",
            () -> new MenuType<>(
                    (containerId, playerInventory) -> {
                        return new IndustrialCraftTable_Menu(
                                containerId,
                                playerInventory,
                                ContainerLevelAccess.NULL
                        );
                    },
                    FeatureFlagSet.of()
            )
    );





    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);


    }
}
