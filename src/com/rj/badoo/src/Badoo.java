package com.rj.badoo.src;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Badoo {

    //    StringBuilder
    /*
    * To find the degree of an array, we just need to keep track of the frequency of each
    * distinct element in the array, and those elements that have the highest frequencies will be the degree.
    * So, to find the sub-array with the maximum degree, we only need to care about the subarray
    * that contains the element that have the maximum counts, which means all the sub array with [start , end]
    * is the start and end occurrence of that element.
    * Thus, what we need to do is keeping track of frequency, start and end position of each element.
    * */
    public static int degreeOfArray(int[] arr) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        Map<Integer, Integer> startIndices = new HashMap<>();
        Map<Integer, Integer> endIndices = new HashMap<>();

        int maxDegree = 0;
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            if (occurrences.containsKey(value)) {
                occurrences.put(value, occurrences.get(value) + 1);
            } else {
                startIndices.put(value, i);
                occurrences.put(value, 1);
            }
            endIndices.put(value, i);
            maxDegree = maxDegree > occurrences.get(value) ? maxDegree : occurrences.get(value);
        }

        int result = arr.length;
        for (int i : occurrences.keySet()) {
            if (occurrences.get(i) == maxDegree) {
                int len = endIndices.get(i) - startIndices.get(i) + 1;
                result = result < len ? result : len;
            }
        }
        return result;
    }


    /*
 * Complete the function below.
 */
    public static int search(int item, int[] array) {
        int offset = findOffset(array, 0, array.length - 1);

        if (offset == -1) return Arrays.binarySearch(array, item);
        else if (array[offset] == item) return offset;
        else if (array[offset] <= item) return Arrays.binarySearch(array, offset + 1, array.length - 1, item);
        else return Arrays.binarySearch(array, 0, offset, item);

    }

    static int search2(int item, int[] array) {
        int offset = findOffset(array, 0, array.length - 1);

        if (offset == -1) return bs(item, array, 0, array.length - 1);
        else if (array[offset] == item) return offset;
        else if (array[offset] <= item) return bs(item, array, offset + 1, array.length - 1);
        else return bs(item, array, 0, offset);

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

    static int findOffset(int[] a, int start, int end) {
        if (start > end) return -1;
        if (start == end) return start;

        int mid = (start + end) / 2;
        if (mid < end && a[mid] > a[mid + 1]) return mid;
        else if (mid > start && a[mid] < a[mid - 1]) return mid - 1;
        else if (a[start] >= a[mid]) return findOffset(a, start, mid - 1);
        else return findOffset(a, mid + 1, end);

    }


}
