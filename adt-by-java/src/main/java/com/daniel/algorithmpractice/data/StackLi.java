package com.daniel.algorithmpractice.data;

/**
 * Hello world!
 * 
 */
public class StackLi {
    private ListNode topOfStack;

    public StackLi() {
	topOfStack = null;
    }

    public boolean isFull() {
	return false;
    }

    public boolean isEmpty() {
	return topOfStack == null;
    }

    public void makeEmpty() {
	topOfStack = null;
    }

    public void push(Object x) {
	topOfStack = new ListNode(x, topOfStack);
    }

    public Object top() {
	if (isEmpty()) {
	    return null;
	}

	return topOfStack.element;
    }

    public void pop() throws Exception {
	if (isEmpty()) {
	    throw new Exception();
	}
	topOfStack = topOfStack.next;
    }

    public Object topAndPop() {
	if (isEmpty()) {
	    return null;
	}

	Object topItem = topOfStack.element;
	topOfStack = topOfStack.next;
	return topItem;
    }
}
