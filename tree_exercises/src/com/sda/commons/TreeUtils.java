package com.sda.commons;

import com.sda.binary_tree.BinaryNode;

public class TreeUtils {

    private TreeUtils() {

    }

    public static int heightOfTree(BinaryNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = heightOfTree(node.getLeftChild());
        int rightHeight = heightOfTree(node.getRightChild());
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void printPreOrder(BinaryNode node) {
        System.out.print(node.toString());
        if (node.getLeftChild() != null) {
            printPreOrder(node.getLeftChild());
        }
        if (node.getRightChild() != null) {
            printPreOrder(node.getRightChild());
        }
    }

    public static void printInOrder(BinaryNode node) {
        if (node.getLeftChild() != null) {
            printInOrder(node.getLeftChild());
        }
        System.out.print(node.toString());
        if (node.getRightChild() != null) {
            printInOrder(node.getRightChild());
        }
    }

    public static void printPostOrder(BinaryNode node) {
        if (node.getLeftChild() != null) {
            printPostOrder(node.getLeftChild());
        }
        if (node.getRightChild() != null) {
            printPostOrder(node.getRightChild());
        }
        System.out.print(node.toString());
    }
}
