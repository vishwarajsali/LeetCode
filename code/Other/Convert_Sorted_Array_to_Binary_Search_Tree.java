/**
 * Convert_Sorted_Array_to_Binary_Search_Tree
 */
public class Convert_Sorted_Array_to_Binary_Search_Tree {

    public static void main(String[] args) {
        
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        BinaryTree tree = new BinaryTree();
        int i = 0;
        tree.root =  insert(nums, tree.root, index);    
    }

    public TreeNode insert(int[] array, TreeNode root, int index){

        if(index < array.length){
            TreeNode temp = new TreeNode();
            temp.root = temp;
        }
    }
}