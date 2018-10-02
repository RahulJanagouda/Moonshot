package com.rj.practice.src;

import java.util.ArrayList;
import java.util.Arrays;

public class CountIslands {
    public static void test() {
        boolean[][] a = new boolean[3][3];
        helper(a);
        System.out.println(Arrays.toString(a[0]));
        System.out.println(Arrays.toString(a[1]));
        System.out.println(Arrays.toString(a[2]));
    }

    private static void helper(boolean[][] a) {
        a[1][2] = true;
    }


    public static int black(ArrayList<String> A) {
        int count = 0;

        char[][] matrix = new char[A.size()][A.get(0).length()];
        boolean[][] isVisited = new boolean[A.size()][A.get(0).length()];

        for (int i = 0; i < A.size(); i++) {
            String s = A.get(i);
            for (int j = 0; j < s.length(); j++) {
                matrix[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 'X' && !isVisited[i][j]) {
                    markVisitedDFS(matrix, isVisited, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    public static void markVisitedDFS( char[][] matrix, boolean[][] isVisited, int i, int j) {
        if (i < 0 || j < 0 || i >= isVisited.length || j >= isVisited[i].length) {
            return;
        }
        if (isVisited[i][j] ||matrix[i][j] == 'O'){
            return;
        }
        isVisited[i][j] = true;

        markVisitedDFS(matrix, isVisited, i + 1, j);
        markVisitedDFS(matrix, isVisited, i - 1, j);
        markVisitedDFS(matrix, isVisited, i, j + 1);
        markVisitedDFS(matrix, isVisited, i, j - 1);
    }
}
