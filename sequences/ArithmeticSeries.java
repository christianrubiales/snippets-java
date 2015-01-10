package sequences;

public class ArithmeticSeries {

	public static void main(String[] args) {
		for (int i = 1; i <= 30; i++) {
			System.out.println(i + " " + naive(i));
		}
		for (int i = 1; i <= 30; i++) {
			System.out.println(i + " " + series(i));
		}
	}

	public static int naive(int n) {
		int result = 0;
		
		for (int i = 1; i <= n; i++) {
			result += i;
		}
		
		return result;
	}

	public static int series(int n) {
		return n * (n + 1) / 2;
	}
}
