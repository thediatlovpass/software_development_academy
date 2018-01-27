package com.sda.binary_tree;

import com.sda.commons.AbstractTree;
import com.sda.commons.IListNode;
import com.sda.commons.TreeUtils;
import com.sda.complete_tree.Node;

public class MyBinaryTree extends AbstractTree{
    BinaryNode root;

    public MyBinaryTree(BinaryNode root) {
        this.root = root;
    }

    public void insertNode(BinaryNode parent, BinaryNode binaryNodeToInsert) {
        parent.addChild(binaryNodeToInsert);
        binaryNodeToInsert.setParent(parent);
    }

    public int getHeight(){
        return TreeUtils.heightOfTree(root);
    }

    @Override
    public IListNode getLeftChild(IListNode node) {
        return node.getLeftChild();
    }

    @Override
    public IListNode getRightChild(IListNode node) {
        return node.getRightChild();
    }
}
