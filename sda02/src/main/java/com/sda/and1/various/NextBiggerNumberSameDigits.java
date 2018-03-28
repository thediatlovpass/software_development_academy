package com.sda.and1.various;

import org.assertj.core.api.Assertions;

public class NextBiggerNumberSameDigits {
    public static void main(String[] args) {
        Assertions.assertThat(nextBiggerNumber(12)).isEqualTo(21);
        Assertions.assertThat(nextBiggerNumber(513)).isEqualTo(531);
        Assertions.assertThat(nextBiggerNumber(2017)).isEqualTo(2071);
        Assertions.assertThat(nextBiggerNumber(9)).isEqualTo(-1);
        Assertions.assertThat(nextBiggerNumber(111)).isEqualTo(-1);
        Assertions.assertThat(nextBiggerNumber(531)).isEqualTo(-1);
    }

    private static int nextBiggerNumber(int number) {
        return -1;
    }
}
