package array;

/**
 * Make sure to test on blank, odd-length, and even-length.
 * Usual bug is with even-length array. 
 * The trick is to use "+1" when calculating the "half".
 */
public class ReverseSubarray {

	public static void main(String[] args) {
		char[] array = "".toCharArray();
		System.out.println(array);
		System.out.println(reverse(array, 0, array.length - 1));
		
		array = "1".toCharArray();
		System.out.println(array);
		System.out.println(reverse(array, 0, array.length - 1));
		
		array = "12".toCharArray();
		System.out.println(array);
		System.out.println(reverse(array, 0, array.length - 1));
		
		array = "123".toCharArray();
		System.out.println(array);
		System.out.println(reverse(array, 0, array.length - 1));
		
		array = "1234".toCharArray();
		System.out.println(array);
		System.out.println(reverse(array, 0, array.length - 1));
		
		array = "1234".toCharArray();
		System.out.println(array);
		System.out.println(reverse(array, 0, 1));
	}

	/**
	 * Indices are inclusive.
	 */
	public static char[] reverse(char[] array, int i, int j) {
		char t;
		int half = (j - i + 1)/2;
		
		for (int k = 0; k < half; k++) {
			t = array[j - k];
			array[j - k] = array[i + k];
			array[i + k] = t;
		}
		
		return array;
	}
}
