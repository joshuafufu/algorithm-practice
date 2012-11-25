package com.daniel.algorithmpractice.tree;

public class BinaryNode {

    int element;
    BinaryNode left;
    BinaryNode right;

    BinaryNode(int theElement) {
	this(theElement, null, null);
    }

    BinaryNode(int theElement, BinaryNode lt, BinaryNode rt) {
	element = theElement;
	left = lt;
	right = rt;
    }
}
