package math.lcm;

public class LcmUsingEuclideanGcdUsingMod {

	public static void main(String[] args) {
		System.out.println(lcm(90, 100)); //900 
		System.out.println(lcm(10, 22)); // 110
		System.out.println(lcm(20, 10)); // 20
		System.out.println(lcm(10, 20)); // 20
		System.out.println(lcm(21, 6)); // 42
		System.out.println(lcm(4, 6)); // 20
		System.out.println(lcm2(-4, 6)); // 20
	}

	public static int lcm(int a, int b) {
		return a*b/gcd(a, b);
	}

	public static int lcm2(int a, int b) {
		return Math.abs(a*b)/gcd(a, b);
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
