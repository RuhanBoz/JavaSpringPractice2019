package Practices;

import java.util.Scanner;

public class ReadingACharacterFromConsole {

	public static void main(String[] args) {

		
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("Enter a character");
		String str=input.nextLine();
		
		char chr=str.charAt(0);
		
		System.out.println("You entered "+chr);
		
		
		System.out.println("Enter a number");
		
		int num=input.nextInt();

		System.out.println("The scanner is closing...");
		
		input.close();
		
		System.out.println("Scanner is closed");
		
		
	}

}
