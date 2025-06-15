package com.jabteam.redsys.init.Menus;


import com.jabteam.redsys.RedSys;
import com.jabteam.redsys.block.ModBlocks;
import com.jabteam.redsys.init.ModMenus;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;

public class IndustrialCraftTable_Menu extends AbstractContainerMenu {
    private final ContainerLevelAccess access;
    private final ContainerData data;
    private final TransientCraftingContainer craftSlots; // Исправлено!
    private final ResultContainer resultSlots = new ResultContainer();

    public IndustrialCraftTable_Menu(int containerId, Inventory playerInventory, ContainerLevelAccess access) {
        super(ModMenus.INDUSTRIAL_CRAFT_TABLE_MENU.get(), containerId);
        this.access = access;
        this.data = new SimpleContainerData(2); // Хранит [прогресс, требуемые_клики]
        this.craftSlots = new TransientCraftingContainer(this, 4, 4);
        RedSys.LOGGER.debug("2");
        // Добавляем слоты
        addSlots(playerInventory);
        this.addDataSlots(data); // Синхронизация данных с клиентом
    }


    private void addSlots(Inventory playerInventory) {
        // Сетка 4x4 (столбцы x, строки y)
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                this.addSlot(new Slot(
                        craftSlots,
                        col + row * 4,   // Индекс слота (0-15)
                        30 + col * 18,   // Позиция X (отступ 30 пикселей)
                        17 + row * 18    // Позиция Y (отступ 17 пикселей)
                ));
            }
        }

        // Слот для результата (справа от сетки)
        this.addSlot(new Slot(resultSlots, 0, 124, 35) {
            @Override
            public boolean mayPlace(ItemStack stack) {
                return false; // Запрещаем класть предметы вручную
            }

            @Override
            public void onTake(Player player, ItemStack stack) {
                // При взятии результата:
                data.set(0, 0); // Сбрасываем прогресс
                craftSlots.clearContent(); // Очищаем сетку крафта
                super.onTake(player, stack);
            }
        });


        // Основной инвентарь (3 ряда по 9)
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 9; col++) {
                this.addSlot(new Slot(
                        playerInventory,
                        col + row * 9 + 9, // Индекс (9-35)
                        8 + col * 18,      // Позиция X
                        84 + row * 18       // Позиция Y
                ));
            }
        }

// Горячие слоты (нижняя панель)
        for (int col = 0; col < 9; col++) {
            this.addSlot(new Slot(
                    playerInventory,
                    col,           // Индекс (0-8)
                    8 + col * 18,  // Позиция X
                    142            // Позиция Y
            ));
        }
    }

    @Override
    public ItemStack quickMoveStack(Player player, int slotIndex) {
        ItemStack stack = ItemStack.EMPTY;
        Slot slot = this.slots.get(slotIndex);

        if (slot != null && slot.hasItem()) {
            ItemStack slotStack = slot.getItem();
            stack = slotStack.copy();

            // Если кликнули по результату
            if (slotIndex == 16) { // 16 — индекс слота результата
                if (!this.moveItemStackTo(slotStack, 17, 53, true)) { // Перемещаем в инвентарь
                    return ItemStack.EMPTY;
                }
                slot.onQuickCraft(slotStack, stack);
            }
            // Если кликнули по инвентарю
            else if (slotIndex >= 17) {
                if (!this.moveItemStackTo(slotStack, 0, 16, false)) { // Пытаемся переместить в сетку крафта
                    return ItemStack.EMPTY;
                }
            }
            // Если кликнули по сетке крафта
            else if (!this.moveItemStackTo(slotStack, 17, 53, false)) {
                return ItemStack.EMPTY;
            }

            if (slotStack.isEmpty()) {
                slot.set(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }
        }
        return stack;
    }

    @Override
    public boolean stillValid(Player player) {
        return stillValid(access, player, ModBlocks.INDUSTRIAL_CRAFT_TABLE.get());
    }
}
