package com.sda.sorters.actions;

import com.sda.sorters.bubblesort.BubbleSort;
import com.sda.sorters.insertsort.InsertSort;

import java.util.Arrays;
import java.util.List;

import static com.sda.sorters.Main.SORT_COMMAND;

public class SortAction implements Action {
    @Override
    public void doAction(List<Integer> list, String[] args) {
        if (args.length > 0) {
            Integer[] array = list.toArray(new Integer[list.size()]);
            if (args[1].toLowerCase().contains("bubble")) {
                BubbleSort bs = new BubbleSort();
                bs.sort(array, true);
            }
            if (args[1].toLowerCase().contains("insert")) {
                InsertSort is = new InsertSort();
                is.sort(array, true);
            }
            System.out.println(SORT_COMMAND + " " + args[0] + " " + Arrays.asList(array));
        }
    }
}
