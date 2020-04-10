/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    /** Iterative solution. */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if (root == null) return res;
        
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
              
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            res.add(node.val);
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
        return res;
    }
    
    /** Recursive solution. */
    /*
    public List<Integer> preorderTraversalRecur(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        preorder(root, res);
        return res;
    }
    
    private void preorder(TreeNode root, List<Integer> res) {
        if (root == null) return;
        res.add(root.val);
        preorder(root.left, res);
        preorder(root.right, res);
        return;
    }
    */
}
