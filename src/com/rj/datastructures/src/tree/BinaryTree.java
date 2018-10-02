package com.rj.datastructures.src.tree;

import com.rj.microsoft.src.Solution;

import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

    private BinaryTreeNode root;

    public BinaryTree(BinaryTreeNode root) {
        setRoot(root);
    }

    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(int rootData) {
        this(new BinaryTreeNode(rootData));
    }

    public BinaryTreeNode getRoot() {
        return root;
    }

    public void setRoot(BinaryTreeNode root) {
        this.root = root;
    }

    public void insertNew(int parentData, int childData) {
        if (root == null) {
            root = new BinaryTreeNode(parentData);
            root.setLeft(new BinaryTreeNode(childData));
        }
        BinaryTreeNode temp = findNode(root, parentData);
        if (temp != null) {
            if (temp.getLeft() == null) {
                temp.setLeft(new BinaryTreeNode(childData));
            } else {
                temp.setRight(new BinaryTreeNode(childData));
            }
        }
    }

    public BinaryTreeNode findNode(BinaryTreeNode root, int parentData) {
        if (root == null || root.getData() == parentData) {
            return root;
        }

        if (root.getLeft() == null && root.getRight() == null) {
            return null;
        }

        BinaryTreeNode a = findNode(root.getLeft(), parentData);

        if (a == null) {
            return findNode(root.getRight(), parentData);
        }

        return a;

    }

    public StringBuilder inOrderTraversal(BinaryTreeNode root, StringBuilder sb) {
        if (root != null) {
            inOrderTraversal(root.getLeft(), sb);
            sb.append(root.getData());
            inOrderTraversal(root.getRight(), sb);
        }
        return sb;
    }


    public void preOrderTraversal(BinaryTreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("X");
            return;
        }

            sb.append(node.getData());
            preOrderTraversal(node.getLeft(), sb);
            preOrderTraversal(node.getRight(), sb);
    }


    public StringBuilder postOrderTraversal(BinaryTreeNode root, StringBuilder sb) {
        if (root != null) {
            postOrderTraversal(root.getLeft(), sb);
            postOrderTraversal(root.getRight(), sb);
            sb.append(root.getData());
        }
        return sb;
    }

    public static void printLineByLineBinaryTree(BinaryTreeNode root){
        Stack<String> stack = new Stack<>();
        printHelper(root, stack);
    }

    private static void printHelper(BinaryTreeNode n, Stack<String> stack) {
        if(n==null) return;

        stack.push(n.getData()+"");

        if(n.getLeft() == null && n.getRight() == null){
            System.out.println(stack);
        }

        printHelper(n.getLeft(), stack);
        printHelper(n.getRight(), stack);
        stack.pop();
    }


    public void printTree() {
        printTreeHelper(getRoot(), 0);
    }

    public void printTreeHelper(BinaryTreeNode root, int level) {
        if (root != null) {
            printTreeHelper(root.getRight(), ++level);


            for (int i = 0; i < level; i++) {
                System.out.print("   ");
            }

            System.out.println(root.getData());
            printTreeHelper(root.getLeft(), level);

        }
    }
}
