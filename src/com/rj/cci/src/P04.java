package com.rj.cci.src;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P04 {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public static Node returnValues() {
        //TODO This is used for testing and incomplete, it wont work
        LinkedList<Node> nodeLinkedList = new LinkedList<>();

        for (int i = 0; i < 9; i++) {
            nodeLinkedList.addFirst(new Node(i));
        }
        nodeLinkedList.getLast().next = nodeLinkedList.get(5);

        return nodeLinkedList.getFirst();
    }

    public static boolean hasCycle(Node head) {
        if (head != null) {
            List<Node> visited = new ArrayList<>();
            while (head != null) {
                if (visited.contains(head)) {
                    return true;
                } else {
                    visited.add(head);
                    head = head.next;
                }
            }
        }
        return false;
    }
}
