#include "stdio.h"
#include "string.h"
#include "stdlib.h"
#include <iostream>
using namespace std;

struct NODE
{
    int data;
    NODE *next;
};

NODE *create()
{
    int data;
    NODE *pHead, *pTail, *pNode;
    pHead = new NODE;
    pTail = pHead;
    cin>>data;
    while(data!=0)
    {
        pNode=new NODE;
        pNode->data=data;
        pTail->next=pNode;
        pTail=pNode;
        cin>>data;
    }
    pTail->next=NULL;
    return pHead;
}


NODE *reverse(NODE* &head)
{
    if ((head->next == NULL) || (head->next->next == NULL)){
        return head;
    }

    NODE *t = NULL;
    NODE *p = head->next;
    NODE *q = head->next->next;

    while(q!=NULL)
    {
        t=q->next;
        q->next = p;
        p=q;
        q=t;
    }

    head->next->next = NULL;
    head->next = p;
    return head;
}

void printList(NODE *pHead)
{
    NODE *current = pHead->next;
    while(current !=NULL)
    {
        cout << current->data<<" ";
        current = current->next;
    }
}

int main(int argc, char *argv[])
{
    NODE *pHead;
    pHead = create();
    reverse(pHead);
    printList(pHead);
}
