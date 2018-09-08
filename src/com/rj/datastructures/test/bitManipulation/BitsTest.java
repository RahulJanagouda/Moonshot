package com.rj.datastructures.test.bitManipulation;

import com.rj.datastructures.src.bitManipulation.Bits;
import org.junit.jupiter.api.Test;

class BitsTest {

    @Test
    void intToBinary() {
        Bits.intToBinary(13948);
    }

    @Test
    void binaryToInt() {
        Bits.binaryToInt("11011011111000");
    }
}