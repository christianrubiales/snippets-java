package sequences;

public class FactorialBenchmark {

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
		long f = 1;
		
		for (long i = 1; i <= n; i++) {
			f *= i;
		}
		
		return f;
	}
	
}
