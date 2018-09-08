package com.rj.datastructures.src.tree;


public class BinarySearchTree {

    private BinaryTreeNode root;

    public BinarySearchTree(BinaryTreeNode root) {
        this.root = root;
    }

    private BinarySearchTree() {
        this.root = null;
    }

    public BinarySearchTree(int rootData) {
        this(new BinaryTreeNode(rootData));
    }

    public void insertRighMost(int nodeData) {
        BinaryTreeNode a = root;
        while (a.getRight() != null) {
            a = a.getRight();
        }
        BinaryTreeNode node = new BinaryTreeNode(nodeData);

        a.setRight(node);
    }

    public void insertLeftFirstRighMost(int nodeData) {
        BinaryTreeNode a = root;

        if (a.getLeft() != null) {
            a = a.getLeft();
        }

        while (a.getRight() != null) {
            a = a.getRight();
        }
        BinaryTreeNode node = new BinaryTreeNode(nodeData);

        a.setRight(node);
    }

    public void insert(int nodeData) {
        insertHelper(getRoot(), nodeData);
    }

    public void insertHelper(BinaryTreeNode node, int nodeData) {
        if (node.getData() < nodeData) {
            if (node.getRight() == null) {
                node.setRight(new BinaryTreeNode(nodeData));
            } else {
                insertHelper(node.getRight(), nodeData);
            }
        } else {
            if (node.getLeft() == null) {
                node.setLeft(new BinaryTreeNode(nodeData));
            } else {
                insertHelper(node.getLeft(), nodeData);
            }
        }

    }


    public void setRoot(BinaryTreeNode root) {
        this.root = root;
    }

    public BinaryTreeNode getRoot() {
        return root;
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

    public static boolean isValidBST(BinaryTreeNode root) {
        return isValidBstHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isValidBstHelper(BinaryTreeNode node, int min, int max) {
        if (node == null) return true;

//        if (node.getLeft() != null) {
//            if (!(node.getData() >= node.getLeft().getData()) || node.getData() < min)
//                return false;
//        }
//
//        if (node.getRight() != null) {
//            if (!(node.getData() < node.getRight().getData()) || node.getData() >= max)
//                return false;
//        }

        if (node.getData() <= min || node.getData() > max) return false;

        return isValidBstHelper(node.getLeft(), min, node.getData())
                && isValidBstHelper(node.getRight(), node.getData(), max);
    }

    public void dfs(BinaryTreeNode root) {

        if (root == null) {
            return;
        }
        System.out.println(root.getData());

        dfs(root.getLeft());
        dfs(root.getRight());

    }

    private void printNode(BinaryTreeNode root) {
        if (root != null) {
            System.out.println(root.getData());
        }
    }

    public void inorderTraversal(BinaryTreeNode root) {
        if (root != null) {
            inorderTraversal(root.getLeft());
            printNode(root);
            inorderTraversal(root.getRight());
        }
    }

    public void preorderTraversal(BinaryTreeNode root) {
        if (root != null) {
            printNode(root);
            preorderTraversal(root.getLeft());
            preorderTraversal(root.getRight());
        }
    }

    public void postorderTraversal(BinaryTreeNode root) {
        if (root != null) {
            postorderTraversal(root.getLeft());
            postorderTraversal(root.getRight());
            printNode(root);
        }
    }

}
