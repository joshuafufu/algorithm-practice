package com.daniel.algorithmpractice.tree;

public class BinarySearchTree {
    private BinaryNode root;

    public BinarySearchTree() {
	root = null;
    }

    public void makeEmpty() {
	root = null;
    }

    public boolean isEmpty() {
	return root == null;
    }

    public int find(int x) {
	return elementAt(find(x, root));
    }

    public int findMin() {
	return elementAt(findMin(root));
    }

    public int findMax() {
	return elementAt(findMax(root));
    }

    public void insert(int x) {
	root = insert(x, root);
    }

    public void remove(int x) {
	root = remove(x, root);
    }

    private int elementAt(BinaryNode t) {
	return t == null ? null : t.element;
    }

    private BinaryNode find(int x, BinaryNode t) {
	if (t == null) {
	    return null;
	}

	if (x < t.element) {
	    return find(x, t.left);
	} else if (x > t.element) {
	    return find(x, t.right);
	} else {
	    return t;
	}
    }

    private BinaryNode findMin(BinaryNode t) {
	if (t == null) {
	    return null;
	} else if (t.left == null) {
	    return t;
	}

	return findMin(t.left);

    }

    private BinaryNode findMax(BinaryNode t) {
	if (t != null) {
	    while (t.right != null) {
		t = t.right;
	    }
	}

	return t;
    }

    private BinaryNode insert(int x, BinaryNode t) {
	if (t == null) {
	    t = new BinaryNode(x, null, null);
	} else if (x < t.element) {
	    t.left = insert(x, t.left);
	} else if (x > t.element) {
	    t.right = insert(x, t.right);
	} else {

	}
	return t;
    }

    private BinaryNode remove(int x, BinaryNode t) {
	if (t == null) {
	    return t;
	}

	if (x < t.element) {
	    t.left = remove(x, t.left);
	} else if (x > t.element) {
	    t.right = remove(x, t.right);
	} else if (t.left != null && t.right != null) {
	    t.element = findMin(t.right).element;
	    t.right = remove(x, t.right);
	} else {
	    t = (t.left != null) ? t.left : t.right;
	}

	return t;
    }

    private void printTree(BinaryNode t) {
	if (t != null) {
	    printTree(t.left);
	    System.out.println(t.element);
	    printTree(t.right);
	}
    }

    public void printTree() {
	if (isEmpty()) {
	    System.out.println("Empty Tree");
	} else {
	    printTree(root);
	}
    }

    // use postorder traversal to calculate height of a tree.
    private int height(BinaryNode t) {
	if (t == null) {
	    return -1;
	} else {
	    return 1 + Math.max(height(t.left), height(t.right));
	}
    }

}
