package com.sda.complete_tree;

import com.sda.binary_tree.BinaryNode;
import com.sda.commons.AbstractTree;
import com.sda.commons.IListNode;

public class CompleteBinaryTree extends AbstractTree{

    public static final int LEFT_NODE_POSITION = 1;
    public static final int RIGHT_NODE_POSITION = 2;
    public static final int MAX_CHILDREN_NUMBER = 2;
    int count;
    Node[] array;

    public CompleteBinaryTree(Node root, int capcity) {
        array = new Node[capcity];
        int baseRootPosition = 0;
        array[baseRootPosition] = root;
        root.setPosition(baseRootPosition);
        count = 1;
    }

    public void insertNode(Node parent, Node nodeToInsert, boolean left) {
        count++;
        int childPosition = left ? LEFT_NODE_POSITION : RIGHT_NODE_POSITION;
        int insertNodePosition = 2 * parent.getPosition() + childPosition;
        array[insertNodePosition] = nodeToInsert;
        nodeToInsert.setPosition(insertNodePosition);
    }

    public IListNode getLeftChild(IListNode node) {
        return array[2 * node.getPosition() + LEFT_NODE_POSITION];
    }

    public IListNode getRightChild(IListNode node) {
        return array[2 * node.getPosition() + RIGHT_NODE_POSITION];
    }

    public Node getParent(Node node) {
        return array[Math.floorDiv((node.getPosition() - 1), 2)];
    }

    public IListNode[] getChildren(IListNode node) {
//        Node[] children = new Node[MAX_CHILDREN_NUMBER];
//        int leftPosition = 2 * node.getPosition() + LEFT_NODE_POSITION;
//        int rightPosition = 2 * node.getPosition() + RIGHT_NODE_POSITION;
//        children[0] = array[leftPosition];
//        children[1] = array[rightPosition];
//        return new Node[]{array[leftPosition], array[rightPosition]};
        return new IListNode[]{getLeftChild(node), getRightChild(node)};
    }

    public int heightOfTree(IListNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = heightOfTree(getLeftChild(node));
        int rightHeight = heightOfTree(getRightChild(node));
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
