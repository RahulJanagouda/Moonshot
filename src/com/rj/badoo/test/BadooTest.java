package com.rj.badoo.test;

import com.rj.badoo.src.Badoo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadooTest {

    @Test void test(){
        Assertions.assertEquals(1, Badoo.search(8,new int[]{7 ,8 ,9 ,1 ,2 ,3 ,4 ,5 ,6}));}
    @Test void test2(){assertEquals(2,Badoo.degreeOfArray(new int[]{1, 2, 2, 3, 1}));}
    @Test void test3(){assertEquals(4,Badoo.degreeOfArray(new int[]{1, 1, 2, 1, 2, 2}));}

}