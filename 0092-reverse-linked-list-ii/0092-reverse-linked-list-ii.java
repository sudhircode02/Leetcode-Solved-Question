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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;
        ListNode start = getNode(head, left-2);
        ListNode end = getNode(head, right);
        ListNode prev = end;
        ListNode curr = getNode(head, left-1); 
        ListNode next = null;
        while(curr != end){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        if(left == 1) head = prev;
        else start.next = prev;
        return head;
    }

    public ListNode getNode(ListNode head, int index){
        if(index < 0) return null;
        ListNode node = head;
        for(int i=0; i<index; i++){
            node = node.next;
        }
        return node;
    }
}