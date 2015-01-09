package math;


class GcdByTrialDivision
{
	public static void main (String[] args) throws java.lang.Exception {
		System.out.println(gcd(90000000, 100000000));// 10000000
		System.out.println(gcd(90, 100));// 10
	}
	
	/**
	 * Start with the lower of the two given numbers,
	 * then start trying to divide both given numbers with the smaller number.
	 * If they can be both divided by the number, then that is the GCD.
	 * Else, keep decrementing the test number by 1 until 1 is reached 
	 * or the test number can now divide both numbers.
	 * O(n)
	 */
	public static int gcd(int a, int b) {
		for (int i = Math.min(a, b); i >= 1; i--) {
			if (a % i == 0 && b % i == 0) {
				return i;
			}
		}
		
		return 1;
	}
}