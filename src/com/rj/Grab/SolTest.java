package com.rj.Grab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolTest {

    @Test
    void solution() {
        Sol s = new Sol();
        int output = s.solution(4, 17);

        assertEquals(3,output);
    }
}