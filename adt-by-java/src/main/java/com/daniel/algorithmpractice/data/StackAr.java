package com.daniel.algorithmpractice.data;

public class StackAr {

    private Object[] theArray;
    private int topOfStack;

    static final int DEFAULT_CAPACITY = 10;

    public StackAr() {
	this(DEFAULT_CAPACITY);
    }

    public StackAr(int capacity) {
	theArray = new Object[capacity];
	topOfStack = -1;
    }

    public boolean isEmpty() {
	return topOfStack == -1;
    }

    public boolean isFull() {
	return topOfStack == theArray.length - 1;
    }

    public void makeEmpty() {
	topOfStack = -1;
    }

    public void push(Object x) throws Exception {
	if (isFull()) {
	    throw new Exception();
	}
	theArray[++topOfStack] = x;
    }

    public Object top() {
	if (isEmpty()) {
	    return null;
	}

	return theArray[topOfStack];
    }

    public void pop() throws Exception {
	if (isEmpty()) {
	    throw new Exception();
	}

	theArray[topOfStack--] = null;
    }

    public Object topAndPop() {
	if (isEmpty()) {
	    return null;
	}
	Object topItem = top();
	theArray[topOfStack--] = null;
	return topItem;
    }
}
