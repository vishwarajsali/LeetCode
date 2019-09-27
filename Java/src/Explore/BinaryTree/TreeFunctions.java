package Explore.BinaryTree;
import java.util.LinkedList;
import java.util.Queue;

/**
 * TreeFunctions
 */
class TreeFunctions {

    public static void printTree(TreeNode root){
        if(root == null) return;
        System.out.println(root.val);
        printTree(root.left);
        printTree(root.right);    
    }
    
}