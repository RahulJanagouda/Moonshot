package com.rj.practice.src;

import sun.text.normalizer.CharTrie;
import sun.text.normalizer.Trie;

public class FizzBuzz {
    public static void main(String[] a) {
        for (int i = 1; i < 101; i++)
            System.out.println(i % 3 == 0 ? i % 5 == 0 ? "FizzBuzz" : "Fizz" : i % 5 == 0 ? "Buzz" : String.valueOf(i));
//            System.out.println(i % 3 == 0 ? i % 5 == 0 ? "FizzBuzz" : "Fizz" : i % 5 == 0 ? "Buzz" : i);
    }
}