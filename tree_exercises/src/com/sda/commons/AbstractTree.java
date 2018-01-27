package com.sda.commons;

import com.sda.complete_tree.Node;

public abstract class AbstractTree {

    public abstract IListNode getLeftChild(IListNode node);

    public abstract IListNode getRightChild(IListNode node);

    public void printPreOrder(IListNode node) {
        System.out.print(node.toString());
        if (getLeftChild(node) != null) {
            printPreOrder(getLeftChild(node));
        }
        if (getRightChild(node) != null) {
            printPreOrder(getRightChild(node));
        }
    }
}
