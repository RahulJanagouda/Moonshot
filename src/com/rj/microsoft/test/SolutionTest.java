package com.rj.microsoft.test;

import com.rj.microsoft.src.BinaryTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void makeBinaryTree() {
        BinaryTree binaryTree = new BinaryTree("(1,2) (1,3) (2,7) (3,8) (5,6) (2,4) (3,5)");
        assertEquals(6, binaryTree.longestPath());
    }
}