package com.vishwaraj.OldFiles.Java.src.main.java.problems._0543DiameterofBinaryTree;

import com.vishwaraj.OldFiles.Java.src.main.java.LeetCodeLib.TreeNode;

/**
 * DiameterofBinaryTree
 */
public class DiameterofBinaryTree {

    public static void main(String[] args) {
        
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;

        depth(root);
        return path -1;
    }
    
    int path = 1;
    
    private int depth(TreeNode root){
        if(root == null) return 0;
        
        int left = depth(root.left);
        int right = depth(root.right);
        
        path = Math.max(path, left+ right+1);
        
        return Math.max(left, right) +1;
        
    }
}