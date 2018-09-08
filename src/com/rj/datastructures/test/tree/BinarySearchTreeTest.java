package com.rj.datastructures.test.tree;

import com.rj.datastructures.src.tree.BinarySearchTree;
import com.rj.datastructures.src.tree.BinaryTreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class BinarySearchTreeTest {

    @Test
    void testValidityOfBinarySearchTree() {
        BinarySearchTree bst = new BinarySearchTree(5);
        bst.insert(2);
        bst.insert(6);
        bst.insert(4);
        bst.insert(5);
        bst.insert(7);
        bst.insert(3);
        bst.insert(9);
        bst.insert(8);
        bst.insert(10);
        bst.insert(1);
        bst.insert(0);
        bst.insert(6);
        bst.insert(1);

//        bst.insertRighMost(3);
//        bst.insertLeftFirstRighMost(6);
//        bst.insertRighMost(2);
//        bst.insertRighMost(1);
        bst.printTree();

        assertTrue(BinarySearchTree.isValidBST(bst.getRoot()));
//        assertTrue(BinarySearchTree.isValidBST(bst.getRoot()));
    }

    @Test
    void testBinarySearchTree() {

        BinaryTreeNode root = new BinaryTreeNode(1);
        root.setLeft(new BinaryTreeNode(2));
        root.setRight(new BinaryTreeNode(3));

        root.getLeft().setLeft(new BinaryTreeNode(4));
        root.getLeft().setRight(new BinaryTreeNode(5));

        root.getRight().setLeft(new BinaryTreeNode(6));
        root.getRight().setRight(new BinaryTreeNode(7));

        root.getLeft().getLeft().setLeft(new BinaryTreeNode(8));
        root.getLeft().getLeft().setRight(new BinaryTreeNode(9));
        root.getLeft().getRight().setLeft(new BinaryTreeNode(11));
        root.getLeft().getRight().setRight(new BinaryTreeNode(12));

        root.getRight().getLeft().setLeft(new BinaryTreeNode(13));
        root.getRight().getLeft().setRight(new BinaryTreeNode(14));
        root.getRight().getRight().setLeft(new BinaryTreeNode(15));
        root.getRight().getRight().setRight(new BinaryTreeNode(16));

        BinarySearchTree bst = new BinarySearchTree(root);

        bst.printTreeHelper(bst.getRoot(), 0);

    }

    @Test
    void testBinarySearchTree_2() {


        BinarySearchTree bst = new BinarySearchTree(5);
        bst.insert(2);
        bst.insert(6);
        bst.insert(4);
        bst.insert(5);
        bst.insert(7);
        bst.insert(3);
        bst.insert(9);
        bst.insert(8);
        bst.insert(10);
        bst.insert(1);
        bst.insert(0);
        bst.insert(6);
        bst.insert(1);

//        bst.inorderTraversal(bst.getRoot());
//        System.out.println("__________________________________");
//        bst.postorderTraversal(bst.getRoot());
//        System.out.println("__________________________________");
        bst.preorderTraversal(bst.getRoot());
        System.out.println("__________________________________");
//        bst.printTree();
//        System.out.println("__________________________________");
        bst.dfs(bst.getRoot());

    }

}