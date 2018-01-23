package com.rj.practice.src;

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
}
