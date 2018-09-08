package com.rj.practice.src;

public class NullCheck {

    static Integer a = null;
    static Integer b = 90;

    public static void main(String[] args){
        Integer x,y = null;
        if (null == (x = a)) {
            System.out.println("X is : "+ x);
        }

        System.out.println("(y = b)"+ (y = b));
        System.out.println("Y before : "+ y);
        System.out.println("B before : "+ b);
        if ((y = b) == null) {
            System.out.println("Y is : "+ y);
        }
        System.out.println("Y after : "+ y);
        System.out.println("B after : "+ b);

    }
}
