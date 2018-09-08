package com.rj.datastructures.src.tree;

import com.rj.microsoft.src.Solution;
import com.sun.source.tree.BinaryTree;

public class FindCommonDescendantsInATree {

    public static BinaryTreeNode findHelper(BinaryTreeNode root, BinaryTreeNode n1, BinaryTreeNode n2) {

        if (root == null) return null;

        if (root == n1 || root == n2) return root;

        BinaryTreeNode leftPart = findHelper(root.getLeft(), n1, n2);
        BinaryTreeNode rightPart = findHelper(root.getRight(), n1, n2);

        if (leftPart != null && rightPart != null) return root;
        if (leftPart == null && rightPart == null) return null;

        return leftPart != null ? leftPart : rightPart;
    }
}
