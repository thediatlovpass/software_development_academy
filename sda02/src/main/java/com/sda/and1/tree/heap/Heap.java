package com.sda.and1.tree.heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {

    private List<Integer> values = new ArrayList<>();

    public void add(Integer value) {
        int index = values.size();
        values.add(value);
        int parentIndex = calculateParentIndex(index);
        while(index > 0 && values.get(parentIndex) < value){
            Integer parentValue = values.get(parentIndex);
            values.set(index, parentValue);
            index = parentIndex;
            parentIndex = calculateParentIndex(index);
        }
        values.set(index, value);
    }

    public int calculateParentIndex(int index) {
        if (index == 0) {
            return 0;
        }
        return Math.floorDiv(index - 1, 2);
    }

    public void setValues(List<Integer> values) {
        this.values = values;
    }
}
