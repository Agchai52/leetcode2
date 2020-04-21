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
    int pos_idx;
    int[] postorder;
    Map<Integer, Integer> map = new HashMap<>();
    
    private TreeNode helper(int in_left, int in_right) {
        if (in_left > in_right) return null;
        int val = postorder[pos_idx--];
        TreeNode root = new TreeNode(val);
        int index = map.get(val);
        /*follow the inverse order of postorder: first right, then left*/
        root.right = helper(index+1, in_right);
        root.left = helper(in_left, index-1);
        
        return root;
        
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.postorder = postorder;
        pos_idx = postorder.length - 1;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper(0, inorder.length-1);
    }
}
