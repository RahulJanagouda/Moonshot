package com.rj.practice.src;

public class MethodReference {
    public int data = 1;

    public void method(MethodReference test) {
        test.data = 10;
        System.out.println("inside method: "+test.data);
    }
}
