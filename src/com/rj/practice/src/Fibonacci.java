package com.rj.practice.src;

import java.util.HashMap;
import java.util.Stack;

public class Fibonacci {

    private static HashMap<Integer, Integer> memo = new HashMap<>();

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(" " + printKFibonaciNumbersRecursicve(i) + ",");
        }

        System.out.println();
        printKFibonaciNumbersIterative(10);

    }

    private static Integer printKFibonaciNumbersRecursicve(int k) {

        if (k <= 2) return 1;

        if (memo.containsKey(k)) return memo.get(k);

        int total = printKFibonaciNumbersRecursicve(k - 1) + printKFibonaciNumbersRecursicve(k - 2);

        memo.put(k, total);

        return total;
    }

    private static void printKFibonaciNumbersIterative(int k) {
        int t1 = 0;
        int t2 = 0;
        for (int i = 1; i <= k; i++) {
            if (i < 2) {
                t1 = 1;
                System.out.print(" "+t1+",");
            } else {
                int temp = t1 + t2;
                System.out.print(" "+temp+",");
                t2 = t1;
                t1 = temp;
            }
        }

    }

    private static void printKFibonaciNumbersIterativeWithStack(int k) {
        Stack<Integer> stack = new Stack<>();
        int t1 = 0;
        int t2 = 0;
        for (int i = 1; i <= k; i++) {
            if (i < 2) {
                stack.push(1);
                System.out.print(" "+t1+",");
            } else {
                int temp = t1 + t2;
                System.out.print(" "+temp+",");
                t2 = t1;
                t1 = temp;
            }
        }

    }


}
