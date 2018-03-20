package com.sda.and1.various;

public class Recursion {
    static int count = 10;

    public static void main(String[] args) {
        recursion();
    }

    private static void recursion() {
        System.out.println("recursion " + count);
        count--;
        if (count > 0) {
            recursion();
        }
    }
}
