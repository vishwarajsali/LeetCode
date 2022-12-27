package com.vishwaraj.OldFiles.Java.src.main.java.problems._0226InvertBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

import com.vishwaraj.OldFiles.Java.src.main.java.LeetCodeLib.TreeNode;

/**
 * InvertBinaryTree
 */
class InvertBinaryTree {

    public static void main(String[] args) {
    
        TreeNode bs = new TreeNode();

        int[] array = {4,2,7,1,3,6,9};

        bs.creatBTarray(array);
        invertTree(bs).preorder();

    }

    public static TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }

    public static TreeNode invertTree1(TreeNode root) {
        
        if(root == null) return null;
        Queue<TreeNode> queue = new LinkedList<> ();
        queue.add(root);

        while(! queue.isEmpty()){

            TreeNode curr  = queue.poll();

            TreeNode temp = curr.left;

            curr.right = curr.left;
            curr.left = temp;
            if(curr.left != null) queue.add(curr.left);
            if(curr.right != null) queue.add(curr.right);
        }
        
        return root;
    }

    
    
}