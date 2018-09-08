package com.rj.datastructures.src.linkedList;

import java.util.StringJoiner;

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList(int data) {
        this.tail = this.head = new Node(data);
    }

    class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" + "data=" + data + '}';
        }
    }

    public Node push(int data) {
        Node temp = new Node(data);
        Node headPtr = head;
        if (head == null) {
            head = temp;
            return head;
        } else {
            temp.next = headPtr;
            head = temp;
        }
        return temp;
    }

    public Node insertAfter(int key, int data) {
        Node temp = new Node(data);
        Node keyNode = find(key);

        if (keyNode != null) {
            temp.next = keyNode.next;
            temp.prev = keyNode;
            keyNode.next = temp;
        }

        return temp;
    }

    public Node find(int data) {
        Node headPtr = head;
        while (headPtr != null) {
            if (headPtr.data == data)
                return headPtr;

            headPtr = headPtr.next;
        }
        return null;
    }

    public Node add(int data) {
        Node temp = new Node(data);
        Node headPtr = head;
        if (head == null) {
            tail = head = temp;
            return head;
        } else {
            while (headPtr.next != null) {
                headPtr = headPtr.next;
            }
            headPtr.next = temp;
            temp.prev = headPtr;
            tail = temp;
        }
        return temp;
    }

    public Node remove(int data) {
        Node headPtr = head;

        while (headPtr != null) {
            if (headPtr.data == data) {
                Node prevNode = headPtr.prev;
                Node nextNode = headPtr.next;

                if (prevNode != null) {
                    prevNode.next = nextNode;
                } else {
                    head = nextNode;
                }

                if (nextNode != null) {
                    nextNode.prev = prevNode;
                } else {
                    tail = prevNode;
                }

                return headPtr;
            }
            headPtr = headPtr.next;
        }
        return null;
    }

    public Node reverse() {
        Node temp = null;
        Node headPtr = head;
        while (headPtr != null) {
            temp = headPtr.next;
            headPtr.next = headPtr.prev;
            headPtr.prev = temp;
            headPtr = temp;
        }

        temp = head;
        head = tail;
        tail = temp;

        head.prev = tail.next = null;
        return head;
    }

    @Override
    public String toString() {


        StringJoiner sj = new StringJoiner(" <-> ");
        Node headPtr = head;
        sj.setEmptyValue("<EMPTY>");
        while (headPtr != null) {
            sj.add("" + headPtr.data);
            headPtr = headPtr.next;
        }
        return sj.toString();
    }

    public void printAll() {
        System.out.println("HEAD-> " + head);
        System.out.println(this.toString());
        System.out.println("TAIL-> " + tail);
    }

    public void print(Node n) {
        System.out.println("NODE = " + n);
    }
}
