package com.rj.microsoft.src;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    Node root;
    List<Node> temporaryHolders = new ArrayList<>();

    class Node {
        private int data;
        private Node left, right;

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


    public BinaryTree(String s) {
        String[] elements = s.substring(1, s.length() - 1).split("\\) \\(");
        for (String element : elements) {
            int parentData = Integer.parseInt(element.split(",")[0]);
            int childData = Integer.parseInt(element.split(",")[1]);
            insert(parentData, childData);
        }
        if (temporaryHolders.size() > 0)
            for (Node tempNode : temporaryHolders) {
                insert(tempNode);
            }
    }

    public int longestPath() {
        return longestPath(root);
    }

    private int longestPath(Node root) {

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

    private void insert(Node node) {
        Node searchedNode = search(node.data);
        searchedNode.setLeft(node.getLeft());
        searchedNode.setRight(node.getRight());
    }

    private void insert(int parentData, int childData) {

        if (root == null) {
            root = new Node(parentData);
            root.setLeft(new Node(childData));
        } else if (search(parentData) != null) {
            if (search(parentData).getLeft() == null) search(parentData).setLeft(new Node(childData));
            else if (search(parentData).getRight() == null) search(parentData).setRight(new Node(childData));
        } else {
            Node temp = new Node(parentData);
            temp.setLeft(new Node(childData));
            temporaryHolders.add(temp);
        }
    }

    private Node search(int data) {
        return search(root, data);
    }

    private Node search(Node r, int data) {
        if (r.getData() == data)
            return r;
        else if (search(r.getLeft(), data) != null) return search(r.getLeft(), data);
        else return search(r.getRight(), data);
    }


}
