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
    ListNode* swapPairs(ListNode* head) {
        if(head == NULL || head->next == NULL) return head;
        int size = getSize(head);
        int s = 0;
        int e = 1;
        while(e < size){
            head = reverse(s, e, head);
            s+=2;
            e+=2;
        }
        return head;
    }

    ListNode* reverse(int s, int e, ListNode* head){
        ListNode* left = getNode(head, s-1);
        ListNode* right = getNode(head, e+1);
        ListNode* curr = getNode(head, s);
        ListNode* prev = right;
        ListNode* next;
        while(curr != right){
            next = curr->next;
            curr->next = prev;
            prev = curr;
            curr = next;
        }
        if(s==0) head = prev;
        else left->next = prev;
        return head;
    }

    ListNode* getNode(ListNode* head, int index){
        if(index < 0) return NULL;
        ListNode* node = head;
        for(int i=0; i<index; i++){
            node = node->next;
        }
        return node;
    }

    int getSize(ListNode* head){
        int size = 0;
        ListNode* temp = head;
        while(temp != NULL){
            size++;
            temp = temp->next;
        }
        return size;
    }

};