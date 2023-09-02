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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        n = size-n;
        if(n==0){
            head = head.next;
            return head;
        }
        ListNode node = getNode(head, n-1);
        node.next = node.next.next;
        return head;
    }
    public static ListNode getNode(ListNode head, int index){
        ListNode node = head;
        for(int i=0; i<index; i++){
            node = node.next;
        }
        return node;
    }
}