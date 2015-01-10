package math;

import java.math.BigDecimal;

public class SquareRoot {

	public static void main(String[] args) {
		System.out.println(newton(10000));
		System.out.println(newton(5));
		System.out.println(newton(5, Double.MIN_VALUE));
		System.out.println(karp(new BigDecimal(5)));
		System.out.println(newton(new BigDecimal(5), new BigDecimal(1e-1)));
	}

	public static double EPSILON = 1e-15; // error tolerance
	
	public static double newton(double n) {
		double t = n;
		while (Math.abs(t - n / t) > EPSILON * t) {
            t = (n / t + t) / 2.0;
        }
		
		return t;
	}

	public static double newton(double n, double precision) {
		double t = n;
		while (Math.abs(t - n / t) > precision * t) {
            t = (n / t + t) / 2.0;
        }
		
		return t;
	}

	/**
	 * Still has errors
	 */
	public static BigDecimal newton(BigDecimal n, BigDecimal precision) {
		BigDecimal t = new BigDecimal(n.toString());
		
		while ((new BigDecimal(t.toString()).subtract(n.divide(t))).abs().doubleValue() > 
				precision.multiply(t).doubleValue()) {
			t = new BigDecimal(n.divide(t).add(t).divide(new BigDecimal(2)).toString());
		}
		
		return t;
	}
	
	/**
	 * 32 digits precision
	 * @see http://stackoverflow.com/a/16859436/2256169
	 */
	public static BigDecimal karp(BigDecimal n) {
	    BigDecimal x = new BigDecimal(Math.sqrt(n.doubleValue()));
	    return x.add(new BigDecimal(n.subtract(x.multiply(x)).doubleValue() / (x.doubleValue() * 2.0)));
	}
}
