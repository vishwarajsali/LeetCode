package com.vishwaraj.OldFiles.Java.src.main.java.problems._0108ConvertSortedArraytoBinarySearchTree;

import com.vishwaraj.OldFiles.Java.src.main.java.LeetCodeLib.TreeNode;

/**
 * ConvertSortedArraytoBinarySearchTree
 */
public class ConvertSortedArraytoBinarySearchTree {

    public static void main(String[] args) {
        int[] nums ={-10,-3,0,5,9};
        sortedArrayToBST(nums).inorder();;
        
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        
        return sortedArrayToBST(nums, 0, nums.length-1);
    }

    private static TreeNode sortedArrayToBST(int[] nums, int left, int right){


        if(left > right) return null;
        int index = (left+right) /2;

        TreeNode root = new TreeNode(nums[index]);

        root.left = sortedArrayToBST(nums,left, index-1);
        root.right = sortedArrayToBST(nums,index+1, right);

        return root;
    }


}