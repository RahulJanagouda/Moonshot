package com.rj.appliedCs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Anagram {

    public static boolean isAnagram(String base, String check) {
        HashMap<Character, Integer> baseMap = new HashMap<>();

        if (check.length() != base.length()) {
            return false;
        }

        for (Character c : base.toCharArray()) {
            if (baseMap.containsKey(c)) {
                baseMap.put(c, baseMap.get(c) + 1);
            } else {
                baseMap.put(c, 1);
            }
        }

        for (Character c : check.toCharArray()) {
            if (baseMap.containsKey(c)) {
                baseMap.put(c, baseMap.get(c) - 1);
            } else {
                return false;
            }
        }

        for (Map.Entry i :
                baseMap.entrySet()) {
            if ((Integer) i.getValue() < 0) return false;
        }
        return true;
    }
}
