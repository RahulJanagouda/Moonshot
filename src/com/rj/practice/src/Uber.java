package com.rj.practice.src;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Uber {

    public int consecutive(long num) {
        int count = 0;
        long start = 1, end = 1;
        long sum = 1;

        while (start <= num / 2) {
            if (sum < num) {
                end += 1;
                sum += end;
            } else if (sum > num) {
                sum -= start;
                start += 1;
            } else if (sum == num) {
                count++;
                sum -= start;
                start += 1;
            }
        }
        return count;
    }

    static int[] takeinput(int[] a) {
        int sizeOfInputArray = a[0];
        int[] inputArray = new int[sizeOfInputArray];
        for (int i = 0; i < sizeOfInputArray; i++) {
            inputArray[i] = a[i+1];
        }

        int sizeOfRotationArray = a[sizeOfInputArray + 1];
        int[] rotationArray = new int[sizeOfRotationArray];

        for (int i = 0; i < rotationArray.length; i++) {
            rotationArray[i] = a[sizeOfInputArray + 2 + i];
        }
        System.out.println("inputArray"+Arrays.toString(inputArray));
        System.out.println("rotationArray"+Arrays.toString(rotationArray));

        return getMaxElementIndices(inputArray, rotationArray);
    }

    static int[] getMaxElementIndices(int[] a, int[] rotate) {
        int[] count = new int[rotate.length];
        for (int i = 0; i < rotate.length; i++) {
            count[i] = leftRotateNTimes(a, rotate[i]);
        }
        System.out.println(Arrays.toString(count));

        return count;
    }

    static int leftRotateNTimes(int[] arr, int n) {
        int k = 0;
        if (n == 0) {
            k = leftRotate(arr);
        } else {
            for (int i = 0; i < n; i++) {
                k = leftRotate(arr);
            }
        }
        System.out.println(Arrays.toString(arr));
        return k;
    }

    static int leftRotate(int[] arr) {

        int indexOfMax = arr.length - 1;
        int i, temp;
        temp = arr[0];
        for (i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
            if (arr[indexOfMax] < arr[i]) {
                indexOfMax = i;
            }
        }
        arr[i] = temp;
        return indexOfMax;
    }
}
