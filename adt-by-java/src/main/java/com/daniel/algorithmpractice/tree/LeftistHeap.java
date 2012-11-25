package com.daniel.algorithmpractice.tree;

public class LeftistHeap {

    private LeftHeapNode root;

    public LeftistHeap() {

    }

    public void merge(LeftistHeap rhs) {
	if (this == rhs) {
	    return;
	}

	root = merge(root, rhs.root);
	rhs.root = null;
    }

    public void insert(int x) {

    }

    public int findMin() {

    }

    public int deleteMin() {

    }

    public boolean isEmpty() {

    }

    public boolean isFull() {

    }

    public void makeEmpty() {

    }

    private static LeftHeapNode merge(LeftHeapNode h1, LeftHeapNode h2) {
	if (h1 == null) {
	    return h2;
	}
	if (h2 == null) {
	    return h1;
	}
	if (h1.element < h2.element) {
	    return merge1(h1, h2);
	} else {
	    return merge1(h2, h1);
	}

    }

    private static LeftHeapNode merge1(LeftHeapNode h1, LeftHeapNode h2) {
	if (h1.left == null) {
	    h1.left = h2;
	} else {
	    h1.right = merge(h1.right, h2);
	    if (h1.left.npl < h1.right.npl) {
		swapChildren(h1);
	    }
	    h1.npl = h1.right.npl + 1;
	}

	return h1;
    }

    private static void swapChildren(LeftHeapNode t) {

    }

}
