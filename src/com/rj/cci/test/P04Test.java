package com.rj.cci.test;

import com.rj.cci.src.P04;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class P04Test {
    @Test
    void hasCycle() {
        Assertions.assertEquals( true, P04.hasCycle(P04.returnValues()));
    }

}