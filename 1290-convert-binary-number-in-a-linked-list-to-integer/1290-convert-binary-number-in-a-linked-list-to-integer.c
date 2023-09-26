/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
int getDecimalValue(struct ListNode* head){
        struct ListNode* curr = head;
        struct ListNode* prev = NULL;
        struct ListNode* next;
        while(curr != NULL){
            next = curr->next;
            curr->next = prev;
            prev = curr;
            curr = next;
        }
        int dec = 0;
        int n = 0;
        while(prev != NULL){
            int bit = prev->val;
            if(n==0){
                dec += bit;
                n=2;
            }
            else{
              dec += bit * n;
                n*=2;
            } 
            prev = prev->next;
        }
        return dec;
}