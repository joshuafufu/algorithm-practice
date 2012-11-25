package com.daniel.algorithmpractice.tree;

public class BinaryHeap {

    private static final int DEFAULT_CAPACITY = 100;

    private int currentSize;
    private int[] array;

    public BinaryHeap() {
	this(DEFAULT_CAPACITY);
    }

    public BinaryHeap(int capacity) {
	currentSize = 0;
	array = new int[capacity + 1];
    }

    public void insert(int x) throws Exception {
	if (isFull()) {
	    throw new Exception();
	}

	int hole = ++currentSize;

	// Percolate up
	for (; hole > 1 && (x < array[hole / 2]); hole /= 2) {
	    array[hole] = array[hole / 2];
	}

	array[hole] = x;
    }

    // public int findMin() {
    // return 0;
    //
    // }
    //
    public int deleteMin() {
	if (isEmpty()) {
	    return 0;
	}

	int minItem = findMin();
	array[1] = array[currentSize--];
	percolateDown(1);

	return minItem;
    }

    //
    // public boolean isEmpty() {
    //
    // }
    //
    // public boolean isFull() {
    //
    // }

    public void makeEmpty() {
	currentSize = 0;
    }

    private void percolateDown(int hole) {
	int child;
	int tmp = array[hole];

	for (; hole * 2 <= currentSize; hole = child) {
	    child = hole * 2;
	    if (child != currentSize && array[child + 1] < array[child]) {
		child++;
	    }
	    if (array[child] < tmp) {
		array[hole] = array[child];
	    } else {
		break;
	    }
	}

	array[hole] = tmp;
    }

    private void buildHeap() {
	for (int i = currentSize / 2; i > 0; i--) {
	    percolateDown(i);
	}
    }
}
