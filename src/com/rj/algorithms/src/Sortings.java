package com.rj.algorithms.src;

public class Sortings {
    public static int[] mergesort(int[] array) {
        int[] tempArray = new int[array.length];
        mergeSortHelper(array, tempArray, 0, array.length - 1);
        return array;
    }

    private static void mergeSortHelper(int[] array, int[] tempArray, int low, int high) {

        if (low < high) {
            int mid = (low + high) / 2;
            mergeSortHelper(array, tempArray, low, mid);
            mergeSortHelper(array, tempArray, mid + 1, high);
            merge(array, tempArray, low, mid, high);
        }
    }

    private static void merge(int[] array, int[] tempArray, int low, int mid, int high) {

        System.arraycopy(array, low, tempArray, low, high + 1 - low);

        int helperLeft = low;
        int helperRight = mid + 1;
        int current = low;

        while (helperLeft <= mid && helperRight <= high) {
            if (tempArray[helperLeft] < tempArray[helperRight]) {
                array[current] = tempArray[helperLeft];
                helperLeft++;
            } else {
                array[current] = tempArray[helperRight];
                helperRight++;
            }
            current++;
        }
        System.arraycopy(tempArray, helperLeft, array, current, mid - helperLeft + 1);
    }

}
