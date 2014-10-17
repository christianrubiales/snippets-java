package array;

import java.util.Arrays;

public class SquareAllElementsAndKeepSortedUsingArraysSort {

	public static void main(String[] args) {
		int[] array = squareAndKeepSorted(new int[]{-3, -2, -1, 0, 1, 2, 3}); // [0, 1, 1, 4, 4, 9, 9]
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static int[] squareAndKeepSorted(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] * array[i];
		}
		Arrays.sort(array);
		
		return array;
	}
	
}
