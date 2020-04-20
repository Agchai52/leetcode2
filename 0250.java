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
    int count = 0;
    public int countUnivalSubtrees(TreeNode root) {
        is_US(root, 0);
        return count;
    }
    
    boolean is_US(TreeNode node, int val) {
        if (node == null) return true;
        /* Do not use ||, since both commends should be run. */
        if (!is_US(node.left, node.val) | !is_US(node.right, node.val)) {
            return false;
        }
        count++;
        return node.val == val;
    }
}
