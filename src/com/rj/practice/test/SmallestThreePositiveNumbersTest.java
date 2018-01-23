package com.rj.practice.test;

import com.rj.practice.src.SmallestThreePositiveNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestThreePositiveNumbersTest {

    @Test
    void getSmallestPositiveNumbers_Should_Always_Pass() {
        assertArrayEquals(new int[]{1, 2, 3}, SmallestThreePositiveNumbers.getSmallestPositiveNumbers(new int[]{1, 2, 3}));
    }

    @Test
    void getSmallestPositiveNumbers_1() {
        assertArrayEquals(new int[]{1, 2, 3}, SmallestThreePositiveNumbers.getSmallestPositiveNumbers(new int[]{1, 2, 3, 4}));
    }

    @Test
    void getSmallestPositiveNumbers_2() {
        assertArrayEquals(new int[]{4, 35, 245}, SmallestThreePositiveNumbers.getSmallestPositiveNumbers(new int[]{1256, 245, 35, 4,324, 436}));
    }
}