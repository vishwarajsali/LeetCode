package com.vishwaraj.OldFiles.src.main.java.code.Chapters.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


/**
 * PostorderTraversal
 */
public class PostorderTraversal {

    public static void main(String[] args) {
        
    }

    public static List<Integer> postorderTraversal(TreeNode root){
        java.util.List<Integer> list = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();

        TreeNode curr = root;
        while(curr!= null || !stack.isEmpty()){
            while(curr!=null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            list.add(curr.val);
            curr = curr.right;
        }

        return list;
    }
}

class TreeNode {

    TreeNode right, left;
    int val;

    TreeNode(int x){ val = x; }
}