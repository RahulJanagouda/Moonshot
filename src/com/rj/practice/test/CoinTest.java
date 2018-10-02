package com.rj.practice.test;

import com.rj.practice.src.Coin;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class CoinTest {
    @Test
    void testPermutations() {
        int[] a = new int[]{5, 10, 15};
        Coin.permutations(a, 55, new Stack<>());
    }

    @Test
    void testCombinations() {
        int[] a = new int[]{1, 10, 15};
        Coin.combinations(a, 0, 15, new Stack<>());
    }
}