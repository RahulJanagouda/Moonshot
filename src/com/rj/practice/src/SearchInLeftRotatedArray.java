package com.rj.practice.src;

public class SearchInLeftRotatedArray {
    public static int worstCaseSearch(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key)
                return i;
        }
        return -1;
    }

    public static int bestCaseSearch(int[] a, int key) {
        return recursiveHelper(a, key, 0, a.length - 1);
    }

    private static int recursiveHelper(int[] a, int key, int start, int end) {
        // 7 ,8 ,9 ,1 ,2 ,3 ,4 ,5 ,6
        // 1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9
        if (start > end)
            return -1;

        int mid = (start + end) / 2;

        if (key == a[mid]) return mid;
        else if (key < a[mid]) return recursiveHelper(a, key, start, mid-1);
        else return recursiveHelper(a, key, mid+1, end);
    }
}
