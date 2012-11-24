package com.daniel.algorithmpractice;

public class Utils {
    public static void swapReferences(int[] array, int left, int right) {
	int tmp = array[left];
	array[left] = array[right];
	array[right] = tmp;
    }
}
