package com.sda.and1.tree.multi_tree;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
    Node parent;
    List<Node> children;
    T data;

    public Node(Node parent, T data) {
        this.data = data;
        this.parent = parent;
        this.children = new ArrayList<>();
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void addChild(Node node) {
        node.setParent(this);
        children.add(node);
    }

    public T getData() {
        return data;
    }
}
