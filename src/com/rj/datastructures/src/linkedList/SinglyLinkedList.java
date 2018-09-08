package com.rj.datastructures.src.linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SinglyLinkedList<E> {
    private Node<E> head = null;

    public Node<E> getHead() {
        return head;
    }

    public void setHead(Node<E> head) {
        this.head = head;
    }


    public Node add(E data) {
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

    public Node remove(E data) {
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
            o += pointer.data + "->";
            pointer = pointer.next;
        }
        return o + "NULL";
    }

    public void print() {
        Node pointer = head;
        while (pointer != null) {
            System.out.print(pointer.data + "->");
            pointer = pointer.next;
        }
        System.out.println("NULL");
    }

    public Node deleteFromEnd(Node head, int n) {

        int size = 0;
        Node headPtr = head;
        while (headPtr != null) {
            size++;
            headPtr = headPtr.next;
        }

        int itemPositionToBeDeleted = size - n;

        if (itemPositionToBeDeleted < 0 || itemPositionToBeDeleted > size) {
            return null;
        }

        headPtr = head;
        int count = 0;
        Node prev = null;
        Node nodeToBeDeleted = headPtr;
        while (count != itemPositionToBeDeleted) {
            count++;
            prev = headPtr;
            nodeToBeDeleted = headPtr.next;
            headPtr = headPtr.next;
        }

        if (prev != null) {
            prev.next = nodeToBeDeleted.next;
        } else {
            setHead(nodeToBeDeleted.next);
        }

        return nodeToBeDeleted;
    }

    public static Node<Integer> mergeKLists_2(Node<Integer>[] lists) {

        Node<Integer> newHead = lists[0];

        for (int i = 1; i < lists.length; i++) {
            while (lists[i] != null) {
                Node<Integer> ptr = newHead;
                Node<Integer> ptrPrev = null;
                Node<Integer> itemToInsert = lists[i];
                while (ptr.next != null && ptr.data <= itemToInsert.data) {
                    ptrPrev = ptr;
                    ptr = ptr.next;
                }
                if (ptr.next == null) {
                    ptr.next = itemToInsert;
                } else if (ptrPrev == null) {
                    newHead = itemToInsert;
                    newHead.next = ptr;
                } else if (ptr.data > itemToInsert.data) {
                    ptrPrev.next = itemToInsert;
                    itemToInsert.next = ptr;
                }
                lists[i] = lists[i].next;
            }

        }
        return newHead;
    }

    public Node<Integer> mergeKLists(Node<Integer>[] lists) {

//        1->4->5,
//        1->3->4,
//        2->6


//        head = null;


        List<Integer> nodes = new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {
            while (lists[i] != null) {
                nodes.add(lists[i].data);
                lists[i] = lists[i].next;
            }
        }
        Collections.sort(nodes);

        Node<Integer> head = null;
        Node<Integer> next = null;

        for (Integer node : nodes) {
            Node<Integer> nodeToBeAdded = new Node<>(node);

            if (head == null) {
                head = nodeToBeAdded;
                next = nodeToBeAdded;
            } else {
                next.next = nodeToBeAdded;
            }
        }
        return head;
    }

//    public Node<Integer> mergeKlistsUsingPriorityQueue(){
//
//    }
}
