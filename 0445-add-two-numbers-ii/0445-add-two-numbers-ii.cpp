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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode* l3 = add(l1, l2);
        return reverse(l3);
    }

    ListNode* add(ListNode* l1, ListNode* l2) {
        
        ListNode* head = new ListNode();
        ListNode* tail = head;
        bool isCarry = false;
        
        while(l1 != NULL && l2 != NULL){
            int n1 = l1->val;
            int n2 = l2->val;
            int val = n1 + n2;
            if(isCarry){
                val++;
                isCarry = false;
            }
            ListNode* next = new ListNode(val%10);
            tail->next = next;
            tail = next;
            if(val > 9) isCarry = true;
            l1 = l1->next;
            l2 = l2->next;
        }
        while(l1 != NULL){
            int val = l1->val;
            if(isCarry){
                val++;
                isCarry = false;
            }
            ListNode* next = new ListNode(val%10);
            tail->next = next;
            tail = next;
            if(val > 9) isCarry = true;
            l1 = l1->next;
        }
        
        while(l2 != NULL){
            int val = l2->val;
            if(isCarry){
                val++;
                isCarry = false;
            }
            ListNode* next = new ListNode(val%10);
            tail->next = next;
            tail = next;
            if(val > 9) isCarry = true;
            l2 = l2->next;
        }
        
        if(isCarry){
            ListNode* next = new ListNode(1);
            tail->next = next;
            tail = next;
        }
        
        return head->next;
    }

    
    ListNode* reverse(ListNode* head){
        ListNode* curr = head;
        ListNode* prev = NULL;
        while(curr != NULL){
            ListNode* next = curr->next;
            curr->next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
};