package Explore.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Symmetric_Tree
 */
public class Symmetric_Tree {

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        
        Symmetric_Tree st = new Symmetric_Tree();
        System.out.println(st.isSymmetric(root));
    }

    public boolean isSymmetric1(TreeNode root) {
        if(root == null) return true;
        return isSymmetric(root.left, root.right);
    }
    
    private boolean isSymmetric(TreeNode l, TreeNode r){
        if (l == null && r == null) return true;
        else if (r == null || l == null) return false;
	
 
	    if (l.val != r.val)	return false;
 
	    if (!isSymmetric(l.left, r.right))  return false;
	    if (!isSymmetric(l.right, r.left))  return false;
 
	    return true;
    }

    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode t1 = q.poll();
            TreeNode t2 = q.poll();
            if (t1 == null && t2 == null) continue;
            if (t1 == null || t2 == null) return false;
            if (t1.val != t2.val) return false;
            q.add(t1.left);
            q.add(t2.right);
            q.add(t1.right);
            q.add(t2.left);
        }
        return true;
    }

}