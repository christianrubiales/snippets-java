package math;

import java.util.ArrayList;
import java.util.List;

/**
 * time: O(n log (log n))
 * space: O(n)
 */
public class SieveofEratosthenesUsingList {

	public static void main(String[] args) {
		System.out.println(getPrimes(30)); // 2, 3, 5, 7, 11, 13, 17, 19, 23, 29
		System.out.println(getPrimes(121)); // 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113
		
		long millis = System.currentTimeMillis();
		System.out.println(getPrimes((int) Math.sqrt(Integer.MAX_VALUE)));
		System.out.println((System.currentTimeMillis() - millis) + " ms");
	}

	public static List<Integer> getPrimes(int max) {
		List<Integer> primes = new ArrayList<Integer>();
		
		// populate with all number between 2 to max
		for (int i = 2; i <= max; i++) {
			primes.add(i);
		}
		
		for (int i = 2; i <= Math.sqrt(max); i++) {
			// remove the succeeding multiples of a base number
			for (int j = i; j <= max;) {
				j += i;
				if (primes.contains(j)) {
					primes.remove((Integer) j);
				}
			}
		}
		
		return primes;
	}
	
}
