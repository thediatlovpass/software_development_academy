package com.sda.exercise2;

public class MinMaxValue {
    public static void main(String[] args) {
        Integer[] arr = {1, 4, 78, 3};
        printMinMax(arr);
    }

    private static void printMinMax(Integer[] array) {
        // Check if array is not empty - empty array results in IndexOutOfBounds exception
        if (array.length > 0) {
            // Set first element of array as max
            Integer max = array[0];
            // Set first element index as index of maximum element in array
            int maxIndex = 0;
            // Set first element of array as min
            Integer min = array[0];
            // Set first element index as index of minimum element in array
            int minIndex = 0;
            for (int i = 0; i < array.length; i++) {
                // if current iterated element is greater than current max -> swap (we have new max) - change max and maxIndex
                if (array[i] > max) {
                    max = array[i];
                    maxIndex = i;
                }
                // if current iterated element is smaller than current min -> swap (we have new min) - change min and minIndex
                if (array[i] < min) {
                    min = array[i];
                    minIndex = i;
                }
            }
            System.out.println(minIndex + " " + min);
            System.out.println(maxIndex + " " + max);
        }
    }
}
