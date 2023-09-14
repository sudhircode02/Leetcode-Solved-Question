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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = null;
        
        for(int i=0; i<lists.length; i++){
            head = merge(head, lists[i]);
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