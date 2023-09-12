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
    public ListNode SwapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        int size = getSize(head);
        int s = 0;
        int e = 1;
        while(e < size){
            head = reverse(s, e, head);
            s+=2;
            e+=2;
        }
        return head;
    }

    public static ListNode reverse(int s, int e, ListNode head){
        ListNode left = getNode(head, s-1);
        ListNode right = getNode(head, e+1);
        ListNode curr = getNode(head, s);
        ListNode prev = right;
        ListNode next;
        while(curr != right){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        if(s==0) head = prev;
        else left.next = prev;
        return head;
    }

    public static ListNode getNode(ListNode head, int index){
        if(index < 0) return null;
        ListNode node = head;
        for(int i=0; i<index; i++){
            node = node.next;
        }
        return node;
    }

    public static int getSize(ListNode head){
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }

}