package Explore.BinaryTree;

/**
 *  Path_Sum
 */
class  Path_Sum {

    public static void main(String[] args) {
        
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;

        sum -= root.val;

        if(root.left == null && root.right == null) return sum == 0;
        
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }

    
}