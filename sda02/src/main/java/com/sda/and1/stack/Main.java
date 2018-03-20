package com.sda.and1.stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
//        Element firstElement = new Element(1);
//        Element secondElement = new Element(2);
//        Element thirdElement = new Element(3);
//
//        MyStack stack = new MyStack();
//        stack.push(firstElement);
//        stack.push(secondElement);
//        stack.push(thirdElement);
//
//        Element last = stack.pop();
//        stack.pop();
//        stack.pop();
//        Element lastNull = stack.pop();
        printDecimalToBinary(4);
        printDecimalToBinary(15);

    }

    private static void printDecimalToBinary(int number) {
        MyStack stack = new MyStack();
        while (number > 0) {
            stack.push(new Element(number % 2));
            number = number / 2;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop().toString() + " ");
        }
        System.out.println();
    }
}
