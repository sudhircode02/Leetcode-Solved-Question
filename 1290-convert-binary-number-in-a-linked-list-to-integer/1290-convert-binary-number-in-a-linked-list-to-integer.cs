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
    public int GetDecimalValue(ListNode head) {
        ListNode curr =head;
        ListNode prev = null;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        int dec = 0;
        int n = 0;
        
        while(prev != null){
            int bit = prev.val;
            if(n==0){
                dec += bit;
                n=2;
            }
            else{
              dec += bit * n;
                n*=2;
            } 
            prev = prev.next;
        }
        return dec;
    }
}