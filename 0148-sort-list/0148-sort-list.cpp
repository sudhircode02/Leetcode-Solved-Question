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
    ListNode* sortList(ListNode* head) {
        if(head == NULL || head->next == NULL) return head;
        return sort(head);
    }

    ListNode* sort(ListNode* head){
        if(head->next == NULL){
            return head;
        }
        ListNode* midNode = getMid(head);
        ListNode* list1Head = head;
        ListNode* list2Head = midNode->next;
        midNode->next = NULL;
        ListNode* list1 = sort(list1Head);
        ListNode* list2 = sort(list2Head);
        return merge(list1, list2);
    } 

    ListNode* merge(ListNode* l1, ListNode* l2){
        ListNode* head = new ListNode(0);
        ListNode* tail = head;
        while(l1 != NULL && l2 != NULL){
            if(l1->val < l2->val){
                tail->next = l1;
                tail = l1;
                l1 = l1->next;
            }
            else{
                tail->next = l2;
                tail = l2;
                l2 = l2->next;
            }
        } 
        while(l1 != NULL){
            tail->next = l1;
            tail = l1;
            l1 = l1->next;
        }
        while(l2 != NULL){
            tail->next = l2;
            tail = l2;
            l2 = l2->next;
        }
        head = head->next;
        return head;
    }

    ListNode* getMid(ListNode* head){
        ListNode* slow = head;
        ListNode* fast = head->next;
        while(fast != NULL && fast->next != NULL){
            slow = slow->next;
            fast = fast->next->next;
        }
        return slow;
    }
};