package com.daniel.algorithmpractice;

public class QuickSort {

    public static void quicksort(int[] arrayToSort) {
	quicksort(arrayToSort, 0, arrayToSort.length - 1);
    }

    private static int median3(int[] arrayToSort, int left, int right) {
	int center = (left + right) / 2;
	if (arrayToSort[center] < arrayToSort[left]) {
	    Utils.swapReferences(arrayToSort, left, center);
	}
	if (arrayToSort[right] < arrayToSort[left]) {
	    Utils.swapReferences(arrayToSort, left, right);
	}
	if (arrayToSort[right] < arrayToSort[center]) {
	    Utils.swapReferences(arrayToSort, center, right);
	}

	Utils.swapReferences(arrayToSort, center, right - 1);

	System.out.println("The pivot is " + arrayToSort[right - 1]);
	return arrayToSort[right - 1];
    }

    private static void quicksort(int[] arrayToSort, int left, int right) {
	if (left >= right) {
	    return;
	}

	// CUTOFF usually be about 20.
	int CUTOFF = 0;

	if (left + CUTOFF <= right) {
	    int pivot = median3(arrayToSort, left, right);

	    int i = left, j = right - 1;
	    for (;;) {
		while (arrayToSort[++i] < pivot) {

		}
		while (arrayToSort[--j] > pivot) {

		}

		if (i < j) {
		    Utils.swapReferences(arrayToSort, i, j);
		} else {
		    break;
		}

	    }
	    System.out.println("i is " + i);
	    System.out.println("j is " + j);
	    Utils.swapReferences(arrayToSort, i, right - 1);

	    System.out.println("After sort: " + arrayToSort[0] + " " + arrayToSort[1] + " " + arrayToSort[2] + " "
		    + arrayToSort[3] + " " + arrayToSort[4]);

	    quicksort(arrayToSort, left, i - 1);
	    quicksort(arrayToSort, i + 1, right);
	} else {
	    // When the array it too small, you should not use quick sort. The
	    // CUTOFF should be less than 20.
	    InsertionSort.insertionsort(arrayToSort, left, right);
	}
    }

    public static void main(String[] args) {
	int[] a = { 5, 4, 2, 3, 1 };

	quicksort(a);

	System.out.println(a[0] + " " + a[1] + " " + a[2] + " " + a[3] + " " + a[4]);

    }
}
