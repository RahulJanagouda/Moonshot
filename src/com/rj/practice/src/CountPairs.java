package com.rj.practice.src;


import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

/*
 * Given an array. Find pairs of numbers that add up to a given value 'x'. with time complexity less than O(n2) and use no additional space.
 * */
public class CountPairs {
    public static List<Pair<Integer,Integer>> getPairs(int[] a, int x) {
        List<Pair<Integer,Integer>> pairs =  new ArrayList<>();
//        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] a = {512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
//        int[] a = {2, 5, 8, 2, 6, 4, 3, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] a = {111, 333, 2343, 5435, 457, 678, 6547, 567, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < a.length ; i++) {
            int j = 1 + 1;
            if ((a[i] + a[j]) == x) {
                pairs.add(new Pair<>(i,j));
            }
        }
        return pairs;
    }
}
