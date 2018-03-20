package com.sda.and1.tree.complete_tree;

public class Main {

    public static void main(String[] args){
        CompleteTree completeTree = new CompleteTree(12);
        Node root = new Node("A");
        completeTree.add(root);
        completeTree.add(new Node("B"));
        completeTree.add(new Node("C"));
        Node nodeD = new Node("D");
        completeTree.add(nodeD);
        completeTree.add(new Node("E"));
        Node nodeF = new Node("F");
        completeTree.add(nodeF);
        completeTree.add(new Node("G"));
        completeTree.add(new Node("H"));
        completeTree.add(new Node("I"));
        completeTree.add(new Node("J"));
        completeTree.add(new Node("K"));
        completeTree.add(new Node("L"));

        printPreOrder(completeTree, root);

        System.out.println();
        completeTree.printInOrderRecurse(root);
        System.out.println();
        completeTree.printInOrder();
    }

    private static void printPreOrder(CompleteTree completeTree, Node node){
        System.out.print(node.toString() + " ");
        if(completeTree.getLeft(node) != null){
            printPreOrder(completeTree, completeTree.getLeft(node));
        }
        if(completeTree.getRight(node) != null){
            printPreOrder(completeTree, completeTree.getRight(node));
        }
    }
}
