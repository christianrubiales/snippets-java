package math;

public class GcdEuclideanUsingSubtraction {

	public static void main(String[] args) {
		System.out.println(gcd(90, 100)); //10 
		System.out.println(gcd(10, 22)); // 2
		System.out.println(gcd(20, 10)); // 10
		System.out.println(gcd(10, 20)); // 10
	}
	
	public static int gcd(int a, int b) {
		
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		
		return a;
	}
}
