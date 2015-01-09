package math.gcd;

public class GcdEuclideanUsingMod {

	public static void main(String[] args) {
		System.out.println(gcd(90, 100)); //10 
		System.out.println(gcd(10, 22)); // 2
		System.out.println(gcd(20, 10)); // 10
		System.out.println(gcd(10, 20)); // 10
	}
	
	public static int gcd(int a, int b) {
		int t;
		while (b != 0) {
			t = b;
			b = a % b;
			a = t;
		}
		
		return a;
	}
}
