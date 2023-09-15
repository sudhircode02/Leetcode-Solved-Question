/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
void reorderList(struct ListNode* head){
    if(head == NULL && head->next ==NULL) return;
        struct ListNode* mid = head;
        struct ListNode* fast = head;
        while(fast != NULL && fast->next != NULL){
            mid = mid->next;
            fast = fast->next->next;
        }
            
        struct ListNode* curr = mid;
        struct ListNode* prev = NULL;
        struct ListNode* next = NULL;
        while(curr != NULL){
            next = curr->next;
            curr->next = prev;
            prev = curr;
            curr = next;
        }
        struct ListNode* h1 = head;
        struct ListNode* h2 = prev;
        next = NULL;
        while(h1 != h2){
            next = h1->next;
            h1->next = h2;
            h1 = next;

            next = h2->next;
            if(next == NULL) break;
            h2->next = h1;
            h2 = next;
        }
}
