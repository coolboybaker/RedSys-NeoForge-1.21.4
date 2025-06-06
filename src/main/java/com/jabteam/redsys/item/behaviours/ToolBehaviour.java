package com.jabteam.redsys.item.behaviours;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;


public class ToolBehaviour extends Item {
    public ToolBehaviour(Properties properties) {
        super(properties.durability(150));
    }


    @Override
    public ItemStack getCraftingRemainder(ItemStack itemStack) {
        if (itemStack.getMaxDamage() <= 0) { return ItemStack.EMPTY;  }
        ItemStack result = itemStack.copy();
        result.setDamageValue(itemStack.getDamageValue() + 1);
        if (result.getDamageValue() >= result.getMaxDamage()) { return ItemStack.EMPTY; }
        return result;
    }
}