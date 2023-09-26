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
    int getDecimalValue(ListNode* head) {
        ListNode* curr = head;
        ListNode* prev = NULL;
        ListNode* next;
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
};