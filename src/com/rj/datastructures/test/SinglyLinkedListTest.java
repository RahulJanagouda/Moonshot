package com.rj.datastructures.test;

import com.rj.datastructures.src.SinglyLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {
    SinglyLinkedList<String> singlyLinkedList =  new SinglyLinkedList();

    @Test
    void test() {
        assertEquals("NULL",singlyLinkedList.toString());
        singlyLinkedList.add("H");
        assertEquals("H->NULL",singlyLinkedList.toString());
        singlyLinkedList.add("E");
        assertEquals("H->E->NULL",singlyLinkedList.toString());
        singlyLinkedList.add("L");
        assertEquals("H->E->L->NULL",singlyLinkedList.toString());
        singlyLinkedList.add("L");
        assertEquals("H->E->L->L->NULL",singlyLinkedList.toString());
        singlyLinkedList.add("O");
        assertEquals("H->E->L->L->O->NULL",singlyLinkedList.toString());
        singlyLinkedList.remove("O");
        assertEquals("H->E->L->L->NULL",singlyLinkedList.toString());
        singlyLinkedList.remove("H");
        assertEquals("E->L->L->NULL",singlyLinkedList.toString());
        singlyLinkedList.remove("L");
        assertEquals("E->L->NULL",singlyLinkedList.toString());
        singlyLinkedList.add("K");
        assertEquals("E->L->K->NULL",singlyLinkedList.toString());
    }
}