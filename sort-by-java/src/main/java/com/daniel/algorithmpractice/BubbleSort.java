package com.daniel.algorithmpractice;

public class BubbleSort {

    private static void bubbleSort(int[] arrayToSort) {
	for (int i = 0; i < arrayToSort.length; i++) {

	    boolean exchanged = false;
	    for (int j = arrayToSort.length - 1; j > i; j--) {
		if (arrayToSort[j] < arrayToSort[j - 1]) {
		    int tmp = arrayToSort[j];
		    arrayToSort[j] = arrayToSort[j - 1];
		    arrayToSort[j - 1] = tmp;
		    exchanged = true;
		}

	    }
	    if (!exchanged) {
		return;
	    }
	    System.out.println("After sort: " + arrayToSort[0] + " " + arrayToSort[1] + " " + arrayToSort[2] + " "
		    + arrayToSort[3] + " " + arrayToSort[4]);
	}
    }

    public static void main(String[] args) {
	int[] a = { 5, 4, 2, 3, 1 };

	bubbleSort(a);

	System.out.println(a[0] + " " + a[1] + " " + a[2] + " " + a[3] + " " + a[4]);
    }
}
