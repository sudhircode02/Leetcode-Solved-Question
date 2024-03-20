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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode front = getNode(list1, a-1);
        ListNode back = getNode(list1, b+1);
        ListNode tail = list2;
        while(tail.next != null) tail = tail.next;
        front.next = list2;
        tail.next = back;
        return list1;
    }

    private ListNode getNode(ListNode head, int index){
        ListNode node = head;
        for(int i=0; i<index && node!=null; i++) node = node.next;
        return node;
    }
}