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
    public ListNode MergeKLists(ListNode[] lists) {
        if (lists.Length == 0) return null;
        ListNode head = null;
        
        foreach(ListNode node in lists){
            head = merge(head, node);
        }
        return head;
    }
    
    public static ListNode merge(ListNode h1, ListNode h2){
        ListNode head = new ListNode();
        ListNode tail = head;
        while(h1 != null && h2 != null){
            if(h1.val < h2.val){
                tail.next = h1;
                tail = h1;
                h1 = h1.next;
            }
            else{
                tail.next = h2;
                tail = h2;
                h2 = h2.next;
            }
        }
        if(h1 != null){
            tail.next = h1;
        } else{
            tail.next = h2;  
        } 
        return head.next;
            
    }
}