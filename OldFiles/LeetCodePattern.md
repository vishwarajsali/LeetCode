## Pattern 0 | Iterative traverse tree 

Whenever you solved the tree problem always use iterative as well as the recursive pattern 

- Iterative help us to understand the problem better
- recursive consist and beautiful 

#### In-order traversal of the binary tree

```java
public List<Integer> inOrderTraversal(TreeNode root){
    ArrayList<Integer> result = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();

    TreeNode p = root;
    while(p!= null){
        stack.push(p);
        p = p.left;
    }

    while (!stack.isEmpty()){
        TreeNode t = stack.pop();
        result.add(t.val);

        t = t.right;

        while(t!= null){
            stack.push(t);
            t = t.left;
        }
    }

    return result;
}
```