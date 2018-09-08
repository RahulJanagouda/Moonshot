package com.rj.algorithms.test;

import com.rj.algorithms.src.Sortings;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortingsTest {

    @Test
    void mergesort() {
        int[] a = {4, 9, 1, 5, 2, 0, 3, 8, 45, 33, 56, 82, 45, 67, 43, 89, 47, 27, 73, 29};
        System.out.println(Arrays.toString(Sortings.mergesort(a)));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}