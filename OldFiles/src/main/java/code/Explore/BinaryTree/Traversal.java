package com.vishwaraj.OldFiles.src.main.java.code.Explore.BinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;



/**
 * Traversal
 */
public class Traversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);

        Traversal traversal = new Traversal();

        //System.out.println(traversal.preorderTraversal(root));
        //System.out.println(traversal.inorderTraversal(root));
        //System.out.println(traversal.postorderTraversal(root));
        System.out.println(traversal.levelOrder(root));
    }

    public List<Integer> preorderTraversal(TreeNode root) {

         
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root == null) return list;
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();

            list.add(temp.val);

            if(temp.right!= null) stack.push(temp.right);
            if(temp.left!= null) stack.push(temp.left);

        }

        return list;
    }

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()){
            while (curr!= null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();

            list.add(curr.val);
            curr = curr.right;
        }

        return list;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
     
        
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null) return list;
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            list.add(0, curr.val);
            if (curr.left != null) {
                stack.add(curr.left);
              }
              if (curr.right != null) {
                stack.add(curr.right);
              }
        }

        return list;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<Integer> list1;
        List<List<Integer>> list = new LinkedList<>();

       Queue<TreeNode> queue = new LinkedList<>();
       if(root == null) return list;

       queue.offer(root);
       while(!queue.isEmpty()){
           int level = queue.size();
           list1 = new LinkedList<>();
           for(int i = 0; i< level; i++){
               if(queue.peek().left != null) queue.offer(queue.peek().left);
               if(queue.peek().right != null) queue.offer(queue.peek().right);
               list1.add(queue.poll().val);
           }
           list.add(list1);
       }
       
    
        return list;
    }
}