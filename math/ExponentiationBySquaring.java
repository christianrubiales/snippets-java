package math;

/**
 * @see http://en.wikipedia.org/wiki/Exponentiation_by_squaring
 * @see http://www.programminglogic.com/fast-exponentiation-algorithms/
 */
public class ExponentiationBySquaring {

	public static void main(String[] args) {
		int k = 11;
		int n = 5;
		for (int i = 0; i < k; i++) {
			System.out.println(naive(i, n));
		}
		
		long start = System.currentTimeMillis();
		for (long i = 0; i < 60; i++) {
			System.out.println(naive(2, i));
		}
		System.out.println((System.currentTimeMillis() - start) + " ms");
		
		start = System.currentTimeMillis();
		for (long i = 0; i < 60; i++) {
			System.out.println(pow(2, i));
		}
		System.out.println((System.currentTimeMillis() - start) + " ms");
	}

	public static int naive(int i, int n) {
		int result = i;
		
		for (int j = 1; j < n; j++) {
			result *= i;
		}
		
		return result;
	}

	public static long naive(long i, long n) {
		long result = i;
		
		for (int j = 1; j < n; j++) {
			result *= i;
		}
		
		return result;
	}
	
	public static long pow(long x, long n) {
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return x;
		} else if (n == 2) {
			return x * x;
		} else if (n % 2 == 0) { // (x^2)^(n/2)
			return pow(pow(x, 2), n / 2);
		} else { // x * (x^2)^((n-1)/2)
			return x * pow(pow(x, 2), (n - 1) / 2);
		}
	}
}
