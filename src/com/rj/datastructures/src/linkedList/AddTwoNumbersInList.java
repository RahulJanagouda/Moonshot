package com.rj.datastructures.src.linkedList;

public class AddTwoNumbersInList {

    public static Node<Integer> addTwoList(Node<Integer> A, Node<Integer> B) {
        if (A == null || B == null) return null;

        Node<Integer> aP = A, bP = B;

        int remainder = 0;
        int total;


        while (aP.next != null) {
            if (bP != null) {
                total = bP.data + aP.data + remainder;
                bP = bP.next;
            } else {
                total = aP.data + remainder;
            }

            remainder = total / 10;
            total = total % 10;

            aP.data = total;
            aP = aP.next;
        }

        if (remainder > 0) {
            Node<Integer> r = new Node<>(remainder);
            aP.next = r;
        }

        return A;
    }
}
