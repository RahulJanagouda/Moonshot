package com.rj.practice.src;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


class UberTest {

    @Test void testrotate_01(){ assertArrayEquals(new int[]{1,3},Uber.takeinput(new int[]{4,1,2,4,3,2,1,3})); }
    @Test void testrotate_02(){ assertArrayEquals(new int[]{3,0,2},Uber.takeinput(new int[]{5,1,2,4,3,5,3,6,9,12})); }

}