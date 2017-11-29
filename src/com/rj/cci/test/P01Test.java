package com.rj.cci.test;

import com.rj.cci.src.P01;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class P01Test {
    @Test
    void test() {
        Assertions.assertArrayEquals(P01.arrayLeftRotation(new int[]{1, 2, 3, 4, 5}, 5, 4), new int[]{5, 1, 2, 3, 4});
    }
}