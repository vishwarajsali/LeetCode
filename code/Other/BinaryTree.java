/**
 * BinaryTree
 */
public class BinaryTree {

    TreeNode root;

    public BinaryTree(){
        root = null;
    }
}

public class TreeNode{
    TreeNode right, left;
    int val;

    public TreeNode(int val){
        this.val = val;
        left = right = null;
    }
}