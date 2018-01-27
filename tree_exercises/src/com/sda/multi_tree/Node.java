package com.sda.multi_tree;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
    T data;
    Node parent;
    List<Node> children;

    public Node(T data){
        this.data = data;
        this.parent = null;
        children = new ArrayList<>();
    }

    public void addChild(Node child){
        children.add(child);
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public List<Node> getChildren() {
        return children;
    }
}
