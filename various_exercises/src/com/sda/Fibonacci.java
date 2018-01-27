package com.sda;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibIterative(9));
        System.out.println("rec " + fibRecursively(9));
    }

    private static int fibIterative(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        int first = 0;
        int second = 1;
        for (int i = 2; i <= num; i++) {
            int sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }

    private static int fibRecursively(int num) {
        if (num == 0) {
            return 0;
        }
        if(num == 1){
            return 1;
        }
        return fibRecursively(num - 1) + fibRecursively(num - 2);
    }
}
