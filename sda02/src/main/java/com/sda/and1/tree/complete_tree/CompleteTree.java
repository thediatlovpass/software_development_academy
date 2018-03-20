package com.sda.and1.tree.complete_tree;

public class CompleteTree {
    private Node[] values;
    private int count = 0;

    public CompleteTree(int size) {
        values = new Node[size];
    }

    public void add(Node node) {
        values[count] = node;
        node.setIndex(count);
        count++;
    }

    public Node getLeft(Node node) {
        int leftIndex = node.getIndex() * 2 + 1;
        if (leftIndex < values.length)
            return values[leftIndex];
        return null;
    }

    public Node getRight(Node node) {
        int rightIndex = node.getIndex() * 2 + 2;
        if (rightIndex < values.length)
            return values[rightIndex];
        return null;
    }

    public Node getParent(Node node) {
        int parentIndex = Math.floorDiv(node.getIndex() - 1, 2);
        if (node.getIndex() == 0) {
            return null;
        }
        return values[parentIndex];
    }

}
