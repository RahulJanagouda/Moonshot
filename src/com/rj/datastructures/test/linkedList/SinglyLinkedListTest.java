package com.rj.datastructures.test.linkedList;

import com.rj.datastructures.src.linkedList.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SinglyLinkedListTest {
    SinglyLinkedList<String> singlyLinkedList = new SinglyLinkedList();

    @Test
    void test() {
        assertEquals("NULL", singlyLinkedList.toString());
        singlyLinkedList.add("H");
        assertEquals("H->NULL", singlyLinkedList.toString());
        singlyLinkedList.add("E");
        assertEquals("H->E->NULL", singlyLinkedList.toString());
        singlyLinkedList.add("L");
        assertEquals("H->E->L->NULL", singlyLinkedList.toString());
        singlyLinkedList.add("L");
        assertEquals("H->E->L->L->NULL", singlyLinkedList.toString());
        singlyLinkedList.add("O");
        assertEquals("H->E->L->L->O->NULL", singlyLinkedList.toString());
        singlyLinkedList.remove("O");
        assertEquals("H->E->L->L->NULL", singlyLinkedList.toString());
        singlyLinkedList.remove("H");
        assertEquals("E->L->L->NULL", singlyLinkedList.toString());
        singlyLinkedList.remove("L");
        assertEquals("E->L->NULL", singlyLinkedList.toString());
        singlyLinkedList.add("K");
        assertEquals("E->L->K->NULL", singlyLinkedList.toString());
    }

    @Test
    void testingDeleteFromEnd() {
        singlyLinkedList.add("1");
        singlyLinkedList.add("2");
        singlyLinkedList.add("3");
        singlyLinkedList.add("4");
        singlyLinkedList.add("5");
        singlyLinkedList.add("6");
        singlyLinkedList.add("7");
        singlyLinkedList.add("8");
        singlyLinkedList.add("9");
        singlyLinkedList.add("10");

        System.out.println(singlyLinkedList.toString());
        singlyLinkedList.deleteFromEnd(singlyLinkedList.getHead(), 4);
        System.out.println(singlyLinkedList.toString());

        System.out.println(singlyLinkedList.toString());
        singlyLinkedList.deleteFromEnd(singlyLinkedList.getHead(), 1);
        System.out.println(singlyLinkedList.toString());

        System.out.println(singlyLinkedList.toString());
        singlyLinkedList.deleteFromEnd(singlyLinkedList.getHead(), 8);
        System.out.println(singlyLinkedList.toString());

    }

    @Test
    void testingMergingKLists_BruteForce() {
        SinglyLinkedList<Integer> l1 = new SinglyLinkedList();

        l1.add(1);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(7);
        l1.add(8);
        l1.add(10);
        SinglyLinkedList<Integer> l2 = new SinglyLinkedList();

        l2.add(1);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(10);

        SinglyLinkedList<Integer> l3 = new SinglyLinkedList();

        l3.add(1);
        l3.add(2);
        l3.add(3);
        l3.add(4);
        l3.add(6);
        l3.add(8);
        l3.add(10);

        SinglyLinkedList<Integer> l4 = new SinglyLinkedList();

        l4.add(1);
        l4.add(2);
        l4.add(3);
        l4.add(5);
        l4.add(6);
        l4.add(7);
        l4.add(9);
        l4.add(10);

        Node[] nodes = new Node[4];
        nodes[0] = l1.getHead();
        nodes[1] = l2.getHead();
        nodes[2] = l3.getHead();
        nodes[3] = l4.getHead();

        long t = System.currentTimeMillis();
        SLLUtils.printAll(SLLUtils.mergeKLists_BruteForce(nodes));
        long tt = System.currentTimeMillis() - t;
        System.out.println("TIME : " + tt);
    }

    @Test
    void testingMergingKLists_PriorityQueue() {
        SinglyLinkedList<Integer> l1 = new SinglyLinkedList();

        l1.add(1);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(7);
        l1.add(8);
        l1.add(10);
        SinglyLinkedList<Integer> l2 = new SinglyLinkedList();

        l2.add(1);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(10);

        SinglyLinkedList<Integer> l3 = new SinglyLinkedList();

        l3.add(1);
        l3.add(2);
        l3.add(3);
        l3.add(4);
        l3.add(6);
        l3.add(8);
        l3.add(10);

        SinglyLinkedList<Integer> l4 = new SinglyLinkedList();

        l4.add(1);
        l4.add(2);
        l4.add(3);
        l4.add(5);
        l4.add(6);
        l4.add(7);
        l4.add(9);
        l4.add(10);

        Node[] nodes = new Node[4];
        nodes[0] = l1.getHead();
        nodes[1] = l2.getHead();
        nodes[2] = l3.getHead();
        nodes[3] = l4.getHead();

        long t = System.currentTimeMillis();
        SLLUtils.printAll(SLLUtils.mergeKLists_PriorityQueue(nodes));
        long tt = System.currentTimeMillis() - t;
        System.out.println("TIME : " + tt);

    }

    @Test
    void testingMergingKLists_DivideAndConquer() {
        SinglyLinkedList<Integer> l1 = new SinglyLinkedList();

        l1.add(1);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(7);
        l1.add(8);
        l1.add(10);
        SinglyLinkedList<Integer> l2 = new SinglyLinkedList();

        l2.add(1);
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        l2.add(10);

        SinglyLinkedList<Integer> l3 = new SinglyLinkedList();

        l3.add(1);
        l3.add(2);
        l3.add(3);
        l3.add(4);
        l3.add(6);
        l3.add(8);
        l3.add(10);

        SinglyLinkedList<Integer> l4 = new SinglyLinkedList();

        l4.add(1);
        l4.add(2);
        l4.add(3);
        l4.add(5);
        l4.add(6);
        l4.add(7);
        l4.add(9);
        l4.add(10);

        Node[] nodes = new Node[4];
        nodes[0] = l1.getHead();
        nodes[1] = l2.getHead();
        nodes[2] = l3.getHead();
        nodes[3] = l4.getHead();

        long t = System.currentTimeMillis();
        SLLUtils.printAll(SLLUtils.mergeKLists_DivideAndConquer(nodes));
        long tt = System.currentTimeMillis() - t;
        System.out.println("TIME : " + tt);

    }

    @Test
    void test_reverseWithSinglePointer() {
        SinglyLinkedList<Integer> l4 = new SinglyLinkedList();

        l4.add(1);
        l4.add(2);
        l4.add(3);
        l4.add(4);
        l4.add(5);
        long startTime = System.nanoTime();
        SLLUtils.printAll(ReverseNodesInK.reverseWithSinglePointer(l4.getHead()));
        long stopTime = System.nanoTime();
        System.out.println((stopTime - startTime) / 1000);

    }

    @Test
    void test_reverseWithTwoPointers() {
        SinglyLinkedList<Integer> l4 = new SinglyLinkedList();
        l4.add(1);
        l4.add(2);
        l4.add(3);
        l4.add(4);
        l4.add(5);

        long startTime = System.nanoTime();
        SLLUtils.printAll(ReverseNodesInK.reverseWithTwoPointers(l4.getHead()));
        long stopTime = System.nanoTime();
        System.out.println((stopTime - startTime) / 1000);

    }


    @Test
    void test_reverseReverseNodesInK() {
        SinglyLinkedList<Integer> l4 = new SinglyLinkedList();
        l4.add(1);
        l4.add(2);
        l4.add(3);
        l4.add(4);
        l4.add(5);
        l4.add(6);
        l4.add(7);
        l4.add(8);
        l4.add(9);

        SLLUtils.printAll(ReverseNodesInK.reverseKGroup(l4.getHead(), 3));
    }


    @Test
    void test_reverseReverseNodesInK_3() {
        SinglyLinkedList<Integer> l4 = new SinglyLinkedList();
        l4.add(1);
        l4.add(2);
        l4.add(3);
        l4.add(4);
        l4.add(5);
        l4.add(6);
        l4.add(7);
        l4.add(8);
        l4.add(9);

        SLLUtils.printAll(ReverseNodesInK.reverseKGroup_3(l4.getHead(), 3));
    }

    @Test
    void test_KthNodeFromLast_Print() {
        SinglyLinkedList<Integer> l4 = new SinglyLinkedList();
        l4.add(1);
        l4.add(2);
        l4.add(3);
        l4.add(4);
        l4.add(5);
        l4.add(6);
        l4.add(7);
        l4.add(8);
        l4.add(9);

        KthNodeFromLast.print(l4.getHead(), 9);
    }

    @Test
    void test_KthNodeFromLast_Return() {
        SinglyLinkedList<Integer> l4 = new SinglyLinkedList();
        l4.add(1);
        l4.add(2);
        l4.add(3);
        l4.add(4);
        l4.add(5);
        l4.add(6);
        l4.add(7);
        l4.add(8);
        l4.add(9);

        System.out.println("returned Kth Value: " + KthNodeFromLast.retrunHelper(l4.getHead(), 1));
    }


    @Test
    void test_AddTwoNumbersInList() {
        SinglyLinkedList<Integer> l4 = new SinglyLinkedList();
        //12345
        l4.add(1);
        l4.add(2);
        l4.add(3);
        l4.add(4);
        l4.add(5);

        SinglyLinkedList<Integer> l5 = new SinglyLinkedList();
        //12345
        l5.add(1);
        l5.add(2);
        l5.add(3);
        l5.add(4);
        l5.add(5);

        SLLUtils.printAll(AddTwoNumbersInList.addTwoList(l4.getHead(), l5.getHead()));

    }


    @Test
    void test_deleteDuplicates() {
        SinglyLinkedList<Integer> l4 = new SinglyLinkedList();
        l4.add(1);
        l4.add(1);
        l4.add(1);
        l4.add(1);
        l4.add(1);
        l4.add(2);
        l4.add(2);
        l4.add(2);
        l4.add(2);
        l4.add(2);
        l4.add(3);
        l4.add(3);
        l4.add(4);
        l4.add(4);
        l4.add(5);
        l4.add(6);
        l4.add(6);
        l4.add(6);
        l4.add(6);
        l4.add(7);
        l4.add(7);
        l4.add(7);
        l4.add(8);
        l4.add(9);
        l4.add(9);
        l4.add(9);
        l4.add(9);

        SLLUtils.printAll(SLLUtils.deleteDuplicates(l4.getHead()));
    }

}