package Practices;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {

		String str="Welcome to Java";
		
		
		// lenght method
		
		int length =str.length();
		
		System.out.println(length);
		
		// char method
		char chr=str.charAt(0);
		
		
		System.out.println(chr);
		
		
		String str1="Class";
		
		// concat method
	System.out.println(str.concat(str1));
		
	
	// uppercase and lower case method
	String str2=str.toLowerCase();
	
	System.out.println(str2);
		
	System.out.println(str1.toUpperCase());	
	
	
	// trim method
	
	String str3="             Yunus            b        ";
	
	
	
	System.out.println(str3.trim());
	
	
	
	
	String message = "math"; 
	System.out.println("The length of " + message + " is "   + message.length());

	
	Scanner s=new Scanner(System.in);
	
	String txt=s.next();
	
	System.out.println(txt.charAt(5));
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}