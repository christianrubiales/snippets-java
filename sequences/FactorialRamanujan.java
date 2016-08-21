package sequences;

/**
 * O(1)
 * Fast but inaccurate.
 * Ramanujan's Approximation should be more accurate than Stirling's Approximation. 
 */
public class FactorialRamanujan {

	public static void main(String[] args) {
		for (long j = 1; j < 21; j++) {
			System.out.println(factorial(j));
		}
//		long start = System.currentTimeMillis();
//		for (long i = 0; i < 10000; i++) {
//			for (long j = 1; j < 21; j++) {
//				factorial(j);
//			}
//		}
//		System.out.println(System.currentTimeMillis() - start);
	}

	public static long factorial(long n) {
		return (long) (Math.sqrt(2 * Math.PI * n) * (Math.pow((n / Math.E), n)) * Math.exp((1/(12*n)) - (1/(360* (n*n*n)))));
	}
	
}
