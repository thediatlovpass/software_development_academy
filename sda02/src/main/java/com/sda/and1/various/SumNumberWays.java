package com.sda.and1.various;

import org.assertj.core.api.Assertions;

public class SumNumberWays {
    /*
        https://en.wikipedia.org/wiki/Partition_(number_theory)#
        In number theory and combinatorics, a partition of a positive integer n, also called an integer partition,
        is a way of writing n as a sum of positive integers. Two sums that differ only in the order of their summands
        are considered the same partition. If order matters, the sum becomes a composition. For example, 4 can be partitioned
        in five distinct ways:
        4
        3 + 1
        2 + 2
        2 + 1 + 1
        1 + 1 + 1 + 1
     */
    public static void main(String[] args) {
//        Assertions.assertThat(sumWays(0, 1)).isEqualTo(1); // 1
//        Assertions.assertThat(sumWays(0, 2)).isEqualTo(2); // 2  -> 1+1 , 2
        Assertions.assertThat(sumWays(0, 3)).isEqualTo(3); // 3 -> 1+1+1, 1+2, 3
//        Assertions.assertThat(sumWays(0, 4)).isEqualTo(5); // 5 -> 1+1+1+1, 1+1+2, 1+3, 2+2, 4
//        Assertions.assertThat(sumWays(0, 5)).isEqualTo(7); // 7 -> 1+1+1+1+1, 1+1+1+2, 1+1+3, 1+2+2, 1+4, 5, 2+3
//        Assertions.assertThat(sumWays(0, 10)).isEqualTo(42);
//        Assertions.assertThat(sumWays(0, 50)).isEqualTo(204226);
//        Assertions.assertThat(sumWays(0, 80)).isEqualTo(15796476);
//        Assertions.assertThat(sumWays(0, 100)).isEqualTo(190569292);
//        Assertions.assertThat(sumWays(0, -1)).isEqualTo(0); // 0
    }

    private static int sumWays(Integer counter, int number) {
        for (int i = 1; i <= number; i++) {
            if (number - i == 0) {
                return 1;
            } else {
                counter += sumWays(counter, number - i);
            }
        }
        return counter;
    }
}
