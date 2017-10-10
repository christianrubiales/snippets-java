package bitManipulation;

public class BitShiftingTest {

	public static void main(String[] args) {
		System.out.println("-1 << 1 = 0 padded to the right (signed left shift):");
		System.out.println(Integer.toBinaryString(-1) + "b << 1 = " + Integer.toBinaryString(-1 << 1) + "b\n");
		
		System.out.println("-4 >> 1 = left most bit/sign bit copied (signed right shift):");
		System.out.println(Integer.toBinaryString(-4) + "b >> 1 = " + Integer.toBinaryString(-4 >> 1) + "b\n");
		
		System.out.println("4 >> 1 = left most bit/sign bit copied (signed right shift):");
		System.out.println(Integer.toBinaryString(4) + "b >> 1 = " + Integer.toBinaryString(4 >> 1) + "b\n");
		
		System.out.println("-1 >>> 1 = left most bit/sign bit not copied (unsigned right shift):");
		System.out.println(Integer.toBinaryString(-1) + "b >>> 31 = " + Integer.toBinaryString(-1 >>> 31) + "b\n");
	}
}