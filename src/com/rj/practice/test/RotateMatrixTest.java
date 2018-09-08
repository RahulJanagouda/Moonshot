package com.rj.practice.test;

import com.rj.practice.src.RotateMatrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateMatrixTest {

    @Test
    void byNintyDegreeClockwise() {
        int[][] m = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] o = new int[][]{
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}
        };

        assertArrayEquals(o, RotateMatrix.byNintyDegreeClockwise(m));
    }

    @Test
    void byNintyDegreeClockwise_2() {
        int[][] m = new int[][]{
                {1, 2},
                {4, 5}
        };

        int[][] o = new int[][]{
                { 4, 1},
                { 5, 2},
        };

        assertArrayEquals(o, RotateMatrix.byNintyDegreeClockwise(m));
    }

}