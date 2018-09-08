package com.rj.datastructures.src;

import com.rj.datastructures.src.linkedList.SinglyLinkedList;

public class HHashTable<K, V> {
    int size = 10;
    SinglyLinkedList<V>[] a = new SinglyLinkedList[size];

    public void add(K key, V value){
        int itemPos  = key.hashCode() % size;
        a[itemPos].add(value);
    }

//    public K getValueForKey(K key){
//        int itemPos  = key.hashCode() % size;
//        HashMapNode<K, V> head = (HashMapNode<K, V>) a[itemPos].getHead();
//        while (head!=null){
//            if(head.)
//        }
//
//
//    }


}
