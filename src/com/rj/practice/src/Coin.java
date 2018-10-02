package com.rj.practice.src;

import java.util.Stack;

public class Coin {
    Integer value;
    public static void permutations(int[] coins, int amount, Stack<Integer> comb) {


        //valid combination found
        if (amount < 0) return;

        //invalid combination found
        if (amount == 0) {
            System.out.println(comb);
            return;
        }

        for (int coin : coins) {
            comb.push(coin);
            permutations(coins, amount - coin, comb);
            comb.pop();
        }
    }

    public static void combinations(int[] coins, int i, int amount, Stack<Integer> comb) {
        //valid combination found
        if (amount < 0 || i > coins.length-1) return;

        //invalid combination found
        if (amount == 0) {
            System.out.println(comb);
            return;
        }


        //include coins[i] into current combination

        comb.push(coins[i]);
        combinations(coins, i, amount - coins[i], comb);
        comb.pop();

        //exclude coins[i] from current combination
        combinations(coins, i + 1, amount , comb);

    }
}
