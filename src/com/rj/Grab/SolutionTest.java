package com.rj.Grab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void solun() {
        Solution s = new Solution();
        int output = s.solution(6, 4, new int[]{4,6,4,6,4,4,6,6});

        assertEquals(7,output);
    }
    @Test
    void solutin() {
        Solution s = new Solution();
        int output = s.solution(6, 4, new int[]{6,6,6,6,6,6,4,6,4,4,4,4,4});

        assertEquals(13,output);
    }
    @Test
    void solution() {
        Solution s = new Solution();
        int output = s.solution(6, 42, new int[]{6, 42, 5, 7, 1, 42});

        assertEquals(4,output);
    }

    @Test
    void solution_1() {
        Solution s = new Solution();
        int output = s.solution(6, 13, new int[]{13,1,1,6});

        assertEquals(3,output);
    }

    @Test
    void solution_2() {
        Solution s = new Solution();
        int output = s.solution(100, 63, new int[]{100,63,1,6,2,13});

        assertEquals(5,output);
    }

}