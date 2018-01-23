package com.rj.practice.src;

import java.util.Arrays;

public class SmallestThreePositiveNumbers {
    public static int[] getSmallestPositiveNumbers(int[] inputArray) {
        int[] smallNumbersSorted = new int[3];
        if (inputArray == null || inputArray.length < 4) {
            return inputArray;
        }
        Arrays.sort(inputArray);
        smallNumbersSorted[0] = inputArray[0];
        smallNumbersSorted[1] = inputArray[1];
        smallNumbersSorted[2] = inputArray[2];

        return smallNumbersSorted;
    }
}
