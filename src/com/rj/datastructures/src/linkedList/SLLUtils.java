package com.rj.datastructures.src.linkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class SLLUtils {

    public static void printAll(Node head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static Node<Integer> mergeKLists_BruteForce(Node<Integer>[] lists) {

        List<Integer> nodes = new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {
            while (lists[i] != null) {
                nodes.add(lists[i].data);
                lists[i] = lists[i].next;
            }
        }
        Collections.sort(nodes);
        SinglyLinkedList<Integer> a = new SinglyLinkedList<>();

        for (Integer node : nodes) {
            a.add(node);
        }
        return a.getHead();
    }


    public static Node<Integer> mergeKLists_PriorityQueue(Node<Integer>[] lists) {

        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (Node<Integer> list : lists) {
            while (list != null) {
                q.add(list.data);
                list = list.next;
            }
        }

//        SinglyLinkedList<Integer> a = new SinglyLinkedList<>();
//        while (!q.isEmpty()){
//            a.add(q.poll());
//        }

//        return a.getHead();

        Node<Integer> head = new Node<>(q.poll());
        Node<Integer> pointer = head;
        while (!q.isEmpty()) {
            pointer.next = new Node<>(q.poll());
            pointer = pointer.next;
//            a.add(q.poll());
        }

        return head;
    }


    public static Node<Integer> mergeKLists_DivideAndConquer(Node<Integer>[] lists) {
        return partition(lists, 0, lists.length - 1);
    }

    private static Node<Integer> partition(Node<Integer>[] lists, int start, int end) {
        if (start == end) return lists[start];
        if (start < end) {
            int mid = (start + end) / 2;
            Node<Integer> l1 = partition(lists, start, mid);
            Node<Integer> l2 = partition(lists, mid + 1, end);
            return merge(l1, l2);
        } else {
            return null;
        }
    }

    private static Node<Integer> merge(Node<Integer> l1, Node<Integer> l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.data < l2.data) {
            l1.next = merge(l1.next, l2);
            return l1;
        } else {
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }


    public static Node<Integer> deleteDuplicates(Node<Integer> a) {
        ArrayList<Node<Integer>> alreadyExisting  = new ArrayList<>();

        Node<Integer> current = a;
        Node<Integer> previous = null;

        while(current!=null){
            if(alreadyExisting.contains(current)){
                previous.next = current.next;
            } else {
                alreadyExisting.add(current);
                previous = current;
            }
            current = current.next;
        }

        return a;
    }
}
