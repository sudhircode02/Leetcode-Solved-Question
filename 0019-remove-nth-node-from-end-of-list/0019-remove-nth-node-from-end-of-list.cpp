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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if(head->next == NULL && n==1){
            head = NULL;
            return head;
        }
        int size = 0;
        ListNode* temp = head;
        while(temp != NULL){
            temp = temp->next;
            size++;
        }
        n = size-n;
        if(n==0){
            head = head->next;
            return head;
        }
        ListNode* node = getNode(head, n-1);
        node->next = node->next->next;
        return head;
    }
    ListNode* getNode(ListNode* head, int index){
        ListNode* node = head;
        for(int i=0; i<index; i++){
            node = node->next;
        }
        return node;
    }
};