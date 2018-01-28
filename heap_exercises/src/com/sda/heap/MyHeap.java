package com.sda.heap;

public class MyHeap {
    Integer[] array;
    int count;

    public MyHeap(int size) {
        this.array = new Integer[size];
    }

    public int getCount() {
        return count;
    }

    public void insert(Integer value) {
        int index = count;
        count++;
        int parentIndex = Math.floorDiv(index - 1, 2);
        while (index > 0 && array[parentIndex] < value) {
            array[index] = array[parentIndex];
            index = parentIndex;
            parentIndex = Math.floorDiv(index - 1, 2);
        }
        array[index] = value;
    }
}
