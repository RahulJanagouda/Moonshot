package com.rj.practice.test;

import com.rj.practice.src.ZeroMatrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZeroMatrixTest {

    @Test
    void makeZeros() {
        int[][] m = new int[][]{
                {1, 2, 3, 1, 3},
                {4, 5, 6, 1, 0},
                {7, 8, 9, 2, 1},
                {7, 0, 9, 2, 1},
                {7, 8, 9, 2, 1},
                {7, 3, 9, 2, 9}

        };


        int[][] o = new int[][]{
                {1, 0, 3, 1, 0},
                {0, 0, 0, 0, 0},
                {7, 0, 9, 2, 0},
                {0, 0, 0, 0, 0},
                {7, 0, 9, 2, 0},
                {7, 0, 9, 2, 0}
        };


        assertArrayEquals(o,ZeroMatrix.makeZeros(m));
    }
}