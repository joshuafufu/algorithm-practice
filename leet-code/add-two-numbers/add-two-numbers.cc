#include "string.h"
#include <iostream>

using namespace std;

struct ListNode {
    int val;
    ListNode *next;
};

class Solution {
public:
    ListNode *addTwoNumbers(ListNode *l1, ListNode *l2) {
        ListNode *current1;
        ListNode *current2;

        current1 = l1;
        current2 = l2;

        ListNode *result;

        int step_num=0;
        
        int i=0, j=0, k=0;
        while(current1!=NULL && current2 != NULL) {
            result[i].val = (step_num+ current1->val + current2->val)%10;
            step_num=(step_num+current2->val + current1->val)/10;
            current1=current1->next;
            current2=current2->next;
            i++;
            
        }

        while(current1!=NULL){
            result[j].val= (step_num+current1->val)%10;
            step_num=(step_num+current1->val)/10;
            current1=current1->next;
            j++;
        }

        while(current2!=NULL){
            result[k].val= (step_num+current2->val)%10;
            step_num=(step_num+current2->val)/10;
            current2=current2->next;
            k++;
        }

        return result;

    }
};

int main(int argc, char *argv[])
{
    ListNode *a,*b;
    a = new ListNode;
    b = new ListNode;
    a->val= 1;
    b->val=2;
    Solution sol;
    ListNode *c= sol.addTwoNumbers(a,b);
    cout << c->val<<endl;
    return 0;
}

