package com.sda.multi_tree;

public class MyTree {
    Node root;

    public MyTree(Node root) {
        this.root = root;
    }

    public void insertNode(Node parent, Node nodeToInsert) {
        parent.addChild(nodeToInsert);
        nodeToInsert.setParent(parent);
    }
}
