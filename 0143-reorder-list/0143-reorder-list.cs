/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public void ReorderList(ListNode head) {
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
        ListNode next = null;
        while(mid != null){
            next = mid.next;
            mid.next = prev;
            prev = mid;
            mid = next;
        }
        ListNode h1 = head;
        ListNode h2 = prev;
        next = null;
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