package com.sda.commons;

public interface IListNode<T> {
    public T getData();
    public IListNode getLeftChild();
    public IListNode getRightChild();

    public int getPosition();
}
