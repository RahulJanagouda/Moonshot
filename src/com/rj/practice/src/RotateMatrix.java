package com.rj.practice.src;

public class RotateMatrix {
    public static int[][] byNintyDegreeClockwise(int[][] m) {
        if (m.length != m[0].length) return null;

        int n = m.length;

        for (int layer = 0; layer < n / 2; layer++) {

            int first = layer;
            int last = n - 1 - layer;

            for (int i = first; i < last; i++) {

                int offset = i - first;
                int top = m[first][i];

                m[first][i] = m[last - offset][first];

                m[last - offset][first] = m[last][last - offset];

                m[last][last - offset] = m[i][last];

                m[i][last] = top;

            }
        }

        return m;
    }
}
