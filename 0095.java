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
    public List<TreeNode> generateTrees(int n) {
        return genBST(1, n);
    }
    
    private List<TreeNode> genBST(int start, int end) {
        List<TreeNode> res = new ArrayList<TreeNode>();
        if (start > end) {
            res.add(null);
            return res;} 
        for (int i = start; i <= end; i++) {
            List<TreeNode> left = genBST(start, i-1);
            List<TreeNode> right = genBST(i+1, end);
            
            for (TreeNode l: left) {
                for (TreeNode r: right) {
                    TreeNode cur = new TreeNode(i);
                    cur.left = l;
                    cur.right = r;
                    res.add(cur);
                }
            }
        }
        return res;
    }
}
