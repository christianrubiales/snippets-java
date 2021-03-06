package math;

import java.util.ArrayList;
import java.util.List;

/**
 * Starting from 2, keep dividing the number by the current divisor as long as it is divisible (so use mod). 
 * If the current divisor no longer gives an integer quotient, increment the divisor. 
 * The divisor value gets bigger, the number itself gets smaller because of repeated divisions.
 */
public class PrimeFactors {

	public static void main(String[] args) {
		System.out.println(primeFactors(360)); // 2, 2, 2, 3, 3, 5
		printPrimeFactors(360);
		System.out.println(primeFactors(3572)); // 2, 2, 19, 47
		printPrimeFactors(3572);
	}

	public static List<Integer> primeFactors(int n) {
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				list.add(i);
				n /= i;
			}
		}
		
		return list;
	}

	public static void printPrimeFactors(int n) {
		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n /= i;
			}
		}
		System.out.println();
	}
}
