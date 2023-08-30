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
    ListNode* doubleIt(ListNode* head) {
        head = reverse(head);
        ListNode* digit = head;
        bool carry = false;
        while(digit != NULL){
            int num = digit->val;
            num *= 2;
            if(carry){
                num++;
                carry = false;
            } 
            digit->val = num%10;
            if(num > 9){
                carry = true;
            }
            if(digit->next == NULL) break;
            digit = digit->next;
            
        }
        if(carry){
            ListNode* cry = new ListNode(1);
            digit->next = cry;
        }
        return reverse(head);
         
    }

    ListNode* reverse(ListNode* head){
        ListNode* curr = head;
        ListNode* prev = NULL;
        ListNode* next;
        while(curr != NULL){
            next = curr->next;
            curr->next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
};