package math;

public class GcdEuclideanUsingModRecursive {

	public static void main(String[] args) {
		System.out.println(gcd(90, 100)); //10 
		System.out.println(gcd(10, 22)); // 2
		System.out.println(gcd(20, 10)); // 10
		System.out.println(gcd(10, 20)); // 10
	}
	
	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}
}
