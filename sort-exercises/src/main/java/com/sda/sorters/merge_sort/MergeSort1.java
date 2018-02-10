package com.sda.sorters.merge_sort;

public class MergeSort1 {
    public static void main(String[] args) {
        int[] inputArr = {6, 5, 4, 1, 3, 7, 9, 2};
        mergeSort(inputArr, 0, inputArr.length - 1);
    }

    private static void mergeSort(int[] array, int left, int right) {
        if (right > left) {
            int middle = left + (right - left) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    private static void merge(int[] array, int left, int middle, int right) {
        int leftLength = middle - left + 1;
        int rightLength = right - middle;
        int[] leftArr = new int[leftLength];
        int[] rightArr = new int[rightLength];
//        int[] resultArr = new int[leftLength + rightLength];
        for (int i = left; i < middle + 1; i++) {
            leftArr[i - left] = array[i];
        }
        for (int i = middle + 1; i < right + 1; i++) {
            rightArr[i - middle - 1] = array[i];
        }
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < leftLength && j < rightLength) {
            if (leftArr[i] < rightArr[j]) {
                array[left + k] = leftArr[i];
                k++;
                i++;
            } else {
                array[left + k] = rightArr[j];
                k++;
                j++;
            }
        }

        while (i < leftLength) {
            array[left + k] = leftArr[i];
            k++;
            i++;
        }
        while (j < rightLength) {
            array[left + k] = rightArr[j];
            k++;
            j++;
        }
//        for (i = 0; i < resultArr.length; i++){
//            array[left + i] = resultArr[i];
//        }
    }
}
