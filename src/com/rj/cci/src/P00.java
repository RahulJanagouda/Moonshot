package com.rj.cci.src;

public class P00 {
    class Node {
        int data;
        Node left;
        Node right;

    }

    boolean checkBST(Node root) {
        return check(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    boolean check(Node n, int min, int max) {
        return n == null || n.data > min && n.data < max && check(n.left, min, n.data) && check(n.right, n.data, max);
    }


//    boolean checkBST(Node root) {
//        if (root == null) return true;
//        System.out.println(root.data);
//        return isLeftBinary(root) && isRightBinary(root);
//    }

    boolean isLeftBinary(Node root){
        if(root.left == null) return true;
        return (root.data > root.left.data) && checkBST(root.left);
    }

    boolean isRightBinary(Node root){
        if(root.right == null) return true;
        return (root.data < root.right.data) && checkBST(root.right);
    }

    boolean checkBST2(Node root) {
        return isLeftSideBinary(root) && isRightSideBinary(root);
//        return root == null || (root.left == null || root.data > root.left.data) && (root.right == null || root.data < root.right.data);
    }

    boolean isLeftSideBinary(Node node) {

        if (node == null)
            return false;

        if (node.left == null)
            return true;
//        return node == null || node.data > node.left.data && isLeftSideBinary(node.left);
        return (node.data > node.left.data) && checkBST(node.left);
    }

    boolean isRightSideBinary(Node node) {
        if (node == null)
            return false;

        if (node.right == null)
            return true;
        return (node.data < node.right.data) && checkBST(node.right);
//        return node == null || node.right == null || node.data < node.right.data && isRightSideBinary(node.right);
    }
}
