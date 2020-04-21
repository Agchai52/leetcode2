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
    int pre_idx;
    int[] preorder;
    Map<Integer, Integer> map = new HashMap<>();
    private TreeNode helper(int in_left, int in_right) {
        if (in_left > in_right) return null;
        int val = preorder[pre_idx++];
        int index = map.get(val);
        
        TreeNode root = new TreeNode(val); 
        root.left = helper(in_left, index - 1);
        root.right = helper(index+1, in_right);
        return root;
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        pre_idx = 0;
        
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper(0, inorder.length - 1);
        
    }
}
