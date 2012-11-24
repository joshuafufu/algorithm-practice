package com.daniel.algorithmpractice;

public class MergeSort {

    private static void mergeSort(int[] arrayToSort, int[] tmpArray, int left, int right) {
	if (left < right) {
	    int center = (left + right) / 2;
	    mergeSort(arrayToSort, tmpArray, left, center);
	    mergeSort(arrayToSort, tmpArray, center + 1, right);
	    merge(arrayToSort, tmpArray, left, center + 1, right);
	}
    }

    private static void merge(int[] arrayToSort, int[] tmpArray, int leftPos, int rightPos, int rightEnd) {
	int leftEnd = rightPos - 1;
	int tmpPos = leftPos;
	int numElements = rightEnd - leftPos + 1;

	while (leftPos <= leftEnd && rightPos <= rightEnd) {
	    if (arrayToSort[leftPos] <= arrayToSort[rightPos]) {
		tmpArray[tmpPos++] = arrayToSort[leftPos++];
	    } else {
		tmpArray[tmpPos++] = arrayToSort[rightPos++];
	    }
	}

	while (leftPos <= leftEnd) {
	    tmpArray[tmpPos++] = arrayToSort[leftPos++];
	}

	while (rightPos <= rightEnd) {
	    tmpArray[tmpPos++] = arrayToSort[rightPos++];
	}

	for (int i = 0; i < numElements; i++, rightEnd--) {
	    arrayToSort[rightEnd] = tmpArray[rightEnd];
	}
    }

    private static void mergeSort(int[] arrayToSort) {
	int[] tmpArray = new int[arrayToSort.length];

	mergeSort(arrayToSort, tmpArray, 0, arrayToSort.length - 1);
    }

    public static void main(String[] args) {
	int[] a = { 5, 4, 2, 3, 1 };

	mergeSort(a);

	System.out.println(a[0] + " " + a[1] + " " + a[2] + " " + a[3] + " " + a[4]);
    }
}
