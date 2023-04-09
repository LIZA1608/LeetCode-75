/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
     ListNode *slow=head;
     ListNode* fast=head;
     while(fast!=NULL && fast->next!=NULL){
         slow=slow->next;
         fast=fast->next->next;
// If a cycle is detected, move slow to the head and traverse both pointers at the same speed until they meet
         if(slow==fast){
             slow=head;
             while(slow!=fast){
                 slow=slow->next;
                 fast=fast->next;
             }
             return slow;
         }
     }   
     return NULL;
    }
};
