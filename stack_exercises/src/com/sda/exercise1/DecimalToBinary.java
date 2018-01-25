package com.sda.exercise1;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinary {

    private static final int BINARY_BASE = 2;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Reads number from standard input
        int num = input.nextInt();
        decimal2Binary(num);
    }

    private static void decimal2Binary(int num) {
        Stack stack = new Stack();
        // Loop till number is greater than 0
        while (num > 0) {
            // Puts on stack remainder
            stack.push(num % BINARY_BASE);
            // Divide number
            num = num / 2;
        }
        while (!stack.isEmpty()) {
            // Till stack is not empty take elements from top and print next to each
            System.out.print(stack.pop() + " ");
        }
    }
}
