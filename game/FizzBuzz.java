package game;

/**
 * Print the numbers from 1 to n, printing "fizz" if the number is divisible by 3, 
 * printing "buzz" if the number is divisible by 5. 
 */
public class FizzBuzz {

	public static void main(String[] args) {
		fizzBuzz(20);
	}

	public static void fizzBuzz(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				System.out.println("fizz");
			} else if (i % 5 == 0) {
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}
		}
	}
	
}
