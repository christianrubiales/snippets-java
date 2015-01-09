package math;


/**
 * A bit tricky when it comes to array indexes.
 * time: O(n log (log n))
 * space: O(n)
 */
public class SieveofEratosthenesUsingArray {

	public static void main(String[] args) {

		// 2
		int[] primes = getPrimes(2);
		print(primes);
		
		// 2 3 5 7 11 13 17 19 23 29
		primes = getPrimes(30);
		print(primes);
		
		// 2 3 4 5 7 9 13 15 19 21 25 31 33 39 43 45 49 55 61 63 69 73 75 81 85 91 99 103 105 109 111 115
		primes = getPrimes(121);
		print(primes);
		
		long start = System.currentTimeMillis();
		primes = getPrimes(10000000);
		System.out.println((System.currentTimeMillis() - start) + "ms");
//		print(primes);
	}
	
	public static int[] getPrimes(int max) {
		int[] primes = new int[max+1];
		
		// populate with all number between 2 to max
		for (int i = 2; i <= max; i++) {
			primes[i] = i;
		}

		int total = max-1;
		for (int i = 2; i <= Math.sqrt(max); i++) {
			// remove the succeeding multiples of a base number
			for (int j = i; j <= max;) {
				j += i;
				if (j <= max && primes[j] > 0) {
					primes[j] = 0;
					total--;
				}
			}
		}
		
		// copy primes from the larger array to the smaller array
		int[] totalprimes = new int[total];
		int temp = 0;
		for (int i = 0; i < primes.length; i++) {
			if (primes[i] > 0) {
				totalprimes[temp] = primes[i];
				temp++;
			}
		}
		
		return totalprimes;
	}

	public static void print(int[] primes) {
		for (int i = 0; i < primes.length; i++) {
			System.out.print(primes[i] + " ");
			System.out.println();
		}
	}

}
