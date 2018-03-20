package com.sda.and1.tree.heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {

    private List<Integer> values = new ArrayList<>();

    public void add(Integer value) {
        int index = values.size();
        values.add(value);
        int parentIndex = calculateParentIndex(index);
        while (index > 0 && values.get(parentIndex) < value) {
            Integer parentValue = values.get(parentIndex);
            values.set(index, parentValue);
            index = parentIndex;
            parentIndex = calculateParentIndex(index);
        }
        values.set(index, value);
    }

    public Integer remove() {
        int size = values.size();
        if (size == 0) return 0;
        Integer currentRoot = values.get(0);
        int currentIndex = 0;
        int lastValue = values.get(size - 1);
        values.remove(size - 1);
        values.set(currentIndex, lastValue);
        int greatestChildIndex = getGreatestChildIndex(currentIndex);
        while (greatestChildIndex > 0 && values.get(greatestChildIndex) > lastValue) {
            Integer greatestChildValue = values.get(greatestChildIndex);
            Integer currentValue = values.get(currentIndex);
            values.set(currentIndex, greatestChildValue);
            values.set(greatestChildIndex, currentValue);
            currentIndex = greatestChildIndex;
            greatestChildIndex = getGreatestChildIndex(currentIndex);
        }
        return currentRoot;
    }

    public int getGreatestChildIndex(int index) {
        int leftIndex = index * 2 + 1;
        if (leftSonExists(index) && rightSonExists(index)) {
            Integer leftChild = values.get(leftIndex);
            int rightIndex = index * 2 + 2;
            Integer rightChild = values.get(rightIndex);
            if (leftChild > rightChild) {
                return leftIndex;
            } else {
                return rightIndex;
            }
        }
        if (leftSonExists(index)) {
            return leftIndex;
        }
        return -1;
    }

    public boolean leftSonExists(int index) {
        return (2 * index + 1) < values.size();
    }

    public boolean rightSonExists(int index) {
        return (2 * index + 2) < values.size();
    }

    public boolean isLeaf(int index) {
        return (2 * index + 2) > values.size();
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
