/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int closestValue(TreeNode root, double target) {
        int a = root.val;
        TreeNode child;
        
        if (target < (double) a) child = root.left;
        else child = root.right;
        
        if (child == null) return a;
        
        int b = closestValue(child, target);
        int res = Math.abs((double)a - target) < Math.abs((double)b - target) ? a : b;
        return res;
        
    }
}
