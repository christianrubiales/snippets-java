package sequences;

/**
 * O(1)
 * Fast but very inaccurate.
 * Ramanujan's Approximation should be more accurate. 
 */
public class FactorialStirling {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		for (long i = 0; i < 10000; i++) {
			for (long j = 0; j < 21; j++) {
				factorial(i);
			}
		}
		System.out.println(System.currentTimeMillis() - start);
	}

	public static long factorial(long n) {
		return (long) (Math.sqrt(2 * Math.PI * n) * (Math.pow((n / Math.E), n)));
	}
	
}
