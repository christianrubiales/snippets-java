package bitManipulation;

public class AbsoluteValueOfInteger {
	
	static int abs(int x) {
		int mask = x >> 31;
		return (x ^ mask) - mask;
	}

	public static void main(String[] args) {
		System.out.println(abs(-1));//1
		System.out.println(abs(-2));//2
		System.out.println(abs(-3));//3
		System.out.println(abs(Integer.MIN_VALUE));// Still -2147483648, max positive value is 2147483647
		System.out.println(abs(Integer.MIN_VALUE + 1));//2147483647

//		for (int i = Integer.MIN_VALUE; i <= 0; i++) {
//			if (abs(i) < 0) {
//				System.out.println(i + " " +abs(i));
//			}
//		}
//		for (int i = Integer.MIN_VALUE; i <= Integer.MAX_VALUE; i++) {
//			Math.abs(i);
//		}
	}

}
