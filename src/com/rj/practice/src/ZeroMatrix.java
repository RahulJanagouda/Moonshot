package com.rj.practice.src;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class ZeroMatrix {
    public static int[][] makeZeros(int[][] m) {

        List<Pair<Integer, Integer>> pairs = new ArrayList<>();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 0) {
                    pairs.add(new Pair<>(i, j));
                }
            }
        }

        pairs.forEach(p -> {
            int i = p.getKey();
            int j = p.getValue();
            for (int col = 0; col < m[i].length; col++) {
                m[i][col] = 0;
            }
            for (int row = 0; row < m.length; row++) {
                m[row][j] = 0;
            }
        });
        return m;
    }
}
