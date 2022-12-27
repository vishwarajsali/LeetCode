package com.vishwaraj.OldFiles.Java.src.main.java.LeetCodeLib;

/**
 * TreeNode
 */
public class TreeNode {

    public int val;
    public TreeNode left, right, root = null;

    public TreeNode(int x) {
        this.val = x;
    }

    public TreeNode() {}
    
    public void insertNode(int key) {
        this.root = insertNode(this.root, key);
    }

    TreeNode insertNode(TreeNode root, int key) {
        if (root == null) {
            root = new TreeNode(key);
            return root;
        }

        if (key < root.val) {
            root.left = insertNode(root.left, key);
        } else {
            root.right = insertNode(root.right, key);
        }

        return root;
    }

    public void inorder() {
        inorder(this.root);
    }

    void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.val);
            inorder(root.right);
        }
    }

    public void preorder() {
        preorder(this.root);
    }

    void preorder(TreeNode root) {
        if (root != null) {
            System.out.println(root.val);
            preorder(root.left);
            preorder(root.right);
        }
    }


    public void creatBTarray(int[] array) {

        for (int i : array) {
            this.root = insertNode(this.root, i);
        }

    }

    public void sortedArrayToBST(int arr[]){
        this.root = sortedArrayToBST(arr, 0, arr.length-1);
    }

    TreeNode sortedArrayToBST(int arr[], int start, int end) { 

        if (start > end) { 
            return null; 
        } 
  
        int mid = (start + end) / 2; 
        TreeNode node = new TreeNode(arr[mid]); 
  
        node.left = sortedArrayToBST(arr, start, mid - 1); 
  
        node.right = sortedArrayToBST(arr, mid + 1, end); 
          
        return node; 
    } 

}