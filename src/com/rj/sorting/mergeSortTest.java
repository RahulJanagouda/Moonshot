package com.rj.sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class mergeSortTest {

    @Test
    void mergesortTest() {
        int[] a = {9, 231, 34, 654, 87, 1, 64, 73, 71, 33, 9, 35, 12, 5, 90};
        System.out.print(Arrays.toString(mergeSort.mergesort(a)));
    }
}