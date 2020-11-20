package com.rj.cci.src;

import java.util.Scanner;

public class P07 {

    public static void main(String[] args) {
        CustomTrie db = new CustomTrie();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int a0 = 0; a0 < n; a0++) {
            String op = in.next();
            String contact = in.next();

            switch (op) {
                case "add":
                    db.put(contact);
                    break;
                case "find":
                    System.out.println(db.get(contact));
                    break;
            }
        }
    }

    private static class CustomTrie {
        Node root;

        class Node {
            Character c;
            Node next;

            public Node(Character c) {
                this.c = c;
                next = null;
            }

        }

        public void put(String string) {
            Node pointer = root;
            char[] characterArray = string.toCharArray();
            for (char aCharacter : characterArray) {
                if (root == null) {
                    root = new Node(aCharacter);
                } else {
                    while (pointer.next != null) {
                        pointer = pointer.next;
                    }
                    pointer = new Node(aCharacter);
                }
            }
        }

        public boolean isChild(String s) {
            Node pointer = root;
            char[] characterArray = s.toCharArray();
            for (int i = 0; i < characterArray.length; i++) {
                if(pointer!=null && pointer.c ==characterArray[i]){
                    pointer = pointer.next;
                }
            }
            return false;
        }

        public boolean get(String string) {
            char[] characterArray = string.toCharArray();

            return false;
        }
    }
}
