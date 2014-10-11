package system;
import java.util.Scanner;


public class ScannerAndSystemInTest {

	/**
	 * THIS ONLY READS KEYBOARD INPUT. (DOES NOT WORK WITH PIPES.) 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;
		while ((line = sc.nextLine()) != null) {
			System.out.println(line);
		}

	}

}
