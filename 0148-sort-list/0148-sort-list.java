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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        return sort(head);
    }

    public ListNode sort(ListNode head){
        if(head.next == null){
            return head;
        }
        ListNode midNode = getMid(head);
        ListNode list1Head = head;
        ListNode list2Head = midNode.next;
        midNode.next = null;
        ListNode list1 = sort(list1Head);
        ListNode list2 = sort(list2Head);
        return merge(list1, list2);
    } 

    public ListNode merge(ListNode l1, ListNode l2){
        ListNode head = new ListNode(0);
        ListNode tail = head;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                tail.next = l1;
                tail = l1;
                l1 = l1.next;
            }
            else{
                tail.next = l2;
                tail = l2;
                l2 = l2.next;
            }
        } 
        while(l1 != null){
            tail.next = l1;
            tail = l1;
            l1 = l1.next;
        }
        while(l2 != null){
            tail.next = l2;
            tail = l2;
            l2 = l2.next;
        }
        head = head.next;
        return head;
    }

    public ListNode getMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}