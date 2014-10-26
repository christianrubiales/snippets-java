package array;

/**
 * Start from the rightmost element down to the leftmost, 
 * since non-negative numbers will already be sorted.
 * Negative numbers will be in reverse sorted order. 
 * Keep track of the index of the minimum squared value so far.
 * 
 * Turned out to be a short solution but with somewhat tricky array index handling.
 */
public class SquareAllElementsAndKeepSorted {

	public static void main(String[] args) {
		int[] array = squareAndKeepSorted(new int[]{-1, 0, 2}); // [0, 1, 4]
		printArray(array);
		
		array = squareAndKeepSorted(new int[]{-3, -2, -1, 0, 1, 2, 3}); // [0, 1, 1, 4, 4, 9, 9]
		printArray(array);
		
		array = squareAndKeepSorted(new int[]{-3, -2, -1, 4}); // [1, 4, 9, 16]
		printArray(array);
		
		array = squareAndKeepSorted(new int[]{-5, -3, -1, 0, 2, 4}); // [0, 1, 4, 9, 16, 25]
		printArray(array);
		
		array = squareAndKeepSorted(new int[]{-3, -2, -1}); // [1, 4, 9]
		printArray(array);
	}

	public static int[] squareAndKeepSorted(int[] array) {
		int squared;
		boolean negativesFound = false;
		int imin = array.length - 1;
		
		for (int i = array.length - 1; i >= 0; i--) {
			negativesFound = !negativesFound ? array[i] < 0 : true;
			squared = array[i] * array[i];
			if (!negativesFound) { // originally non-negative, simply square them
				array[i] = squared;
				imin--;
			} else { // push elements less than the new squared number to the left
				for (int j = array.length - 1; j >= 0; j--) {
					if (squared >= array[j]) {
						for (int k = imin; k < j; k++) {
							array[k] = array[k+1];
						}
						array[j] = squared;
						break;
					}
				}
				imin--;
			}
		}
		
		return array;
	}
	
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println();
		System.out.println();
	}

}
