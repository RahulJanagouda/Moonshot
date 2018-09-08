package com.rj.practice.src;

public class BinarySearch {
    public static int bsHelper(int key, int[] a) {
        return bs(key, a, 0, a.length - 1);
    }

    private static int bs(int key, int[] a, int start, int end) {
        if (start > end) return -1;
        int mid = (start + end) / 2;
        if (key == a[mid]) {
            return mid;
        } else if (key < a[mid]) {
            return bs(key, a, start, mid - 1);
        } else {
            return bs(key, a, mid + 1, end);
        }
    }

    public static int findOffsetHelper(int[] a) {
        return fo(a, 0, a.length - 1);
    }

    private static int fo(int[] a, int s, int e) {
        if (s > e) return -1;
        if (s == e) return s;

        int mid = s + e / 2;

        if (mid < e && a[mid] > a[mid + 1]) return mid;
        else if (mid > s && a[mid] < a[mid - 1]) return mid - 1;
        else if (a[s] >= a[mid]) return fo(a, s, mid - 1);
        else return fo(a, mid + 1, e);
    }
}
