package com.sda.complete_tree;

import com.sda.commons.IListNode;

public class Node<T> implements IListNode<T>{
    T data;
    int position;

    public Node(T data) {
        this.data = data;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
