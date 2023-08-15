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
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;

        ListNode ans =  new ListNode(0);
        ListNode temp = head;
        ListNode newHead = ans;
        while(temp != null){
            int val = temp.val;
            if(val < x){
                ListNode next = new ListNode(val);
                ans.next = next;
                ans = next;
                temp.val = 101;
            }
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            int val = temp.val;
            temp = temp.next;
            if(val != 101){
                ListNode next = new ListNode(val);
                ans.next = next;
                ans = next;
            }
        }
        head = newHead.next;
        return head;
        
    }
}