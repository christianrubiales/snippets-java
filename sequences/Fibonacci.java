package sequences;

import java.math.BigInteger;

public class Fibonacci {

	public static void main(String[] args) {
		for (int i = 0; i < 35; i++) {
			System.out.println(i + " " + naiveRecursive(i));
		}
		for (int i = 0; i < 47; i++) {
			System.out.println(i + " " + naiveIterative(i));
		}
		for (long i = 0; i < 93; i++) {
			System.out.println(i + " " + naiveIterative(i));
		}
		for (long i = 0; i < 501; i++) {
			System.out.println(i + " " + naiveIterativeBigInteger(i));
		}
	}

	/**
	 * Starts to get really slow at fib(30)
	 */
	public static int naiveRecursive(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return naiveRecursive(n - 1) + naiveRecursive(n - 2);
		}
	}

	/**
	 * int starts to overflow at fib(46)
	 */
	public static int naiveIterative(int n) {

		if (n == 0 || n == 1) {
			return 1;
		}
		
		int n1 = 1;
		int n2 = 1;
		int result = 0;
		
		for (int i = 1; i < n; i++) {
			result = n1 + n2;
			n2 = n1;
			n1 = result;
		}
		
		return result;
	}

	/**
	 * long starts to overflow at fib(92)
	 */
	public static long naiveIterative(long n) {

		if (n == 0 || n == 1) {
			return 1;
		}
		
		long n1 = 1;
		long n2 = 1;
		long result = 0;
		
		for (long i = 1; i < n; i++) {
			result = n1 + n2;
			n2 = n1;
			n1 = result;
		}
		
		return result;
	}

	/**
	 * Not too slow actually
	 */
	public static BigInteger naiveIterativeBigInteger(long n) {

		if (n == 0 || n == 1) {
			return new BigInteger("1");
		}
		
		BigInteger n1 = new BigInteger("1");
		BigInteger n2 = new BigInteger("1");
		BigInteger result = new BigInteger("1");
		
		for (long i = 1; i < n; i++) {
			result = n1.add(n2);
			n2 = new BigInteger(n1.toString());
			n1 = new BigInteger(result.toString());
		}
		
		return result;
	}
}
