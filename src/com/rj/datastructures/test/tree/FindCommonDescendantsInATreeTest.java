package com.rj.datastructures.test.tree;

import com.rj.datastructures.src.tree.BinaryTree;
import com.rj.datastructures.src.tree.BinaryTreeNode;
import com.rj.datastructures.src.tree.FindCommonDescendantsInATree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindCommonDescendantsInATreeTest {

    @Test
    void find() {
        BinaryTree bt = new BinaryTree();
        bt.insertNew(1, 2);
        bt.insertNew(1, 3);

        bt.insertNew(2, 4);
        bt.insertNew(2, 5);

        bt.insertNew(3, 6);
        bt.insertNew(3, 9);

        bt.insertNew(4, 7);
        bt.insertNew(4, 8);

        bt.insertNew(9, 12);
        bt.insertNew(7, 10);
        bt.insertNew(10, 19);

        bt.insertNew(5, 21);
        bt.insertNew(21, 22);

        bt.printTree();

        BinaryTreeNode common =
                FindCommonDescendantsInATree.findHelper(
                        bt.getRoot(),
                        bt.findNode(bt.getRoot(), 21),
                        bt.findNode(bt.getRoot(), 8));

//        BinaryTreeNode common = bt.findNode(bt.getRoot(), 12);
        System.out.println(common.getData());
    }


    @Test
    void isSubtree() {
        BinaryTree bt = new BinaryTree();
        bt.insertNew(1, 2);
        bt.insertNew(1, 3);

        bt.insertNew(2, 4);
        bt.insertNew(2, 5);

        bt.insertNew(3, 6);
        bt.insertNew(3, 9);

        bt.insertNew(4, 7);
        bt.insertNew(4, 8);

        bt.insertNew(9, 12);
        bt.insertNew(7, 10);
        bt.insertNew(10, 19);

        bt.insertNew(5, 21);
        bt.insertNew(21, 22);


        bt.printTree();

        StringBuilder sb = new StringBuilder();
        bt.inOrderTraversal(bt.getRoot(), sb);
        System.out.println(sb.toString());

        StringBuilder sb3 = new StringBuilder();
        bt.preOrderTraversal(bt.getRoot(), sb3);
        System.out.println(sb3.toString());

        StringBuilder sb5 = new StringBuilder();
        bt.postOrderTraversal(bt.getRoot(), sb5);
        System.out.println(sb5.toString());

//        Uncomment the below line to undo the subtree
//        bt.insertNew(12, 120);


        StringBuilder sb2 = new StringBuilder();
        bt.inOrderTraversal(bt.findNode(bt.getRoot(), 3), sb2);
        System.out.println(sb2.toString());


        StringBuilder sb4 = new StringBuilder();
        bt.preOrderTraversal(bt.findNode(bt.getRoot(), 3), sb4);
        System.out.println(sb4.toString());


        StringBuilder sb6 = new StringBuilder();
        bt.postOrderTraversal(bt.findNode(bt.getRoot(), 3), sb6);
        System.out.println(sb6.toString());

        assertTrue(sb.toString().contains(sb2.toString()));
        assertTrue(sb3.toString().contains(sb4.toString()));
        assertTrue(sb5.toString().contains(sb6.toString()));

    }

}