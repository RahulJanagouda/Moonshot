package com.rj.cci.test;

import com.rj.cci.src.P07;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P07Test {
    @Test
    void main() {
        P07.main(new String[]{
                "4",
                "add hack",
                "add hackerrank",
                "find hac",
                "find hak"
        });
    }
}