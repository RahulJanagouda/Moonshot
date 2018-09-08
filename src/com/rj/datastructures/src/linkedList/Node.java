package com.rj.datastructures.src.linkedList;


public class Node<E> {
    E data;
    Node<E> next;

    public Node(E data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}