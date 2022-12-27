package com.vishwaraj.OldFiles.src.main.java.code.Java;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Same_Tree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        else if (p != null && q != null){
            return (p.val == q.val 
                    && isSameTree(p.left, q.left)
                    && isSameTree(p.right, q.right));
        } else return false;
    }
}

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 