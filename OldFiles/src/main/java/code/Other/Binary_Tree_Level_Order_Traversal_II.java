package com.vishwaraj.OldFiles.src.main.java.code.Other;

import com.vishwaraj.OldFiles.src.main.java.code.Explore.BinaryTree.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/**
 * Binary_Tree_Level_Order_Traversal_II
 */
public class Binary_Tree_Level_Order_Traversal_II {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new com.vishwaraj.OldFiles.src.main.java.code.Explore.BinaryTree.TreeNode(3);
        tree.root.left = new com.vishwaraj.OldFiles.src.main.java.code.Explore.BinaryTree.TreeNode(9);
        tree.root.right = new com.vishwaraj.OldFiles.src.main.java.code.Explore.BinaryTree.TreeNode(20);
        tree.root.right.left = new com.vishwaraj.OldFiles.src.main.java.code.Explore.BinaryTree.TreeNode(15);
        tree.root.right.right = new com.vishwaraj.OldFiles.src.main.java.code.Explore.BinaryTree.TreeNode(7);

        System.out.println(Arrays.toString(levelOrderBottom(tree.root).toArray()) );
    }

    public static List<List<Integer>> levelOrderBottom(com.vishwaraj.OldFiles.src.main.java.code.Explore.BinaryTree.TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        Queue<com.vishwaraj.OldFiles.src.main.java.code.Explore.BinaryTree.TreeNode> q = new LinkedList<>();
        q.add(root);
        while(true){
            int nodecount = q.size();
            if(nodecount == 0) break;
            List<Integer> subList = new ArrayList<Integer>();

            while(nodecount > 0){
                com.vishwaraj.OldFiles.src.main.java.code.Explore.BinaryTree.TreeNode curr = q.peek();
                subList.add(curr.val);
                q.remove();
                if(curr.left!= null) q.add(curr.left);
                if(curr.right!= null) q.add(curr.right);

                nodecount --;
            }
            list.add(0,subList);
        }

        return list;
    }
}