package com.sda.and1.tree.heap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Heap heap = new Heap();
//        heap.add(25);
//        heap.add(12);
//        heap.add(11);
//        heap.add(8);
//        heap.add(10);
//        heap.add(6);
//        heap.add(9);
//        heap.add(6);
//        heap.add(7);
//        heap.add(9);
//        heap.add(3);
//        heap.add(5);
//        heap.add(4);
//        heap.add(3);
//
//        int size = heap.getSize();
//        Integer[] result = new Integer[size];
//        for (int i = 0; i < size; i++){
//            result[i] = heap.remove();
//        }
//        System.out.println(Arrays.asList(result));
        Integer[] array = {3, 6, 3, 7, 8, 4};
        heapSort(array);
    }

    private static void heapSort(Integer[] array) {
        //twórz kopiec
        int heapSize = 0;
        for (int i = 0; i < array.length; i++) {
            Integer valueToInsert = array[i];
            int index = heapSize;
            array[heapSize] = valueToInsert;
            int parentIndex = calculateParentIndex(index);
            while (index > 0 && array[parentIndex] < valueToInsert) {
                Integer parentValue = array[parentIndex];
                array[index] = parentValue;
                index = parentIndex;
                parentIndex = calculateParentIndex(index);
            }
            array[index] = valueToInsert;
            heapSize++;
        }
        //robierz kopiec
        heapSize = array.length;
        int size = heapSize;
        for (int i = 0; i < size; i++) {
            Integer currentRoot = array[0];
            int currentIndex = 0;
            int lastValue = array[heapSize - 1];
            if (heapSize > 0) {
                array[currentIndex] = lastValue;
                int greatestChildIndex = getGreatestChildIndex(array, heapSize, currentIndex);
                while (greatestChildIndex > 0 && array[greatestChildIndex] > lastValue) {
                    Integer greatestChildValue = array[greatestChildIndex];
                    Integer currentValue = array[currentIndex];
                    array[currentIndex] = greatestChildValue;
                    array[greatestChildIndex] = currentValue;
                    currentIndex = greatestChildIndex;
                    greatestChildIndex = getGreatestChildIndex(array, heapSize, currentIndex);
                }
            }
            array[size - i - 1] = currentRoot;
            heapSize--;
        }
        System.out.println(Arrays.asList(array));
    }

    public static int calculateParentIndex(int index) {
        if (index == 0) {
            return 0;
        }
        return Math.floorDiv(index - 1, 2);
    }

    public static int getGreatestChildIndex(Integer[] array, int heapSize, int index) {
        int leftIndex = index * 2 + 1;
        if (leftSonExists(heapSize, index) && rightSonExists(heapSize, index)) {
            Integer leftChild = array[leftIndex];
            int rightIndex = index * 2 + 2;
            Integer rightChild = array[rightIndex];
            if (leftChild > rightChild) {
                return leftIndex;
            } else {
                return rightIndex;
            }
        }
        if (leftSonExists(heapSize, index)) {
            return leftIndex;
        }
        return -1;
    }

    public static boolean leftSonExists(int heapSize, int index) {
        return (2 * index + 1) < heapSize;
    }

    public static boolean rightSonExists(int heapSize, int index) {
        return (2 * index + 2) < heapSize;
    }
}
