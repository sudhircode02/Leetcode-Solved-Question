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
    public ListNode doubleIt(ListNode head) {
        head = reverse(head);
        ListNode digit = head;
        boolean carry = false;
        while(digit != null){
            int num = digit.val;
            num *= 2;
            if(carry){
                num++;
                carry = false;
            } 
            digit.val = num%10;
            if(num > 9){
                carry = true;
            }
            if(digit.next == null) break;
            digit = digit.next;
            
        }
        if(carry){
            ListNode cry = new ListNode(1);
            digit.next = cry;
        }
        return reverse(head);
         
    }

    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}