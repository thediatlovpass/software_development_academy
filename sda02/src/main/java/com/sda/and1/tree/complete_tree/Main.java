package com.sda.and1.tree.complete_tree;

public class Main {
    public static void main(String[] args){
        CompleteTree completeTree = new CompleteTree(12);
        Node a = new Node("A");
        completeTree.add(a);
        completeTree.add(new Node("B"));
        completeTree.add(new Node("C"));
        Node d = new Node("D");
        completeTree.add(d);
        completeTree.add(new Node("E"));
        Node f = new Node("F");
        completeTree.add(f);
        completeTree.add(new Node("G"));
        completeTree.add(new Node("H"));
        completeTree.add(new Node("I"));
        completeTree.add(new Node("J"));
        completeTree.add(new Node("K"));
        completeTree.add(new Node("L"));

        System.out.println(completeTree.getLeft(d));
        System.out.println(completeTree.getRight(d));

//        System.out.println(completeTree.getParent(a));
    }
}
