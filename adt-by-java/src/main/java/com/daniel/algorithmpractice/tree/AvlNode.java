package com.daniel.algorithmpractice.tree;

public class AvlNode {

    int element;
    AvlNode left;
    AvlNode right;
    int height;

    AvlNode(int theElement) {
	this(theElement, null, null);
    }

    AvlNode(int theElement, AvlNode lt, AvlNode rt) {
	element = theElement;
	left = lt;
	right = rt;
	height = 0;
    }
}
