package com.sda.multi_tree;

public class Main {
    public static void main(String[] args){
        Node<String> root = new Node<>("A");
        Node<String> rootChild1 = new Node<>("B");
        Node<String> rootChild2 = new Node<>("C");
        Node<String> rootChild3 = new Node<>("D");

        Node<String> bChild1 = new Node<>("E");
        Node<String> bChild2 = new Node<>("F");
        Node<String> bChild3 = new Node<>("G");

        Node<String> dChild1 = new Node<>("H");

        MyTree myTree = new MyTree(root);
        myTree.insertNode(root, rootChild1);
        myTree.insertNode(root, rootChild2);
        myTree.insertNode(root, rootChild3);

        myTree.insertNode(rootChild1, bChild1);
        myTree.insertNode(rootChild1, bChild2);
        myTree.insertNode(rootChild1, bChild3);

        myTree.insertNode(rootChild3, dChild1);

    }
}
