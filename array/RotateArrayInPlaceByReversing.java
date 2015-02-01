package array;

/**
 * Tricky when it comes to indices
 * @see http://leetcode.com/2010/04/rotating-array-in-place.html
 */
public class RotateArrayInPlaceByReversing {

	public static void main(String[] args) {
		String s = "123456789";
		for (int i = 0; i < s.length() + s.length(); i++) {
			System.out.println(rotateLeft(s.toCharArray(), i));
		}
	}
	
	/**
	 * 1) Reverse the whole array
	 * 2) Reverse the first (length - places)
	 * 3) Reverse the last places, if places > 0
	 */
	public static char[] rotateLeft(char[] array, int places) {
		places = places % array.length;
		reverse(array, 0, array.length - 1);
		reverse(array, 0, array.length - 1 - places);
		if (places > 0) {
			reverse(array, array.length - places, array.length - 1);
		}
		
		return array;
	}
	
	public static char[] reverse(char[] array, int startIndex, int endIndex) {
		char temp;
		int length = endIndex - startIndex;
		for (int i = 0; i <= length / 2; i++) {
			// just a normal swap
			temp = array[endIndex - i];
			array[endIndex - i] = array[startIndex + i];
			array[startIndex + i] = temp;
		}
		return array;
	}

}
