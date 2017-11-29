package com.rj.cci.src;

import java.util.ArrayList;
import java.util.Arrays;

public class P02 {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Number: " + numberNeeded("aaaaaaa", "aaaaaaa"));
//        System.out.println("Number: " + numberNeeded("abcde", "edboa"));
    }

    public static int numberNeeded(String first, String second) {
        ArrayList<String> firstList = new ArrayList<>(Arrays.asList(first.split("")));
        ArrayList<String> secondList = new ArrayList<>(Arrays.asList(second.split("")));
        for (int a = 0; a < firstList.size(); a++) {
            if (secondList.contains(firstList.get(a))) {
                secondList.remove(firstList.get(a));
                firstList.remove(a);
                a--;
            }
        }
        return firstList.size() + secondList.size();
    }
}
