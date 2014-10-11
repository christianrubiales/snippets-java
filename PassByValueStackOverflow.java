/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* http://stackoverflow.com/a/12429953 */
class PassByValueStackOverflow
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Foo f = new Foo("f");
		
        changeReference(f); // It won't change the reference!
        System.out.println(f.getAttribute());
        
        modifyReference(f); // It will modify the object that the reference variable "f" refers to!
        System.out.println(f.getAttribute());
	}
	     
	public static void changeReference(Foo a){
          Foo b = new Foo("b");
          a = b;
     }
     public static void modifyReference(Foo c){
          c.setAttribute("c");
     }
}

class Foo {
	private String attribute;
	
	public Foo(String attribute) {
		this.attribute = attribute;
	}
	
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	
	public String getAttribute() {
		return this.attribute;
	}
}
