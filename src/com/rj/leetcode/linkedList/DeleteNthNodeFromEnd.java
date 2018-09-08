package com.rj.leetcode.linkedList;


public class DeleteNthNodeFromEnd {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


    static ListNode deleteFromEnd(ListNode head, int n) {

        int size = 0;
        ListNode headPtr = head;
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
        ListNode prev = null;
        ListNode nodeToBeDeleted = headPtr;
        while (count != itemPositionToBeDeleted) {
            count++;
            prev = headPtr;
            nodeToBeDeleted = headPtr.next;
            headPtr = headPtr.next;
        }

        if (prev != null) {
            prev.next = nodeToBeDeleted.next;
        } else {
            head = nodeToBeDeleted.next;
        }


        return head;
    }


}
