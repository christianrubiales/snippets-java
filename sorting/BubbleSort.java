package sorting;

import java.util.Arrays;

/**
 * @see www.java-examples.com/java-bubble-sort-example
 */
public class BubbleSort<T extends Comparable<T>> {

	public static void main(String[] args) {
		BubbleSort<Integer> sorter = new BubbleSort<Integer>();
		
		System.out.println(Arrays.deepToString(sorter.sort(new Integer[]{2,3,1})));
		System.out.println(Arrays.deepToString(sorter.sort(new Integer[]{6,5,3,3,5,2,6,7,8,12,3,7,4,2,3,1,8,9,2})));
		System.out.println(Arrays.deepToString(sorter.sort(new Integer[]{1,1,1,1})));
		System.out.println(Arrays.deepToString(sorter.sort(new Integer[]{1,2,3,4,5})));
		System.out.println(Arrays.deepToString(sorter.sort(new Integer[]{5,4,3,2,1})));
		System.out.println(Arrays.deepToString(sorter.sort(new Integer[]{5,1,4,2,3,3,2,4,1,5})));
		System.out.println(Arrays.deepToString(sorter.sort(new Integer[]{5,8,1,3,7,9,2})));
	}

	public T[] sort(T[] array) {
		T temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length - i; j++) { // the largest will always bubble to the top, so we can exclude the topmost in this loop
				if (array[j - 1].compareTo(array[j]) > 0) {// if previous is greater than the next, swap
					// swap
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
		
		return array;
	}
	
}
