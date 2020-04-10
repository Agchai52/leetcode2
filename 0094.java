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
    /** Iterative Solution*/
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if (root == null) return res;
        
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;

        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;              
            }
            cur = stack.pop();
            res.add(cur.val);
            cur = cur.right;            
        }       
        return res;
    }
    
    /** Recursive Solution */
    public List<Integer> inorderTraversalRecur(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if (root == null) return res;
        res.addAll(inorderTraversalRecur(root.left));
        res.add(root.val);
        res.addAll(inorderTraversalRecur(root.right));
        return res;
    }
}
