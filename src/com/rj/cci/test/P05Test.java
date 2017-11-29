package com.rj.cci.test;

import com.rj.cci.src.P05;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class P05Test {
    @Test
    void isBalanced() {
        Assertions.assertEquals( true, P05.areBracketsBalanced());
    }

}