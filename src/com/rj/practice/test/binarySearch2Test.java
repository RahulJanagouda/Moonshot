package com.rj.practice.test;

import com.rj.practice.src.BinarySearch_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class binarySearch2Test {
    @Test
    void binarySearch() {
        Assertions.assertEquals(9, BinarySearch_2.binarySearch(new int[]{2,5,7,8,9},9));
    }

}