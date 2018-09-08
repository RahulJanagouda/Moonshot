package com.rj.datastructures.src.linkedList;

public class KthNodeFromLast {

    public static int print(Node<Integer> head, int k) {
        if (head == null) return 0;

        int i = print(head.next, k) + 1;

        if (k == i) {
            System.out.println("Kth item from last : " + head.data);
        }
        return i;
    }

    static class Idx {
        int i = 0;
    }

    public static Node<Integer> retrunHelper(Node<Integer> head, int k) {
        return returnValue(head, k, new Idx());
    }

    private static Node<Integer> returnValue(Node<Integer> head, int k, Idx idx) {
        if (head == null) return null;

        Node<Integer> a = returnValue(head.next, k, idx);
        idx.i = idx.i + 1;

        if (k == idx.i) {
            return head;
        }
        return a;
    }

}
