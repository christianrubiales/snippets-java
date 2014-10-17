package string;


class ReverseStringUsingNewCharArray
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(new String(reverseString("12345".toCharArray())));
	}
	
	/**
	 * Copy each character from the source string to the new string in reverse order.
	 */
	public static char[] reverseString(char[] string) {
		char[] reverse = new char[string.length];
		
		int x = string.length;
		for (int i = 0; i < x; i++) {
			reverse[i] = string[x-i-1];
		}
		
		return reverse;
	}
}