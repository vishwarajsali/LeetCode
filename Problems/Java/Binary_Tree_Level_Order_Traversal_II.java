import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/**
 * Binary_Tree_Level_Order_Traversal_II
 */
public class Binary_Tree_Level_Order_Traversal_II {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new TreeNode(3);
        tree.root.left = new TreeNode(9);
        tree.root.right = new TreeNode(20);
        tree.root.right.left = new TreeNode(15);
        tree.root.right.right = new TreeNode(7);

        System.out.println(Arrays.toString(levelOrderBottom(tree.root).toArray()) );
    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(true){
            int nodecount = q.size();
            if(nodecount == 0) break;
            List<Integer> subList = new ArrayList<Integer>();

            while(nodecount > 0){
                TreeNode curr = q.peek();
                subList.add(curr.val);
                q.remove();
                if(curr.left!= null) q.add(curr.left);
                if(curr.right!= null) q.add(curr.right);

                nodecount --;
            }
            list.add(0,subList);
        }

        return list;
    }
}