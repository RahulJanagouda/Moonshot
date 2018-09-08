package com.rj.datastructures.src.linkedList;

import java.util.ArrayList;
import java.util.List;

public class ReverseNodesInK {


    public static Node<Integer> reverseWithSinglePointer(Node<Integer> head) {
        Node<Integer> ptrRev = null;

        while (head != null) {
            if (ptrRev == null) {
                ptrRev = new Node<>(head.data);
                ptrRev.next = null;
            } else {
                Node<Integer> node = new Node<>(head.data);
                node.next = ptrRev;
                ptrRev = node;
            }
            head = head.next;
        }

        return ptrRev;
    }

    public static Node<Integer> reverseWithTwoPointers(Node<Integer> head) {
        Node<Integer> previous = null;
        Node<Integer> current = head;
        Node<Integer> next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }


    /*
     * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
     * k is a positive integer and is less than or equal to the length of the linked list.
     * If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
     * Example:
     * Given this linked list: 1->2->3->4->5
     * For k = 2, you should return: 2->1->4->3->5
     * For k = 3, you should return: 3->2->1->4->5
     * Note:
     * Only constant extra memory is allowed.
     * You may not alter the values in the list's nodes, only nodes itself may be changed.
     * */

    public static Node<Integer> reverseKGroup(Node<Integer> head, int k) {
        if (head == null || k < 2) return head;
        int count = 0;
        List<Node> detachedArrays = new ArrayList<>();

        Node<Integer> current = null;
        Node<Integer> next = head;
        Node<Integer> newHead;

        while (count <= k && next != null) {
            if (count == k) {
                detachedArrays.add(current);
                current = null;
                count = 0;
            } else {
                Node<Integer> temp = next.next;
                next.next = current;
                current = next;
                next = temp;
                count++;
            }
        }
        if (count < k) {
            Node<Integer> nextOfCurrent;
            Node<Integer> prevOfCurrent = null;
            while (current!=null){
                nextOfCurrent = current.next;
                current.next = prevOfCurrent;
                prevOfCurrent = current;
                current = nextOfCurrent;
            }
            current = prevOfCurrent;
        }
        detachedArrays.add(current);
        newHead = detachedArrays.get(0);
        Node<Integer> stitchPointer = newHead;

        for (int i = 1; i < detachedArrays.size(); i++) {
            while (stitchPointer.next != null) {
                stitchPointer = stitchPointer.next;
            }
            stitchPointer.next = detachedArrays.get(i);
        }
        return newHead;
    }

//    public static Node<Integer> reverseKGroup_2(Node<Integer> head, int k) {
//        if (head == null || k < 2) return head;
//
//        Node<Integer> pointer = head;
//        List<Node> detachedArrays = new ArrayList<>();
//        int count = 0;
//
//        Node<Integer> current = null;
//        Node<Integer> next = head;
//
//        while (count <= k && next != null) {
//            if (count == k) {
//                detachedArrays.add()
//            } else {
//                Node<Integer> temp = next.next;
//                next.next = current;
//                current = next;
//                next = temp;
//                count++;
//            }
//        }
//        return head;
//    }

//    public Node<Integer reverseKGroup(Node<Integer head, int k) {
//        if( k < 2) return head;
//        int count = 0;
//        Node<Integer current = null;
//        Node<Integer next = head;
//        Node<Integer newHead = head;
//        while(count <= k || next != null){
//            count++;
//            if( count == k){
//                Node<Integer reversedPointer = current;
//                while(reversedPointer.next!=null){
//                    reversedPointer = reversedPointer.next;
//                }
//                reversedPointer.next = next;
//                newHead = current;
//                count = 0;
//            } else {
//                Node<Integer temp = next.next;
//                next.next = current;
//                current = next;
//                next = temp;
//            }
//        }
//        return newHead;
//    }


    public static Node<Integer> reverseKGroup_3(Node<Integer> head, int k) {
        Node<Integer> curr = head;
        int count = 0;
        while (curr != null && count != k) { // find the k+1 node
            curr = curr.next;
            count++;
        }
        if (count == k) { // if k+1 node is found
            curr = reverseKGroup_3(curr, k); // reverse list with k+1 node as head
            // head - head-pointer to direct part,
            // curr - head-pointer to reversed part;
            while (count-- > 0) { // reverse current k-group:
                Node<Integer> tmp = head.next; // tmp - next head in direct part
                head.next = curr; // pre-appending "direct" head to the reversed list
                curr = head; // move head of reversed part to a new node
                head = tmp; // move "direct" head to the next node in direct part
            }
            head = curr;
        }
        return head;
    }
}
