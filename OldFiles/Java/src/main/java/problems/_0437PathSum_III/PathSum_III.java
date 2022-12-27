package com.vishwaraj.OldFiles.Java.src.main.java.problems._0437PathSum_III;


import com.vishwaraj.OldFiles.Java.src.main.java.LeetCodeLib.TreeNode;

/**
 * PathSum_III
 */
public class PathSum_III {

    public static void main(String[] args) {
        int[] nums = {10,5,-3,3,2,11,3,-2,1};
        TreeNode root = new TreeNode();

        root.creatBTarray(nums);
        System.out.println(pathSum(root, 8));
        //root.preorder();
        print(root);


    }

    public static int pathSum(TreeNode root, int sum) {
       return 0;
    }

    public static void print(TreeNode root){
        if (root != null) {
            print(root.left);
            System.out.println(root.val);
            print(root.right);
        }
    }

    


}