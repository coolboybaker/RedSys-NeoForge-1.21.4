package com.jabteam.redsys.item.behaviours;

import com.ibm.icu.impl.Pair;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.IntTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class SchemeBehaviour extends Item {
    public SchemeBehaviour(Properties properties) {
        super(properties);
    }



    // Save
    public static CompoundTag SchemeDataToNBT(int[][] first_side, int[][] second_side) {
        CompoundTag tag = new CompoundTag();

        // First Side
        ListTag first_side_tag = new ListTag();
        for (int[] row : first_side) {
            ListTag rowTag = new ListTag();
            for (int value : row) {
                rowTag.add(IntTag.valueOf(value));
            }
            first_side_tag.add(rowTag);
        }
        tag.put("first_side", first_side_tag);

        // Second side
        ListTag second_side_tag = new ListTag();
        for (int[] row : second_side) {
            ListTag rowTag = new ListTag();
            for (int value : row) {
                rowTag.add(IntTag.valueOf(value));
            }
            second_side_tag.add(rowTag);
        }
        tag.put("second_side", second_side_tag);

        return tag;
    }


    // Load
    public static Pair<int[][], int[][]> NBTtoSchemeData(CompoundTag tag) {
        // First side
        ListTag first_side_tag = tag.getList("first_side", Tag.TAG_LIST);
        int[][] first_side_data = new int[first_side_tag.size()][];
        for (int i = 0; i < first_side_tag.size(); i++) {
            ListTag rowTag = (ListTag) first_side_tag.get(i);
            first_side_data[i] = new int[rowTag.size()];
            for (int j = 0; j < rowTag.size(); j++) {
                first_side_data[i][j] = ((IntTag) rowTag.get(j)).getAsInt();
            }
        }

        // Second side
        ListTag second_side_tag = tag.getList("second_side", Tag.TAG_LIST);
        int[][] second_side_data = new int[second_side_tag.size()][];
        for (int i = 0; i < second_side_tag.size(); i++) {
            ListTag rowTag = (ListTag) second_side_tag.get(i);
            second_side_data[i] = new int[rowTag.size()];
            for (int j = 0; j < rowTag.size(); j++) {
                second_side_data[i][j] = ((IntTag) rowTag.get(j)).getAsInt();
            }
        }

        return Pair.of(first_side_data, second_side_data);
    }
}






