package com.daniel.algorithmpractice.tree;

public class LeftHeapNode {

    int element;
    LeftHeapNode left;
    LeftHeapNode right;
    int npl;

    LeftHeapNode(int theElement) {
	this(theElement, null, null);
    }

    LeftHeapNode(int theElement, LeftHeapNode lt, LeftHeapNode rt) {
	element = theElement;
	left = lt;
	right = rt;
	npl = 0;
    }
}
