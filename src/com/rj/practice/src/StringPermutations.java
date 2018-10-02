package com.rj.practice.src;

import java.util.ArrayList;
import java.util.HashMap;

public class StringPermutations {
    public static void permutations(String string){
        permutations(string,"");
    }

    private static void permutations(String string, String prefix) {
        if(string.length() ==0){
            System.out.println(prefix);
        } else {
            for (int i = 0; i < string.length(); i++) {
                String rem = string.substring(0,i) + string.substring(i+1);
                permutations(rem,prefix + string.charAt(i));
            }
        }
    }


    static ArrayList<String> getPerms(String s){
        ArrayList<String> list = new ArrayList<>();
        return getPerms(s,"",list);
    }

    static ArrayList<String> getPerms(String s, String r, ArrayList<String> list){
        if(s.length() == 0){
            list.add(r);
            System.out.println(r);
        }

        for(int i =0; i < s.length(); i++){
            getPerms(s.substring(0,i) + s.substring(i+1, s.length()), r+s.charAt(i), list);
        }
        return list;
    }

    static void getPermsDistinct(String s){
        HashMap<Character, Integer> counts = getCounts(s);
        System.out.println(counts);
        getPermsDistinct(counts,"",s.length());
    }

    static void getPermsDistinct(HashMap<Character, Integer> counts,String prefix, int remaining){
        if(remaining ==0){
            System.out.println(prefix);
            return;
        }

        for(Character c : counts.keySet()){
            int charCount = counts.get(c);
            if(charCount > 0){
                counts.put(c,charCount -1);
                getPermsDistinct(counts, prefix+c, remaining - 1);
                counts.put(c,charCount);
            }
        }
    }

    static HashMap<Character, Integer>  getCounts(String s){
        HashMap<Character, Integer> counts = new HashMap<>();
        for(Character c : s.toCharArray()){
            if(!counts.containsKey(c)){
                counts.put(c,0);
            }
            counts.put(c,counts.get(c)+1);
        }
        return counts;
    }
}
