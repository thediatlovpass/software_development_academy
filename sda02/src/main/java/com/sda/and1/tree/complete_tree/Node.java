package com.sda.and1.tree.complete_tree;

public class Node {
    private Integer index;
    private String value;

    public Node(String value) {
        this.value = value;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return value;
    }
}
