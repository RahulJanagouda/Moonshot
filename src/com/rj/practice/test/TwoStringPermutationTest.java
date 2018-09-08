package com.rj.practice.test;

import com.rj.practice.src.TwoStringPermutation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoStringPermutationTest {

    @Test
    void areStringsPermutation() {
        assertTrue(TwoStringPermutation.areStringsPermutation("", ""));
        assertTrue(TwoStringPermutation.areStringsPermutation("a", "a"));
        assertTrue(TwoStringPermutation.areStringsPermutation("ba", "ab"));
        assertTrue(TwoStringPermutation.areStringsPermutation("abcde", "abecd"));
        assertTrue(TwoStringPermutation.areStringsPermutation("cbababa", "aaabbbc"));
        assertFalse(TwoStringPermutation.areStringsPermutation("cbababaab", "aaabbbc"));
    }

    @Test
    void isPermutationOptimal() {
        assertTrue(TwoStringPermutation.isPermutationOptimal("", ""));
        assertTrue(TwoStringPermutation.isPermutationOptimal("a", "a"));
        assertTrue(TwoStringPermutation.isPermutationOptimal("ba", "ab"));
        assertTrue(TwoStringPermutation.isPermutationOptimal("abcde", "abecd"));
        assertTrue(TwoStringPermutation.isPermutationOptimal("cababab", "aaabbbc"));
        assertFalse(TwoStringPermutation.isPermutationOptimal("cbababaab", "aaabbbc"));
    }
}