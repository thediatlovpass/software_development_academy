package com.sda.and1.various;

public class DigitalRoot {
    /*
        A digital root is the recursive sum of all the digits in a number.
        Given n, take the sum of the digits of n. If that value has two digits,
        continue reducing in this way until a single-digit number is produced.
        This is only applicable to the natural numbers.
        
        digitalRoot(16)
        => 1 + 6
        => 7

        digitalRoot(942)
        => 9 + 4 + 2
        => 15 ...
        => 1 + 5
        => 6

        digitalRoot(132189)
        => 1 + 3 + 2 + 1 + 8 + 9
        => 24 ...
        => 2 + 4
        => 6

        digitalRoot(493193)
        => 4 + 9 + 3 + 1 + 9 + 3
        => 29 ...
        => 2 + 9
        => 11 ...
        => 1 + 1
        => 2
     */

    public static void main(String[] args) {
        System.out.println(digitalRoot(16));
        System.out.println(digitalRoot(942));
        System.out.println(digitalRoot(132189));
        System.out.println(digitalRoot(493193));

    }

    private static int digitalRoot(int number){
        return 0;
    }

}
