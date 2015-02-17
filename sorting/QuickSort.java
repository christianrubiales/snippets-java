package sorting;

import java.util.Arrays;

public class QuickSort<T extends Comparable<T>> {

	public static void main(String[] args) {
		QuickSort<Integer> sorter = new QuickSort<Integer>();
		
		System.out.println(Arrays.deepToString(sorter.sort(new Integer[]{2,3,1})));
		System.out.println(Arrays.deepToString(sorter.sort(new Integer[]{6,5,3,3,5,2,6,7,8,12,3,7,4,2,3,1,8,9,2})));
	}
	
	public T[] sort(T[] array) {
		if (array == null || array.length == 0) {
			return array;
		}
		
		return quicksort(array, 0, array.length - 1);
	}
	
	public T[] quicksort(T[] array, int low, int high) {
		int i = low;
		int j = high;
		T pivot = array[low + (high - low)/2];
		
		while (i <= j) {
			
			while (array[i].compareTo(pivot) < 0) {
				i++;
			}
			
			while (array[j].compareTo(pivot) > 0) {
				j--;
			}
			
			if (i <= j) {
				swap(array, i, j);
				i++;
				j--;
			}
		}
		
		if (low < j) {
			quicksort(array, low, j);
		}

		if (i < high) {
			quicksort(array, i, high);
		}
		
		return array;
	}
	
	public void swap(T[] array, int i, int j) {
		T temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	

}
