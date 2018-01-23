package com.rj.practice.src;

import sun.text.normalizer.CharTrie;
import sun.text.normalizer.Trie;

public class FizzBuzz {
    public static void main(String[] a) {
        for (int i = 1; i < 101; i++)
            System.out.println(i % 3 == 0 ? i % 5 == 0 ? "FizzBuzz" : "Fizz" : i % 5 == 0 ? "Buzz" : String.valueOf(i));
//            System.out.println(i % 3 == 0 ? i % 5 == 0 ? "FizzBuzz" : "Fizz" : i % 5 == 0 ? "Buzz" : i);
    }

    public static void compareString() {
        String b = "Apple";
        String a = new String("Apple");
        String c = a;
        String d = new String(a);

        System.out.println("a == a:");
        System.out.println(a == a);
        System.out.println("a == b:");
        System.out.println(a == b);
        System.out.println("b == c:");
        System.out.println(b == c);
        System.out.println("a == c:");
        System.out.println(a == c);
        System.out.println("a == d:");
        System.out.println(a == d);

        System.out.println("a equals a:" + a.equals(a));
        System.out.println("a equals b:" + a.equals(b));
        System.out.println("b equals c:" + b.equals(c));
        System.out.println("a equals b:" + a.equals(c));
        System.out.println("a equals d:" + a.equals(d));
    }
}