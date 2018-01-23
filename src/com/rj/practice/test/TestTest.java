package com.rj.practice.test;

import com.rj.practice.src.MethodReference;
import org.junit.jupiter.api.Test;

class TestTest {
    @Test
    public void printTest(){
        MethodReference test = new MethodReference();
        System.out.println("Before change: "+test.data);
        test.method(test);
        test.data = 99;
        System.out.println("After change: "+test.data);
        test.method(test);
        System.out.println("After method: "+test.data);

    }
}