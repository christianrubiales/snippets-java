package sequences;

import java.math.BigInteger;

/**
 * Just remember 0! = 1
 */
public class Factorial {

	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			System.out.println(i + " " + factorial(i));
		}
		for (long i = 0; i <= 100; i++) {
			System.out.println(i + " " + factorial(i));
		}
		for (long i = 0; i <= 100; i++) {
			System.out.println(i + " " + factorial(new BigInteger(Long.toString(i))));
		}
	}
	
	/**
	 * Starts to overflow at 17!
	 */
	public static int factorial(int n) {
		int result = 1;
		
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		
		return result;
	}
	
	/**
	 * Starts to overflow at 21!
	 */
	public static long factorial(long n) {
		long result = 1;
		
		for (long i = 1; i <= n; i++) {
			result *= i;
		}
		
		return result;
	}
	
	public static BigInteger factorial(BigInteger n) {
		BigInteger result = new BigInteger("1");
		
		for (long i = 1; i <= n.longValue(); i++) {
			result = new BigInteger(result.toString()).multiply(new BigInteger(Long.toString(i)));
		}
		
		return result;
	}
}
