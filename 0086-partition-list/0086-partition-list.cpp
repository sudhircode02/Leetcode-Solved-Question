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
    ListNode* partition(ListNode* head, int x) {
        if(head == NULL) return head;

        ListNode* ans =  new ListNode(0);
        ListNode* temp = head;
        ListNode* newHead = ans;
        while(temp != NULL){
            int val = temp->val;
            if(val < x){
                ListNode* next = new ListNode(val);
                ans->next = next;
                ans = next;
                temp->val = 101;
            }
            temp = temp->next;
        }
        temp = head;
        while(temp != NULL){
            int val = temp->val;
            temp = temp->next;
            if(val != 101){
                ListNode* next = new ListNode(val);
                ans->next = next;
                ans = next;
            }
        }
        head = newHead->next;
        return head;
    }
};