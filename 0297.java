/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.   
    public String serialize(TreeNode root) {
        if (root == null) return "";
        StringBuilder sb = new StringBuilder();
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.remove();
                if (node == null) {
                    sb.append("null,");
                } else {
                    sb.append(node.val + ",");
                    q.add(node.left);
                    q.add(node.right);
                }
            }
        }
        return sb.toString();
    }
    

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == "") return null;
        String[] str = data.split(",");        
        TreeNode root = new TreeNode(Integer.parseInt(str[0]));
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root); 
        
        for (int i = 1; i < str.length; i++) {
            TreeNode node = q.poll();
            if (!str[i].equals("null")) {
                node.left = new TreeNode(Integer.parseInt(str[i]));
                q.add(node.left);
            }
            
            if (!str[++i].equals("null")) {
                node.right = new TreeNode(Integer.parseInt(str[i]));
                q.add(node.right);
            }
            
        }

        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
