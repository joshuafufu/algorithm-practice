package com.daniel.algorithmpractice.data;

public class ListNode {
    Object element;
    ListNode next;

    // This may used to generate the last element of the list?
    public ListNode(Object theElement) {
	this(theElement, null);
    }

    public ListNode(Object theElement, ListNode n) {
	element = theElement;
	next = n;
    }
}
