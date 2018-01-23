package com.rj.Grab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SWETest {
    @Test
    void solution() {
        SWE s =  new SWE();
        assertEquals(4,s.solution(2,"1A 2F 1C"));
        assertEquals(3,s.solution(1,""));
    }

}