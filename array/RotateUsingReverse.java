package array;

/**
 * Still tricky, but not as tricky as {@code RotateArrayInPlaceByReversing}
 */
public class RotateUsingReverse {

	public static void main(String[] args) {
		char[] s = "12345".toCharArray();
		rotateRight(s, 1);System.out.println(s);
		rotateLeft(s, 1);System.out.println(s);
		rotateLeft(s, 1);System.out.println(s);
		rotateLeft(s, 10);System.out.println(s);
	}

	public static void reverse(char[] s, int x, int y) {
		char c;
		for (int k = x; k < (y - x) / 2; k++) {
			c = s[y - k - 1];
			s[y - k - 1] = s[k];
			s[k] = c;
		}
	}
	
	public static void rotateLeft(char[] s, int n) {
		if (s.length > 0) {
			n = n % s.length - 1;
			reverse(s, 0, n);
			reverse(s, n + 1, s.length - 1);
			reverse(s, 0, s.length - 1);
		}
	}
	
	public static void rotateRight(char[] s, int n) {
		if (s.length > 0) {
			n = n % s.length - 1;
			reverse(s, 0, s.length - n - 1);
			reverse(s, s.length - n, s.length - 1);
			reverse(s, 0, s.length - 1);
		}
	}
}
