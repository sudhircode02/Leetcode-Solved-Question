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
    public void reorderList(ListNode head) {
        if(head == null && head.next ==null) return;
        
        //Getting Middle Node
        ListNode mid = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            mid = mid.next;
            fast = fast.next.next;
        }
        
        //Reverse the list from Middle
        ListNode prev = null;
        while(mid != null){
            ListNode next = mid.next;
            mid.next = prev;
            prev = mid;
            mid = next;
        }
        ListNode h1 = head;
        ListNode h2 = prev;
        ListNode next = null;
        while(h1 != h2){
            next = h1.next;
            h1.next = h2;
            h1 = next;
            next = h2.next;
            if(next == null) break;
            h2.next = h1;
            h2 = next;
        }
    }

}