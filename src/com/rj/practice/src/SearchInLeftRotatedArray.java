package com.rj.practice.src;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class SearchInLeftRotatedArray {
    public static int worstCaseSearch(int[] a, int key) {
        TreeMap<Coin,String> treeMap = new TreeMap<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                return o1.value.compareTo(o2.value);
            }
        });
        LinkedHashMap<Integer,String>linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key)
                return i;
        }
        return -1;
    }

    public static int bestCaseSearch(int[] a, int key) {
        return recursiveHelper_3(a, key, 0, a.length - 1);
    }

    private static int recursiveHelper(int[] a, int key, int start, int end) {
        // 7 ,8 ,9 ,1 ,2 ,3 ,4 ,5 ,6
        // 1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9
        if (start > end)
            return -1;

        int mid = (start + end) / 2;

        if (key == a[mid]) return mid;
        else if (key < a[mid]){
            if(a[start] < a[end] && a[end] > key){
                return recursiveHelper(a, key, start, mid-1);
            } else {
                return recursiveHelper(a, key, mid+1, end);
            }
        }
        else if (key > a[mid]){
            if (a[end] > a[start]){
                return recursiveHelper(a, key, mid+1, end);
            } else {
                return recursiveHelper(a, key, start, mid-1);
            }
        }
        else return -1;
    }

    private static int recursiveHelper_3(int[] a, int key, int start, int end) {
        // 7 ,8 ,9 ,1 ,2 ,3 ,4 ,5 ,6
        // 1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9
        if (start > end)
            return -1;

        int mid = (start + end) / 2;

        if (key == a[mid]) return mid;

        if (a[start] <= a[mid]) {
            if (a[start] <= key && key < a[mid]) {
                return recursiveHelper_3(a, key, start, mid - 1);
            } else {
                return recursiveHelper_3(a, key, mid + 1, end);
            }
        } else {
            if (a[mid] < key && key <= a[end])
                return recursiveHelper_3(a, key, mid + 1, end);
            else
                return recursiveHelper_3(a, key, start, mid - 1);
        }
    }
}
