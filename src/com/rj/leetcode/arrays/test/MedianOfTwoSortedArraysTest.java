package com.rj.leetcode.arrays.test;

import com.rj.leetcode.arrays.MedianOfTwoSortedArrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArraysTest {

    @Test
    void findMedianSortedArrays() {
//        1,2,3,4,5,5,6,6,7,7,8,9
        int[] a = {1, 2};
        int[] b = {3,4};
        System.out.println(MedianOfTwoSortedArrays.findMedianSortedArrays(b, a));
    }
}