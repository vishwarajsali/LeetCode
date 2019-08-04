import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

import java.util.List;

/**
 * Traversal
 */
public class Traversal {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        
		/**
		 * Binary Tree in our example, height = 2
		 * 		1		(Root)
		 * 	  2	  3		(Level 1)
		 *  4    	 5		(Level 2)
		 */
        
		tree.root = new TreeNode(1);
		tree.root.left = new TreeNode(2);
		tree.root.right = new TreeNode(3);
		tree.root.left.left = new TreeNode(4);
		tree.root.right.left = new TreeNode(5);


       System.out.println( Arrays.toString(preorderTraversal(tree.root).toArray()));
       System.out.println( Arrays.toString(inorderTraversal(tree.root).toArray()));
       System.out.println( Arrays.toString(postorderTraversal(tree.root).toArray()));

    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();

        if(root == null) return result;

        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            result.add(curr.val);
            if(curr.right != null) stack.push(curr.right);
            if(curr.left != null) stack.push(curr.left);
            
        }

        return result;
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode p = root;
        while(p!= null){
            stack.push(p);
            p = p.left;
        }

        while (!stack.empty()) {
            TreeNode curr = stack.pop();
            result.add(curr.val);

            curr = curr.right;
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
        }

        return result;
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode p = root;
        while(p != null){
            stack.push(p);
            p = p.right;
        }

        while (!stack.empty()) {
            TreeNode curr = stack.pop();
            result.add(curr.val);

            curr = curr.left;
            while(curr != null){
                stack.push(curr);
                curr = curr.right;
            }
        }

        return result;
    }
}

