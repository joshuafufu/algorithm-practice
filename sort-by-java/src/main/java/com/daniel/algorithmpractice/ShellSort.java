package com.daniel.algorithmpractice;

/**
 * Hello world!
 * 
 */
public class ShellSort {

    public static void shellSort(int[] arrayToSort) {
	for (int gap = arrayToSort.length / 2; gap > 0; gap /= 2) {
	    for (int i = gap; i < arrayToSort.length; i++) {
		int tmp = arrayToSort[i];
		int j = i;

		for (; j >= gap && tmp < arrayToSort[j - gap]; j -= gap) {
		    arrayToSort[j] = arrayToSort[j - gap];
		}
		arrayToSort[j] = tmp;
		System.out.println("After sort: " + arrayToSort[0] + " " + arrayToSort[1] + " " + arrayToSort[2] + " "
			+ arrayToSort[3] + " " + arrayToSort[4]);
	    }

	}

    }

    public static void main(String[] args) {
	int[] a = { 5, 4, 2, 3, 1 };

	shellSort(a);

	System.out.println(a[0] + " " + a[1] + " " + a[2] + " " + a[3] + " " + a[4]);
    }
}
