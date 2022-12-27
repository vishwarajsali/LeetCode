package com.vishwaraj.OldFiles.src.main.java.code.Chapters.BinaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 *  Binary_Tree_Preorder_Traversal
 */
public class Binary_Tree_Preorder_Traversal {

    public static void main(String[] args) {

        
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();

        if(root == null) return list;

        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            list.add(curr.val);
            if(curr.right != null) stack.push(curr.right);
            if(curr.left!= null) stack.push(curr.left);
        }

        return list;
        
    }
}


class TreeNode {

    TreeNode right, left;
    int val;

    TreeNode(int x){ val = x; }
}