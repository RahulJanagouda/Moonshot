package com.rj.sorting;

public class mergeSort {
    public static int[] mergesort(int[] a) {
        return mergeSortHelper(a, 0, a.length - 1);

    }
// This does not work.
    private static int[] mergeSortHelper(int[] a, int low, int hi) {
        int mid = (hi + low) / 2;
        if(low < hi){
        }
        return merge(mergeSortHelper(a, low, mid), mergeSortHelper(a, mid + 1, hi));
    }

    private static int[] merge(int[] left, int[] right) {
        int[] sorted = new int[left.length + right.length];

        int llen = 0;
        int rlen = 0;
        int tlen = sorted.length;
        int i = -1;

        while (llen + rlen >= tlen) {
            if (left[llen] < right[rlen]) {
                sorted[++i] = left[llen];
                llen++;
            } else {
                sorted[++i] = right[rlen];
                rlen++;
            }
        }
        return sorted;
    }
}
