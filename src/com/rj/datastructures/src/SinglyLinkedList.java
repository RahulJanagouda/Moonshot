package com.rj.datastructures.src;

public class SinglyLinkedList<E> {
    Node<E> head = null;

    class Node<E> {
        E data;
        Node next;

        public Node(E data) {
            this.data = data;
        }
    }

    public Node add(String data) {
        Node insertNode = new Node(data);
        if (head == null) {
            head = insertNode;
            return head;
        } else {
            Node pointer = head;
            while (pointer.next != null) {
                pointer = pointer.next;
            }
            pointer.next = insertNode;
            return pointer;
        }
    }

    public Node remove(String data) {
        if (head == null) {
            return null;
        } else {
            Node pointer = head;
            Node pointerToPrev = null;

            while (pointer != null) {
                if (pointer.data.equals(data)) {
                    if (pointer == head) {
                        head = pointer.next;
                        return pointer;
                    } else {
                        pointerToPrev.next = pointer.next;
                        return pointer;
                    }
                }
                pointerToPrev = pointer;
                pointer = pointer.next;
            }
            return null;
        }
    }

    @Override
    public String toString() {
        String o = "";
        Node pointer = head;
        while (pointer != null) {
            o+= pointer.data + "->";
            pointer = pointer.next;
        }
        return o+"NULL";
    }

    public void print() {
        Node pointer = head;
        while (pointer != null) {
            System.out.print(pointer.data + "->");
            pointer = pointer.next;
        }
        System.out.println("NULL");
    }
}
