package math.gcd;

/**
 * O(n)
 */
public class GcdEuclideanUsingSubtractionRecursive {

	public static void main(String[] args) {
		System.out.println(gcd(90, 100)); //10 
		System.out.println(gcd(10, 22)); // 2
		System.out.println(gcd(20, 10)); // 10
		System.out.println(gcd(10, 20)); // 10
	}
	
	public static int gcd(int a, int b) {
		if (a == b) {
			return a;
		} else if (a > b) {
			return gcd(a - b, a);
		} else {
			return gcd(a, b - a);
		}
	}
}
