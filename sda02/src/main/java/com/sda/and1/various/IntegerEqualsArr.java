package com.sda.and1.various;

import org.assertj.core.api.Assertions;

public class IntegerEqualsArr {
    public static void main(String[] args) {
        // index where sum of left side equals right side
        // returns 3
        int[] arr1 = {1, 2, 3, 4, 3, 2, 1};
        Assertions.assertThat(arr1).isEqualTo(3);
        // returns 1
        int[] arr2 = {1, 100, 50, -51, 1, 1};
        Assertions.assertThat(arr2).isEqualTo(1);
        // returns 0
        int[] arr3 = {10, 10, -80, 10, 10, 15, 35};
        Assertions.assertThat(arr3).isEqualTo(0);
        // return -1
        int[] arr4 = {1, 2, 3, 4};
        Assertions.assertThat(arr4).isEqualTo(-1);
    }
}
