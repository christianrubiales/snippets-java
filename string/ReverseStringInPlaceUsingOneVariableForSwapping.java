package string;

import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseStringInPlaceUsingOneVariableForSwapping
{
	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(new String(reverseString("12345".toCharArray())));
	}
	
	/**
	 * Swap the first and last characters, then doing the same for the 2nd character and the next to the last character,
	 * and so on, until the middle is reached.
	 */
	public static char[] reverseString(char[] string) {
		
		int x = string.length;
		char t;
		for (int i = 0; i < x/2; i++) {
			t = string[i];
			string[i] = string[x-i-1];
			string[x-i-1] = t;
		}
		
		return string;
	}
	
}