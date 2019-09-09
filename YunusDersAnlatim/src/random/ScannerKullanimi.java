package random;

import java.util.Scanner;



public class ScannerKullanimi {

	public static void main(String[] args) {

		
		
	// Scanner kullanicidan veri alma isine yarar.
	Scanner input=new Scanner (System.in);
		
	String name, lastname, country, dob;
	
	int age; 
	 
	System.out.println("Adinizi giriniz");
	
	name=input.nextLine();
	
	System.out.println("Soyadinizi giriniz");
	
	lastname=input.nextLine();
	
	System.out.println("Where are you from");
	
	country=input.nextLine();
	
	System.out.println("Kac yasindasin");
	
	age=input.nextInt();
	
	
	System.out.println("Adiniz: "+name+" Soyadiniz: "+lastname+"\n"+ "You are from "+country+"."+" \tSiz "+age+ " yasindasiniz.");
	

	
	}

}
