package com.rj.pluralsight;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReflectionTest {
    Reflection r;
    @BeforeEach
    void setUp() {
        r = new Reflection();
    }

    @Test
    void doWorkWithClassVariable() {
        assertEquals(r.doWorkWithClassVariable(),"Reflection");
    }

    @Test
    void doWorkWithGetClass() {
        assertEquals(r.doWorkWithGetClass(),"Reflection");
    }

    @Test
    void doWorkWithClassLoader() {
        assertEquals(r.doWorkWithClassLoader(),"Reflection");
    }
}