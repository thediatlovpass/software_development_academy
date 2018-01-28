package com.sda.commons;

public interface IListNode<T> {
    public T getData();

    default IListNode getLeftChild() {
        return null;
    }

    default IListNode getRightChild() {
        return null;
    }

    default int getPosition() {
        return 0;
    }
}
