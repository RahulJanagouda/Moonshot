package com.rj.datastructures.test.linkedList;

import com.rj.datastructures.src.linkedList.DoublyLinkedList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DoublyLinkedListTest {
    private DoublyLinkedList dll;

    @BeforeEach
    void setUp() {
        dll = new DoublyLinkedList(1);
    }

    @Test
    void add() {
        dll.add(2);
        dll.add(3);
        dll.add(4);
        dll.add(5);
        dll.add(6);
        dll.add(7);
        dll.add(8);
        dll.add(9);
        dll.add(10);
    }


    @Test
    void remove() {
        add();

        dll.remove(5);
        dll.remove(8);
    }


    @Test
    void push(){
        dll.push(2);
        dll.push(3);
        dll.push(4);
        dll.push(5);
        dll.push(6);
        dll.push(7);
        dll.push(8);
        dll.push(9);
        dll.push(10);
    }

    @Test
    void insertAfter(){
        add();
        dll.insertAfter(10,11);
        dll.insertAfter(3,12);
        dll.insertAfter(1, 22);
    }

    @Test
    void find(){
        add();
        dll.print(dll.find(10));
    }

    @Test
    void reverse(){
        add();
        dll.reverse();
    }

    @AfterEach
    void tearDown() {
        dll.printAll();
    }
}