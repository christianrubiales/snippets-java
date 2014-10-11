package string;

import java.util.*;
import java.lang.*;
import java.io.*;

class ReverseStringInPlaceUsingTwoVariablesForSwapping
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
		char s;
		char t;
		for (int i = 0; i < x/2; i++) {
			s = string[i];
			t = string[x-i-1];
			string[i] = t;
			string[x-i-1] = s;
		}
		
		return string;
	}
	
}