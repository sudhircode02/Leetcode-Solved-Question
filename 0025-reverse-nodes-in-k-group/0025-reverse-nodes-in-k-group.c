/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseKGroup(struct ListNode* head, int k){
        int s = 0, e = k-1;
        int size = getSize(head);

        if(e >= size) return head;
        
        struct ListNode* left = NULL;
        struct ListNode* right = head;
        for(int i=0; i<e+1; i++){
            right = right->next;
        }
        struct ListNode* prev = right;
        struct ListNode* curr = head;
        
        while(true){    
            struct ListNode* next = NULL;
            while(curr != right){
                next = curr->next;
                curr->next = prev;
                prev = curr;
                curr = next;
            }
            if(s==0){
                head = prev;
                left = head;
            } 
            else left->next = prev;

            s = e+1;
            e += k;
            if(e >= size) break;
            curr = right;
            while(left->next != curr){
                left = left->next;
            }
            for(int i=0; i<k; i++){
                right = right->next;
            }
            prev = right;
        }
    return head;
}

    int getSize(struct ListNode* head){
        int size = 0;
        struct ListNode* temp = head;
        while(temp != NULL){
            size++;
            temp = temp->next;
        }
        return size;
    }