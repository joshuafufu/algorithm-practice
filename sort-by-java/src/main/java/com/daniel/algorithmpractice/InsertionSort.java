package com.daniel.algorithmpractice;

public class InsertionSort {
    public static void insertionSort(Comparable[] a) {
	int j;

	for (int p = 0; p < a.length; p++) {
	    Comparable tmp = a[p];

	    for (j = p; j > 0 && tmp.compareTo(a[j - 1]) < 0; j--) {
		a[j] = a[j - 1];
	    }
	    a[j] = tmp;
	}
    }

    public static void insertionsort(int[] arrayToSort) {
	int loopCount = 0;
	int j;

	for (int i = 0; i < arrayToSort.length; i++) {

	    int tmp = arrayToSort[i];

	    for (j = i; j > 0 && tmp < arrayToSort[j - 1]; j--) {
		arrayToSort[j] = arrayToSort[j - 1];
		loopCount++;
	    }
	    arrayToSort[j] = tmp;

	    System.out.println("After " + i + "th sort: " + arrayToSort[0] + " " + arrayToSort[1] + " "
		    + arrayToSort[2] + " " + arrayToSort[3] + " " + arrayToSort[4]);
	}
	System.out.println("The sort takes " + loopCount + " loops");
    }

    public static void insertionsort(int[] arrayToSort, int left, int right) {
	int[] partialArray = new int[right - left + 1];

	for (int i = 0; i < partialArray.length; i++) {
	    partialArray[i] = arrayToSort[left + i];
	}
	insertionsort(partialArray);
    }

    public static void main(String[] args) {
	int[] a = { 5, 4, 2, 3, 1 };

	insertionsort(a, 0, 4);

	System.out.println(a[0] + " " + a[1] + " " + a[2] + " " + a[3] + " " + a[4]);
    }
}
