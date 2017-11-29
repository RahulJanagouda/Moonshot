package com.rj.practice.src.test;

import com.rj.practice.src.BinarySearch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test void testA() { Assertions.assertEquals(-1, BinarySearch.bsHelper(-1, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8})); }
    @Test void test0() { assertEquals(0, BinarySearch.bsHelper(0, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8})); }
    @Test void test1() { assertEquals(1, BinarySearch.bsHelper(1, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8})); }
    @Test void test2() { assertEquals(2, BinarySearch.bsHelper(2, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8})); }
    @Test void test3() { assertEquals(3, BinarySearch.bsHelper(3, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8})); }
    @Test void test4() { assertEquals(4, BinarySearch.bsHelper(4, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8})); }
    @Test void test5() { assertEquals(5, BinarySearch.bsHelper(5, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8})); }
    @Test void test6() { assertEquals(6, BinarySearch.bsHelper(6, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8})); }
    @Test void test7() { assertEquals(7, BinarySearch.bsHelper(7, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8})); }
    @Test void test8() { assertEquals(8, BinarySearch.bsHelper(8, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8})); }
    @Test void test9() { assertEquals(-1, BinarySearch.bsHelper(9, new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8})); }
    @Test void test90() { assertEquals(8, Arrays.binarySearch(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8},8)); }

    @Test void testFo() { assertEquals(4, BinarySearch.foHelper(new int[]{3,4,5,6,7,1,2,3,4,5,6,7}));}
    @Test void testFoo() { assertEquals(2, BinarySearch.foHelper(new int[]{7 ,8 ,9 ,1 ,2 ,3 ,4 ,5 ,6}));}
}