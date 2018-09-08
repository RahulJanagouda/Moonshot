package com.rj.datastructures.src.bitManipulation;

public class Bits {
    public static void intToBinary(int a) {
        StringBuilder sb = new StringBuilder();
        int b = a;

        for (int i = 0; i < Integer.SIZE; i++) {
            sb.append((a & 1) == 1 ? 1 : 0);
            a >>= 1;
        }

        String binaryRep = sb.reverse().toString();
        System.out.println("System   : " + Integer.toBinaryString(b));
        System.out.println("Computed : " + binaryRep);
    }

    public static void binaryToInt(String a) {
        int output = 0;
        char[] bits = a.toCharArray();

        for (int i = 0; i < bits.length; i++) {
            if (bits[i] == '1') {
                output += getMultiplicationFactorForIthPosition(bits.length - i -1);
            }
        }

        System.out.println("Integer :" + output);
    }

    public static int getMultiplicationFactorForIthPosition(int i) {
        return (int) Math.pow(2,  i);
    }
}
