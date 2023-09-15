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
    void reorderList(ListNode* head) {
         if(head == NULL && head->next ==NULL) return;
        ListNode* mid = getMid(head);
        ListNode* curr = mid;
        ListNode* prev = NULL;
        ListNode* next = NULL;
        while(curr != NULL){
            next = curr->next;
            curr->next = prev;
            prev = curr;
            curr = next;
        }
        ListNode* h1 = head;
        ListNode* h2 = prev;
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

    ListNode* getMid(ListNode* head){
        ListNode* slow = head;
        ListNode* fast = head;
        while(fast != NULL && fast->next != NULL){
            slow = slow->next;
            fast = fast->next->next;
        }
        return slow;
    }
};