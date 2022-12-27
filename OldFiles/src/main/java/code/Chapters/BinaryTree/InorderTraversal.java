package com.vishwaraj.OldFiles.src.main.java.code.Chapters.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


/**
 * InorderTraversal
 */
public class InorderTraversal {

    public static void main(String[] args) {
        
    }

    public static List<Integer> inorderTraversal(TreeNode root){
        List<Integer> list = new ArrayList<Integer>();

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode curr = root;

        while(curr!=null || !stack.empty()){
            while(curr!=null){
                stack.add(curr);
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