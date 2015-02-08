package array;


/**
 * Tricky: reverse(), indices, use of short-circuit
 */
public class ReverseWordsInArray {

	public static void main(String[] args) {
		char[] array = "abc def ghi jkl mno".toCharArray();
		reverseWords(array);
		System.out.println(array);
		
		array = "abcd efgh ijkl".toCharArray();
		reverseWords(array);
		System.out.println(array);
		
		array = "apple blueberry carrot deer elephant fruit".toCharArray();
		reverseWords(array);
		System.out.println(array);
		
		array = "".toCharArray();
		reverseWords(array);
		System.out.println(array);
		
		array = "word".toCharArray();
		reverseWords(array);
		System.out.println(array);
	}
	
	public static void reverseWords(char[] array) {
		reverse(array, 0, array.length - 1);
		
		int s = 0; // start of word
		for (int i = 0; i <= array.length; i++) {
			if (i == array.length || array[i] == ' ') {
				reverse(array, s, i - 1);
				s = i + 1;
			}
		}
	}
	
	/**
	 * Reverse part of array. Indices are inclusive.
	 * @param array
	 * @param i start index
	 * @param j end index
	 */
	public static void reverse(char[] array, int i, int j) {
		char t = 0;
		int length = (j - i + 1) / 2;
		
		for (int k = 0; k < length; k++) {
			t = array[j - k];
			array[j - k] = array[i + k];
			array[i + k] = t;
		}
	}
	
}
