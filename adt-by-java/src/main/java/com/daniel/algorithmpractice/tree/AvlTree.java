package com.daniel.algorithmpractice.tree;

public class AvlTree {
    private static int height(AvlNode t) {
	return t == null ? -1 : t.height;
    }

    private AvlNode insert(int x, AvlNode t) {
	if (t == null) {
	    t = new AvlNode(x, null, null);
	} else if (x < t.element) {
	    t.left = insert(x, t.left);
	    if (height(t.left) - height(t.right) == 2) {
		if (x < t.left.element) {
		    t = rotateWithLeftChild(t);
		} else {
		    t = doubleWithLeftChild(t);
		}
	    }
	} else if (x > t.element) {
	    t.right = insert(x, t.right);
	    if (height(t.right) - height(t.left) == 2) {
		if (x > t.right.element) {
		    t = rotateWithRightChild(t);
		} else {
		    t = doubleWithRightChild(t);
		}
	    }
	} else {

	}

	t.height = Math.max(height(t.left), height(t.right)) + 1;

	return t;
    }

    private static AvlNode rotateWithLeftChild(AvlNode k2) {
	AvlNode k1 = k2.left;
	k2.left = k1.right;
	k1.right = k2;
	k2.height = Math.max(height(k2.left), height(k2.right)) + 1;
	k1.height = Math.max(height(k1.left), k2.height) + 1;

	return k1;
    }

    private static AvlNode doubleWithLeftChild(AvlNode k3) {
	k3.left = rotateWithRightChild(k3.left);
	return rotateWithLeftChild(k3);
    }
}
