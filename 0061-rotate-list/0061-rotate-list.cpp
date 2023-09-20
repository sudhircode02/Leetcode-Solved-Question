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
    ListNode* rotateRight(ListNode* head, int k) {
        if(k==0 || head==NULL || head->next==NULL) return head;
        int size = 1;
        ListNode* last = head;
        while(last->next != NULL){
            size++;
            last = last->next;
        }
        
        if(k >= size) k %= size;
        if(k==0) return head;
        
        last->next = head;
        ListNode* tail = head;
        for(int i=0; i<size-k-1; i++){
            tail = tail->next;
        }
        
        head = tail->next;
        tail->next = NULL;
        return head;
    }
};