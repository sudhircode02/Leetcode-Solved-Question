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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        
        ListNode head = new ListNode();
        ListNode tail = head;
        while(list1 != null && list2 != null){
            int val1 = list1.val;
            int val2 = list2.val;
            int minVal = Math.min(val1, val2);
            ListNode next = new ListNode(minVal);
            tail.next = next;
            tail = next;  
            if(val1 < val2){
                list1 = list1.next;
            }else{
                list2 = list2.next;
            }
        }
        while(list1 != null){
            int val = list1.val;
            ListNode next = new ListNode(val);
            tail.next = next;
            tail =next;
            list1 = list1.next;
        }
        while(list2 != null){
            int val = list2.val;
            ListNode next = new ListNode(val);
            tail.next = next;
            tail =next;
            list2 = list2.next;
        }
        head = head.next;
        return head;
    }
}