package com.rj.microsoft.src;

public class Solution {

    public static int maxDifference(int[] a) {
        if (a.length < 2) {
            return -1;
        }
        int maxDifference = -1;
        int minElement = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] - minElement > maxDifference)
                maxDifference = a[i] - minElement;
            if (a[i] < minElement && minElement != -1)
                minElement = a[i];
        }
        return maxDifference;
    }

    public static int maxDiff(int[] a) {
        int maxDiff = a[1] - a[0];
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] - a[i] > maxDiff)
                    maxDiff = a[j] - a[i];
            }
        }
        return maxDiff;
    }

    class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }

        public void setLeft(Node n) {
            left = n;
        }

        public void setRight(Node n) {
            right = n;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }

        public void setData(int d) {
            data = d;
        }

        public int getData() {
            return data;
        }
    }
    public void setup(String s){


        return  ;
    }
    public class BinaryTree {
        Node root;



        public void insert(int parentData, int childData) {

            if (root == null) {
                root = new Node(parentData);
                root.setLeft(new Node(childData));
            } else if (search(parentData)) {
                if (find(parentData).getLeft() == null) find(parentData).setLeft(new Node(childData));
                else if (find(parentData).getRight() == null) find(parentData).setRight(new Node(childData));
            }
        }

        public void insert(int data) {
            root = insert(root, data);
        }

        /* Function to insert data recursively */
        private Node insert(Node node, int data) {
            if (node == null)
                node = new Node(data);
            else {
                if (node.getRight() == null)
                    node.right = insert(node.right, data);
                else
                    node.left = insert(node.left, data);
            }
            return node;
        }

        public Node find(int val) {
            return find(root, val);
        }

        private Node find(Node root, int val) {
            if (root.getData() == val)
                return root;
            if (root.getLeft() != null)
                if (search(root.getLeft(), val))
                    return root;
            if (root.getRight() != null)
                if (search(root.getRight(), val))
                    return root;
            return null;
        }

        public boolean search(int val) {
            return search(root, val);
        }

        private boolean search(Node r, int val) {
            if (r.getData() == val)
                return true;
            if (r.getLeft() != null)
                if (search(r.getLeft(), val))
                    return true;
            if (r.getRight() != null)
                if (search(r.getRight(), val))
                    return true;
            return false;
        }


        int longestPath() {
            return longestPath(root);
        }

        int longestPath(Node root) {

            if (root == null) return 0;

            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            int leftLength = longestPath(root.left);
            int rightLength = longestPath(root.right);

            return Math.max(leftHeight + rightHeight + 1, Math.max(leftLength, rightLength));
        }


        private int height(Node node) {
            if (node == null) return 0;
            return (1 + Math.max(height(node.left), height(node.right)));
        }
    }
}
