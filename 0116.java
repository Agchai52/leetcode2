/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if (root == null) return root;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {                      
            int len_q = q.size();
            
            for (int i = 0; i < len_q; i++) { 
                Node node = q.remove();
                if (i < len_q - 1) 
                    node.next = q.peek();
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            
        }
        return root;
        
    }
}
