package com.sda.and1.binary_search_tree;

public class Main {
    public static void main(String[] args) {
        MyBst myBst = new MyBst();
        int[] input = {1, 2, 3, 4, 5, 6, 7, 9};
        myBst.add(input);
        System.out.println(myBst.search(8));
        System.out.println(myBst.getMax());
        System.out.println(myBst.getMin());
    }
}
