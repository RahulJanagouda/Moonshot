package com.rj.cci.src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P03 {
    private Map<String, Integer> magazineMap = new HashMap<String, Integer>();
    private Map<String, Integer> noteMap = new HashMap<String, Integer>();

    public P03(String magazine, String note) {
        String[] m = magazine.split(" ");
        String[] n = note.split(" ");
        for (String aM : m) {
            if (magazineMap.get(aM) == null)
                magazineMap.put(aM, 1);
            else {
                magazineMap.put(aM, magazineMap.get(aM) + 1);
            }
        }

        for (String aN : n) {
            if (noteMap.get(aN) == null)
                noteMap.put(aN, 1);
            else {
                noteMap.put(aN, noteMap.get(aN) + 1);
            }
        }
    }

    public boolean solve() {

        for (String s :
                noteMap.keySet()) {
            if (magazineMap.get(s) < noteMap.get(s)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        P03 s = new P03(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if (answer)
            System.out.println("Yes");
        else System.out.println("No");

    }
}
