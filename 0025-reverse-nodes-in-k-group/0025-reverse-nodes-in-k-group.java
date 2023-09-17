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
    public ListNode reverseKGroup(ListNode head, int k) {
        int s = 0, e = k-1;
        int size = getSize(head);
        if(e >= size) return head;
        ListNode left = null;
        ListNode right = head;
        for(int i=0; i<e+1; i++){
            right = right.next;
        }
        ListNode prev = right;
        ListNode curr = head;
        while(true){
            
            ListNode next;
            while(curr != right){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            if(s==0){
                head = prev;
                left = head;
            } 
            else left.next = prev;
            
            s = e+1;
            e += k;
            if(e >= size) break;
            curr = right;
            while(left.next != curr){
                left = left.next;
            }
            for(int i=0; i<k; i++){
                right = right.next;
            }
            prev = right;

        }

    return head;
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