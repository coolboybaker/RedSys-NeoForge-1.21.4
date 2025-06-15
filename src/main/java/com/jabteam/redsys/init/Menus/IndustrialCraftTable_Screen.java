package com.jabteam.redsys.init.Menus;

/*
import net.minecraft.ResourceLocationException;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.client.resources.sounds.SimpleSoundInstance;
import net.minecraft.client.Minecraft;


public class IndustrialCraftTable_Screen extends AbstractContainerScreen<IndustrialCraftTable_Menu> {
    public static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath("redsys", "textures/gui/industrial_craft_table.png");

    // Координаты элементов GUI
    private static final int PROGRESS_ARROW_X = 89;
    private static final int PROGRESS_ARROW_Y = 34;
    private static final int PROGRESS_WIDTH = 24;
    private static final int PROGRESS_HEIGHT = 17;
    private static final int PROGRESS_TEXT_X = 92;
    private static final int PROGRESS_TEXT_Y = 36;

    public IndustrialCraftTable_Screen(IndustrialCraftTable_Menu menu, Inventory playerInventory, Component title) {
        super(menu, playerInventory, title);
        this.imageWidth = 176;
        this.imageHeight = 166;
        this.inventoryLabelY = this.imageHeight - 94;
    }

    @Override
    protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
        int x = (this.width - this.imageWidth) / 2;
        int y = (this.height - this.imageHeight) / 2;


    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
        renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
        super.render(guiGraphics, mouseX, mouseY, partialTicks);
        renderTooltip(guiGraphics, mouseX, mouseY);

        // Дополнительные tooltips
        if (this.menu.getCarried().isEmpty() && this.hoveredSlot != null && this.hoveredSlot.hasItem()) {
            guiGraphics.renderTooltip(this.font, this.hoveredSlot.getItem(), mouseX, mouseY);
        }
    }

    @Override
    protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
        // Заголовок
        guiGraphics.drawString(this.font, this.title, this.titleLabelX, this.titleLabelY, 0x404040, false);

        // Инвентарь игрока
        guiGraphics.drawString(this.font, this.playerInventoryTitle,
                this.inventoryLabelX, this.inventoryLabelY, 0x404040, false);

        // Прогресс крафта
        //int current = menu.getData().get(0);
        //int required = menu.getData().get(1);
        int current = 0;
        int required = 0;
        if (required > 0) {
            String progressText = current + "/" + required;
            guiGraphics.drawString(this.font, progressText,
                    PROGRESS_TEXT_X, PROGRESS_TEXT_Y, 0xFFFFFF, false);
        }
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        // Обработка клика по слоту результата
        if (this.hoveredSlot != null && this.hoveredSlot.index == 16) {
            //if (this.menu.getData().get(0) >= this.menu.getData().get(1)) {
            if (false) {
                // Можно добавить звук клика
                Minecraft.getInstance().getSoundManager().play(
                        SimpleSoundInstance.forUI(SoundEvents.UI_STONECUTTER_TAKE_RESULT, 1.0F));
            }
        }
        return super.mouseClicked(mouseX, mouseY, button);
    }
}
*/
import com.jabteam.redsys.RedSys;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;

public class IndustrialCraftTable_Screen extends Screen {

    private final int imageWidth = 176;
    private final int imageHeight = 166;

    private int leftPos;
    private int topPos;

    public IndustrialCraftTable_Screen(Component title) {
        super(title);
    }

    @Override
    protected void init() {
        super.init();
        RedSys.LOGGER.debug("3");

        // Вычисляем позиции для центрирования GUI
        this.leftPos = (this.width - this.imageWidth) / 2;
        this.topPos = (this.height - this.imageHeight) / 2;
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTick) {
        // Рендерим полупрозрачный темный фон


        // Рендерим заголовок
        guiGraphics.drawString(
                this.font,
                this.title,
                this.leftPos + 8, this.topPos + 6,
                0x404040,
                false
        );

        super.render(guiGraphics, mouseX, mouseY, partialTick);
    }

    @Override
    public boolean isPauseScreen() {
        return false; // Не приостанавливать игру при открытии GUI
    }
}