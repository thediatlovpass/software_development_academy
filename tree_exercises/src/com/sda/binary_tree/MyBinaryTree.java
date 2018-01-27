package com.sda.binary_tree;

public class MyBinaryTree {
    BinaryNode root;

    public MyBinaryTree(BinaryNode root) {
        this.root = root;
    }

    public void insertNode(BinaryNode parent, BinaryNode binaryNodeToInsert) {
        parent.addChild(binaryNodeToInsert);
        binaryNodeToInsert.setParent(parent);
    }
}
