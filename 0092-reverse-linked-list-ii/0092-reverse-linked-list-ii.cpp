/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* reverseBetween(ListNode* head, int left, int right) {
        if(left == right) return head;
        ListNode* start = getNode(head, left-2);
        ListNode* end = getNode(head, right);
        ListNode* prev = end;
        ListNode* curr = getNode(head, left-1); 
        ListNode* next = NULL;
        while(curr != end){
            next = curr->next;
            curr->next = prev;
            prev = curr;
            curr = next;
        }
        if(left == 1) head = prev;
        else start->next = prev;
        return head;
    }

    ListNode* getNode(ListNode* head, int index){
        if(index < 0) return NULL;
        ListNode* node = head;
        for(int i=0; i<index; i++){
            node = node->next;
        }
        return node;
    }
};