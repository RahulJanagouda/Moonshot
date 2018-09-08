package com.rj.practice.src;

import java.util.Arrays;
import java.util.HashMap;

public class TwoStringPermutation {

    //    space : O(m+n) & time : O(2m+n)
    public static boolean areStringsPermutation(String a, String b) {
        if (a.length() != b.length()) return false;
        HashMap<Character, Integer> aCount = new HashMap();
        HashMap<Character, Integer> bCount = new HashMap();
        for (int i = 0; i < a.length(); i++) {
            if (aCount.containsKey(a.charAt(i))) {
                aCount.put(a.charAt(i), 1 + aCount.get(a.charAt(i)));
            } else {
                aCount.put(a.charAt(i), 1);
            }
        }

        for (int i = 0; i < b.length(); i++) {
            if (bCount.containsKey(b.charAt(i))) {
                bCount.put(b.charAt(i), 1 + bCount.get(b.charAt(i)));
            } else {
                bCount.put(b.charAt(i), 1);
            }
        }

        if (aCount.keySet().size() != bCount.keySet().size()) return false;

        for (Character k : aCount.keySet()) {
            if (bCount.get(k) != aCount.get(k)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPermutationOptimal(String a, String b) {
        if (a.length() != b.length()) return false;

        if (a.length() == 0 && b.length() == 0) return true;
        char[] aChars = a.toCharArray();
        char[] bChars = a.toCharArray();
        Arrays.sort(aChars);
        Arrays.sort(bChars);

        return Arrays.equals(aChars, bChars);
    }
}
