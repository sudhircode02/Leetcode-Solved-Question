/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode temp = removeNodes(head.next);
        if (temp.val > head.val) {
            return temp;
        } else {
            head.next = temp;
            return head;
        }
    }
}