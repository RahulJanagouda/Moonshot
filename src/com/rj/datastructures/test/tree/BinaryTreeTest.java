package com.rj.datastructures.test.tree;

import com.rj.datastructures.src.tree.BinarySearchTree;
import com.rj.datastructures.src.tree.BinaryTree;
import com.rj.datastructures.src.tree.FindCommonDescendantsInATree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void testPrint(){

        BinaryTree bt = new BinaryTree();
        bt.insertNew(1,2);
        bt.insertNew(1,3);

        bt.insertNew(2,4);
        bt.insertNew(2,5);

        bt.insertNew(3,6);
        bt.insertNew(3,9);

        bt.insertNew(4,7);
        bt.insertNew(4,8);

        bt.insertNew(9,12);
        bt.insertNew(7,10);

        bt.printTree();
    }

    @Test
    void testprintLineByLineBinaryTree(){
        BinaryTree bt = new BinaryTree();
        bt.insertNew(1,2);
        bt.insertNew(1,3);

        bt.insertNew(2,4);
        bt.insertNew(2,5);

        bt.insertNew(3,6);
        bt.insertNew(3,9);

        bt.insertNew(4,7);
        bt.insertNew(4,8);

        bt.insertNew(9,12);
        bt.insertNew(7,10);

        bt.printTree();

        BinaryTree.printLineByLineBinaryTree(bt.getRoot());
    }

}