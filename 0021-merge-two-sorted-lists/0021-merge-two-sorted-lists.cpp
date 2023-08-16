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
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        if(list1 == NULL) return list2;
        if(list2 == NULL) return list1;
        
        ListNode* head = new ListNode();
        ListNode* tail = head;
        while(list1 != NULL && list2 != NULL){
            int val1 = list1->val;
            int val2 = list2->val;
            int minVal = min(val1, val2);
            ListNode* next = new ListNode(minVal);
            tail->next = next;
            tail = next;  
            if(val1 < val2){
                list1 = list1->next;
            }else{
                list2 = list2->next;
            }
        }
        while(list1 != NULL){
            int val = list1->val;
            ListNode* next = new ListNode(val);
            tail->next = next;
            tail =next;
            list1 = list1->next;
        }
        while(list2 != NULL){
            int val = list2->val;
            ListNode* next = new ListNode(val);
            tail->next = next;
            tail =next;
            list2 = list2->next;
        }
        head = head->next;
        return head;
    }
};