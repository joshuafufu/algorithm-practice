package com.daniel.algorithmpractice;

public class HeapSort {

    private static int leftChild(int i) {
	return 2 * i + 1;
    }

    private static void percDown(int[] arrayToSort, int i, int n) {
	int child;
	int tmp;

	for (tmp = arrayToSort[i]; leftChild(i) < n; i = child) {
	    child = leftChild(i);
	    if (child != n - 1 && arrayToSort[child] < arrayToSort[child + 1]) {
		child++;
	    }

	    if (tmp < arrayToSort[child]) {
		arrayToSort[i] = arrayToSort[child];
	    } else {
		break;
	    }
	}

	arrayToSort[i] = tmp;

	System.out.println("After sort: " + arrayToSort[0] + " " + arrayToSort[1] + " " + arrayToSort[2] + " "
		+ arrayToSort[3] + " " + arrayToSort[4]);
    }

    private static void heapsort(int[] arrayToSort) {
	for (int i = arrayToSort.length / 2; i >= 0; i--) {
	    percDown(arrayToSort, i, arrayToSort.length);
	}

	for (int i = arrayToSort.length - 1; i > 0; i--) {
	    int tmp = arrayToSort[0];
	    arrayToSort[0] = arrayToSort[i];
	    arrayToSort[i] = tmp;
	    percDown(arrayToSort, 0, i);
	}
    }

    public static void main(String[] args) {
	int[] a = { 5, 4, 2, 3, 1 };

	heapsort(a);

	System.out.println(a[0] + " " + a[1] + " " + a[2] + " " + a[3] + " " + a[4]);
    }
}
