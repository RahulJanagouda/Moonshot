package com.rj.Grab;

public class Sol {

    public int solution(int A, int B) {
        // write your code in Java SE 8
        int count = 0;
        for (int i = A; i <= B; i++) {
            for (int j = 0; j * j <= i; j++) {
                if (j * j == i)
                    count++;
            }
        }
        return count;
    }
}
