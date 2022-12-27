package com.vishwaraj.OldFiles.src.main.java.code.Other;

import com.vishwaraj.OldFiles.src.main.java.code.Explore.BinaryTree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Maximum_Depth_of_Binary_Tree
 */
public class Maximum_Depth_of_Binary_Tree {

 
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

		/**
		 * Binary Tree in our example, height = 2
		 * 		1		(Root)
		 * 	  2	  3		(Level 1)
		 *  4    	 5		(Level 2)
		 */
        
		tree.root = new com.vishwaraj.OldFiles.src.main.java.code.Explore.BinaryTree.TreeNode(1);
		tree.root.left = new com.vishwaraj.OldFiles.src.main.java.code.Explore.BinaryTree.TreeNode(2);
		tree.root.right = new com.vishwaraj.OldFiles.src.main.java.code.Explore.BinaryTree.TreeNode(3);
		tree.root.left.left = new com.vishwaraj.OldFiles.src.main.java.code.Explore.BinaryTree.TreeNode(4);
		tree.root.right.left = new com.vishwaraj.OldFiles.src.main.java.code.Explore.BinaryTree.TreeNode(5);

        System.out.println(maxDepthRecu(tree.root));
        System.out.println(maxDepthIter(tree.root));


    }

    public static int maxDepthRecu(com.vishwaraj.OldFiles.src.main.java.code.Explore.BinaryTree.TreeNode root) {

        if (root == null)
            return 0;
        int leftHeight = maxDepthRecu(root.left);
        int rightHeight = maxDepthRecu(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int maxDepthIter(com.vishwaraj.OldFiles.src.main.java.code.Explore.BinaryTree.TreeNode root) {

        if(root == null) return 0;

        Queue<com.vishwaraj.OldFiles.src.main.java.code.Explore.BinaryTree.TreeNode> q = new LinkedList<>();


        q.add(root);
        int height = 0;

        while (true) {
            int nodecount = q.size();
            if(nodecount == 0) return height;

            height++;

            while (nodecount > 0) {
                com.vishwaraj.OldFiles.src.main.java.code.Explore.BinaryTree.TreeNode curr = q.peek();
                q.remove();

                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
                nodecount --;
            }
        }
    }
}

