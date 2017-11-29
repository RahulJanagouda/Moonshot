package com.rj.practice.src;

public class BinarySearch_2 {
    public static Boolean binarySearch(int[] arr, int n){
        return bs(arr,n,0,arr.length-1);
    }

    public static Boolean bs(int[] a,int key, int s, int e){
        if(s>e) return false;
        int mid = (s+e)/2;
        if(key == a[mid]) return true;
        else if (key > a[mid]) return bs(a, key, mid+1,e);
        else return bs(a, key, s,mid-1);
    }
}
