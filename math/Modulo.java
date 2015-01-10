package math;

/**
 * Remainder after division
 */
public class Modulo {

	public static void main(String[] args) {
//		System.out.println(4 % 1);//division by 0 error
		System.out.println(4 % 1);
		System.out.println(4 % 2);
		System.out.println(4 % 3);
		System.out.println(4 % 4);
		System.out.println(4 % 5);
		System.out.println(0 % 4);
		System.out.println(1 % 4);
		System.out.println(2 % 4);
		System.out.println(3 % 4);
		System.out.println(4 % 4);
		System.out.println(5 % 4);

		System.out.println();
//		System.out.println(mod(4, 0));//division by 0 error
		System.out.println(mod(4, 1));//0
		System.out.println(mod(4, 2));//0
		System.out.println(mod(4, 3));//1
		System.out.println(mod(4, 4));//0
		System.out.println(mod(4, 5));//4
		System.out.println(mod(0, 4));//0
		System.out.println(mod(1, 4));//1
		System.out.println(mod(2, 4));//2
		System.out.println(mod(3, 4));//3
		System.out.println(mod(4, 4));//0
		System.out.println(mod(5, 4));//1
	}
	
	/**
	 * From wikipedia: a mod b = a - b(floor(a/b))
	 */
	public static int mod(int a, int b) {
		return a - b * (a/b);
	}
}
