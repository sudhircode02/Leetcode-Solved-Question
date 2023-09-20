/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* rotateRight(struct ListNode* head, int k){
        if(k==0 || head==NULL || head->next==NULL) return head;
        int size = 1;
        struct ListNode* last = head;
        while(last->next != NULL){
            size++;
            last = last->next;
        }
        
        if(k >= size) k %= size;
        if(k==0) return head;
        
        last->next = head;
        struct ListNode* tail = head;
        for(int i=0; i<size-k-1; i++){
            tail = tail->next;
        }
        
        head = tail->next;
        tail->next = NULL;
        return head;
}