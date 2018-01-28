package com.sda.heap;

public class Main {
    public static void main(String[] args){
        MyHeap heap = new MyHeap(20);
        heap.insert(25);
        heap.insert(12);
        heap.insert(11);
        heap.insert(8);
        heap.insert(10);
        heap.insert(6);
        heap.insert(9);
        heap.insert(6);
        heap.insert(7);
        heap.insert(9);
        heap.insert(3);
        heap.insert(5);
        heap.insert(4);
        heap.insert(3);
        heap.remove();
    }
}
