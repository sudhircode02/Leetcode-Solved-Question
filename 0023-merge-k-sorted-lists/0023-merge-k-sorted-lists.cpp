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
    ListNode* mergeKLists(vector<ListNode*>& lists) {
        ListNode* head = NULL;
        
        for(int i=0; i<lists.size(); i++){
            head = merge(head, lists[i]);
        }
        return head;
    }
    
    ListNode* merge(ListNode* h1, ListNode* h2){
        ListNode* head = new ListNode();
        ListNode* tail = head;
        while(h1 != NULL && h2 != NULL){
            if(h1->val < h2->val){
                tail->next = h1;
                tail = h1;
                h1 = h1->next;
            }
            else{
                tail->next = h2;
                tail = h2;
                h2 = h2->next;
            }
        }
        if(h1 != NULL){
            tail->next = h1;
        } else{
            tail->next = h2;  
        } 
        return head->next;
    }
};