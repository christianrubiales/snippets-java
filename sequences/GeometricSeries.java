package sequences;

/**
 * a + ar^1 + ar^2 + ar^3 + ar^4 ...
 */
public class GeometricSeries {

	public static void main(String[] args) {
//		System.out.println(naive(1, 2, 3));
//		System.out.println(naive(2, 5, 4)); // http://en.wikipedia.org/wiki/Geometric_progression
//		System.out.println(naive(2, 3));
//		System.out.println(naive(5, 4)); // http://en.wikipedia.org/wiki/Geometric_progression
		System.out.println(naive(0.5, 1)); // http://en.wikipedia.org/wiki/Geometric_progression
//		System.out.println(series(1, 2, 3));
//		System.out.println(series(2, 5, 4)); // http://en.wikipedia.org/wiki/Geometric_progression
//		System.out.println(series(2, 3));
//		System.out.println(series(5, 4)); // http://en.wikipedia.org/wiki/Geometric_progression
		System.out.println(series(0.5, 1)); // http://en.wikipedia.org/wiki/Geometric_progression
	}

	public static double naive(double a, double r, int n) {
		double result = 0;
		
		for (int k = 0; k < n; k++) {
			result += a * Math.pow(r, k);
		}
		
		return result;
	}

	public static double naive(double r, int n) {
		double result = 0;

		for (int k = 0; k < n; k++) {
			result += Math.pow(r, k);
		}
		
		return result;
	}

	public static double series(double a, double r, int n) {
		return a * (1 - Math.pow(r, n)) / (1 - r);
	}

	public static double series(double r, int n) {
		return (1 - Math.pow(r, n)) / (1 - r);
	}
}
