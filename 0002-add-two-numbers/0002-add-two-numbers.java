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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode head = new ListNode();
        ListNode tail = head;
        boolean isCarry = false;
        
        while(l1 != null && l2 != null){
            int n1 = l1.val;
            int n2 = l2.val;

            int val = n1 + n2;
            if(isCarry){
                val++;
                isCarry = false;
            }
            ListNode next = new ListNode(val%10);
            tail.next = next;
            tail = next;
            if(val > 9) isCarry = true;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            int val = l1.val;
            
            if(isCarry){
                val++;
                isCarry = false;
            }
            
            ListNode next = new ListNode(val%10);
            tail.next = next;
            tail = next;
            
            if(val > 9) isCarry = true;

            l1 = l1.next;
        }
        
        while(l2 != null){
            int val = l2.val;
            
            if(isCarry){
                val++;
                isCarry = false;
            }
            
            ListNode next = new ListNode(val%10);
            tail.next = next;
            tail = next;
            
            if(val > 9) isCarry = true;
            
            l2 = l2.next;
        }
        
        if(isCarry){
            ListNode next = new ListNode(1);
            tail.next = next;
            tail = next;
        }
        head = head.next;
        
        return head;
    }

}