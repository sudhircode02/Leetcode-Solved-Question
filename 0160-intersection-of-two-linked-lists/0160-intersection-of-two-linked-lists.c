/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *getIntersectionNode(struct ListNode *headA, struct ListNode *headB) {
    if(headA == NULL || headB == NULL) 
            return NULL;
        if(headA == headB) return headA;
        struct ListNode* h1 = headA;
        while(h1 != NULL){
            struct ListNode* h2 = headB;
            while(h2 != NULL){
                if(h1 == h2) return h2;
                h2 = h2->next;
            }
            h1 = h1->next;
        }
        return NULL;
}