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

    public Integer remove() {
        if (count == 0) {
            return null;
        }
        Integer result = array[0];
        count--;
        Integer value = array[count];
        int index = 0;
        int sonIndex = 1;
        while (sonIndex < count) {
            if (sonIndex + 1 < count && array[sonIndex + 1] > array[sonIndex]) {
                sonIndex++;
            }
            if (value >= array[sonIndex]) {
                break;
            }
            array[index] = array[sonIndex];
            index = sonIndex;
            sonIndex = 2 * sonIndex + 1;
        }
        array[index] = value;
        array[count] = null;
        return result;
    }

    public Integer[] sort() {
        Integer[] resultArray = new Integer[count];
        int size = count;
        for (int i = 0; i < size; i++) {
            resultArray[i] = remove();
        }
        return resultArray;
    }
}
