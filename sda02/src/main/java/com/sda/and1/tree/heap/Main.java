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
        heapSort(new Integer[]{3, 6, 3, 7, 8, 4});
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
        System.out.println(array);
        System.out.println(Arrays.asList(array));
        //robierz kopiec
    }

    public static int calculateParentIndex(int index) {
        if (index == 0) {
            return 0;
        }
        return Math.floorDiv(index - 1, 2);
    }
}
