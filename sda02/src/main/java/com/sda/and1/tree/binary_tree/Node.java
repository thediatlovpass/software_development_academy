package com.sda.and1.tree.binary_tree;

public class Node<T> {
    private Node parent;
    private Node left;
    private Node right;
    private T data;

    public Node(T data) {
        this.data = data;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void addLeftChild(Node node) {
        node.setParent(this);
        left = node;
    }

    public void addRightChild(Node node) {
        node.setParent(this);
        right = node;
    }

    public T getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }
}
