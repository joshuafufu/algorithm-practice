#include "string.h"
#include <iostream>
#include <malloc.h>

using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

class Solution {
public:
    ListNode *addTwoNumbers(ListNode *l1, ListNode *l2) {
        ListNode *head = new ListNode(0);
        ListNode *cur = head;
        int add = 0;

        while(l1!=NULL || l2 !=NULL || add !=0) 
        {
            if (add!=0)
            {
                cur->val=add;
                add =0;
            }
            
            if(l1!=NULL && l2==NULL)
            {
                add = (cur->val + l1->val)/10;
                cur->val = (cur->val + l1->val)%10;
            }
            else if (l1 == NULL && l2!=NULL)
            {
                add = (cur->val + l2->val)/10;
                cur->val = (cur->val+l2->val)%10;
            }
            if (l1==NULL && l2==NULL && add!=0)
            {
                cur->val = add;
            }
            if (l1!=NULL && l2!=NULL)
            {
                add = (cur->val + l1->val + l2->val)/10;
                cur->val = (cur->val + l1->val + l2->val)%10;
            }

            if(l1==NULL || l1->next == NULL)
            {
                l1 = NULL;
            }
            else {
                l1= l1->next;
            }

            if (l2==NULL || l2->next == NULL)
            {
                l2=NULL;
            }else{
                l2=l2->next;
            }
            if(l1!=NULL || l2!=NULL || add !=0)
            {
                cur->next = new ListNode(0);
                cur=cur->next;
            }

        }
        cur->next = NULL;
        return head;

    }
};

int main(int argc, char *argv[])
{
    ListNode *a,*b;
    a = new ListNode(9);
    b = new ListNode(9);
    ListNode *a2 = new ListNode(9);
    ListNode *b2 = new ListNode(9);
    a->next=a2;
    b->next=b2;
   
    Solution sol;
    ListNode *c= sol.addTwoNumbers(a,b);
    cout << c->next->val<<endl;
    cout << c->next->next->val << endl;
    return 0;
}

