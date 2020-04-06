/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/*
1-> 2->3->4->5->NULL

p = 5, 4, 3, 2 null
h.n.n = h 1, 2 -> 1, 2, 3, 4, 5, null
h.n = null 

return p
*/
class Solution {
    public ListNode reverseList(ListNode head) {
        return helper(head, null);
    }
    
    public ListNode helper(ListNode curr, ListNode prev) {
        if (curr == null) return prev;
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        return helper(next, prev);
    }

}
