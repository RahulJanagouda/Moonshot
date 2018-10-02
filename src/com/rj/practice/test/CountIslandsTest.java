package com.rj.practice.test;

import com.rj.practice.src.CountIslands;
import org.junit.jupiter.api.Test;

import java.util.AbstractList;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CountIslandsTest {

    @Test
    void test1() {
        CountIslands.test();
    }

    @Test
    void black() {
        ArrayList<String> a = new ArrayList<>();
        a.add("OOOXOOO");
        a.add("OOXXOXO");
        a.add("OXOOOXO");
        assertEquals(3, CountIslands.black(a));
    }
}