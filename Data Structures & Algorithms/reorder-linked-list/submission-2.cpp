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
    void reorderList(ListNode* head) {
        int n=0;
        ListNode* temp=head;
        while(temp){
            n++;
            temp=temp->next;
        }
        if(n==1)return;
        int i=0;
        ListNode* temp2=head;
        while(temp2){
            if(i==n/2)break;
            temp2=temp2->next;
            i++;
        }
        ListNode* rev=NULL;
        ListNode* next=temp2->next;
        while(next!=NULL){
        next=temp2->next;
        temp2->next=rev;
        rev=temp2;
        if(next!=NULL)temp2=next;
        }
        ListNode*head1=head;
        while(temp2!=next){
            next=head1->next;
            if(temp2==next)break;
            head1->next=new ListNode(temp2->val);
            head1->next->next=next;
            head1=next;
            temp2=temp2->next;
        }
    }
};
