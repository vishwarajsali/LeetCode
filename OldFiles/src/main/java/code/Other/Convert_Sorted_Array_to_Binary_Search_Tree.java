package com.vishwaraj.OldFiles.src.main.java.code.Other;

import com.vishwaraj.OldFiles.src.main.java.code.Explore.BinaryTree.TreeNode;

/**
 * Convert_Sorted_Array_to_Binary_Search_Tree
 */
public class Convert_Sorted_Array_to_Binary_Search_Tree {

    public static void main(String[] args) {
        
    }

    public static com.vishwaraj.OldFiles.src.main.java.code.Explore.BinaryTree.TreeNode sortedArrayToBST(int[] nums) {
        BinaryTree tree = new BinaryTree();
        int i = 0;
        tree.root =  insert(nums, tree.root, index);    
    }

    public com.vishwaraj.OldFiles.src.main.java.code.Explore.BinaryTree.TreeNode insert(int[] array, com.vishwaraj.OldFiles.src.main.java.code.Explore.BinaryTree.TreeNode root, int index){

        if(index < array.length){
            com.vishwaraj.OldFiles.src.main.java.code.Explore.BinaryTree.TreeNode temp = new com.vishwaraj.OldFiles.src.main.java.code.Explore.BinaryTree.TreeNode();
            temp.root = temp;
        }
    }
}