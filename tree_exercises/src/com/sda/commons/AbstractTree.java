package com.sda.commons;

public interface AbstractTree {

    public abstract IListNode getLeftChild(IListNode node);

    public abstract IListNode getRightChild(IListNode node);

    default int heightOfTree(IListNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = heightOfTree(getLeftChild(node));
        int rightHeight = heightOfTree(getRightChild(node));
        return Math.max(leftHeight, rightHeight) + 1;
    }

    default void printPreOrder(IListNode node) {
        System.out.print(node.toString());
        if (getLeftChild(node) != null) {
            printPreOrder(getLeftChild(node));
        }
        if (getRightChild(node) != null) {
            printPreOrder(getRightChild(node));
        }
    }

    default void printInOrder(IListNode node) {
        if (getLeftChild(node) != null) {
            printInOrder(getLeftChild(node));
        }
        System.out.print(node.toString());
        if (getRightChild(node) != null) {
            printInOrder(getRightChild(node));
        }
    }

    default void printPostOrder(IListNode node) {
        if (getLeftChild(node) != null) {
            printPostOrder(getLeftChild(node));
        }
        if (getRightChild(node) != null) {
            printPostOrder(getRightChild(node));
        }
        System.out.print(node.toString());
    }
}
